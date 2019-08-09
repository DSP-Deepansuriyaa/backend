package com.niit.ecombackend;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.niit.ecombackend.DAO.Category_DAO;
import com.niit.ecombackend.config.DBConfig;
import com.niit.ecombackend.model.Category;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=DBConfig.class)
public class Categoryinsert {
	
Category d;
@Autowired
Category_DAO catdao;
	@Before
	public void setUp() throws Exception {
		d=new Category();
		d.setCat_Id(01);
		d.setCat_Name("Digital");
		d.setCat_Des("highly waterproof");
		
		
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(true, catdao.addCategory(d));
		
		//Category d1=catdao.selectOneCategory("Analog");
		///String cat=d1.getCat_Name();
		//d1.setCat_Des("hiahdadajd");
		//catdao.updateCategory(d1);
		///Category d2=catdao.selectOneCategory("Analog");
		///assertEquals(false,);
		
		//catdao.deleteCategory(d1);
		//assertNotNull(d1);
	}

}
