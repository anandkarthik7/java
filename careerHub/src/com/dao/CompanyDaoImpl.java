package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.model.*;
import com.model.JobListing;
import com.utility.DBConnection;

public class CompanyDaoImpl implements CompanyDao{

	@Override
	public int PostJob(JobListing jobListing) throws SQLException {
		Connection con=DBConnection.dbConnect();
		String sql="INSERT INTO jobs (job_title,job_description , job_location, salary , job_type) VALUES (?,?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1,jobListing.getJobTitle());
		pstmt.setString(2, jobListing.getJobDescription());
		pstmt.setString(3, jobListing.getJobLocation());
		pstmt.setDouble(4, jobListing.getSalary());
		pstmt.setString(5, jobListing.getJobType());

		int status=pstmt.executeUpdate();
		DBConnection.dbClose();
		return status;
	}


	@Override
	public List<JobListing> GetJobs() throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql="select * from jobs";
		//prepare the statement 
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rst  = pstmt.executeQuery();
		List<JobListing> list=new ArrayList<>();
		while(rst.next() == true) {
			int jobID  = rst.getInt("job_id");
			String  jobTitle = rst.getString("job_title");
			String jobDescription = rst.getString("job_description");
			String jobLocation = rst.getString("job_location");
			Double salary =rst.getDouble("salary");
			String jobType=rst.getString("job_type");
			Date postedDate=rst.getDate("Posted_date");
			
			 JobListing jobListing = new JobListing(jobID, jobID, jobTitle, jobDescription, jobLocation,salary, jobType,  postedDate); 
			list.add(jobListing);
		}
		DBConnection.dbClose();
		return list;
	}

	

}
