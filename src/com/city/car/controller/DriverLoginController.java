package com.city.car.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.city.car.model.DriverModel;
import com.city.car.service.IDriverService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Controller("driverLoginController")
public class DriverLoginController extends ActionSupport{

	private IDriverService ds=null;
	private DriverModel dm=null;
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
	
	public String login()throws Exception{
		if(ds.validate(dm.getDno(), dm.getPassword())){
//			ActionContext.getContext().getSession().put("dno", dm.getDno());
			//非耦合方式
			ActionContext ac=ActionContext.getContext();
			Map<String,Object> session=ac.getSession();
			session.put("dm", dm);
			return "success";
		}
		else
			return "error";
	}
	
	
	
}
