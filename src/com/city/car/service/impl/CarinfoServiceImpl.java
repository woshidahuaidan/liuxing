package com.city.car.service.impl;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.city.car.model.CarinfoModel;
import com.city.car.model.CategoryModel;
import com.city.car.model.InsuranceModel;
import com.city.car.service.ICarinfoService;

@Service("carinfoServiceImpl")
@Transactional
public class CarinfoServiceImpl implements ICarinfoService {
	
	private SessionFactory sf=null;
	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	//默认构造方法
	public CarinfoServiceImpl()
	{
		
	}
	//有参数构造方法
	@Autowired
	public CarinfoServiceImpl(SessionFactory sf)
	{
		this.sf=sf;
	}


	@Override
	public void add(CarinfoModel cm) throws Exception {
	
		sf.getCurrentSession().save(cm);

	}

	@Override
	public void modify(CarinfoModel cm) throws Exception {
		
		sf.getCurrentSession().update(cm);
	}

	@Override
	public void delete(CarinfoModel cm) throws Exception {
		
		sf.getCurrentSession().delete(cm);
	}

	@Override
	public CarinfoModel getCar(String id) throws Exception {
		// TODO Auto-generated method stub
		return sf.getCurrentSession().get(CarinfoModel.class,id);	
		}

	@Override
	public List<CarinfoModel> getListByAll() throws Exception {
		
		return sf.getCurrentSession().createQuery("from CarinfoModel").list();
		
	}

	
	@Override
	public List<CarinfoModel> getListByCartegory(String ccNo) throws Exception {
		
		String hql="select cm from CarinfoModel cm where cm.cartegory.ccno=:ccno";
		Query query=sf.getCurrentSession().createQuery(hql);
		query.setString("ccno", ccNo);
		List<CarinfoModel> list=query.getResultList();
		
		return list;
	}

	@Override
	public List<CarinfoModel> getListWithPage(int rows, int page) throws Exception {
		String hql="from CarinfoModel cm ";
		Query query=sf.getCurrentSession().createQuery(hql);
		
		System.out.println("page"+page);
		System.out.println("rows"+rows);
		
		query.setFirstResult(rows*(page-1));
		query.setMaxResults(rows);
		
		List<CarinfoModel> list=query.list();
		
		return list;
	}
	@Override
	public int getCount() throws Exception {
		String hql="select count(cm.cid) from CarinfoModel cm ";
		Query query=sf.getCurrentSession().createQuery(hql);
		Long lcount=(Long)query.uniqueResult();
		
		return lcount.intValue();
	}
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
	//给指定增加指定的车险
	@Override
	public void addInsurance(String id, int sno) throws Exception {
//		CarinfoModel cm=sf.getCurrentSession().get(CarinfoModel.class, id);
//		InsuranceModel sm=sf.getCurrentSession().get(InsuranceModel.class, sno);
//		
//		cm.getInsurance().add(sm);
	}
	//给指定车辆增加多个车险
	@Override
	public void addInsurances(String id, int[] snos) throws Exception {
		CarinfoModel cm=sf.getCurrentSession().get(CarinfoModel.class, id);
		for(int sno:snos){
			InsuranceModel sm=sf.getCurrentSession().get(InsuranceModel.class, sno);
			sm.getCarinfo().add(cm);
			cm.getInsurance().add(sm);
			
		}
		
	}
	//取得指定车辆的车险集合
	@Override
	public List<InsuranceModel> getInsurancesByCar(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	//检查指定的车辆是否有指定的车险
	@Override
	public boolean hasSpecificInsurance(String id, int sno) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	//查询无车险的车辆列表
	@Override
	public List<InsuranceModel> getListWithoutInsurance() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	//回填一对多的方法
	@Override
	public int[] getInsurancewithIntByCar(String id) throws Exception {
		int[] blist=null;
		Session session=sf.getCurrentSession();
		String hql="select im.sno from CarinfoModel cm inner join cm.insurance im where cm.cid=:cid";
		Query query=session.createQuery(hql);
		query.setString("cid",id);
		List<Integer> list=query.list();
		if(list!=null&&list.size()>0){
			blist=new int[list.size()];
			for(int i=0;i<list.size();i++){
				blist[i]=list.get(i);
			}
			
		}
		
		return blist;
	}
	//有条件查询的分页
	@Override
	public List<CarinfoModel> getListByCategoryNoSearch(String categoryNo, int rows, int page) throws Exception {
		String hql="select cm from CarinfoModel cm where cm.cartegory.ccno=:ccno";
		Query query=sf.getCurrentSession().createQuery(hql);
		query.setString("ccno", categoryNo);
		
		System.out.println("page"+page);
		System.out.println("rows"+rows);
		
		query.setFirstResult(rows*(page-1));
		query.setMaxResults(rows);
		
		List<CarinfoModel> list=query.list();
		
		return list;
	}
	@Override
	public int getCountByCategoryNoSearch(String categoryNo) throws Exception {
		String hql="select cm from CarinfoModel cm where cm.cartegory.ccno=:ccno";
		Query query=sf.getCurrentSession().createQuery(hql);
		query.setString("ccno", categoryNo);
		Long lcount=(Long)query.uniqueResult();
		
		return lcount.intValue();
	}
	@Override
	public int getPageCountByCategoryNoSearch(int rows, String categoryNo) throws Exception {
		int pagecout=0;
		int count=this.getCountByCategoryNoSearch(categoryNo);
		if(count%rows==0){
			pagecout=count/rows;
			}else{
				pagecout=(count/rows)+1;
			}
			
			return pagecout;
	}
	

}
