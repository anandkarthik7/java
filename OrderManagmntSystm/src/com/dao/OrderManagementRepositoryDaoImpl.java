package com.dao;

import java.sql.*;
import java.util.*;
import com.exception.*;
import com.model.*;
import com.utility.DBConnection;

public class OrderManagementRepositoryDaoImpl implements OrderManagementRepositoryDao{

	@Override
	public int createProduct(Product product) throws SQLException {
		Connection con = DBConnection.dbConnect();
		 String sql = "insert into product (productName, description, price, quantityInStock, type) values (?, ?, ?, ?, ?, ?, ?)";
		 PreparedStatement pstmt = con.prepareStatement(sql);
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, product.getProductName());
      pstmt.setString(2, product.getDescription());
      pstmt.setDouble(3, product.getPrice());
      pstmt.setInt(4, product.getQuantityInStock());
      pstmt.setString(5, product.getType());
       int status = pstmt.executeUpdate();
		DBConnection.dbClose();
		return status;	
		
	}
	@Override
	public int addElectronics(Electronics electronics) throws SQLException {
		Connection con = DBConnection.dbConnect();
		 String sql = "insert into Electronics (brand, warrantyPeriod, product_id) VALUES (?, ?, ?)";
		 PreparedStatement pstmt = con.prepareStatement(sql);
      pstmt = con.prepareStatement(sql);
      pstmt.setString(1, electronics.getBrand());
      pstmt.setInt(2, electronics.getWarrantyPeriod());
      pstmt.setInt(3, electronics.getProductId());
       int status = pstmt.executeUpdate();
		DBConnection.dbClose();
		return status;	
		
	}

	@Override
	public int addClothing(Clothing clothing) throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql = "Insert into Clothing (size, color, product_id) values (?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, clothing.getSize());
        pstmt.setString(2, clothing.getColor());
        pstmt.setInt(3, clothing.getProductId());
		int status = pstmt.executeUpdate(); 
		DBConnection.dbClose();
		return status;	
		
	}

	@Override
	public List<Product> findAll() throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql="select * from product";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rst = pstmt.executeQuery();
		List<Product> productList = new ArrayList<>();
		while(rst.next() == true) {
			int productId = rst.getInt("id");
	        String productName = rst.getString("productName");
	        String description = rst.getString("description");
	        double price = rst.getDouble("price");
	        int quantityInStock = rst.getInt("quantityInStock");
	        String type = rst.getString("type");
	        Product product = new Product(productId, productName, description, price, quantityInStock, type);
	        productList.add(product);
		}
		DBConnection.dbClose();		
		return productList;
	}

	@Override
	public List<Order> findOrdersByUserId(int userId) throws SQLException,UserNotFoundException {
		Connection con = DBConnection.dbConnect();
		String sql="select * from orders where User_id = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, userId);
		ResultSet rst = pstmt.executeQuery();
		List<Order> orderList = new ArrayList<>();
		while(rst.next() == true) {
			int orderId = rst.getInt("id");
            int productId = rst.getInt("Product_id");
            int quantity = rst.getInt("quantity");
            String status = rst.getString("status");
            Order order = new Order(orderId, userId, productId, quantity,status);
            orderList.add(order);
		}
		DBConnection.dbClose();		
		return orderList;
	}

	@Override
	public int createOrder(Order order) throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql = "insert into orders (User_id, Product_id, quantity, status) values (?, ?, ?, ?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, order.getUserId());
        pstmt.setInt(2, order.getProductId());
        pstmt.setInt(3, order.getQuantity());
        pstmt.setString(4, order.getStatus());
		int status = pstmt.executeUpdate();
		DBConnection.dbClose();
		return status;	
		
	}

	@Override
	public int cancelOrder(int orderId) throws SQLException, OrderNotFoundException {
		Connection con = DBConnection.dbConnect();
		String sql = "update orders set status = 'cancelled' where id = ?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, orderId);
		int status = pstmt.executeUpdate();
		DBConnection.dbClose();
		return status;
	}

}