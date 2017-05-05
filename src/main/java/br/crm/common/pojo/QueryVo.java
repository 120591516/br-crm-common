package br.crm.common.pojo;

import java.io.Serializable;
import java.util.List;

public class QueryVo implements Serializable {

	// 名称
	private String total_name;
	// 性质 0：医院，1：体检机构
	private Integer nature;
	// 等级名称
	private String level_name;
	// 体检软件供应商
	private String soft_company;
	// 省
	private Integer province;
	// 市
	private Integer city;
	// 县
	private Integer county;
	// 优健康合作意向
	private Integer cooperation;
	// 负责人
	private String sale_name;
	// 联系人
	private String conn_person;
	// 投资公司
	private String investment;

	private Integer pageNo = 1;// 当前页码

	private Integer pageTotal;// 总页码

	private Integer pageCount = 10;// 每页条数
	
	private Integer start;

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageTotal() {
		return pageTotal;
	}

	public void setPageTotal(Integer pageTotal) {
		this.pageTotal = pageTotal;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
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

	public String getSoft_company() {
		return soft_company;
	}

	public void setSoft_company(String soft_company) {
		this.soft_company = soft_company;
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

	public Integer getCooperation() {
		return cooperation;
	}

	public void setCooperation(Integer cooperation) {
		this.cooperation = cooperation;
	}

	public String getSale_name() {
		return sale_name;
	}

	public void setSale_name(String sale_name) {
		this.sale_name = sale_name;
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
