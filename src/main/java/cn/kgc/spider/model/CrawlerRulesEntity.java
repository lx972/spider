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
 *    CrawlerRules实体类
 * @date 2020-03-10 15:36:40
 */
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class CrawlerRulesEntity implements Serializable{

	  private static final long serialVersionUID = 1L;
	
	/**
	* 主键
	*/
	  private Long id;
	/**
	* 规则名称
	*/
	  private String ruleName;
	/**
	* 规则网址
	*/
	  private String url;
	/**
	* 请求方式;select;1:GET,2:POST
	*/
	  private Integer reqMethod;
	/**
	* 开始页数
	*/
	  private Integer startPageNo;
	/**
	* 结束页数
	*/
	  private Integer endPageNo;
	/**
	* 是否需要代理;radios;1:代理,0:默认访问
	*/
	  private Integer isNeedProxy;
	/**
	* 是否需要分页;radio;1:需要,2:不需要
	*/
	  private Integer isNeedPage;
	/**
	* 规则描述
	*/
	  private String description;
	/**
	* 状态;radio;0:启用,1:禁用
	*/
	  private Integer status;
	/**
	 * 创建时间
	 */
      @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss" ,timezone = "GMT+8")
	  private Date creatdTime;
	/**
	 * 更新时间
	 */
      @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss" ,timezone = "GMT+8")
	  private Date updatedTime;

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
	   * 设置：规则名称
	   */
	  public void setRuleName(String ruleName) {
		  this.ruleName = ruleName;
	  }
	  /**
	   * 获取：规则名称
	   */
	  public String getRuleName() {
	   	  return ruleName;
	  }
	  /**
	   * 设置：规则网址
	   */
	  public void setUrl(String url) {
		  this.url = url;
	  }
	  /**
	   * 获取：规则网址
	   */
	  public String getUrl() {
	   	  return url;
	  }
	  /**
	   * 设置：请求方式;select;1:GET,2:POST
	   */
	  public void setReqMethod(Integer reqMethod) {
		  this.reqMethod = reqMethod;
	  }
	  /**
	   * 获取：请求方式;select;1:GET,2:POST
	   */
	  public Integer getReqMethod() {
	   	  return reqMethod;
	  }
	  /**
	   * 设置：开始页数
	   */
	  public void setStartPageNo(Integer startPageNo) {
		  this.startPageNo = startPageNo;
	  }
	  /**
	   * 获取：开始页数
	   */
	  public Integer getStartPageNo() {
	   	  return startPageNo;
	  }
	  /**
	   * 设置：结束页数
	   */
	  public void setEndPageNo(Integer endPageNo) {
		  this.endPageNo = endPageNo;
	  }
	  /**
	   * 获取：结束页数
	   */
	  public Integer getEndPageNo() {
	   	  return endPageNo;
	  }
	  /**
	   * 设置：是否需要代理;radios;1:代理,0:默认访问
	   */
	  public void setIsNeedProxy(Integer isNeedProxy) {
		  this.isNeedProxy = isNeedProxy;
	  }
	  /**
	   * 获取：是否需要代理;radios;1:代理,0:默认访问
	   */
	  public Integer getIsNeedProxy() {
	   	  return isNeedProxy;
	  }
	  /**
	   * 设置：是否需要分页;radio;1:需要,2:不需要
	   */
	  public void setIsNeedPage(Integer isNeedPage) {
		  this.isNeedPage = isNeedPage;
	  }
	  /**
	   * 获取：是否需要分页;radio;1:需要,2:不需要
	   */
	  public Integer getIsNeedPage() {
	   	  return isNeedPage;
	  }
	  /**
	   * 设置：规则描述
	   */
	  public void setDescription(String description) {
		  this.description = description;
	  }
	  /**
	   * 获取：规则描述
	   */
	  public String getDescription() {
	   	  return description;
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
	  /**
	   * 设置：创建时间
	   */
	  public void setCreatdTime(Date creatdTime) {
		  this.creatdTime = creatdTime;
	  }
	  /**
	   * 获取：创建时间
	   */
	  public Date getCreatdTime() {
	   	  return creatdTime;
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
