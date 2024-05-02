package com.service;
import com.dao.*;

import java.sql.SQLException;
import java.util.List;

import com.model.Order;
import com.dao.*;
import com.exception.OrderNotFoundException;
import com.exception.UserNotFoundException;
public class OrderService<OrderManagementRepository> {
	OrderManagementRepositoryDao orderManagementRepository= new OrderManagementRepositoryDaoImpl();
	
	public List<Order> findAllByUserId(int UserId) throws SQLException, UserNotFoundException{
		return orderManagementRepository.findOrdersByUserId(UserId);	}

	public int createOrder(Order order) throws SQLException{
		return orderManagementRepository.createOrder(order);
	}

	public int cancelOrder(int orderId)throws SQLException,OrderNotFoundException {
		return orderManagementRepository.cancelOrder(orderId);
	}

}
