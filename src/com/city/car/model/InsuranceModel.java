package com.city.car.model;

import java.sql.Date;
import java.util.Set;

public class InsuranceModel {

	private int sno;
	private String stype;
	private String sfirm;
	private String smoney;
	private String date;
	private String stime;
	private Set<CarinfoModel> carinfo=null;
	

	public Set<CarinfoModel> getCarinfo() {
		return carinfo;
	}
	public void setCarinfo(Set<CarinfoModel> carinfo) {
		this.carinfo = carinfo;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getStype() {
		return stype;
	}
	public void setStype(String stype) {
		this.stype = stype;
	}
	public String getSfirm() {
		return sfirm;
	}
	public void setSfirm(String sfirm) {
		this.sfirm = sfirm;
	}
	public String getSmoney() {
		return smoney;
	}
	public void setSmoney(String smoney) {
		this.smoney = smoney;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStime() {
		return stime;
	}
	public void setStime(String stime) {
		this.stime = stime;
	}
	
	
}
