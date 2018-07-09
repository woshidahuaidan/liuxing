package com.city.car.service;

import java.util.List;

import com.city.car.model.InsuranceModel;

public interface IInsuranceService {

		//���ӳ���
		public void add(InsuranceModel sm) throws Exception;
		//�޸ĳ���
		public void modify(InsuranceModel sm) throws Exception;
		//ɾ������
		public void delete(InsuranceModel sm) throws Exception;
		//ȡ��ָ������
		public InsuranceModel getInsurance(int sno) throws Exception;
		//ȡ�����г����б�
		public List<InsuranceModel>  getListByAll() throws Exception;
}
