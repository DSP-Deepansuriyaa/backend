package com.niit.ecombackend.DAO;

import java.util.List;

import com.niit.ecombackend.model.Product;

public interface Product_DAO {

	boolean addProduct(Product p);
	boolean updateProduct(Product p);
	boolean deleteProduct(Product p);
	Product selectOneProduct(int pro_id);
	List<Product> selectAllProduct();
	
	
}
