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
 *    Keyword实体类
 * @date 2020-03-10 15:36:40
 */
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class KeywordEntity implements Serializable{

	  private static final long serialVersionUID = 1L;
	
	/**
	* 
	*/
	  private Integer id;
	/**
	* 
	*/
	  private Integer rId;
	/**
	* 
	*/
	  private String name;
	/**
	* 
	*/
	  private Integer dataType;
	/**
	* 
	*/
	  private String uuid;
	/**
	* 
	*/
	  private Long taskId;
	/**
	* 
	*/
	  private String website;
	/**
	* 
	*/
	  private Integer status;
	/**
	* 
	*/
	  private String jobDescription;
	/**
	 * 创建时间
	 */
      @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss" ,timezone = "GMT+8")
	  private Date createdTime;
	/**
	 * 更新时间
	 */
      @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss" ,timezone = "GMT+8")
	  private Date updatedTime;

	  /**
	   * 设置：
	   */
	  public void setId(Integer id) {
		  this.id = id;
	  }
	  /**
	   * 获取：
	   */
	  public Integer getId() {
	   	  return id;
	  }
	  /**
	   * 设置：
	   */
	  public void setRId(Integer rId) {
		  this.rId = rId;
	  }
	  /**
	   * 获取：
	   */
	  public Integer getRId() {
	   	  return rId;
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
	  public void setDataType(Integer dataType) {
		  this.dataType = dataType;
	  }
	  /**
	   * 获取：
	   */
	  public Integer getDataType() {
	   	  return dataType;
	  }
	  /**
	   * 设置：
	   */
	  public void setUuid(String uuid) {
		  this.uuid = uuid;
	  }
	  /**
	   * 获取：
	   */
	  public String getUuid() {
	   	  return uuid;
	  }
	  /**
	   * 设置：
	   */
	  public void setTaskId(Long taskId) {
		  this.taskId = taskId;
	  }
	  /**
	   * 获取：
	   */
	  public Long getTaskId() {
	   	  return taskId;
	  }
	  /**
	   * 设置：
	   */
	  public void setWebsite(String website) {
		  this.website = website;
	  }
	  /**
	   * 获取：
	   */
	  public String getWebsite() {
	   	  return website;
	  }
	  /**
	   * 设置：
	   */
	  public void setStatus(Integer status) {
		  this.status = status;
	  }
	  /**
	   * 获取：
	   */
	  public Integer getStatus() {
	   	  return status;
	  }
	  /**
	   * 设置：
	   */
	  public void setJobDescription(String jobDescription) {
		  this.jobDescription = jobDescription;
	  }
	  /**
	   * 获取：
	   */
	  public String getJobDescription() {
	   	  return jobDescription;
	  }
	  /**
	   * 设置：创建时间
	   */
	  public void setCreatedTime(Date createdTime) {
		  this.createdTime = createdTime;
	  }
	  /**
	   * 获取：创建时间
	   */
	  public Date getCreatedTime() {
	   	  return createdTime;
	  }
	  /**
	   * 设置：更新时间
	   */
	  public void setUpdatedTime(Date updatedTime) {
		  this.updatedTime = updatedTime;
	  }
	  /**
	   * 获取：更新时间
	   */
	  public Date getUpdatedTime() {
	   	  return updatedTime;
	  }

	 
	  @Override
	  public String toString() {
		  return  ReflectionToStringBuilder.toString(this);
	  }

}
