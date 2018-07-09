package com.city.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.city.car.model.CategoryModel;
import com.city.car.service.ICategoryService;

@Controller("cateegoryFrontController")
public class CategoryFrontController {

	private ICategoryService ccs=null;
	private CategoryModel ccm=null;
	private String ccno=null;
	private List<CategoryModel> categorylist=null;
	
	@Autowired
	public void setCcs(ICategoryService ccs) {
		this.ccs = ccs;
	}
	
	
	public List<CategoryModel> getCategorylist() {
		return categorylist;
	}


	public void setCategorylist(List<CategoryModel> categorylist) {
		this.categorylist = categorylist;
	}


	public CategoryModel getCcm() {
		return ccm;
	}
	public void setCcm(CategoryModel ccm) {
		this.ccm = ccm;
	}
	public String getCcno() {
		return ccno;
	}
	public void setCcno(String ccno) {
		this.ccno = ccno;
	}
	
		//�ַ�������ҳ��
		public String tomain() throws Exception
		{
			categorylist=ccs.getList();
			
			return "tomain";
		}
		//�ַ�������ҳ��
		public String toadd() throws Exception
		{
			
			return "toadd";
		}
		//�ַ����޸�ҳ��
		public String tomodify() throws Exception
		{
			
			if(ccs.getCayegory(ccno)!=null)
			ccm=ccs.getCayegory(ccno);
			System.out.println(ccno);
			return "tomodify";
		}
		//�ַ���ɾ��ҳ��
		public String todelete() throws Exception
		{
			ccm=ccs.getCayegory(ccno);
			return "todelete";
		}
		//�ַ����鿴ҳ��
		public String toview() throws Exception
		{
			ccm=ccs.getCayegory(ccno);
			return "toview";
		}
	
	
	
}
