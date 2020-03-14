package cn.kgc.spider.controller.spider;

import cn.kgc.spider.common.Constants;
import cn.kgc.spider.model.CrawlerNodeEntity;
import cn.kgc.spider.model.CrawlerRulesEntity;
import cn.kgc.spider.model.CrawlerTaskEntity;
import cn.kgc.spider.model.RecruitEntity;
import cn.kgc.spider.service.CrawlerNodeService;
import cn.kgc.spider.service.CrawlerRulesService;
import cn.kgc.spider.service.CrawlerTaskService;
import cn.kgc.spider.service.RecruitService;
import cn.kgc.spider.util.DocumentUtil;
import cn.kgc.spider.util.RegUtil;
import cn.kgc.spider.util.StringUtils;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 
 * @author lx
 *   爬虫任务控制器
 * @date 2020-03-08 16:20:50
 */
@Controller
@RequestMapping("/execute")
public class ExecuteController{

	/**
	 * 日志对象
	 */
	private static Logger logger = LoggerFactory.getLogger(ExecuteController.class);

	/**
	 * 用来保存已经爬取过的url池，一个任务一个set
	 */
	static Map<Long,Set<String>> urlSetMap=new HashMap<>(16);


	/**
	 * 任务列表操作对象
	 */
	@Autowired
	private CrawlerTaskService crawlerTaskService;

	/**
	 * 爬取的信息操作对象
	 */
	@Autowired
	private RecruitService recruitService;

	/**
	 * 爬虫规则操作对象
	 */
	@Autowired
	private CrawlerRulesService crawlerRulesService;

	/**
	 * 列表页和内容页规则操作对象
	 */
	@Autowired
	private CrawlerNodeService crawlerNodeService;


	/**
	 * 执行任务
	 */
	@RequestMapping("/crawler")
	@ResponseBody
	public String crawler(CrawlerTaskEntity crawlerTaskEntity){
		try {
			CrawlerTaskEntity task = crawlerTaskService.findObjectByPramas(crawlerTaskEntity);
			if (task.getStatus().equals(Constants.TaskStatus.dataRun)){
				//任务正在执行
				logger.info(">>>>>>>>>>>>>>>>>>>>>>>任务正在执行");
				return "任务正在执行";
			}else {
				//开始执行任务
				//修改任务状态为正在执行
				task.setStatus(Constants.TaskStatus.dataRun);
				//设置爬虫进度为0%
				task.setDataProgress("0%");
				//设置更新时间
				task.setUpdatedTime(new Date());
				//更新该任务状态
				crawlerTaskService.upd(task);
				//新建一个url池，用来保存已经爬取过得url连接
				Set<String> urlSet=new HashSet<>();
				//保存当前已经爬取的url
				urlSetMap.put(task.getId(),urlSet);
				//根据taskid找到已经爬取的信息
				RecruitEntity recruitEntity=new RecruitEntity();
				recruitEntity.setTaskId(task.getId());
				List<RecruitEntity> recruitList = recruitService.getRecruitListByPramas(recruitEntity);
				for (RecruitEntity recruit : recruitList) {
					//将已经爬取的url放入url池中
					urlSet.add(recruit.getDetailUrl());
				}
				//保存当前已经爬取的url
				urlSetMap.put(task.getId(),urlSet);
				//生成事物id
				final String uuid=UUID.randomUUID().toString();
				//获取爬虫规则
				CrawlerRulesEntity crawlerRulesEntity=new CrawlerRulesEntity();
				crawlerRulesEntity.setId(task.getRuleId());
				CrawlerRulesEntity crawlerRule = crawlerRulesService.findObjectByPramas(crawlerRulesEntity);
				//获取列表页规则
				CrawlerNodeEntity crawlerNodeEntity=new CrawlerNodeEntity();
				crawlerNodeEntity.setRuleId(crawlerRule.getId());
				crawlerNodeEntity.setLevel("0");
				List<CrawlerNodeEntity> listPageList = crawlerNodeService.findManyByPramas(crawlerNodeEntity);
				//创建一个线程池
				final ExecutorService fixedThreadPool = Executors.newFixedThreadPool(task.getThreadCount());
				//遍历列表页规则,得到内容页规则
				crawlerNodeEntity.setRuleId(null);
				crawlerNodeEntity.setLevel(null);
				for (final CrawlerNodeEntity listPage : listPageList) {
					crawlerNodeEntity.setParent(listPage.getId());
					//根据列表页规则得到内容页规则
					final List<CrawlerNodeEntity> contentPageList = crawlerNodeService.findManyByPramas(crawlerNodeEntity);
					//判断是否分页
					if (task.getIsNeedPage().equals(1)){
						//分页
                        logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>分页");
						for(int i=task.getStartPage();i<=task.getEndPage();i++){
							final int index=i;
                            Future future = fixedThreadPool.submit(new Runnable() {
                                @Override
                                public void run() {
                                    //列表页url
                                    final String listPageUrl = task.getUrl().replaceAll(Constants.Crawler.placeholder, index + "");
                                    logger.info(">>>>>>>>>>>>>>列表页url:" + listPageUrl);
                                    //爬取列表页
                                    crawlListPage(listPageUrl, crawlerRule, listPage, task, contentPageList, uuid);

                                }
                            });
                        }
					}else {
                        //不分页
                        logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>不分页");
                            fixedThreadPool.execute(new Runnable() {
                                @Override
                                public void run() {
                                    //列表页url
                                    final String listPageUrl = task.getUrl();
                                    logger.info(">>>>>>>>>>>>>>列表页url:"+listPageUrl);
                                    //爬取列表页
                                    crawlListPage(listPageUrl,crawlerRule,listPage,task,contentPageList,uuid);
                                }
                            });
                        }

				}
				//关闭线程池
				fixedThreadPool.shutdown();
			}
		} catch (Exception e) {
			e.printStackTrace();
            return "任务执行异常";
		}
		return "success";
	}


