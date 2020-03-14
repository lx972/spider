package cn.kgc.spider.controller.crawlerNode;

import cn.kgc.spider.common.Constants;
import cn.kgc.spider.controller.BaseController;
import cn.kgc.spider.model.CrawlerNodeEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author lx
 *   CrawlerNode控制器
 * @date 2020-03-08 16:20:50
 */
@Controller
@RequestMapping("/crawlernode")
public class CrawlerNodeController extends BaseController<CrawlerNodeEntity> {
	
	/**
	 * 加载保存字段
	 */
	@RequestMapping("/queryFieldType")
	@ResponseBody
	public List<Map<String,String>> queryFieldType(){
		return Constants.saveCloums();
	}





}
