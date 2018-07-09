package com.city.car.service.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.city.car.model.CarinfoModel;
import com.city.car.model.InsuranceModel;
import com.city.car.service.IInsuranceService;
@Service("insuranceServiceImpl")
@Transactional
public class InsuranceServiceImpl implements IInsuranceService {

	private SessionFactory sf=null;
	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	//增加车险
	@Override
	public void add(InsuranceModel sm) throws Exception {
		sf.getCurrentSession().save(sm);

	}

	//修改车险
	@Override
	public void modify(InsuranceModel sm) throws Exception {
		sf.getCurrentSession().update(sm);

	}

	//删除车险
	@Override
	public void delete(InsuranceModel sm) throws Exception {
		sf.getCurrentSession().delete(sm);

	}

	//取得指定车险
	@Override
	public InsuranceModel getInsurance(int sno) throws Exception {
		return sf.getCurrentSession().get(InsuranceModel.class,sno);	
	}

	//取得所有车险列表
	@Override
	public List<InsuranceModel> getListByAll() throws Exception {
		return sf.getCurrentSession().createQuery("from InsuranceModel").list();
	}

}
