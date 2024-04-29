package com.dao;

import java.sql.SQLException;
import java.util.*;

import com.model.Applicant;
import com.model.JobApplication;

public interface ApplicantDao {
	int CreateProfile(Applicant applicant) throws SQLException;
	int ApplyForJob(JobApplication jobApplication) throws SQLException;
	
}


