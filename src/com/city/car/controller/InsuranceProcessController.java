package com.city.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.city.car.model.InsuranceModel;
import com.city.car.service.IInsuranceService;
@Controller("insuranceProcessController")
public class InsuranceProcessController {

	private IInsuranceService ss=null;
	private InsuranceModel sm=null;
	
	@Autowired
	public void setSs(IInsuranceService ss) {
		this.ss = ss;
	}
	public InsuranceModel getSm() {
		return sm;
	}
	public void setSm(InsuranceModel sm) {
		this.sm = sm;
	}
	//定义增加处理方法
			public String add() throws Exception
			{
				
					ss.add(sm);
					return "success";
				
			}
			//定义修改处理方法
			public String modify() throws Exception
			{
				
				ss.modify(sm);
				return "success";
				
				
			}
			//定义处理方法
			public String delete() throws Exception
			{
				ss.delete(sm);
				return "success";
				
			}	
}
