package cn.kgc.spider.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *  方法名与mybatis 映射文件SQL ID对应
 *@author lx
 *@param <T>
 */
public interface BaseMapper<T> {

	/**
	 * 添加
	 * @param t
	 * @return
	 * @throws Exception
	 */
	Integer insert(T t) throws Exception;

	/**
	 * 修改
	 * @param t
	 * @return
	 * @throws Exception
	 */
	Integer update(@Param("t") T t) throws Exception;

	/**
	 * 根据条件删除
	 * @param t
	 * @return
	 * @throws Exception
	 */
	Integer delete(@Param("t") T t) throws Exception;

	/**
	 * 批量删除
	 * @param id
	 * @return
	 * @throws Exception
	 */
	Integer deleteBatch(Object[] id) throws Exception;

	/**
	 * 根据条件查询单个结果
	 * @param t
	 * @return
	 * @throws Exception
	 */
	T queryObjectByPramas(@Param("t") T t) throws Exception;

	/**
	 * 根据id查询单个结果
	 * @param id
	 * @return
	 * @throws Exception
	 */
	T queryObjectById(Integer id) throws Exception;

	/**
	 * 查询所有
	 * @return
	 * @throws Exception
	 */
	List<T> queryAll() throws Exception;

	/**
	 * 根据其它条件查询多个结果集
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	List<T> queryManyByOtherPramas(Object obj) throws Exception;

	/**
	 * 根据条件（无条件）查询多个结果集
	 * @param t
	 * @return
	 * @throws Exception
	 */
	List<T> queryManyByPramas(@Param("t") T t) throws Exception;

	/**
	 * 根据条件（无条件）分页查询
	 * @param t
	 * @return
	 * @throws Exception
	 */
	List<T> queryListByPramas(@Param("t") T t) throws Exception;

	/**
	 * 根据条件（无条件）查询数据条数
	 * @param t
	 * @return
	 * @throws Exception
	 */
	Long queryTotalByPramas(@Param("t") T t) throws Exception;
	
}
