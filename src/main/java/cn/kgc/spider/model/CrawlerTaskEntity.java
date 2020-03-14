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
 *    CrawlerTask实体类
 * @date 2020-03-10 15:36:40
 */
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class CrawlerTaskEntity implements Serializable{

	  private static final long serialVersionUID = 1L;
	
	/**
	* 主键
	*/
	  private Long id;
	/**
	* 任务名称
	*/
	  private String taskName;
	/**
	* 规则Id
	*/
	  private Long ruleId;
	/**
	* 数据类型;select;(1:java,2:web前端,3:大数据,4:运维,5:net工程师)
	*/
	  private Integer dataTypeId;
	/**
	* 采集URL
	*/
	  private String url;
	/**
	* 关键词
	*/
	  private String keyword;
	/**
	* 是否需要分页;0:不需要
	*/
	  private Integer isNeedPage;
	/**
	* 开始页数
	*/
	  private Integer startPage;
	/**
	* 结束页数
	*/
	  private Integer endPage;
	/**
	* 线程数目
	*/
	  private Integer threadCount;
	/**
	* 爬虫进度
	*/
	  private String dataProgress;
	/**
	* 关键词抽取进度
	*/
	  private String keywordProgress;
	/**
	* 爬虫数目
	*/
	  private Integer dataCounts;
	/**
	* 抽取次数
	*/
	  private Integer keywordCounts;
	/**
	* 数据总数
	*/
	  private Integer totalCount;
	/**
	* 任务描述
	*/
	  private String description;
	/**
	* 0:待执行,1:正在执行
	*/
	  private Integer status;
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
	   * 设置：任务名称
	   */
	  public void setTaskName(String taskName) {
		  this.taskName = taskName;
	  }
	  /**
	   * 获取：任务名称
	   */
	  public String getTaskName() {
	   	  return taskName;
	  }
	  /**
	   * 设置：规则Id
	   */
	  public void setRuleId(Long ruleId) {
		  this.ruleId = ruleId;
	  }
	  /**
	   * 获取：规则Id
	   */
	  public Long getRuleId() {
	   	  return ruleId;
	  }
	  /**
	   * 设置：数据类型;select;(1:java,2:web前端,3:大数据,4:运维,5:net工程师)
	   */
	  public void setDataTypeId(Integer dataTypeId) {
		  this.dataTypeId = dataTypeId;
	  }
	  /**
	   * 获取：数据类型;select;(1:java,2:web前端,3:大数据,4:运维,5:net工程师)
	   */
	  public Integer getDataTypeId() {
	   	  return dataTypeId;
	  }
	  /**
	   * 设置：采集URL
	   */
	  public void setUrl(String url) {
		  this.url = url;
	  }
	  /**
	   * 获取：采集URL
	   */
	  public String getUrl() {
	   	  return url;
	  }
	  /**
	   * 设置：关键词
	   */
	  public void setKeyword(String keyword) {
		  this.keyword = keyword;
	  }
	  /**
	   * 获取：关键词
	   */
	  public String getKeyword() {
	   	  return keyword;
	  }
	  /**
	   * 设置：是否需要分页;0:不需要
	   */
	  public void setIsNeedPage(Integer isNeedPage) {
		  this.isNeedPage = isNeedPage;
	  }
	  /**
	   * 获取：是否需要分页;0:不需要
	   */
	  public Integer getIsNeedPage() {
	   	  return isNeedPage;
	  }
	  /**
	   * 设置：开始页数
	   */
	  public void setStartPage(Integer startPage) {
		  this.startPage = startPage;
	  }
	  /**
	   * 获取：开始页数
	   */
	  public Integer getStartPage() {
	   	  return startPage;
	  }
	  /**
	   * 设置：结束页数
	   */
	  public void setEndPage(Integer endPage) {
		  this.endPage = endPage;
	  }
	  /**
	   * 获取：结束页数
	   */
	  public Integer getEndPage() {
	   	  return endPage;
	  }
	  /**
	   * 设置：线程数目
	   */
	  public void setThreadCount(Integer threadCount) {
		  this.threadCount = threadCount;
	  }
	  /**
	   * 获取：线程数目
	   */
	  public Integer getThreadCount() {
	   	  return threadCount;
	  }
	  /**
	   * 设置：爬虫进度
	   */
	  public void setDataProgress(String dataProgress) {
		  this.dataProgress = dataProgress;
	  }
	  /**
	   * 获取：爬虫进度
	   */
	  public String getDataProgress() {
	   	  return dataProgress;
	  }
	  /**
	   * 设置：关键词抽取进度
	   */
	  public void setKeywordProgress(String keywordProgress) {
		  this.keywordProgress = keywordProgress;
	  }
	  /**
	   * 获取：关键词抽取进度
	   */
	  public String getKeywordProgress() {
	   	  return keywordProgress;
	  }
	  /**
	   * 设置：爬虫数目
	   */
	  public void setDataCounts(Integer dataCounts) {
		  this.dataCounts = dataCounts;
	  }
	  /**
	   * 获取：爬虫数目
	   */
	  public Integer getDataCounts() {
	   	  return dataCounts;
	  }
	  /**
	   * 设置：抽取次数
	   */
	  public void setKeywordCounts(Integer keywordCounts) {
		  this.keywordCounts = keywordCounts;
	  }
	  /**
	   * 获取：抽取次数
	   */
	  public Integer getKeywordCounts() {
	   	  return keywordCounts;
	  }
	  /**
	   * 设置：数据总数
	   */
	  public void setTotalCount(Integer totalCount) {
		  this.totalCount = totalCount;
	  }
	  /**
	   * 获取：数据总数
	   */
	  public Integer getTotalCount() {
	   	  return totalCount;
	  }
	  /**
	   * 设置：任务描述
	   */
	  public void setDescription(String description) {
		  this.description = description;
	  }
	  /**
	   * 获取：任务描述
	   */
	  public String getDescription() {
	   	  return description;
	  }
	  /**
	   * 设置：0:待执行,1:正在执行
	   */
	  public void setStatus(Integer status) {
		  this.status = status;
	  }
	  /**
	   * 获取：0:待执行,1:正在执行
	   */
	  public Integer getStatus() {
	   	  return status;
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
