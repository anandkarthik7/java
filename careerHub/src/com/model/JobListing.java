package com.model;
import java.time.*;
import java.util.*;

public class JobListing {

	private int JobID;
	private int CompanyID ;
	private String JobTitle;
	private String JobDescription;
	private String JobLocation;
	private double Salary;
	private String JobType;
	private Date PostedDate;
	public JobListing(int jobID, int companyID, String jobTitle, String jobDescription, String jobLocation,
			double salary, String jobType, Date postedDate) {
		super();
		JobID = jobID;
		CompanyID = companyID;
		JobTitle = jobTitle;
		JobDescription = jobDescription;
		JobLocation = jobLocation;
		Salary = salary;
		JobType = jobType;
		PostedDate = postedDate;
	}
	public JobListing() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getJobID() {
		return JobID;
	}
	public void setJobID(int jobID) {
		JobID = jobID;
	}
	public int getCompanyID() {
		return CompanyID;
	}
	public void setCompanyID(int companyID) {
		CompanyID = companyID;
	}
	public String getJobTitle() {
		return JobTitle;
	}
	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}
	public String getJobDescription() {
		return JobDescription;
	}
	public void setJobDescription(String jobDescription) {
		JobDescription = jobDescription;
	}
	public String getJobLocation() {
		return JobLocation;
	}
	public void setJobLocation(String jobLocation) {
		JobLocation = jobLocation;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public String getJobType() {
		return JobType;
	}
	public void setJobType(String jobType) {
		JobType = jobType;
	}
	public Date getPostedDate() {
		return PostedDate;
	}
	public void setPostedDate(String postedDate2) {
		PostedDate = postedDate2;
	}
	@Override
	public String toString() {
		return "JobListing [JobID=" + JobID + ", CompanyID=" + CompanyID + ", JobTitle=" + JobTitle
				+ ", JobDescription=" + JobDescription + ", JobLocation=" + JobLocation + ", Salary=" + Salary
				+ ", JobType=" + JobType + ", PostedDate=" + PostedDate + "]";
	}
	
	

}