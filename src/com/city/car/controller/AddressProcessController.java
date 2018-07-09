package com.city.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.city.car.model.AddressModel;
import com.city.car.service.IAddressService;
@Controller("addressProcessController")
public class AddressProcessController {

	private IAddressService as=null;
	private AddressModel am=null;
	public AddressModel getAm() {
		return am;
	}
	public void setAm(AddressModel am) {
		this.am = am;
	}
	@Autowired
	public void setAs(IAddressService as) {
		this.as = as;
	}
	//定义增加处理方法
			public String add() throws Exception
			{
				
					as.add(am);
					return "success";
				
			}
			//定义修改处理方法
			public String modify() throws Exception
			{
				
				as.add(am);
				return "success";
				
				
			}
			//定义处理方法
			public String delete() throws Exception
			{
				as.add(am);
				return "success";
				
			}	
	
}
