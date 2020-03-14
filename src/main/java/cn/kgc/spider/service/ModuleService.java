package cn.kgc.spider.service;

import cn.kgc.spider.model.ModuleEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author lx
 *    Module业务层接口
 * @date 2020-03-08 16:20:50
 */
public interface ModuleService extends BaseService<ModuleEntity>{


    /**
     * 加载菜单
     * @return
     * @throws Exception
     */
    List<Map<String,Object>> loadMenu()throws Exception;
	
}
