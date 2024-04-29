package com.model;
import java.util.*;
public class Company {
	private int CompanyID;
	private String CompanyName;
	private String CompanyLocation;
	public Company(int companyID, String companyName, String companyLocation) {
		super();
		CompanyID = companyID;
		CompanyName = companyName;
		CompanyLocation = companyLocation;
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCompanyID() {
		return CompanyID;
	}
	public void setCompanyID(int companyID) {
		CompanyID = companyID;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getCompanyLocation() {
		return CompanyLocation;
	}
	public void setCompanyLocation(String companyLocation) {
		CompanyLocation = companyLocation;
	}
	@Override
	public String toString() {
		return "Company [CompanyID=" + CompanyID + ", CompanyName=" + CompanyName + ", CompanyLocation="
				+ CompanyLocation + "]";
	}

	
}
