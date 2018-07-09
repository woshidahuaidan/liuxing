package com.city.car.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.city.car.model.CarinfoModel;
import com.city.car.model.DriverModel;
import com.city.car.model.UseCarModel;
import com.city.car.service.ICarinfoService;
import com.city.car.service.IDriverService;
import com.city.car.service.IUserCarService;
@Controller("useCarFrontController")
public class UseCarFrontController {

	private IUserCarService us=null;
	private IDriverService ds=null;
	private ICarinfoService cs=null;
	private UseCarModel um=null;
	private List<UseCarModel> useList=null;
	private List<CarinfoModel> carinfoList=null;
	private List<DriverModel> driverList=null;
	private String id;
	
	@Autowired
	public void setUs(IUserCarService us) {
		this.us = us;
	}
	@Autowired
	public void setDs(IDriverService ds) {
		this.ds = ds;
	}
	@Autowired
	public void setCs(ICarinfoService cs) {
		this.cs = cs;
	}
	public UseCarModel getUm() {
		return um;
	}
	public void setUm(UseCarModel um) {
		this.um = um;
	}
	public List<UseCarModel> getUseList() {
		return useList;
	}
	public void setUseList(List<UseCarModel> useList) {
		this.useList = useList;
	}
	public List<CarinfoModel> getCarinfoList() {
		return carinfoList;
	}
	public void setCarinfoList(List<CarinfoModel> carinfoList) {
		this.carinfoList = carinfoList;
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
			//�ַ�������ҳ��
			public String tomain() throws Exception
			{
				useList=us.getList();
				
				return "tomain";
			}
			//�ַ�������ҳ��
			public String toadd() throws Exception
			{
				driverList=ds.getListByAll();
				carinfoList=cs.getListByAll();
				
				return "toadd";
			}
			//�ַ����޸�ҳ��
			public String tomodify() throws Exception
			{
				
				driverList=ds.getListByAll();
				carinfoList=cs.getListByAll();
				um=us.getUse(id);
				return "tomodify";
			}
			//�ַ���ɾ��ҳ��
			public String todelete() throws Exception
			{
				
				driverList=ds.getListByAll();
				carinfoList=cs.getListByAll();
				um=us.getUse(id);
				return "todelete";
			}
			//�ַ����鿴ҳ��
			public String toview() throws Exception
			{
				um=us.getUse(id);
				driverList=ds.getListByAll();
				carinfoList=cs.getListByAll();
		
				return "toview";
			}
	
	
}
