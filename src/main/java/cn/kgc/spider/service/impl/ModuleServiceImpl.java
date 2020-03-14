package cn.kgc.spider.service.impl;

import cn.kgc.spider.model.ModuleEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cn.kgc.spider.service.ModuleService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author lx
 *    Module业务层实现类
 * @date 2020-03-08 16:20:50
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ModuleServiceImpl extends BaseServiceImpl<ModuleEntity> implements ModuleService {


    /**
     * 加载菜单
     * @return
     * @throws Exception
     */
    @Override
    public List<Map<String, Object>> loadMenu() throws Exception {
        List<Map<String, Object>> menu=new ArrayList<>();
        //查询父节点为0并且启用的菜单
        ModuleEntity moduleEntity=new ModuleEntity();
        moduleEntity.setParent((long)0);
        moduleEntity.setStatus(0);
        List<ModuleEntity> parents = baseMapper.queryListByPramas(moduleEntity);
        for (ModuleEntity parent : parents) {
            //找到该父节点下面所有的子节点
            moduleEntity.setParent(parent.getId());
            List<ModuleEntity> childs = baseMapper.queryListByPramas(moduleEntity);
            //保存菜单
            Map<String, Object> parentMenu=new HashMap<>(16);
            parentMenu.put("name",parent.getName());
            parentMenu.put("children",childs);
            menu.add(parentMenu);
        }
        return menu;
    }
}
