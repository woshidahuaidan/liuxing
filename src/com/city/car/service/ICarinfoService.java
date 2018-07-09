package com.city.car.service;

import java.util.List;

import com.city.car.model.CarinfoModel;
import com.city.car.model.InsuranceModel;

public interface ICarinfoService {
		//增加员工
		public void add(CarinfoModel cm) throws Exception;
		//增加员工
		//public void addCategory(String id,String ccno) throws Exception;
		//修改员工
		public void modify(CarinfoModel cm) throws Exception;
		//删除员工
		public void delete(CarinfoModel cm) throws Exception;
		//取得指定汽车
		public CarinfoModel getCar(String id) throws Exception;
		
		//取得所有的汽车信息列表
		public List<CarinfoModel> getListByAll() throws Exception;
			
		//取得指定部门的员工列表
		public List<CarinfoModel> getListByCartegory(String ccNo) throws Exception;
		
		//给指定增加指定的车险
		public void addInsurance(String id,int sno) throws Exception;
		//给指定车辆增加多个车险
		public void addInsurances(String id,int[] snos) throws Exception;
		//取得指定车辆的车险集合
		public List<InsuranceModel> getInsurancesByCar(String id) throws Exception;
		//检查指定的车辆是否有指定的车险
		public boolean hasSpecificInsurance(String id,int sno) throws Exception;
		//查询无车险的车辆列表
		public List<InsuranceModel> getListWithoutInsurance() throws Exception;
		//无条件查询的分页
		public List<CarinfoModel> getListWithPage(int rows,int page)throws Exception;
		public int getCount() throws Exception;
		public int getPageCount(int rows) throws Exception;
		//回填一对多的方法
		public int[] getInsurancewithIntByCar(String id) throws Exception;
	//有条件查询的分页
		public List<CarinfoModel> getListByCategoryNoSearch(String categoryNo,int rows,int page)throws Exception;
		public int getCountByCategoryNoSearch(String categoryNo) throws Exception;
		public int getPageCountByCategoryNoSearch(int rows,String categoryNo) throws Exception;

}
