package cn.kgc.spider.controller;

import cn.kgc.spider.model.CrawlerDataTypeEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

/**
 * 
 * @author lx
 *   CrawlerDataType控制器
 * @date 2020-03-08 16:20:51
 */
@Controller
@RequestMapping("/crawlerdatatype")
public class CrawlerDataTypeController extends BaseController<CrawlerDataTypeEntity>{
	
	/**
	 * 页面jsp
	 */
	@RequestMapping("/page")
	public String page(){
		return "crawlerdatatype";
	}

    /**
     * 页面html
     */
    @RequestMapping("/html")
    public String html(){
        return "crawlerdatatype";
    }
}