	/**
	 * 爬取列表页
	 * @param listPageUrl	列表页url
	 * @param crawlerRule	爬虫规则对象
	 * @param listPage	列表页规则对象
	 * @param task	爬虫任务对象
	 * @param contentPageList	所有详情页规则兑现
	 * @param uuid	事物id
	 */
	public void crawlListPage(String listPageUrl,
                              CrawlerRulesEntity crawlerRule,
                              CrawlerNodeEntity listPage,
                              CrawlerTaskEntity task,
                              List<CrawlerNodeEntity> contentPageList,
                              String uuid){
		Document document=null;
		//判断是否需要代理
		if (crawlerRule.getIsNeedProxy().equals(1)){
			//代理
			document = DocumentUtil.againDocument(listPageUrl);
		}else {
			document = DocumentUtil.againCommonDocument(listPageUrl,0);
		}
		//根据列表页的规则爬取列表页
		Elements elements = document.select(listPage.getClassReg());
		for (Element element : elements) {
			//得到详情页的url
			final String contentPageUrl = element.absUrl("href");
            logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>详情页的url："+contentPageUrl);
			document=null;
			if (isExist(task.getId(),contentPageUrl)){
				//已经爬取了
				logger.info(">>>>>>>>>>>>URL："+contentPageUrl+">>>>>>>已经存在，直接跳过");
				continue;
			}else {
				//未爬取
				//再次判断是否需要代理
				if (crawlerRule.getIsNeedProxy().equals(1)){
					//代理
					document = DocumentUtil.againDocument(contentPageUrl);
				}else {
					document = DocumentUtil.againCommonDocument(contentPageUrl,0);
				}

			}
			//爬取详情页
			crawlContentPage( contentPageUrl, document, contentPageList,listPageUrl,task,uuid);
		}
	}

