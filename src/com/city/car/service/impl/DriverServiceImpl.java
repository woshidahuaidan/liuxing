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
	//默认构造方法
	public DriverServiceImpl()
	{
		
	}
	//有参数构造方法
	@Autowired
	public DriverServiceImpl(SessionFactory sf)
	{
		this.sf=sf;
	}
	//增加员工
	@Override
	public void add(DriverModel dm) throws Exception {
		sf.getCurrentSession().save(dm);

	}

	//增加员工和图片
	@Override
	public void add(DriverModel dm, File photo, String fileName, String contentType) throws Exception {
		dm.setFilename(fileName);
		dm.setContextType(contentType);
		InputStream fin=new FileInputStream(photo);
		Blob blobphoto=sf.getCurrentSession().getLobHelper().createBlob(fin, fin.available());
		dm.setPhoto( blobphoto);
		
	
		
		sf.getCurrentSession().save(dm);

	}

	//修改员工
	@Override
	public void modify(DriverModel dm) throws Exception {
		sf.getCurrentSession().update(dm);

	}

	//删除员工
	@Override
	public void delete(DriverModel dm) throws Exception {
		sf.getCurrentSession().delete(dm);

	}

	//根据id取得指定信息
	@Override
	public DriverModel getDriver(String id) throws Exception {
		return sf.getCurrentSession().get(DriverModel.class,id);	
	}

	//取得所有的员工列表
	@Override
	public List<DriverModel> getListByAll() throws Exception {
		return sf.getCurrentSession().createQuery("from DriverModel").list();
	}

	//取得页数和每页个数
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

	//取得总共的个数
	@Override
	public int getCount() throws Exception {
		String hql="select count(dm.dno) from DriverModel dm ";
		Query query=sf.getCurrentSession().createQuery(hql);
		Long lcount=(Long)query.uniqueResult();
		
		return lcount.intValue();
	}

	//取得每页的个数
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
	//验证员工是否合法
	@Override
	public boolean validate(String id, String password) throws Exception {
		boolean result=false;
		DriverModel dm=sf.getCurrentSession().get(DriverModel.class,id);
		if(dm!=null&&dm.getDno()!=null&&dm.getPassword().equals(password))
			return true;
		else
		return result;
	}
	//修改图片
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
