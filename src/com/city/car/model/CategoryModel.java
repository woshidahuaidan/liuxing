package com.city.car.model;

import java.util.Set;

public class CategoryModel {
	private String ccno;
	private String ccname;
	
	private Set<CarinfoModel> carinfo=null;
	
	public Set<CarinfoModel> getCarinfo() {
		return carinfo;
	}
	public void setCarinfo(Set<CarinfoModel> carinfo) {
		this.carinfo = carinfo;
	}
	public String getCcno() {
		return ccno;
	}
	public void setCcno(String ccno) {
		this.ccno = ccno;
	}
	public String getCcname() {
		return ccname;
	}
	public void setCcname(String ccname) {
		this.ccname = ccname;
	}
	

}
