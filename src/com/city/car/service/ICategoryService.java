package com.city.car.service;

import java.util.List;

import com.city.car.model.CategoryModel;

public interface ICategoryService {
		//增加部门
		public void add(CategoryModel dm) throws Exception;
		//修改部门
		public void modify(CategoryModel dm) throws Exception;
		//删除部门
		public void delete(CategoryModel dm) throws Exception;
		//取得指定部门,无关联的员工集合
		public  CategoryModel getCayegory(String ccNo) throws Exception;
		//取得指定部门,同时查询出关联的员工集合
		public CategoryModel getWithEmployees(String ccNo) throws Exception;
			
		//取得所有部门列表,不取得关联的员工对象
		public List<CategoryModel> getList() throws Exception;

}
