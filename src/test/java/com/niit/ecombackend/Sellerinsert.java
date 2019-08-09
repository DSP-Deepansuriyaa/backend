package com.niit.ecombackend;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.niit.ecombackend.DAO.Seller_DAO;
import com.niit.ecombackend.config.DBConfig;
import com.niit.ecombackend.model.Seller;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=DBConfig.class)
public class Sellerinsert {

	Seller s;
	@Autowired
	Seller_DAO seldao;
	
	
	@Before
	public void setUp() throws Exception {
		
		s=new Seller();
		s.setSel_Id(001);
		s.setSel_Name("PSRO");
		s.setSel_Location("Chennai");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		///ADD
		assertEquals(true, seldao.addSeller(s));
		
		///UPDATE
		
		//Seller s1=seldao.selectOneSeller("PSRO");
		//s1.setSel_Location("Coimbatore");
		//seldao.updateSeller(s1);
		
		///DELETE
		
//		Seller s1=seldao.selectOneSeller(22);
//		seldao.deleteSeller(s1);
//		assertNotNull(s1);
		
	}

}
