package cn.kgc.spider.service;

import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

/**
 *基础业务接口
 * @author lx
 * @param <T>
 */
public interface BaseService<T> {

	/**
	 * 添加
	 * @param t
	 * @return
	 * @throws Exception
	 */
	String save(T t) throws Exception;

	/**
	 * 修改
	 * @param t
	 * @return
	 * @throws Exception
	 */
	String upd(T t) throws Exception;

	/**
	 * 删除
	 * @param t
	 * @return
	 * @throws Exception
	 */
	String remove(T t) throws Exception;

	/**
	 * 批量删除
	 * @param ids
	 * @return
	 * @throws Exception
	 */
	String removeBatch(Integer[] ids) throws Exception;

	/**
	 * 根据条件查询单个结果
	 * @param t
	 * @return
	 * @throws Exception
	 */
    T findObjectByPramas(T t) throws Exception;

	/**
	 * 查询所有
	 * @return
	 * @throws Exception
	 */
  	List<T> findAll() throws Exception;

	/**
	 * 根据单个其它条件查询多个结果集
	 * @param obj
	 * @return
	 * @throws Exception
	 */
  	List<T> findManyByOtherPramas(Object obj) throws Exception;

	/**
	 * 根据条件（无条件）查询多个结果
	 * @param t
	 * @return
	 * @throws Exception
	 */
  	List<T> findManyByPramas(T t) throws Exception;

	/**
	 * 根据条件(无条件)分页查询layui的table
	 * @param page
	 * @param limit
	 * @param t
	 * @return
	 * @throws Exception
	 */
	Map<String,Object> findListByPramas(Integer page, Integer limit, T t) throws Exception;

	/**
	 * 获取表的数据记录条数
	 * @param t
	 * @return
	 * @throws Exception
	 */
	Long getTotalByPramas(T t) throws Exception;

	/**
	 * 根据条件分页查询，一般分页
	 * @param page
	 * @param limit
	 * @param t
	 * @return
	 * @throws Exception
	 */
	PageInfo<T> findPageByPramas(Integer page, Integer limit, T t) throws Exception;

	/**
	 * 获取数据页数
	 * @param pageSize
	 * @param t
	 * @return
	 * @throws Exception
	 */
	Integer getTotalPageByPramas(Integer pageSize, T t) throws Exception;
	
}
