package com.city.car.model;

import java.sql.Blob;
import java.util.Set;

public class DriverModel {

	private String dno;
	private String password;
	private String dname;
	private String dsex;
	private int age;
	private String dtel;
	private Blob photo;
	private String filename;
	private String contextType;
	private Set<UseCarModel> uses=null;
	private AddressModel address=null;
	
	
	public AddressModel getAddress() {
		return address;
	}
	public void setAddress(AddressModel address) {
		this.address = address;
	}
	public String getDno() {
		return dno;
	}
	public void setDno(String dno) {
		this.dno = dno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDsex() {
		return dsex;
	}
	public void setDsex(String dsex) {
		this.dsex = dsex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDtel() {
		return dtel;
	}
	public void setDtel(String dtel) {
		this.dtel = dtel;
	}
	public Blob getPhoto() {
		return photo;
	}
	public void setPhoto(Blob photo) {
		this.photo = photo;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getContextType() {
		return contextType;
	}
	public void setContextType(String contextType) {
		this.contextType = contextType;
	}
	public Set<UseCarModel> getUses() {
		return uses;
	}
	public void setUses(Set<UseCarModel> uses) {
		this.uses = uses;
	}
	
	
}
