package com.dao;

import java.sql.SQLException;

import com.model.User;

public interface UserInterfaceDao {

	int createUser(User user) throws SQLException;

	User login(String username, String password) throws SQLException;

}
