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
 *    CrawlerDataType实体类
 * @date 2020-03-10 15:36:40
 */
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class CrawlerDataTypeEntity implements Serializable{

	  private static final long serialVersionUID = 1L;
	
	/**
	* 主键自增
	*/
	  private Long id;
	/**
	* 类型名称
	*/
	  private String typeName;
	/**
	* 停止词
	*/
	  private String stopWord;
	/**
	* 拓展词
	*/
	  private String extWord;
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
	   * 设置：主键自增
	   */
	  public void setId(Long id) {
		  this.id = id;
	  }
	  /**
	   * 获取：主键自增
	   */
	  public Long getId() {
	   	  return id;
	  }
	  /**
	   * 设置：类型名称
	   */
	  public void setTypeName(String typeName) {
		  this.typeName = typeName;
	  }
	  /**
	   * 获取：类型名称
	   */
	  public String getTypeName() {
	   	  return typeName;
	  }
	  /**
	   * 设置：停止词
	   */
	  public void setStopWord(String stopWord) {
		  this.stopWord = stopWord;
	  }
	  /**
	   * 获取：停止词
	   */
	  public String getStopWord() {
	   	  return stopWord;
	  }
	  /**
	   * 设置：拓展词
	   */
	  public void setExtWord(String extWord) {
		  this.extWord = extWord;
	  }
	  /**
	   * 获取：拓展词
	   */
	  public String getExtWord() {
	   	  return extWord;
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
