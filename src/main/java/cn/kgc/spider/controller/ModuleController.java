package cn.kgc.spider.controller;

import cn.kgc.spider.model.ModuleEntity;
import cn.kgc.spider.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author lx
 *   Module控制器
 * @date 2020-03-08 16:20:50
 */
@Controller
@RequestMapping("/module")
public class ModuleController extends BaseController<ModuleEntity>{

	/**
	 * 菜单业务层
	 */
	@Autowired
	private ModuleService moduleService;

	/**
	 * 加载菜单
	 * @return
	 */
	@RequestMapping("/loadMenu")
	@ResponseBody
	public List<Map<String,Object>> loadMenu(){
		try {
			return moduleService.loadMenu();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
