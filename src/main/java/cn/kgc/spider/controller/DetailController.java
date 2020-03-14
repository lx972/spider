package cn.kgc.spider.controller;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

/**
 * 
 * @author lx
 *   测试控制器
 * @date 2020-01-05 15:52:54
 */
@Controller
@RequestMapping("/detail")
public class DetailController {
	

	@RequestMapping("/crawlzl")
    @ResponseBody
	public String crawlzl(){
	    //智联网址
	    String url="https://www.biquge.lu/book/630/382897.html";
	    //建立连接
        Connection connect = Jsoup.connect(url);
        //获取内容
        try {
            Document document = connect.get();
            Elements h1 = document.select("h1");
            String html = h1.text();
            System.out.println(html);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "crawlerdatatype";
	}


}
