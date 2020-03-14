package cn.kgc.spider.mapper;
import cn.kgc.spider.model.RecruitEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 
 * @author lx
 *    RecruitMapper层
 * @date 2020-03-08 16:20:50
 */
@Repository
public interface RecruitMapper extends BaseMapper<RecruitEntity> {

    /**
     * 根据任务信息查询招聘结果信息，任务和招聘信息是一对多的关系
     * @param recruitEntity
     * @return
     * @throws Exception
     */
    List<RecruitEntity> getRecruitListByPramas(@Param("t") RecruitEntity recruitEntity)throws Exception;
}
