package cn.kgc.spider.controller.crawlerNode;

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
public class ModelCrawlerNodeController {


	/**
	 * 页面parentList
	 */
	@RequestMapping("/toParentList")
	public String toParentList(Integer ruleId, HttpServletRequest request){
		request.setAttribute("ruleId",ruleId);
		return "crawlerNode/parentList";
	}



	/**
	 * 页面addCrawlerNode
	 */
	@RequestMapping("/toAddCrawlerNode")
	public String toAddCrawlerNode(Integer ruleId,Integer parent,Integer level, HttpServletRequest request){
		request.setAttribute("ruleId",ruleId);
		request.setAttribute("parent",parent);
		request.setAttribute("level",level);
		return "crawlerNode/addCrawlerNode";
	}



	/**
	 * 页面updateCrawlerNode
	 */
	@RequestMapping("/toUpdateCrawlerNode")
	public String toUpdateCrawlerNode(Integer id, HttpServletRequest request){
		request.setAttribute("id",id);
		return "crawlerNode/updateCrawlerNode";
	}


	/**
	 * 页面childList
	 */
	@RequestMapping("/toChildList")
	public String toChildList(Integer parent,Integer ruleId, HttpServletRequest request){
		request.setAttribute("parent",parent);
		request.setAttribute("ruleId",ruleId);
		return "crawlerNode/childList";
	}



}
