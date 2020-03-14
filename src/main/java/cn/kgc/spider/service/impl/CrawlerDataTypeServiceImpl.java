package cn.kgc.spider.service.impl;

import cn.kgc.spider.model.CrawlerDataTypeEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cn.kgc.spider.service.CrawlerDataTypeService;

/**
 * 
 * @author lx
 *    CrawlerDataType业务层实现类
 * @date 2020-03-08 16:20:51
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class CrawlerDataTypeServiceImpl extends BaseServiceImpl<CrawlerDataTypeEntity> implements CrawlerDataTypeService {
	
}
