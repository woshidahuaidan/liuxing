package com.city.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.city.car.model.AddressModel;
import com.city.car.model.DriverModel;
import com.city.car.service.IAddressService;
import com.city.car.service.IDriverService;
@Controller("addressFrontController")
public class AddressFrontController {

	private IAddressService as=null;
	private IDriverService ds=null;
	private AddressModel am=null;
	private List<AddressModel> addressList=null;
	private List<DriverModel> driverList=null;
	private String id;
	@Autowired
	public void setAs(IAddressService as) {
		this.as = as;
	}
	
	public AddressModel getAm() {
		return am;
	}
	public void setAm(AddressModel am) {
		this.am = am;
	}
	public List<AddressModel> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<AddressModel> addressList) {
		this.addressList = addressList;
	}
	public IDriverService getDs() {
		return ds;
	}
	@Autowired
	public void setDs(IDriverService ds) {
		this.ds = ds;
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

			//分发到增加页面
			public String tomain() throws Exception
			{
				
				addressList=as.getList();
				return "tomain";
			}
			//分发到增加页面
			public String toadd() throws Exception
			{
				driverList=ds.getListByAll();
				return "toadd";
			}
			//分发到修改页面
			public String tomodify() throws Exception
			{
				am=as.getAddress(id);
				driverList=ds.getListByAll();
				return "tomodify";
			}
			//分发到删除页面
			public String todelete() throws Exception
			{
				am=as.getAddress(id);
				return "todelete";
			}
			//分发到查看页面
			public String toview() throws Exception
			{
				am=as.getAddress(id);
				return "toview";
			}
		
}
