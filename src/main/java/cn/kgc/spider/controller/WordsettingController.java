package cn.kgc.spider.controller;

import cn.kgc.spider.model.WordsettingEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

/**
 * 
 * @author lx
 *   Wordsetting控制器
 * @date 2020-03-08 16:20:50
 */
@Controller
@RequestMapping("/wordsetting")
public class WordsettingController extends BaseController<WordsettingEntity>{
	
	/**
	 * 页面jsp
	 */
	@RequestMapping("/page")
	public String page(){
		return "wordsetting";
	}

    /**
     * 页面html
     */
    @RequestMapping("/html")
    public String html(){
        return "redirect:/html/wordsetting.html";
    }
}
