package com.niit.ecombackend.DAO;

import java.util.List;

import com.niit.ecombackend.model.Category;

public interface Category_DAO {
	boolean addCategory(Category d);
	boolean updateCategory(Category d);
	boolean deleteCategory(Category d);
	Category selectOneCategory(int cat_Id);
	List<Category> selectAllCategory();
	
}
