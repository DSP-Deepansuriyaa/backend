package com.niit.ecombackend.Impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ecombackend.DAO.Category_DAO;
import com.niit.ecombackend.model.Category;

@Repository
@Transactional
public class Category_DAOImpl implements Category_DAO {
	@Autowired
	SessionFactory sf;

	@Override
	public boolean addCategory(Category d) {
		try {
			sf.getCurrentSession().save(d);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean updateCategory(Category d) {
		try {
			sf.getCurrentSession().update(d);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean deleteCategory(Category d) {
		try {
			sf.getCurrentSession().delete(d);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public Category selectOneCategory(int cat_Id) {
		try {
			return (Category) sf.getCurrentSession().createCriteria(Category.class)
					.add(Restrictions.eq("cat_Id", cat_Id)).uniqueResult();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}

	}

	@Override
	public List<Category> selectAllCategory() {
		try {
			return sf.getCurrentSession().createCriteria(Category.class).list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}

	}

}