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
 *    CrawlerNode实体类
 * @date 2020-03-10 15:36:40
 */
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class CrawlerNodeEntity implements Serializable{

	  private static final long serialVersionUID = 1L;
	
	/**
	* 
	*/
	  private Long id;
	/**
	* 
	*/
	  private Long parent;
	/**
	* 节点名称
	*/
	  private String name;
	/**
	* 节点类型;select;1:jsoup选择,2:字符串截取,3:正则表达式
	*/
	  private String type;
	/**
	* 节点级别
	*/
	  private String level;
	/**
	* 是否有子节点;radio;1:有,0:无
	*/
	  private String hasNext;
	/**
	* 保存对应字段
	*/
	  private String saveCloumn;
	/**
	* jsuop选择表达式
	*/
	  private String classReg;
	/**
	* 开始字符串
	*/
	  private String startStr;
	/**
	* 结束字符串
	*/
	  private String endStr;
	/**
	* 结果类型
	*/
	  private String resultType;
	/**
	* 元素位置;select;0:全部元素,1:首元素,2:末元素,3:指定位置元素
	*/
	  private Integer position;
	/**
	* 
	*/
	  private Integer selfPosition;
	/**
	* 是否是超链接;radio;0:否,1:是
	*/
	  private String isHref;
	/**
	* 正则表达式
	*/
	  private String reg;
	/**
	* 
	*/
	  private Long ruleId;
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
	   * 设置：节点名称
	   */
	  public void setName(String name) {
		  this.name = name;
	  }
	  /**
	   * 获取：节点名称
	   */
	  public String getName() {
	   	  return name;
	  }
	  /**
	   * 设置：节点类型;select;1:jsoup选择,2:字符串截取,3:正则表达式
	   */
	  public void setType(String type) {
		  this.type = type;
	  }
	  /**
	   * 获取：节点类型;select;1:jsoup选择,2:字符串截取,3:正则表达式
	   */
	  public String getType() {
	   	  return type;
	  }
	  /**
	   * 设置：节点级别
	   */
	  public void setLevel(String level) {
		  this.level = level;
	  }
	  /**
	   * 获取：节点级别
	   */
	  public String getLevel() {
	   	  return level;
	  }
	  /**
	   * 设置：是否有子节点;radio;1:有,0:无
	   */
	  public void setHasNext(String hasNext) {
		  this.hasNext = hasNext;
	  }
	  /**
	   * 获取：是否有子节点;radio;1:有,0:无
	   */
	  public String getHasNext() {
	   	  return hasNext;
	  }
	  /**
	   * 设置：保存对应字段
	   */
	  public void setSaveCloumn(String saveCloumn) {
		  this.saveCloumn = saveCloumn;
	  }
	  /**
	   * 获取：保存对应字段
	   */
	  public String getSaveCloumn() {
	   	  return saveCloumn;
	  }
	  /**
	   * 设置：jsuop选择表达式
	   */
	  public void setClassReg(String classReg) {
		  this.classReg = classReg;
	  }
	  /**
	   * 获取：jsuop选择表达式
	   */
	  public String getClassReg() {
	   	  return classReg;
	  }
	  /**
	   * 设置：开始字符串
	   */
	  public void setStartStr(String startStr) {
		  this.startStr = startStr;
	  }
	  /**
	   * 获取：开始字符串
	   */
	  public String getStartStr() {
	   	  return startStr;
	  }
	  /**
	   * 设置：结束字符串
	   */
	  public void setEndStr(String endStr) {
		  this.endStr = endStr;
	  }
	  /**
	   * 获取：结束字符串
	   */
	  public String getEndStr() {
	   	  return endStr;
	  }
	  /**
	   * 设置：结果类型
	   */
	  public void setResultType(String resultType) {
		  this.resultType = resultType;
	  }
	  /**
	   * 获取：结果类型
	   */
	  public String getResultType() {
	   	  return resultType;
	  }
	  /**
	   * 设置：元素位置;select;0:全部元素,1:首元素,2:末元素,3:指定位置元素
	   */
	  public void setPosition(Integer position) {
		  this.position = position;
	  }
	  /**
	   * 获取：元素位置;select;0:全部元素,1:首元素,2:末元素,3:指定位置元素
	   */
	  public Integer getPosition() {
	   	  return position;
	  }
	  /**
	   * 设置：
	   */
	  public void setSelfPosition(Integer selfPosition) {
		  this.selfPosition = selfPosition;
	  }
	  /**
	   * 获取：
	   */
	  public Integer getSelfPosition() {
	   	  return selfPosition;
	  }
	  /**
	   * 设置：是否是超链接;radio;0:否,1:是
	   */
	  public void setIsHref(String isHref) {
		  this.isHref = isHref;
	  }
	  /**
	   * 获取：是否是超链接;radio;0:否,1:是
	   */
	  public String getIsHref() {
	   	  return isHref;
	  }
	  /**
	   * 设置：正则表达式
	   */
	  public void setReg(String reg) {
		  this.reg = reg;
	  }
	  /**
	   * 获取：正则表达式
	   */
	  public String getReg() {
	   	  return reg;
	  }
	  /**
	   * 设置：
	   */
	  public void setRuleId(Long ruleId) {
		  this.ruleId = ruleId;
	  }
	  /**
	   * 获取：
	   */
	  public Long getRuleId() {
	   	  return ruleId;
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
