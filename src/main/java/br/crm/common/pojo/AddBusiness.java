package br.crm.common.pojo;

import java.io.Serializable;
import java.util.Date;

public class AddBusiness implements Serializable {

	// ------基本信息--------------
	private Integer id;

	private String shortName;// 企业名称

	private String totalName;// 企业简称

	private Integer nature;// 性质

	private Integer province;// 省

	private Integer city;// 市

	private Integer county;// 县

	private Integer districtq;// 区

	private Integer town;// 镇

	private String address;

	private Double size;// 营业面积

	private Integer status;// 状态（0：正常，1：禁用）

	private Date createTime;// 创建时间

	private Date updateTime;// 更新时间
	
	//--------等级信息------------
	
	private String levelName;// 等级名称
	
	// ------合作信息--------------
		private Integer cooperation;// 合作意向（1-5，1最低，5最高）

		private String opinion;// 意见

		// ----------联系信息---------------
		private String connPerson;// 联系人

		private String connPost;// 职务

		private String connPhone;// 联系人手机

		private String connCall;// 联系人电话

		// ----------------体检信息----------------------
		private String year;// 年份

		private Integer count;// 体检量

		private Double turnover;// 营业额

		// ----------------软件信息----------------------

		private String softName;// 软件名称

		private String soft_company;// 软件公司

		private Double softPrice;// 软件金额

		private String softFunc;// 软件功能描述

		// ----------------投资信息----------------------

		private String investment;// 投资公司名称

		private Date investTime;// 时间

		private String investWheel;// 投资阶段

		private Double investMoney;// 投资金额

		// -------------------网络信息----------------------
		private Integer app;// app

		private Integer wechat;// 微信
		
		private Integer web;//

		// -------------------拜访信息----------------------

		private Date visitTime;// 拜访时间

		private Date visitNextTime;// 下次拜访时间

		private String visitOpinion;// 拜访意见

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getTotalName() {
		return totalName;
	}

	public void setTotalName(String totalName) {
		this.totalName = totalName;
	}

	public Integer getNature() {
		return nature;
	}

	public void setNature(Integer nature) {
		this.nature = nature;
	}

	public Integer getProvince() {
		return province;
	}

	public void setProvince(Integer province) {
		this.province = province;
	}

	public Integer getCity() {
		return city;
	}

	public void setCity(Integer city) {
		this.city = city;
	}

	public Integer getCounty() {
		return county;
	}

	public void setCounty(Integer county) {
		this.county = county;
	}

	public Integer getDistrictq() {
		return districtq;
	}

	public void setDistrictq(Integer districtq) {
		this.districtq = districtq;
	}

	public Integer getTown() {
		return town;
	}

	public void setTown(Integer town) {
		this.town = town;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public Integer getCooperation() {
		return cooperation;
	}

	public void setCooperation(Integer cooperation) {
		this.cooperation = cooperation;
	}

	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

	public String getConnPerson() {
		return connPerson;
	}

	public void setConnPerson(String connPerson) {
		this.connPerson = connPerson;
	}

	public String getConnPost() {
		return connPost;
	}

	public void setConnPost(String connPost) {
		this.connPost = connPost;
	}

	public String getConnPhone() {
		return connPhone;
	}

	public void setConnPhone(String connPhone) {
		this.connPhone = connPhone;
	}

	public String getConnCall() {
		return connCall;
	}

	public void setConnCall(String connCall) {
		this.connCall = connCall;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Double getTurnover() {
		return turnover;
	}

	public void setTurnover(Double turnover) {
		this.turnover = turnover;
	}

	public String getSoftName() {
		return softName;
	}

	public void setSoftName(String softName) {
		this.softName = softName;
	}

	public String getSoft_company() {
		return soft_company;
	}

	public void setSoft_company(String soft_company) {
		this.soft_company = soft_company;
	}

	public Double getSoftPrice() {
		return softPrice;
	}

	public void setSoftPrice(Double softPrice) {
		this.softPrice = softPrice;
	}

	public String getSoftFunc() {
		return softFunc;
	}

	public void setSoftFunc(String softFunc) {
		this.softFunc = softFunc;
	}

	public String getInvestment() {
		return investment;
	}

	public void setInvestment(String investment) {
		this.investment = investment;
	}

	public Date getInvestTime() {
		return investTime;
	}

	public void setInvestTime(Date investTime) {
		this.investTime = investTime;
	}

	public String getInvestWheel() {
		return investWheel;
	}

	public void setInvestWheel(String investWheel) {
		this.investWheel = investWheel;
	}

	public Double getInvestMoney() {
		return investMoney;
	}

	public void setInvestMoney(Double investMoney) {
		this.investMoney = investMoney;
	}

	public Integer getApp() {
		return app;
	}

	public void setApp(Integer app) {
		this.app = app;
	}

	public Integer getWechat() {
		return wechat;
	}

	public void setWechat(Integer wechat) {
		this.wechat = wechat;
	}

	public Date getVisitTime() {
		return visitTime;
	}

	public void setVisitTime(Date visitTime) {
		this.visitTime = visitTime;
	}

	public Date getVisitNextTime() {
		return visitNextTime;
	}

	public void setVisitNextTime(Date visitNextTime) {
		this.visitNextTime = visitNextTime;
	}

	public String getVisitOpinion() {
		return visitOpinion;
	}

	public void setVisitOpinion(String visitOpinion) {
		this.visitOpinion = visitOpinion;
	}

	public Integer getWeb() {
		return web;
	}

	public void setWeb(Integer web) {
		this.web = web;
	}
	
	
}

