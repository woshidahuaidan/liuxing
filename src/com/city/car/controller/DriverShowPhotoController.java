package com.city.car.controller;

import java.io.File;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.city.car.model.DriverModel;
import com.city.car.service.IDriverService;
@Controller("driverShowPhotoController")
public class DriverShowPhotoController {

	private IDriverService ds=null;
	private DriverModel dm=null;

	private String id=null;
	
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
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public InputStream getInputStream() throws Exception
	{
		InputStream result=null;
		dm=ds.getDriver(id);
		if(dm!=null&&dm.getFilename()!=null){
			result=dm.getPhoto().getBinaryStream();
		}
	
		return result;
	}
	
	public String show() throws Exception
	{
		
		return "show";
	}
	
}
