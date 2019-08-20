package com.service;

import org.springframework.ui.Model;

import com.model.CustomerModel;

public interface CustomerService {
	
	//return bool value 
	public boolean authenticateUser(String username, String password);

	//return in console: addition successful
	//return a javascript popup saying customer added sucessfully to dashboard
	public boolean addCustomer(CustomerModel customerModel);

	public boolean deleteCustomer(int empId);

	public void updateCustomer(Model model);
	
	
}
