package com.city.car.service;

import java.util.List;

import com.city.car.model.CategoryModel;

public interface ICategoryService {
		//���Ӳ���
		public void add(CategoryModel dm) throws Exception;
		//�޸Ĳ���
		public void modify(CategoryModel dm) throws Exception;
		//ɾ������
		public void delete(CategoryModel dm) throws Exception;
		//ȡ��ָ������,�޹�����Ա������
		public  CategoryModel getCayegory(String ccNo) throws Exception;
		//ȡ��ָ������,ͬʱ��ѯ��������Ա������
		public CategoryModel getWithEmployees(String ccNo) throws Exception;
			
		//ȡ�����в����б�,��ȡ�ù�����Ա������
		public List<CategoryModel> getList() throws Exception;

}
