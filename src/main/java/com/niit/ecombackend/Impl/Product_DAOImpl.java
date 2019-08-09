package com.niit.ecombackend.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.ecombackend.DAO.Product_DAO;
import com.niit.ecombackend.model.Product;
@Repository
@Transactional
public class Product_DAOImpl implements Product_DAO {
@Autowired
	SessionFactory sf;
	
	@Override
	public boolean addProduct(Product p) {
		try {
			sf.getCurrentSession().save(p);
			return true;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean updateProduct(Product p) {
		try {
			sf.getCurrentSession().update(p);
			return true;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean deleteProduct(Product p) {
		try {
			sf.getCurrentSession().delete(p);
			return true;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public Product selectOneProduct(int pro_id) {
		try {
			return (Product)sf.getCurrentSession().createCriteria(Product.class).add(Restrictions.eqOrIsNull("pro_id", pro_id)).uniqueResult();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		
	}

	@Override
	public List<Product> selectAllProduct() {
		try {
			return sf.getCurrentSession().createCriteria(Product.class).list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		
	}

	

}
