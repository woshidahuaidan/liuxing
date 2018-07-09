package com.city.car.service;

import java.util.List;

import com.city.car.model.CarinfoModel;
import com.city.car.model.InsuranceModel;

public interface ICarinfoService {
		//����Ա��
		public void add(CarinfoModel cm) throws Exception;
		//����Ա��
		//public void addCategory(String id,String ccno) throws Exception;
		//�޸�Ա��
		public void modify(CarinfoModel cm) throws Exception;
		//ɾ��Ա��
		public void delete(CarinfoModel cm) throws Exception;
		//ȡ��ָ������
		public CarinfoModel getCar(String id) throws Exception;
		
		//ȡ�����е�������Ϣ�б�
		public List<CarinfoModel> getListByAll() throws Exception;
			
		//ȡ��ָ�����ŵ�Ա���б�
		public List<CarinfoModel> getListByCartegory(String ccNo) throws Exception;
		
		//��ָ������ָ���ĳ���
		public void addInsurance(String id,int sno) throws Exception;
		//��ָ���������Ӷ������
		public void addInsurances(String id,int[] snos) throws Exception;
		//ȡ��ָ�������ĳ��ռ���
		public List<InsuranceModel> getInsurancesByCar(String id) throws Exception;
		//���ָ���ĳ����Ƿ���ָ���ĳ���
		public boolean hasSpecificInsurance(String id,int sno) throws Exception;
		//��ѯ�޳��յĳ����б�
		public List<InsuranceModel> getListWithoutInsurance() throws Exception;
		//��������ѯ�ķ�ҳ
		public List<CarinfoModel> getListWithPage(int rows,int page)throws Exception;
		public int getCount() throws Exception;
		public int getPageCount(int rows) throws Exception;
		//����һ�Զ�ķ���
		public int[] getInsurancewithIntByCar(String id) throws Exception;
	//��������ѯ�ķ�ҳ
		public List<CarinfoModel> getListByCategoryNoSearch(String categoryNo,int rows,int page)throws Exception;
		public int getCountByCategoryNoSearch(String categoryNo) throws Exception;
		public int getPageCountByCategoryNoSearch(int rows,String categoryNo) throws Exception;

}
