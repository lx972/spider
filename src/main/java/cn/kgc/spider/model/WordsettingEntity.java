package cn.kgc.spider.model;

import java.io.Serializable;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author lx
 *    Wordsetting实体类
 * @date 2020-03-10 15:36:40
 */
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class WordsettingEntity implements Serializable{

	  private static final long serialVersionUID = 1L;
	
	/**
	* 
	*/
	  private Integer id;
	/**
	* 
	*/
	  private String name;
	/**
	* 
	*/
	  private String value;
	/**
	* 0:未删除 1:已删除
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
	  public void setValue(String value) {
		  this.value = value;
	  }
	  /**
	   * 获取：
	   */
	  public String getValue() {
	   	  return value;
	  }
	  /**
	   * 设置：0:未删除 1:已删除
	   */
	  public void setStatus(Integer status) {
		  this.status = status;
	  }
	  /**
	   * 获取：0:未删除 1:已删除
	   */
	  public Integer getStatus() {
	   	  return status;
	  }

	 
	  @Override
	  public String toString() {
		  return  ReflectionToStringBuilder.toString(this);
	  }

}
