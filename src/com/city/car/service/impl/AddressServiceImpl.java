package com.city.car.service.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.city.car.model.AddressModel;
import com.city.car.model.CategoryModel;
import com.city.car.service.IAddressService;
@Service("addressServiceImpl")
@Transactional
public class AddressServiceImpl implements IAddressService {

	private SessionFactory sf=null;
	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	@Override
	public void add(AddressModel dm) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().save(dm);
	}

	@Override
	public void modify(AddressModel dm) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().update(dm);
	}

	@Override
	public void delete(AddressModel dm) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().delete(dm);
	}

	@Override
	public AddressModel getAddress(String no) throws Exception {
		// TODO Auto-generated method stub
		return sf.getCurrentSession().get(AddressModel.class,no);
	}

	@Override
	public List<AddressModel> getList() throws Exception {
		// TODO Auto-generated method stub
		return sf.getCurrentSession().createQuery("from AddressModel").getResultList();
	}

}
