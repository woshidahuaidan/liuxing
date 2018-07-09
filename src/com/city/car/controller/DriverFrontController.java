package com.city.car.controller;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.city.car.model.DriverModel;
import com.city.car.service.IDriverService;

@Controller("driverFrontController")
public class DriverFrontController {
	private IDriverService ds=null;
	private DriverModel dm=null;
	private List<DriverModel> driverList=null;
	private String id=null;
	private int page=1;
	private int lcount=0;
	private int pagecount=0;
	private int rows=3;
	
	private String[] sexs=new String[]{"男","女"};
	private Map<String,String> sexss=new HashMap<String,String>();
	
	
	
	public String[] getSexs() {
		return sexs;
	}
	public void setSexs(String[] sexs) {
		this.sexs = sexs;
	}
	public Map<String, String> getSexss() {
		return sexss;
	}
	public void setSexss(Map<String, String> sexss) {
		this.sexss = sexss;
	}
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
	public void setDn(DriverModel dm) {
		this.dm = dm;
	}
	public List<DriverModel> getDriverList() {
		return driverList;
	}
	public void setDriverList(List<DriverModel> driverList) {
		this.driverList = driverList;
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
		//到员工主页分发分发
		public String tomain() throws Exception
		{
			driverList=ds.getListByAll();
			driverList=ds.getListWithPage(rows, page);
			pagecount=ds.getPageCount(rows);
			lcount=ds.getCount();
			return "tomain";
		}
		
		public String toadd() throws Exception
		{
		
			return "toadd";
		}
		
		public String tomodify() throws Exception
		{
			dm=ds.getDriver(id);
			
			sexss.put("0", "男");
			sexss.put("1", "女");
			return "tomodify";
		}
		
		public String todelete() throws Exception
		{
			dm=ds.getDriver(id);
			return "todelete";
		}
		
		
	
		public String toview() throws Exception
		{
			dm=ds.getDriver(id);
			
			return "toview";
		}
		
	

}
