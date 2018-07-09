package com.city.car.controller;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.city.car.model.DriverModel;
import com.city.car.service.IDriverService;
@Controller("driverProcessController")
public class DriverProcessController {

	private IDriverService ds=null;
	private DriverModel dm=null;
	private List<DriverModel> driverList=null;
	private String id=null;
	private File photo;
	private String photoFileName;
	private String photoContentType;
	public IDriverService getDs() {
		return ds;
	}
	@Autowired
	public void setDs(IDriverService ds) {
		this.ds = ds;
	}
	public DriverModel getDm() {
		return dm;
	}
	public void setDm(DriverModel dm) {
		this.dm = dm;
	}
	public List<DriverModel> getDriverList() {
		return driverList;
	}
	public void setDriverList(List<DriverModel> driverList) {
		this.driverList = driverList;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public File getPhoto() {
		return photo;
	}
	public void setPhoto(File photo) {
		this.photo = photo;
	}
	public String getPhotoFileName() {
		return photoFileName;
	}
	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}
	
	public String getPhotoContentType() {
		return photoContentType;
	}
	public void setPhotoContentType(String photoContentType) {
		this.photoContentType = photoContentType;
	}
	public String add() throws Exception
	{
		if(photoFileName==null||photoFileName.trim().length()==0){
			ds.add(dm);
		}
		else{
			ds.add(dm, photo, photoFileName, photoContentType);
		}
		
	
		return "success";
	}
	
	public String modify() throws Exception
	{
		if(photoFileName==null||photoFileName.trim().length()==0){
			ds.modify(dm);
		}
		else{
			ds.modify(dm, photo, photoFileName, photoContentType);
		}
		return "success";
	}
	
	public String delete() throws Exception
	{
		ds.delete(dm);
		return "success";
	}
	
	
	
	
	
}
