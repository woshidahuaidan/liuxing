package com.city.car.service;

import java.io.File;
import java.util.List;
import com.city.car.model.DriverModel;

public interface IDriverService {

		//����Ա��
		public void add(DriverModel dm) throws Exception;
		//����Ա����ͼƬ
		public void add(DriverModel dm,File photo,String fileName,String contentType) throws Exception;
		//�޸�Ա��
		public void modify(DriverModel dm) throws Exception;
		//�޸�Ա����ͼƬ
		public void modify(DriverModel dm,File photo,String fileName,String contentType) throws Exception;
		//ɾ��Ա��
		public void delete(DriverModel dm) throws Exception;
		//����idȡ��ָ����Ϣ
		public DriverModel getDriver(String id) throws Exception;
		//ȡ�����е�Ա���б�
		public List<DriverModel> getListByAll() throws Exception;
		//ȡ��ҳ����ÿҳ����
		public List<DriverModel> getListWithPage(int rows,int page)throws Exception;
		//ȡ���ܹ��ĸ���
		public int getCount() throws Exception;
		//ȡ��ÿҳ�ĸ���
		public int getPageCount(int rows) throws Exception;
		//��֤Ա���Ƿ�Ϸ�
		public boolean validate(String id,String password) throws Exception;
		
}
