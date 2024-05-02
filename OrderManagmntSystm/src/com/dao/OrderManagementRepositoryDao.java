package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.exception.OrderNotFoundException;
import com.exception.UserNotFoundException;
import com.model.Clothing;
import com.model.Electronics;
import com.model.Order;
import com.model.Product;

public interface OrderManagementRepositoryDao {

	int createProduct(Product product) throws SQLException;

	int addElectronics(Electronics electronics) throws SQLException;

	int addClothing(Clothing clothing) throws SQLException;

	List<Product> findAll() throws SQLException;

	List<Order> findOrdersByUserId(int userId) throws SQLException, UserNotFoundException;

	int cancelOrder(int orderId) throws SQLException, OrderNotFoundException;

	int createOrder(Order order) throws SQLException;

}
