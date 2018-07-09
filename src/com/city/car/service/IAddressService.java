package com.city.car.service;

import java.util.List;
import com.city.car.model.AddressModel;


public interface IAddressService {

			//增加地址
			public void add(AddressModel dm) throws Exception;
			//修改地址
			public void modify(AddressModel dm) throws Exception;
			//删除地址
			public void delete(AddressModel dm) throws Exception;
			//取得指定地址
			public  AddressModel getAddress(String no) throws Exception;
			//取得所有地址
			public List<AddressModel> getList() throws Exception;
}
