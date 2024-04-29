package com.model;
import java.util.*;
public class JobApplication {
	private int ApplicationID;
	private int JobID ;
	private int ApplicantID;
	private String CoverLetter;
	private Date ApplicationDate;
	public JobApplication(int applicationID, int jobID, int applicantID, String coverLetter, Date applicationDate) {
		super();
		ApplicationID = applicationID;
		JobID = jobID;
		ApplicantID = applicantID;
		CoverLetter = coverLetter;
		ApplicationDate = applicationDate;
	}
	public JobApplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getApplicationID() {
		return ApplicationID;
	}
	public int getJobID() {
		return JobID;
	}
	public int getApplicantID() {
		return ApplicantID;
	}
	public String getCoverLetter() {
		return CoverLetter;
	}
	public Date getApplicationDate() {
		return ApplicationDate;
	}
	public void setApplicationID(int applicationID) {
		ApplicationID = applicationID;
	}
	public void setJobID(int jobID) {
		JobID = jobID;
	}
	public void setApplicantID(int applicantID) {
		ApplicantID = applicantID;
	}
	public void setCoverLetter(String coverLetter) {
		CoverLetter = coverLetter;
	}
	public void setApplicationDate(Date applicationDate) {
		ApplicationDate = applicationDate;
	}
	@Override
	public String toString() {
		return "JobApplication [ApplicationID=" + ApplicationID + ", JobID=" + JobID + ", ApplicantID=" + ApplicantID
				+ ", CoverLetter=" + CoverLetter + ", ApplicationDate=" + ApplicationDate + "]";
	}
	
	
	
}
