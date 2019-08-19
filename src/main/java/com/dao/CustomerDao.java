package com.dao;

import java.util.List;

import com.entity.Customer;

public interface CustomerDao {

	Customer createCustomer(Customer customer);
	Customer readCustomer(Customer customer);
	Customer updateCustomer(Customer customer);
	Customer deleteCustomer(Customer customer);
	
	List<Customer> displayAllCustomer(Customer customer);	
}
