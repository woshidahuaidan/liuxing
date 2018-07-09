package com.city.car.service.impl;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.city.car.model.UseCarModel;
import com.city.car.service.IUserCarService;

@Service("useCarServiceImpl")
@Transactional
public class UseCarServiceImpl implements IUserCarService {

	private SessionFactory sf=null;
	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	@Override
	public void add(UseCarModel um) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().save(um);
	}

	@Override
	public void modify(UseCarModel um) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().update(um);
	}

	@Override
	public void delete(UseCarModel um) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().delete(um);
	}

	@Override
	public UseCarModel getUse(String uNo) throws Exception {
		// TODO Auto-generated method stub
		return sf.getCurrentSession().get(UseCarModel.class,uNo);
	}

	@Override
	public List<UseCarModel> getList() throws Exception {
		return sf.getCurrentSession().createQuery("from UseCarModel").getResultList();
	}

}
