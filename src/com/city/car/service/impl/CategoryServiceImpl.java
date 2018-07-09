package com.city.car.service.impl;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.city.car.model.CategoryModel;
import com.city.car.service.ICategoryService;

@Service("categoryServiceImpl")
@Transactional
public class CategoryServiceImpl implements ICategoryService {
	private SessionFactory sf=null;
	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	//Ĭ�Ϲ��췽��
	public CategoryServiceImpl()
	{
		
	}
	//�в������췽��
	@Autowired
	public CategoryServiceImpl(SessionFactory sf)
	{
		this.sf=sf;
	}

	@Override
	public void add(CategoryModel dm) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().save(dm);
	}

	@Override
	public void modify(CategoryModel dm) throws Exception {
		// TODO Auto-generated method stub

		sf.getCurrentSession().update(dm);
	}

	@Override
	public void delete(CategoryModel dm) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().delete(dm);

	}


	//ȡ��ָ�����,ͬʱ��ѯ�������ļ���
	@Override
	public CategoryModel getWithEmployees(String ccNo) throws Exception {
		String hql="from CategoryModel ccm inner join fetch ccm.carinfo cm where cm.ccno=:ccno";
		Query query=sf.getCurrentSession().createQuery(hql);
		query.setString("ccno", ccNo);
		CategoryModel dm=(CategoryModel)query.uniqueResult();
		
		return dm;
	}

	//ȡ����������б��޹�����Ա������
	@Override
	public List<CategoryModel> getList() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("aa");
		return sf.getCurrentSession().createQuery("from CategoryModel").getResultList();
	}
	
	//ȡ��ָ�����,�޹����ļ���
	@Override
	public CategoryModel getCayegory(String ccNo) throws Exception {
		CategoryModel cm=sf.getCurrentSession().get(CategoryModel.class,ccNo);
		
		return cm;
	}

}
