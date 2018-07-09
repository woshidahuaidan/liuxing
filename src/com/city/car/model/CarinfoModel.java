package com.city.car.model;

import java.util.Set;

public class CarinfoModel {

	private String cid;
	private String cmodel;
	private int cnum;
	private String ccolor;
	private String cdate;
	
	private CategoryModel category=null;
	private Set<InsuranceModel> insurance=null;
	private Set<UseCarModel> use=null;
	
	
	public Set<UseCarModel> getUse() {
		return use;
	}
	public void setUse(Set<UseCarModel> use) {
		this.use = use;
	}
	public Set<InsuranceModel> getInsurance() {
		return insurance;
	}
	public void setInsurance(Set<InsuranceModel> insurance) {
		this.insurance = insurance;
	}
	public CategoryModel getCategory() {
		return category;
	}
	public void setCategory(CategoryModel category) {
		this.category = category;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCmodel() {
		return cmodel;
	}
	public void setCmodel(String cmodel) {
		this.cmodel = cmodel;
	}
	
	public int getCnum() {
		return cnum;
	}
	public void setCnum(int cnum) {
		this.cnum = cnum;
	}
	public String getCcolor() {
		return ccolor;
	}
	public void setCcolor(String ccolor) {
		this.ccolor = ccolor;
	}
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	
	
}
