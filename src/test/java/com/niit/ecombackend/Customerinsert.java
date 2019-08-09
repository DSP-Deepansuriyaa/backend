package com.niit.ecombackend;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.niit.ecombackend.DAO.Customer_DAO;
import com.niit.ecombackend.config.DBConfig;
import com.niit.ecombackend.model.Customer;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=DBConfig.class)
public class Customerinsert {

	Customer c;
	@Autowired
	Customer_DAO custdao;
	@Before
	public void setUp() throws Exception {
		c=new Customer();
		c.setCust_Name("deepansuriyaa");
		c.setCust_Phno("9003931600");
		c.setCust_Email("dspss@gmail.com");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//add
		//assertEquals(true, custdao.addCustomer(c));
	
//	edit
//	Customer c1=custdao.selectOneCustomer("dsp@gmail.com");
//		String phno=c1.getCust_Phno();
//		c1.setCust_Phno("1234567890");
//		custdao.updateCustomer(c1);
//		Customer c2=custdao.selectOneCustomer("dsp@gmail.com");
//		assertEquals(false, phno.equals(c2.getCust_Phno()));
		
		//view
		//Customer c3=custdao.selectOneCustomer("dsp@gmail.com");
		//assertNotNull(c3);
		
		//delete
		Customer c4=custdao.selectOneCustomer("dspss@gmail.com");
		custdao.deleteCustomer(c4);
		Customer c5=custdao.selectOneCustomer("dspss@gmail.com");
		assertNotNull(c5);
		
	}

}
