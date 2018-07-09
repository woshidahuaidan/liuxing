package com.city.car.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.city.car.model.CarinfoModel;
import com.city.car.model.DriverModel;
import com.city.car.service.IDriverService;
@Service("driverServiceImpl")
@Transactional
public class DriverServiceImpl implements IDriverService {

	private SessionFactory sf=null;
	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	//Ĭ�Ϲ��췽��
	public DriverServiceImpl()
	{
		
	}
	//�в������췽��
	@Autowired
	public DriverServiceImpl(SessionFactory sf)
	{
		this.sf=sf;
	}
	//����Ա��
	@Override
	public void add(DriverModel dm) throws Exception {
		sf.getCurrentSession().save(dm);

	}

	//����Ա����ͼƬ
	@Override
	public void add(DriverModel dm, File photo, String fileName, String contentType) throws Exception {
		dm.setFilename(fileName);
		dm.setContextType(contentType);
		InputStream fin=new FileInputStream(photo);
		Blob blobphoto=sf.getCurrentSession().getLobHelper().createBlob(fin, fin.available());
		dm.setPhoto( blobphoto);
		
	
		
		sf.getCurrentSession().save(dm);

	}

	//�޸�Ա��
	@Override
	public void modify(DriverModel dm) throws Exception {
		sf.getCurrentSession().update(dm);

	}

	//ɾ��Ա��
	@Override
	public void delete(DriverModel dm) throws Exception {
		sf.getCurrentSession().delete(dm);

	}

	//����idȡ��ָ����Ϣ
	@Override
	public DriverModel getDriver(String id) throws Exception {
		return sf.getCurrentSession().get(DriverModel.class,id);	
	}

	//ȡ�����е�Ա���б�
	@Override
	public List<DriverModel> getListByAll() throws Exception {
		return sf.getCurrentSession().createQuery("from DriverModel").list();
	}

	//ȡ��ҳ����ÿҳ����
	@Override
	public List<DriverModel> getListWithPage(int rows, int page) throws Exception {
		String hql="from DriverModel dm ";
		Query query=sf.getCurrentSession().createQuery(hql);
		
		System.out.println("page"+page);
		System.out.println("rows"+rows);
		
		query.setFirstResult(rows*(page-1));
		query.setMaxResults(rows);
		
		List<DriverModel> list=query.list();
		
		return list;
	}

	//ȡ���ܹ��ĸ���
	@Override
	public int getCount() throws Exception {
		String hql="select count(dm.dno) from DriverModel dm ";
		Query query=sf.getCurrentSession().createQuery(hql);
		Long lcount=(Long)query.uniqueResult();
		
		return lcount.intValue();
	}

	//ȡ��ÿҳ�ĸ���
	@Override
	public int getPageCount(int rows) throws Exception {
		int pagecout=0;
		int count=this.getCount();
		if(count%rows==0){
			pagecout=count/rows;
			}else{
				pagecout=(count/rows)+1;
			}
			
			return pagecout;
		
	}
	//��֤Ա���Ƿ�Ϸ�
	@Override
	public boolean validate(String id, String password) throws Exception {
		boolean result=false;
		DriverModel dm=sf.getCurrentSession().get(DriverModel.class,id);
		if(dm!=null&&dm.getDno()!=null&&dm.getPassword().equals(password))
			return true;
		else
		return result;
	}
	//�޸�ͼƬ
	@Override
	public void modify(DriverModel dm, File photo, String fileName, String contentType) throws Exception {
		dm.setFilename(fileName);
		dm.setContextType(contentType);
		InputStream fin=new FileInputStream(photo);
		Blob blobphoto=sf.getCurrentSession().getLobHelper().createBlob(fin, fin.available());
		dm.setPhoto( blobphoto);
		
	
		
		sf.getCurrentSession().update(dm);;
		
	}

}
