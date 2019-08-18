package com.dao;

import java.util.List;

import com.model.CustomerModel;

public interface CustomerDao {

	public List<CustomerModel> authenticateEmployee(String username);
	public int addTransaction(); 
	
}
