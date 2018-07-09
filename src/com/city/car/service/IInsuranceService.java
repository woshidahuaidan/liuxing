package com.city.car.service;

import java.util.List;

import com.city.car.model.InsuranceModel;

public interface IInsuranceService {

		//增加车险
		public void add(InsuranceModel sm) throws Exception;
		//修改车险
		public void modify(InsuranceModel sm) throws Exception;
		//删除车险
		public void delete(InsuranceModel sm) throws Exception;
		//取得指定车险
		public InsuranceModel getInsurance(int sno) throws Exception;
		//取得所有车险列表
		public List<InsuranceModel>  getListByAll() throws Exception;
}
