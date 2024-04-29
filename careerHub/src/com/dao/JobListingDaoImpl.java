package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import 
import com.utility.DBConnection;

public class JobListingDaoImpl implements JobApplicationDao{

	@Override
	public int save(Address address) throws SQLException {
		Connection con=DBConnection.dbConnect();
		String sql="INSERT INTO address (address_id,address_state , address_city, address_pincode) VALUES (?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setInt(1,address.getAddress_id());
		pstmt.setString(2, address.getAddress_state());
		pstmt.setString(3, address.getAddress_city());
		pstmt.setString(4, address.getAddress_pincode());
		int status=pstmt.executeUpdate();
		DBConnection.dbClose();
		return status;
	}

	@Override
	public boolean findOne(int address_id) throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql="select address_id from address where address_id=?";
		//prepare the statement 
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, address_id);
		ResultSet rst  = pstmt.executeQuery();
		boolean status = rst.next(); //true / false
		DBConnection.dbClose();
		return status;
	}

	@Override
	public void DeleteById(int address_id) throws SQLException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Connection con = DBConnection.dbConnect();
				String sql="delete from address where address_id =?";
				//prepare the statement 
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, address_id);
				pstmt.executeUpdate();
				DBConnection.dbClose();
	}

	@Override
	public List<Address> findAll() throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql="select * from address";
		//prepare the statement 
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rst  = pstmt.executeQuery();
		List<Address> list=new ArrayList<>();
		while(rst.next() == true) {
			int id  = rst.getInt("address_id");
			String  state= rst.getString("address_state");
			String city = rst.getString("address_city");
			String pincode = rst.getString("address_pincode");
			 Address address = new Address(id,state,city,pincode); //100X 200X 300X
			list.add(address);
		}
		DBConnection.dbClose();
		return list;
	}

	

}
