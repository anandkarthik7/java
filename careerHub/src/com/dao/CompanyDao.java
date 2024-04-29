package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.JobListing;

public interface CompanyDao {

	int PostJob(JobListing jobListing) throws SQLException;

	List<JobListing> GetJobs() throws SQLException;

}
