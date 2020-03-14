package cn.kgc.spider.service.impl;

import cn.kgc.spider.mapper.RecruitMapper;
import cn.kgc.spider.model.RecruitEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cn.kgc.spider.service.RecruitService;

import java.util.List;

/**
 * 
 * @author lx
 *    Recruit业务层实现类
 * @date 2020-03-08 16:20:50
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RecruitServiceImpl extends BaseServiceImpl<RecruitEntity> implements RecruitService {

    /**
     * 招聘结果信息操作对象
     */
    @Autowired
    private RecruitMapper recruitMapper;


    /**
     * 根据任务信息查询招聘结果信息，任务和招聘信息是一对多的关系
     * @param recruitEntity
     * @return
     * @throws Exception
     */
    @Override
    public List<RecruitEntity> getRecruitListByPramas(RecruitEntity recruitEntity) throws Exception {
        return recruitMapper.getRecruitListByPramas(recruitEntity);
    }
}
