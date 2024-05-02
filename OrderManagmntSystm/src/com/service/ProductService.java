package com.service;
 import java.sql.*;
import java.util.List;

import com.model.Clothing;
import com.model.Electronics;
import com.model.Product;
import com.dao.*;
import com.exception.*;
public class ProductService {
	OrderManagementRepositoryDao dao = new OrderManagementRepositoryDaoImpl();
	public int addProduct(Product product) throws SQLException {
		
		return dao.createProduct(product);
	}
	public int addClothing(Clothing clothing) throws SQLException{
		return dao.addClothing(clothing);
		
	}
	public int addElectronics(Electronics electronics) throws SQLException{
		return dao.addElectronics(electronics);
		
	}
	public List<Product> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
