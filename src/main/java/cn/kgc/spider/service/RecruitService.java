package cn.kgc.spider.service;

import cn.kgc.spider.model.RecruitEntity;

import java.util.List;

/**
 * 
 * @author lx
 *    Recruit业务层接口
 * @date 2020-03-08 16:20:50
 */
public interface RecruitService extends BaseService<RecruitEntity>{

    /**
     * 根据任务信息查询招聘结果信息，任务和招聘信息是一对多的关系
     * @param recruitEntity
     * @return
     * @throws Exception
     */
    List<RecruitEntity> getRecruitListByPramas(RecruitEntity recruitEntity)throws Exception;
}
