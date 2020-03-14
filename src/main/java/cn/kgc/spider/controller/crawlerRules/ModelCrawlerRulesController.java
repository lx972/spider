package cn.kgc.spider.controller.crawlerRules;

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
public class ModelCrawlerRulesController {

	/**
	 * 页面crawlerRulesList
	 */
	@RequestMapping("/toCrawlerRulesList")
	public String toCrawlerRulesList(){
		return "crawlerRules/crawlerRulesList";
	}


	/**
	 * 页面addCrawlerRules
	 */
	@RequestMapping("/toAddCrawlerRules")
	public String toAddCrawlerRules(){
		return "crawlerRules/addCrawlerRules";
	}


	/**
	 * 页面updateCrawlerRules
	 */
	@RequestMapping("/toUpdateCrawlerRules")
	public String toUpdateCrawlerRules(Integer id, HttpServletRequest request){
		request.setAttribute("id",id);
		return "crawlerRules/updateCrawlerRules";
	}



}
