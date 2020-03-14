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
 *    Recruit实体类
 * @date 2020-03-10 15:36:40
 */
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class RecruitEntity implements Serializable{

	  private static final long serialVersionUID = 1L;
	
	/**
	* 
	*/
	  private Integer id;
	/**
	* 招聘标题
	*/
	  private String title;
	/**
	* 
	*/
	  private String city;
	/**
	* 公司名称
	*/
	  private String companyName;
	/**
	* 公司类型
	*/
	  private String companyType;
	/**
	* 公司网址
	*/
	  private String companyUrl;
	/**
	* 福利
	*/
	  private String welfare;
	/**
	* 公司地址
	*/
	  private String companyAddress;
	/**
	* 职位月薪
	*/
	  private String monthlySalary;
	/**
	* 
	*/
	  private Integer minSalary;
	/**
	* 
	*/
	  private String maxSalary;
	/**
	* 发布日期
	*/
	  private String releaseDate;
	/**
	* 工作性质
	*/
	  private String workNature;
	/**
	* 工作经验
	*/
	  private String experience;
	/**
	* 学历
	*/
	  private String eucation;
	/**
	* 招聘人数
	*/
	  private String rNum;
	/**
	* 职位分类
	*/
	  private String positionCategory;
	/**
	* 工作描述
	*/
	  private String jobDescription;
	/**
	* 列表页URL
	*/
	  private String listUrl;
	/**
	* 详情页URL
	*/
	  private String detailUrl;
	/**
	* 
	*/
	  private String uuid;
	/**
	* dataType表id
	*/
	  private Integer dataTypeId;
	/**
	* 
	*/
	  private String website;
	/**
	* 0:未删除 1:已删除
	*/
	  private Integer status;
	/**
	* 公司规模
	*/
	  private String companySize;
	/**
	* 任务Id
	*/
	  private Long taskId;
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

/***************************以下为自行添加的属性***********/
	/**
	 * 爬虫任务名称
	 */
	private String taskName;


      private String typeName;

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

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
	   * 设置：招聘标题
	   */
	  public void setTitle(String title) {
		  this.title = title;
	  }
	  /**
	   * 获取：招聘标题
	   */
	  public String getTitle() {
	   	  return title;
	  }
	  /**
	   * 设置：
	   */
	  public void setCity(String city) {
		  this.city = city;
	  }
	  /**
	   * 获取：
	   */
	  public String getCity() {
	   	  return city;
	  }
	  /**
	   * 设置：公司名称
	   */
	  public void setCompanyName(String companyName) {
		  this.companyName = companyName;
	  }
	  /**
	   * 获取：公司名称
	   */
	  public String getCompanyName() {
	   	  return companyName;
	  }
	  /**
	   * 设置：公司类型
	   */
	  public void setCompanyType(String companyType) {
		  this.companyType = companyType;
	  }
	  /**
	   * 获取：公司类型
	   */
	  public String getCompanyType() {
	   	  return companyType;
	  }
	  /**
	   * 设置：公司网址
	   */
	  public void setCompanyUrl(String companyUrl) {
		  this.companyUrl = companyUrl;
	  }
	  /**
	   * 获取：公司网址
	   */
	  public String getCompanyUrl() {
	   	  return companyUrl;
	  }
	  /**
	   * 设置：福利
	   */
	  public void setWelfare(String welfare) {
		  this.welfare = welfare;
	  }
	  /**
	   * 获取：福利
	   */
	  public String getWelfare() {
	   	  return welfare;
	  }
	  /**
	   * 设置：公司地址
	   */
	  public void setCompanyAddress(String companyAddress) {
		  this.companyAddress = companyAddress;
	  }
	  /**
	   * 获取：公司地址
	   */
	  public String getCompanyAddress() {
	   	  return companyAddress;
	  }
	  /**
	   * 设置：职位月薪
	   */
	  public void setMonthlySalary(String monthlySalary) {
		  this.monthlySalary = monthlySalary;
	  }
	  /**
	   * 获取：职位月薪
	   */
	  public String getMonthlySalary() {
	   	  return monthlySalary;
	  }
	  /**
	   * 设置：
	   */
	  public void setMinSalary(Integer minSalary) {
		  this.minSalary = minSalary;
	  }
	  /**
	   * 获取：
	   */
	  public Integer getMinSalary() {
	   	  return minSalary;
	  }
	  /**
	   * 设置：
	   */
	  public void setMaxSalary(String maxSalary) {
		  this.maxSalary = maxSalary;
	  }
	  /**
	   * 获取：
	   */
	  public String getMaxSalary() {
	   	  return maxSalary;
	  }
	  /**
	   * 设置：发布日期
	   */
	  public void setReleaseDate(String releaseDate) {
		  this.releaseDate = releaseDate;
	  }
	  /**
	   * 获取：发布日期
	   */
	  public String getReleaseDate() {
	   	  return releaseDate;
	  }
	  /**
	   * 设置：工作性质
	   */
	  public void setWorkNature(String workNature) {
		  this.workNature = workNature;
	  }
	  /**
	   * 获取：工作性质
	   */
	  public String getWorkNature() {
	   	  return workNature;
	  }
	  /**
	   * 设置：工作经验
	   */
	  public void setExperience(String experience) {
		  this.experience = experience;
	  }
	  /**
	   * 获取：工作经验
	   */
	  public String getExperience() {
	   	  return experience;
	  }
	  /**
	   * 设置：学历
	   */
	  public void setEucation(String eucation) {
		  this.eucation = eucation;
	  }
	  /**
	   * 获取：学历
	   */
	  public String getEucation() {
	   	  return eucation;
	  }
	  /**
	   * 设置：招聘人数
	   */
	  public void setRNum(String rNum) {
		  this.rNum = rNum;
	  }
	  /**
	   * 获取：招聘人数
	   */
	  public String getRNum() {
	   	  return rNum;
	  }
	  /**
	   * 设置：职位分类
	   */
	  public void setPositionCategory(String positionCategory) {
		  this.positionCategory = positionCategory;
	  }
	  /**
	   * 获取：职位分类
	   */
	  public String getPositionCategory() {
	   	  return positionCategory;
	  }
	  /**
	   * 设置：工作描述
	   */
	  public void setJobDescription(String jobDescription) {
		  this.jobDescription = jobDescription;
	  }
	  /**
	   * 获取：工作描述
	   */
	  public String getJobDescription() {
	   	  return jobDescription;
	  }
	  /**
	   * 设置：列表页URL
	   */
	  public void setListUrl(String listUrl) {
		  this.listUrl = listUrl;
	  }
	  /**
	   * 获取：列表页URL
	   */
	  public String getListUrl() {
	   	  return listUrl;
	  }
	  /**
	   * 设置：详情页URL
	   */
	  public void setDetailUrl(String detailUrl) {
		  this.detailUrl = detailUrl;
	  }
	  /**
	   * 获取：详情页URL
	   */
	  public String getDetailUrl() {
	   	  return detailUrl;
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
	  public void setDataTypeId(Integer dataTypeId) {
		  this.dataTypeId = dataTypeId;
	  }
	  /**
	   * 获取：
	   */
	  public Integer getDataTypeId() {
	   	  return dataTypeId;
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
	  /**
	   * 设置：公司规模
	   */
	  public void setCompanySize(String companySize) {
		  this.companySize = companySize;
	  }
	  /**
	   * 获取：公司规模
	   */
	  public String getCompanySize() {
	   	  return companySize;
	  }
	  /**
	   * 设置：任务Id
	   */
	  public void setTaskId(Long taskId) {
		  this.taskId = taskId;
	  }
	  /**
	   * 获取：任务Id
	   */
	  public Long getTaskId() {
	   	  return taskId;
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

	 
	  @Override
	  public String toString() {
		  return  ReflectionToStringBuilder.toString(this);
	  }

}
