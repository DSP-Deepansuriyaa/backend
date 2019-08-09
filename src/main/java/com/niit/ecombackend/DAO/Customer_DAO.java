package com.niit.ecombackend.DAO;

import java.util.List;


import com.niit.ecombackend.model.Customer;

public interface Customer_DAO {
	boolean addCustomer(Customer c);
	boolean updateCustomer(Customer c);
	boolean deleteCustomer(Customer c);
	Customer selectOneCustomer(String cust_Email);
	List<Customer> selectAll();
}
