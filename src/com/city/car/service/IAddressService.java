package com.city.car.service;

import java.util.List;
import com.city.car.model.AddressModel;


public interface IAddressService {

			//���ӵ�ַ
			public void add(AddressModel dm) throws Exception;
			//�޸ĵ�ַ
			public void modify(AddressModel dm) throws Exception;
			//ɾ����ַ
			public void delete(AddressModel dm) throws Exception;
			//ȡ��ָ����ַ
			public  AddressModel getAddress(String no) throws Exception;
			//ȡ�����е�ַ
			public List<AddressModel> getList() throws Exception;
}
