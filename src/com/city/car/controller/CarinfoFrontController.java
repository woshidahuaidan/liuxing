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

@Controller("carinfoFrontController")
public class CarinfoFrontController {

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
	private int[]  insurances;
	
	
	public int[] getInsurances() {
		return insurances;
	}
	public void setInsurances(int[] insurances) {
		this.insurances = insurances;
	}
	@Autowired
	public void setCs(ICarinfoService cs) {
		this.cs = cs;
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

	public ICategoryService getCcs() {
		return ccs;
	}
	@Autowired
	public void setCcs(ICategoryService ccs) {
		this.ccs = ccs;
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
	public List<InsuranceModel> getInsuranceList() {
		return insuranceList;
	}
	public void setInsuranceList(List<InsuranceModel> insuranceList) {
		this.insuranceList = insuranceList;
	}
		//到员工主页分发分发
		public String tomain() throws Exception
		{
			categoryList=ccs.getList();	
			System.out.println(categoryList.size());
			carinfoList=cs.getListByAll();
			carinfoList=cs.getListWithPage(rows, page);
			pagecount=cs.getPageCount(rows);
			lcount=cs.getCount();
			
			
		//	System.out.println(carinfoList.size());
			
			return "tomain";
		}
		
		public String toadd() throws Exception
		{
			categoryList=ccs.getList();
			insuranceList=sc.getListByAll();
			
			return "toadd";
		}
		
		public String tomodify() throws Exception
		{
			cm=cs.getCar(id);
			categoryList=ccs.getList();
			insuranceList=sc.getListByAll();
			insurances=cs.getInsurancewithIntByCar(id);
			return "tomodify";
		}
		
		public String todelete() throws Exception
		{
			cm=cs.getCar(id);
			
			insuranceList=sc.getListByAll();
			return "todelete";
		}
		
		public String toview() throws Exception
		{
			cm=cs.getCar(id);
			categoryList=ccs.getList();
			insuranceList=sc.getListByAll();
			return "toview";
		}
		
	
	
	
	
	
	
}