	/**
	 * 爬取详情页
	 * @param contentPageUrl	详情页url
	 * @param contentPageDocument	详情页document
	 * @param contentPageList	所有内容页规则对象
	 * @param listPageUrl	列表页url
	 * @param task	爬虫任务对象
	 * @param uuid	事物id
	 */
	public void crawlContentPage(String contentPageUrl,
                                 Document contentPageDocument,
                                 List<CrawlerNodeEntity> contentPageList,
                                 String listPageUrl,
                                 CrawlerTaskEntity task,
                                 String uuid){
		String value=null;
		RecruitEntity recruitEntity=new RecruitEntity();
		for (CrawlerNodeEntity contentPage : contentPageList) {
			//根据不同的爬取方式爬取详情页
			switch (contentPage.getType()){
				//jsoup选择
				case "1":
					//根据内容页规则爬取内容页
                    logger.info(">>>>>>>>>>>>>>>>>>>jsoup选择："+contentPage.getClassReg());
					Elements elements = contentPageDocument.select(contentPage.getClassReg());
					//判断爬取元素位置
					if (contentPage.getPosition().equals(0)){
						//爬取全部元素
                        logger.info(">>>>>>>>>>>>>>>>>>>爬取全部元素");
						//判断爬取到的内容是否是超链接
						if (contentPage.getIsHref().equals("1")){
							//是超链接
                            logger.info(">>>>>>>>>>>>>>>>>>>是超链接");
							value = elements.attr("href");
						}else {
							//不是超链接
                            logger.info(">>>>>>>>>>>>>>>>>>>不是超链接");
							value = elements.text();
						}
					}else if (contentPage.getPosition().equals(1)){
						//爬取首元素
                        logger.info(">>>>>>>>>>>>>>>>>>>爬取首元素");
						//判断爬取到的内容是否是超链接
						if (contentPage.getIsHref().equals("1")){
							//是超链接
							value = elements.first().absUrl("href");
						}else {
							//不是超链接
							value = elements.first().text();
						}
					}else if (contentPage.getPosition().equals(2)){
						//爬取尾元素
                        logger.info(">>>>>>>>>>>>>>>>>>>爬取尾元素");
						//判断爬取到的内容是否是超链接
						if (contentPage.getIsHref().equals("1")){
							//是超链接
							value = elements.last().absUrl("href");
						}else {
							//不是超链接
							value = elements.last().text();
						}
					}else if (contentPage.getPosition().equals(3)){
						//爬取指定位置元素
                        logger.info(">>>>>>>>>>>>>>>>>>>爬取指定位置元素:"+contentPage.getSelfPosition());
						//判断爬取到的内容是否是超链接
						if (contentPage.getIsHref().equals("1")){
							//是超链接
							value = elements.get(contentPage.getSelfPosition()-1).absUrl("href");
						}else {
							//不是超链接
							value = elements.get(contentPage.getSelfPosition()-1).text();
						}
					}
                    logger.info(">>>>>>>>>>>>>>>>>>>爬取到的值value："+value);
					break;
				case "2":
					//字符串截取
					int startIndex=contentPageDocument.html().indexOf(contentPage.getStartStr())+contentPage.getStartStr().length();
					int endIndex=contentPageDocument.html().indexOf(contentPage.getEndStr());
					value=contentPageDocument.html().substring(startIndex,endIndex);
                    logger.info(">>>>>>>>>>>>>>>>>>>爬取到的值value："+value);
					break;
				case "3":
					//正则表达式
					String html=contentPageDocument.html();
					value= RegUtil.regTest(html,contentPage.getReg());
                    logger.info(">>>>>>>>>>>>>>>>>>>爬取到的值value："+value);
					break;
			}
			//利用反射将对应值保存到对象对应属性中
			setCloumn(contentPage.getSaveCloumn(),value,recruitEntity);
		}
		//设置列表页url
		recruitEntity.setListUrl(listPageUrl);
		//设置详情页url
		recruitEntity.setDetailUrl(contentPageUrl);
		//状态
		recruitEntity.setStatus(Constants.Status.ACTIVE);
		//设置关键字
		recruitEntity.setCity(task.getKeyword());
		recruitEntity.setDataTypeId(task.getDataTypeId());
		recruitEntity.setUuid(uuid);
		recruitEntity.setTaskId(task.getId());
		recruitEntity.setCreatedTime(new Date());
        try {
            recruitService.save(recruitEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


	/**
	 * 利用反射将对应值保存到对象对应属性中
	 * @param cloumn
	 * @param value
	 * @param recruitEntity
	 */
	public static void setCloumn(String cloumn,String value,RecruitEntity recruitEntity){
		try {
			Method mothod = RecruitEntity.class.getMethod("set"+ StringUtils.captureName(cloumn),String.class);
			//value= StringUtils.delHTMLTag(value);
			mothod.invoke(recruitEntity,value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * 判断详情页的url是否已经爬取过
	 * @param taskId
	 * @param contentPageUrl
	 * @return
	 */
	public static boolean isExist(Long taskId,String contentPageUrl){
		Set<String> urlSet = urlSetMap.get(taskId);
		if (urlSet.contains(contentPageUrl)){
			//已经爬取过了
			return true;
		}else {
			//未爬取
			urlSet.add(contentPageUrl);
			urlSetMap.put(taskId,urlSet);
			return false;
		}
	}


	/**
	 * 抽取数据
	 */
	@RequestMapping("/filterData")
	@ResponseBody
	public String filterData(Integer taskId){
		return "success";
	}

}
