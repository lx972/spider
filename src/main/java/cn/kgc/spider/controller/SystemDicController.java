package cn.kgc.spider.controller;

import cn.kgc.spider.model.SystemDicEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

/**
 * 
 * @author lx
 *   SystemDic控制器
 * @date 2020-03-08 16:20:50
 */
@Controller
@RequestMapping("/systemdic")
public class SystemDicController extends BaseController<SystemDicEntity>{
	
	/**
	 * 页面jsp
	 */
	@RequestMapping("/page")
	public String page(){
		return "systemdic";
	}

    /**
     * 页面html
     */
    @RequestMapping("/html")
    public String html(){
        return "redirect:/html/systemdic.html";
    }
}
