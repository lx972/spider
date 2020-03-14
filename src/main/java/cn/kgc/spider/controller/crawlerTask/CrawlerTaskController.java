package cn.kgc.spider.controller.crawlerTask;

import cn.kgc.spider.common.Constants;
import cn.kgc.spider.controller.BaseController;
import cn.kgc.spider.model.CrawlerTaskEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author lx
 *   CrawlerTask控制器
 * @date 2020-03-08 16:20:50
 */
@Controller
@RequestMapping("/crawlertask")
public class CrawlerTaskController extends BaseController<CrawlerTaskEntity> {
	
	/**
	 * 加载数据类型
	 */
	@RequestMapping("/queryDataType")
	@ResponseBody
	public List<Map<String, Object>> queryDataType(){
		return Constants.dataType();
	}

}
