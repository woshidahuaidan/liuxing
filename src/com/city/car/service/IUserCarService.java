package com.city.car.service;

import java.util.List;
import com.city.car.model.UseCarModel;

public interface IUserCarService {
			//���Ӷ���
			public void add(UseCarModel um) throws Exception;
			//�޸Ķ���
			public void modify(UseCarModel um) throws Exception;
			//ɾ������
			public void delete(UseCarModel um) throws Exception;
			//ȡ��ָ��������
			public  UseCarModel getUse(String  uNo) throws Exception;
			//ȡ�����ж�����
			public List<UseCarModel> getList() throws Exception;
}
