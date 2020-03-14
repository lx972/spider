package cn.kgc.spider.service.impl;

import cn.kgc.spider.mapper.BaseMapper;
import cn.kgc.spider.service.BaseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *基础业务实现
 * @author lx
 * @param <T>
 */
public class BaseServiceImpl<T> implements BaseService<T> {
	
	protected Map<String, Object> map = new HashMap<String, Object>();
	
	protected List<T> list = new ArrayList<T>();

	/**
	 * 操作成功的常量
	 */
	protected static final String SUCCESS = "success";

	/**
	 * 删除操作成功的常量
	 */
	protected static final String DELSUCCESS = "delSuccess";

	/**
	 * 修改操作成功的常量
	 */
	protected static final String UPDSUCCESS = "updSuccess";

	/**
	 * 添加操作成功的常量
	 */
	protected static final String SAVESUCCESS = "saveSuccess";

	/**
	 * 操作成功的常量
	 */
	protected static final String FAIL = "fail";

	/**
	 * 基础mapper对象
	 */
	@Autowired
	protected BaseMapper<T> baseMapper;



	/**
	 * 添加
	 * @param t
	 * @return
	 * @throws Exception
	 */
	@Override
	public String save(T t) throws Exception {
		if(baseMapper.insert(t)>0){
			return SAVESUCCESS;
		}else{
			return FAIL;
		}
	}


	/**
	 * 修改
	 * @param t
	 * @return
	 * @throws Exception
	 */
	@Override
	public String upd(T t) throws Exception {
		if(baseMapper.update(t)>0){
			return UPDSUCCESS;
		}else{
			return FAIL;
		}
	}


	/**
	 * 根据条件单个删除
	 * @param t
	 * @return
	 * @throws Exception
	 */
	@Override
	public String remove(T t) throws Exception {
		if(baseMapper.delete(t)>0){
			return DELSUCCESS;
		}else{
			return FAIL;
		}
	}


	/**
	 * 批量删除
	 * @param ids
	 * @return
	 * @throws Exception
	 */
	@Override
	public String removeBatch(Integer[] ids) throws Exception {
		if(baseMapper.deleteBatch(ids)>0){
			return DELSUCCESS;
		}else{
			return FAIL;
		}
	}


	/**
	 * 根据条件查询单个结果
	 * @param t
	 * @return
	 * @throws Exception
	 */
	@Override
	public T findObjectByPramas(T t) throws Exception {
		
		return baseMapper.queryObjectByPramas(t);
	}


	/**
	 * 根据其它条件查询多个结果
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<T> findManyByOtherPramas(Object obj) throws Exception {
		
		return baseMapper.queryManyByOtherPramas(obj);
	}


	/**
	 * 根据条件（无条件）查询多个结果
	 * @param t
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<T> findManyByPramas(T t) throws Exception {
		
		return baseMapper.queryManyByPramas(t);
	}


	/**
	 * 根据条件(无条件)分页查询layui的table
	 * @param page
	 * @param limit
	 * @param t
	 * @return
	 * @throws Exception
	 */
	@Override
	public Map<String, Object> findListByPramas(Integer page, Integer limit, T t) throws Exception {
		PageHelper.startPage(page,limit);
		PageInfo<T> pageInfo = new PageInfo<T>(baseMapper.queryListByPramas(t));
		map.put("total",pageInfo.getTotal());
		map.put("rows",pageInfo.getList());
		return map;
	}


	/**
	 * 获取表的数据记录条数
	 * @param t
	 * @return
	 * @throws Exception
	 */
	@Override
	public Long getTotalByPramas(T t) throws Exception {
		
		return baseMapper.queryTotalByPramas(t);
	}


	/**
	 * 根据条件分页查询，一般分页
	 * @param page
	 * @param limit
	 * @param t
	 * @return
	 * @throws Exception
	 */
	@Override
	public PageInfo<T> findPageByPramas(Integer page, Integer limit, T t) throws Exception {
		PageHelper.startPage(page,limit);
		PageInfo<T> pageInfo = new PageInfo<T>(baseMapper.queryListByPramas(t));
		return new PageInfo<T>(baseMapper.queryListByPramas(t));
	}


	/**
	 * 获取数据页数
	 * @param pageSize
	 * @param t
	 * @return
	 * @throws Exception
	 */
	@Override
	public Integer getTotalPageByPramas(Integer pageSize, T t) throws Exception {
		Long totalRecord = baseMapper.queryTotalByPramas(t);
		if(totalRecord%pageSize==0){
			return (int) (totalRecord/pageSize);
		}else{
			return (int) (totalRecord/pageSize + 1);
		}
		
	}



	/**
	 * 查询所有
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<T> findAll() throws Exception {
		
		return baseMapper.queryAll();
	}

	
	
}
