package cn.kgc.spider.controller.crawlerRules;

import cn.kgc.spider.controller.BaseController;
import cn.kgc.spider.model.CrawlerRulesEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 
 * @author lx
 *   CrawlerRules控制器
 * @date 2020-03-08 16:20:50
 */
@Controller
@RequestMapping("/crawlerrules")
public class CrawlerRulesController extends BaseController<CrawlerRulesEntity> {

}
