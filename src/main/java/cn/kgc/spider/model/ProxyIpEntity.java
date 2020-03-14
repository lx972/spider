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
 *    ProxyIp实体类
 * @date 2020-03-10 15:36:40
 */
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class ProxyIpEntity implements Serializable{

	  private static final long serialVersionUID = 1L;
	
	/**
	* 
	*/
	  private Integer id;
	/**
	* 
	*/
	  private String ip;
	/**
	* 
	*/
	  private String port;
	/**
	* 
	*/
	  private String website;
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
	* 状态;checkbox;0:启用,1:禁用
	*/
	  private String testCheck;
	/**
	* 状态;select;0:选择0,1:选择1,2:选择2,3:选择3
	*/
	  private Integer testSelect;
	/**
	* 状态;radio;0:启用,1:禁用
	*/
	  private Integer status;

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
	  public void setIp(String ip) {
		  this.ip = ip;
	  }
	  /**
	   * 获取：
	   */
	  public String getIp() {
	   	  return ip;
	  }
	  /**
	   * 设置：
	   */
	  public void setPort(String port) {
		  this.port = port;
	  }
	  /**
	   * 获取：
	   */
	  public String getPort() {
	   	  return port;
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
	   * 设置：状态;checkbox;0:启用,1:禁用
	   */
	  public void setTestCheck(String testCheck) {
		  this.testCheck = testCheck;
	  }
	  /**
	   * 获取：状态;checkbox;0:启用,1:禁用
	   */
	  public String getTestCheck() {
	   	  return testCheck;
	  }
	  /**
	   * 设置：状态;select;0:选择0,1:选择1,2:选择2,3:选择3
	   */
	  public void setTestSelect(Integer testSelect) {
		  this.testSelect = testSelect;
	  }
	  /**
	   * 获取：状态;select;0:选择0,1:选择1,2:选择2,3:选择3
	   */
	  public Integer getTestSelect() {
	   	  return testSelect;
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
