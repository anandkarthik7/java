package com.dao;
import java.sql.*;
import java.util.*;
import com.model.*;
import com.utility.DBConnection;

public class UserInterfaceDaoImpl implements UserInterfaceDao{

	@Override
	public int createUser(User user) throws SQLException {
				Connection con = DBConnection.dbConnect();
				String sql="insert into user (username, password, role) values (?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, user.getUsername());
				pstmt.setString(2, user.getPassword());
				pstmt.setString(3, user.getRole());
				int status = pstmt.executeUpdate(); 
				DBConnection.dbClose();
				return status;
		
	}

	@Override
	public User login(String username, String password) throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql="select * from user where username=? and password=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, username);
		pstmt.setString(2, password);
		ResultSet rst  = pstmt.executeQuery();
		 
		if(rst.next()) {
			User user = new User();
			user.setUserId(rst.getInt("id"));
			user.setUsername(username);
			user.setPassword(password);
			user.setRole(rst.getString("role"));
			DBConnection.dbClose();
			return user;
		}
		else {
			DBConnection.dbClose();
			return null; 
	}

}

	
}
