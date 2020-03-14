package cn.kgc.spider.controller;

import cn.kgc.spider.model.ProxyIpEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

/**
 * 
 * @author lx
 *   ProxyIp控制器
 * @date 2020-03-08 16:20:50
 */
@Controller
@RequestMapping("/proxyip")
public class ProxyIpController extends BaseController<ProxyIpEntity>{
	
	/**
	 * 页面jsp
	 */
	@RequestMapping("/page")
	public String page(){
		return "proxyip";
	}

    /**
     * 页面html
     */
    @RequestMapping("/html")
    public String html(){
        return "redirect:/html/proxyip.html";
    }
}
