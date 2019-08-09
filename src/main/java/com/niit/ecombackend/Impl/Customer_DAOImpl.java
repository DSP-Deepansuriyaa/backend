package com.niit.ecombackend.Impl;

import java.util.List;


import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ecombackend.DAO.Customer_DAO;
import com.niit.ecombackend.model.Customer;
@Repository
@Transactional
public class Customer_DAOImpl implements Customer_DAO {
@Autowired
	SessionFactory sf;
	@Override
	public boolean addCustomer(Customer c) {
		try {
			sf.getCurrentSession().save(c);
			return true;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}}

	@Override
	public boolean updateCustomer(Customer c) {
		try {
			sf.getCurrentSession().update(c);
			return true;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}}
		

	@Override
	public boolean deleteCustomer(Customer c) {
		try {
			sf.getCurrentSession().delete(c);
			return true;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}}
		

	@Override
	public Customer selectOneCustomer(String cust_Email) {
		try {
			return (Customer)sf.getCurrentSession().createCriteria(Customer.class).add(Restrictions.eq("cust_Email", cust_Email)).uniqueResult();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		
	}

	@Override
	public List<Customer> selectAll() {
		try {
			return sf.getCurrentSession().createCriteria(Customer.class).list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		
	}

}
