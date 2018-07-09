package com.city.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.city.car.model.CategoryModel;
import com.city.car.service.ICategoryService;

@Controller("categoryProcessController")
public class CategoryProcessController {
	private ICategoryService ccs=null;
	private CategoryModel ccm=null;
	
	
	@Autowired
	public void setCcs(ICategoryService ccs) {
		this.ccs = ccs;
	}
	public CategoryModel getCcm() {
		return ccm;
	}
	public void setCcm(CategoryModel ccm) {
		this.ccm = ccm;
	}
	
	public String main() throws Exception
	{
		
			
			return "success";
		
	}
	//�������Ӵ�����
		public String add() throws Exception
		{
			
				ccs.add(ccm);
				return "success";
			
		}
		//�����޸Ĵ�����
		public String modify() throws Exception
		{
			
			ccs.modify(ccm);
			return "success";
			
			
		}
		//���崦����
		public String delete() throws Exception
		{
			ccs.delete(ccm);
			return "success";
			
		}	

}
