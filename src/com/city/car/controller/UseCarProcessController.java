package com.city.car.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.city.car.model.UseCarModel;
import com.city.car.service.IUserCarService;

@Controller("useCarProcessController")
public class UseCarProcessController {

	private IUserCarService us=null;
	
	private UseCarModel um=null;
	
	
	
	@Autowired
	public void setUs(IUserCarService us) {
		this.us = us;
	}

	public UseCarModel getUm() {
		return um;
	}
	public void setUm(UseCarModel um) {
		this.um = um;
	}


	//定义增加处理方法
			public String add() throws Exception
			{
				
					us.add(um);
					return "success";
				
			}
			//定义修改处理方法
			public String modify() throws Exception
			{
				
				us.modify(um);
				return "success";
				
			}
			//定义处理方法
			public String delete() throws Exception
			{
				us.delete(um);
				return "success";
				
			}	
}
