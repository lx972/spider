package cn.kgc.spider.controller.crawlerTask;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 
 * @author lx
 *   页面跳转控制器
 * @date 2020-01-05 15:52:54
 */
@Controller
@RequestMapping("/model")
public class ModelCrawlerTaskController {

	/**
	 * 页面addCrawlerTask
	 */
	@RequestMapping("/toAddCrawlerTask")
	public String toAddCrawlerTask(){
		return "crawlerTask/addCrawlerTask";
	}


	/**
	 * 页面updateCrawlerTask
	 */
	@RequestMapping("/toUpdateCrawlerTask")
	public String toUpdateCrawlerTask(Integer id,HttpServletRequest request){
		request.setAttribute("id",id);
		return "crawlerTask/updateCrawlerTask";
	}




}
