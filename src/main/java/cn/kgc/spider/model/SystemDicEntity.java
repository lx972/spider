package cn.kgc.spider.model;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author lx
 *    SystemDic实体类
 * @date 2020-03-10 15:36:40
 */
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class SystemDicEntity implements Serializable{

	  private static final long serialVersionUID = 1L;
	
	/**
	* 主键
	*/
	  private Long id;
	/**
	* 父节点
	*/
	  private String parent;
	/**
	* 名称
	*/
	  private String name;
	/**
	* 主键
	*/
	  private String dicKey;
	/**
	* 数据字典值
	*/
	  private String dicValue;
	/**
	 * 
	 */
      @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss" ,timezone = "GMT+8")
	  private Date createdTime;
	/**
	 * 
	 */
      @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss" ,timezone = "GMT+8")
	  private Date updatedTime;
	/**
	* 状态;radio;0:启用,1:禁用
	*/
	  private Integer status;

	  /**
	   * 设置：主键
	   */
	  public void setId(Long id) {
		  this.id = id;
	  }
	  /**
	   * 获取：主键
	   */
	  public Long getId() {
	   	  return id;
	  }
	  /**
	   * 设置：父节点
	   */
	  public void setParent(String parent) {
		  this.parent = parent;
	  }
	  /**
	   * 获取：父节点
	   */
	  public String getParent() {
	   	  return parent;
	  }
	  /**
	   * 设置：名称
	   */
	  public void setName(String name) {
		  this.name = name;
	  }
	  /**
	   * 获取：名称
	   */
	  public String getName() {
	   	  return name;
	  }
	  /**
	   * 设置：主键
	   */
	  public void setDicKey(String dicKey) {
		  this.dicKey = dicKey;
	  }
	  /**
	   * 获取：主键
	   */
	  public String getDicKey() {
	   	  return dicKey;
	  }
	  /**
	   * 设置：数据字典值
	   */
	  public void setDicValue(String dicValue) {
		  this.dicValue = dicValue;
	  }
	  /**
	   * 获取：数据字典值
	   */
	  public String getDicValue() {
	   	  return dicValue;
	  }
	  /**
	   * 设置：
	   */
	  public void setCreatedTime(Date createdTime) {
		  this.createdTime = createdTime;
	  }
	  /**
	   * 获取：
	   */
	  public Date getCreatedTime() {
	   	  return createdTime;
	  }
	  /**
	   * 设置：
	   */
	  public void setUpdatedTime(Date updatedTime) {
		  this.updatedTime = updatedTime;
	  }
	  /**
	   * 获取：
	   */
	  public Date getUpdatedTime() {
	   	  return updatedTime;
	  }
	  /**
	   * 设置：状态;radio;0:启用,1:禁用
	   */
	  public void setStatus(Integer status) {
		  this.status = status;
	  }
	  /**
	   * 获取：状态;radio;0:启用,1:禁用
	   */
	  public Integer getStatus() {
	   	  return status;
	  }

	 
	  @Override
	  public String toString() {
		  return  ReflectionToStringBuilder.toString(this);
	  }

}
