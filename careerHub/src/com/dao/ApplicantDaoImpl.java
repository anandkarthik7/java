package com.dao;

import java.sql.*;
import java.sql.Connection;
import java.util.*;


import com.model.Applicant;
import com.model.JobApplication;
import com.utility.DBConnection;
import com.utility.*;
public class ApplicantDaoImpl implements ApplicantDao{

	@Override
	public int CreateProfile(Applicant applicant) throws SQLException {
		Connection con=DBConnection.dbConnect();
		String sql="INSERT INTO applicants (first_name , last_name, email,phone) VALUES (?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, applicant.getFirstName());
		pstmt.setString(2, applicant.getLastName());
		pstmt.setString(3, applicant.getEmail());
		pstmt.setString(4, applicant.getPhone());
		int status=pstmt.executeUpdate();
		DBConnection.dbClose();
		return status;
	}

	@Override
	public int ApplyForJob(JobApplication jobApplication) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DBConnection.dbConnect();
		String sql="INSERT INTO applications (jobs_id , cover_letter) VALUES (?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, jobApplication.getJobID());
		pstmt.setString(2, jobApplication.getCoverLetter());
		
		int status=pstmt.executeUpdate();
		DBConnection.dbClose();
		return status;
		
		
	}

	

	

}
