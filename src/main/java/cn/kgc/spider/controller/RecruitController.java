package cn.kgc.spider.controller;

import cn.kgc.spider.model.RecruitEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

/**
 * 
 * @author lx
 *   Recruit控制器
 * @date 2020-03-08 16:20:50
 */
@Controller
@RequestMapping("/recruit")
public class RecruitController extends BaseController<RecruitEntity>{
	
	/**
	 * 页面jsp
	 */
	@RequestMapping("/page")
	public String page(){
		return "recruit";
	}

    /**
     * 页面html
     */
    @RequestMapping("/html")
    public String html(){
        return "redirect:/html/recruit.html";
    }
}
