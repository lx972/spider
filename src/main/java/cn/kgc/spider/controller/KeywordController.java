package cn.kgc.spider.controller;

import cn.kgc.spider.model.KeywordEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

/**
 * 
 * @author lx
 *   Keyword控制器
 * @date 2020-03-08 16:20:50
 */
@Controller
@RequestMapping("/keyword")
public class KeywordController extends BaseController<KeywordEntity>{
	
	/**
	 * 页面jsp
	 */
	@RequestMapping("/page")
	public String page(){
		return "keyword";
	}

    /**
     * 页面html
     */
    @RequestMapping("/html")
    public String html(){
        return "redirect:/html/keyword.html";
    }
}
