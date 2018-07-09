package com.city.car.service.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.city.car.model.IPModel;
import com.city.car.service.IIPService;
@Service("IPService")
public class IPServiceImpl implements IIPService {

	private SessionFactory sf=null;
	
	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	@Override
	public boolean checkIPExist(String ip) throws Exception {
		// TODO Auto-generated method stub
		boolean result=false;
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		//¡Ÿ ±Ã¨
		if(session.get(IPModel.class, ip)!=null){
			result=true;
		}
		tx.commit();
		session.close();
		return result;
	}
	}


