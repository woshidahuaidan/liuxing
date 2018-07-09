package com.city.car.model;

public class UseCarModel {

	private  String uid;
	private String udate;
	private String backdate;
	private String reason;
	
	private CarinfoModel carinfoNo;
	private DriverModel driverNo;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUdate() {
		return udate;
	}
	public void setUdate(String udate) {
		this.udate = udate;
	}
	public String getBackdate() {
		return backdate;
	}
	public void setBackdate(String backdate) {
		this.backdate = backdate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public CarinfoModel getCarinfoNo() {
		return carinfoNo;
	}
	public void setCarinfoNo(CarinfoModel carinfoNo) {
		this.carinfoNo = carinfoNo;
	}
	public DriverModel getDriverNo() {
		return driverNo;
	}
	public void setDriverNo(DriverModel driverNo) {
		this.driverNo = driverNo;
	}
	
	
	
}
