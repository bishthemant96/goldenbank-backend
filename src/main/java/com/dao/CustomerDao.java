package com.dao;

import java.util.List;

import com.entity.CustomerEntity;

public interface CustomerDao {

	CustomerEntity createCustomer(CustomerEntity customer);
	CustomerEntity readCustomer(CustomerEntity customer);
	CustomerEntity updateCustomer(CustomerEntity customer);
	CustomerEntity deleteCustomer(CustomerEntity customer);
	
	List<CustomerEntity> displayAllCustomer();	
}
