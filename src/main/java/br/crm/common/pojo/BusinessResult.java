package br.crm.common.pojo;

import java.io.Serializable;

public class BusinessResult implements Serializable {

	// 负责人
	private String sale_name;
	// 名称
	private String total_name;
	// 性质 0：医院，1：体检机构
	private Integer nature;
	// 等级名称
	private String level_name;
	// 优健康合作意向
	private Integer cooperation;
	// 体检软件供应商
	private String soft_company;
	// 年体检量(万人）
	private Integer count;
	// 单位地址
	private String address;
	// 联系人
	private String conn_person;
	// 投资公司
	private String investment;

	public String getSale_name() {
		return sale_name;
	}

	public void setSale_name(String sale_name) {
		this.sale_name = sale_name;
	}

	public String getTotal_name() {
		return total_name;
	}

	public void setTotal_name(String total_name) {
		this.total_name = total_name;
	}

	public Integer getNature() {
		return nature;
	}

	public void setNature(Integer nature) {
		this.nature = nature;
	}

	public String getLevel_name() {
		return level_name;
	}

	public void setLevel_name(String level_name) {
		this.level_name = level_name;
	}

	public Integer getCooperation() {
		return cooperation;
	}

	public void setCooperation(Integer cooperation) {
		this.cooperation = cooperation;
	}

	public String getSoft_company() {
		return soft_company;
	}

	public void setSoft_company(String soft_company) {
		this.soft_company = soft_company;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getConn_person() {
		return conn_person;
	}

	public void setConn_person(String conn_person) {
		this.conn_person = conn_person;
	}

	public String getInvestment() {
		return investment;
	}

	public void setInvestment(String investment) {
		this.investment = investment;
	}

}
