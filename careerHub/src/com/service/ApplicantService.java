package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.*;
import com.exception.*;
import com.model.*;

public class ApplicantService {
ApplicantDao applicantDao=new ApplicantDaoImpl();
	public int save(Address address) throws SQLException {
		return addressDao.save(address);
	}
	public void DeleteAddress(int addressId) throws SQLException, ResourceNotFoundException {
		boolean IsAddressIdValid=addressDao.findOne(addressId);
		if (!IsAddressIdValid)
			throw new ResourceNotFoundException("AddressId is invalid");
		 addressDao.DeleteById(addressId);;
	}
	public List<Address> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return addressDao.findAll();
	}

}
