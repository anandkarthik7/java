package com.model;

import java.util.Date;

public class Applicant {
	private int ApplicantID;
	private String FirstName;
	private String LastName;
	private String Email;
	private String Phone;
	private String Resume;
	public Applicant(int applicantID, String firstName, String lastName, String email, String phone, String resume) {
		super();
		ApplicantID = applicantID;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Phone = phone;
		Resume = resume;
	}
	public Applicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getApplicantID() {
		return ApplicantID;
	}
	public void setApplicantID(int applicantID) {
		ApplicantID = applicantID;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getResume() {
		return Resume;
	}
	public void setResume(String resume) {
		Resume = resume;
	}
	@Override
	public String toString() {
		return "Applicant [ApplicantID=" + ApplicantID + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", Email=" + Email + ", Phone=" + Phone + ", Resume=" + Resume + "]";
	}
	
	

}
