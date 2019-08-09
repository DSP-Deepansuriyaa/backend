package com.niit.ecombackend.DAO;

import java.util.List;


import com.niit.ecombackend.model.Seller;

public interface Seller_DAO {
	boolean addSeller(Seller s);
	boolean updateSeller(Seller s);
	boolean deleteSeller(Seller s);
	Seller selectOneSeller(int sel_Id);
	List<Seller> selectAllSeller();

}
