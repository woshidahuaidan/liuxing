package com.city.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.city.car.model.InsuranceModel;
import com.city.car.service.IInsuranceService;
@Controller("insuranceFrontController")
public class InsuranceFrontController {

	private IInsuranceService ss=null;
	private InsuranceModel sm=null;
	private List<InsuranceModel> insuranceList=null;
	private int id=0;
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
	
	public List<InsuranceModel> getInsuranceList() {
		return insuranceList;
	}
	public void setInsuranceList(List<InsuranceModel> insuranceList) {
		this.insuranceList = insuranceList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
			//到车险主页分发
			public String tomain() throws Exception
			{
				insuranceList=ss.getListByAll();
				
				return "tomain";
			}
			
			public String toadd() throws Exception
			{
				
				return "toadd";
			}
			
			public String tomodify() throws Exception
			{
				sm=ss.getInsurance(id);
				return "tomodify";
			}
			
			public String todelete() throws Exception
			{
				sm=ss.getInsurance(id);
				return "todelete";
			}
			
			public String toview() throws Exception
			{
				sm=ss.getInsurance(id);			
				return "toview";
			}
	
	
	
}
