package com.city.car.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.city.car.model.CarinfoModel;
import com.city.car.model.CategoryModel;
import com.city.car.model.InsuranceModel;
import com.city.car.service.ICarinfoService;
import com.city.car.service.ICategoryService;
import com.city.car.service.IInsuranceService;

@Controller("carinfoProcessController")
public class CarinfoProcessController {
	private ICarinfoService cs=null;
	private ICategoryService ccs=null;
	private IInsuranceService sc=null;
	private CarinfoModel cm=null;
	private List<CarinfoModel> carinfoList=null;
	private List<CategoryModel> categoryList=null;
	private List<InsuranceModel> insuranceList=null;
	private String id;
	private int page=1;
	private int lcount=0;
	private int pagecount=0;
	private int rows=3;
	private String categoryNo;
	private int[] insurances=null;
	private int ii;
	
	public ICarinfoService getCs() {
		return cs;
	}
	@Autowired
	public void setCs(ICarinfoService cs) {
		this.cs = cs;
	}

	public ICategoryService getCcs() {
		return ccs;
	}
	@Autowired
	public void setCcs(ICategoryService ccs) {
		this.ccs = ccs;
	}

	public IInsuranceService getSc() {
		return sc;
	}
	@Autowired
	public void setSc(IInsuranceService sc) {
		this.sc = sc;
	}

	public CarinfoModel getCm() {
		return cm;
	}

	public void setCm(CarinfoModel cm) {
		this.cm = cm;
	}

	public List<CarinfoModel> getCarinfoList() {
		return carinfoList;
	}

	public void setCarinfoList(List<CarinfoModel> carinfoList) {
		this.carinfoList = carinfoList;
	}

	public List<CategoryModel> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<CategoryModel> categoryList) {
		this.categoryList = categoryList;
	}

	public List<InsuranceModel> getInsuranceList() {
		return insuranceList;
	}

	public void setInsuranceList(List<InsuranceModel> insuranceList) {
		this.insuranceList = insuranceList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getLcount() {
		return lcount;
	}

	public void setLcount(int lcount) {
		this.lcount = lcount;
	}

	public int getPagecount() {
		return pagecount;
	}

	public void setPagecount(int pagecount) {
		this.pagecount = pagecount;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public String getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(String categoryNo) {
		this.categoryNo = categoryNo;
	}

	public int[] getInsurances() {
		return insurances;
	}

	public void setInsurances(int[] insurances) {
		this.insurances = insurances;
	}

	public int getIi() {
		return ii;
	}

	public void setIi(int ii) {
		this.ii = ii;
	}

		//定义增加处理方法
		public String main() throws Exception
		{
			
			carinfoList=cs.getListByCartegory(categoryNo);
			lcount=cs.getCountByCategoryNoSearch(categoryNo);
			pagecount=cs.getPageCountByCategoryNoSearch(rows, categoryNo);
			carinfoList=cs.getListByCategoryNoSearch(categoryNo, rows, page);
			//cs.getListByCartegory(id);
			for(CarinfoModel cm:carinfoList){
				System.out.println(cm.getCid());
			}
			
				return "success";
			
		}
	
	//定义增加处理方法
	public String add() throws Exception
	{
		//if(insurances!=null)
		cs.add(cm);
		if(insurances!=null)
		cs.addInsurances(cm.getCid(), insurances);
//		else
//		System.out.println("bbb");
		//cs.addInsurance(cm.getCid(), ii);
		
		//cs.add(cm);
			
			return "success";
		
	}
	//定义修改处理方法
	public String modify() throws Exception
	{
		
		cs.modify(cm);
		return "success";
		
		
	}
	//定义处理方法
	public String delete() throws Exception
	{
		cs.delete(cm);
		return "success";
		
	}	

	

}
