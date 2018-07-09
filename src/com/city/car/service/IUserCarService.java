package com.city.car.service;

import java.util.List;
import com.city.car.model.UseCarModel;

public interface IUserCarService {
			//增加订单
			public void add(UseCarModel um) throws Exception;
			//修改订单
			public void modify(UseCarModel um) throws Exception;
			//删除订单
			public void delete(UseCarModel um) throws Exception;
			//取得指定订单号
			public  UseCarModel getUse(String  uNo) throws Exception;
			//取得所有定订单
			public List<UseCarModel> getList() throws Exception;
}
