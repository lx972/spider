package cn.kgc.spider.service.impl;

import cn.kgc.spider.model.ProxyIpEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cn.kgc.spider.service.ProxyIpService;

/**
 * 
 * @author lx
 *    ProxyIp业务层实现类
 * @date 2020-03-08 16:20:50
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ProxyIpServiceImpl extends BaseServiceImpl<ProxyIpEntity> implements ProxyIpService {
	
}
