package com.city.car.service;

import java.io.File;
import java.util.List;
import com.city.car.model.DriverModel;

public interface IDriverService {

		//增加员工
		public void add(DriverModel dm) throws Exception;
		//增加员工和图片
		public void add(DriverModel dm,File photo,String fileName,String contentType) throws Exception;
		//修改员工
		public void modify(DriverModel dm) throws Exception;
		//修改员工和图片
		public void modify(DriverModel dm,File photo,String fileName,String contentType) throws Exception;
		//删除员工
		public void delete(DriverModel dm) throws Exception;
		//根据id取得指定信息
		public DriverModel getDriver(String id) throws Exception;
		//取得所有的员工列表
		public List<DriverModel> getListByAll() throws Exception;
		//取得页数和每页个数
		public List<DriverModel> getListWithPage(int rows,int page)throws Exception;
		//取得总共的个数
		public int getCount() throws Exception;
		//取得每页的个数
		public int getPageCount(int rows) throws Exception;
		//验证员工是否合法
		public boolean validate(String id,String password) throws Exception;
		
}
