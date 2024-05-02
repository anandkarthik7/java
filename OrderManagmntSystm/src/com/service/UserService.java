package com.service;
import java.sql.SQLException;
import java.sql.SQLException;
import java.util.*;
import com.dao.*;
import com.exception.InvalidCredentialsException;
import com.model.User;

public class UserService {
	UserInterfaceDao userDao = new UserInterfaceDaoImpl();
	public int createUser(User user) throws SQLException {
		return userDao.createUser(user);
		
	}
	public User login(String username, String password) throws SQLException, InvalidCredentialsException {
		 
		User user = userDao.login(username,password);
		if(user == null) {
			throw new InvalidCredentialsException("Invalid Credentials");
		}
		return user;
	}
	
}
