package com.niit.ecombackend.Impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ecombackend.DAO.Seller_DAO;
import com.niit.ecombackend.model.Seller;
@Repository
@Transactional
public class Seller_DAOImpl implements Seller_DAO {

	@Autowired
	SessionFactory sf;
	@Override
	public boolean addSeller(Seller s) {
		try {
			sf.getCurrentSession().save(s);
			return true;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
		
	@Override
	public boolean updateSeller(Seller s) {
		try {
			sf.getCurrentSession().update(s);
			return true;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean deleteSeller(Seller s) {
		try {
			sf.getCurrentSession().delete(s);
			return true;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
		

	@Override
	public Seller selectOneSeller(int sel_Id) {
		try {
			return (Seller) sf.getCurrentSession().createCriteria(Seller.class)
					.add(Restrictions.eq("sel_Id", sel_Id)).uniqueResult();			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		
	}

	@Override
	public List<Seller> selectAllSeller() {
		try {
			return sf.getCurrentSession().createCriteria(Seller.class).list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		
	}

}