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
 *    Module实体类
 * @date 2020-03-10 15:36:40
 */
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class ModuleEntity implements Serializable{

	  private static final long serialVersionUID = 1L;
	
	/**
	* 
	*/
	  private Long id;
	/**
	* 
	*/
	  private String name;
	/**
	* 
	*/
	  private String url;
	/**
	* 
	*/
	  private Long parent;
	/**
	 * 
	 */
      @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss" ,timezone = "GMT+8")
	  private Date creatdTime;
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
	   * 设置：
	   */
	  public void setId(Long id) {
		  this.id = id;
	  }
	  /**
	   * 获取：
	   */
	  public Long getId() {
	   	  return id;
	  }
	  /**
	   * 设置：
	   */
	  public void setName(String name) {
		  this.name = name;
	  }
	  /**
	   * 获取：
	   */
	  public String getName() {
	   	  return name;
	  }
	  /**
	   * 设置：
	   */
	  public void setUrl(String url) {
		  this.url = url;
	  }
	  /**
	   * 获取：
	   */
	  public String getUrl() {
	   	  return url;
	  }
	  /**
	   * 设置：
	   */
	  public void setParent(Long parent) {
		  this.parent = parent;
	  }
	  /**
	   * 获取：
	   */
	  public Long getParent() {
	   	  return parent;
	  }
	  /**
	   * 设置：
	   */
	  public void setCreatdTime(Date creatdTime) {
		  this.creatdTime = creatdTime;
	  }
	  /**
	   * 获取：
	   */
	  public Date getCreatdTime() {
	   	  return creatdTime;
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
