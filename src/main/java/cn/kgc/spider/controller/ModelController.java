package cn.kgc.spider.controller;

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
public class ModelController {
	
	/**
	 * 页面index
	 */
	@RequestMapping("/toIndex")
	public String toIndex(){
		return "index";
	}

	/**
	 * 页面TabSelect
	 */
	@RequestMapping("/toTabSelect")
	public String toTabSelect(){
		return "crawlerRules/tabSelect";
	}



	/**
	 * 页面crawlerTask
	 */
	@RequestMapping("/toCrawlerTask")
	public String toCrawlerTask(){
		return "crawlerTask/crawlerTaskList";
	}





}
