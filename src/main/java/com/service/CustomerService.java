package com.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.dao.CustomerDao;
import com.entity.CustomerEntity;
import com.model.CustomerModel;

@Transactional
@Service
public class CustomerService {

	@Autowired
	CustomerDao cDao;

	/*
	 * public boolean authenticateUser(CustomerModel cModel) { CustomerEntity
	 * customer = new CustomerEntity();
	 * 
	 * BeanUtils.copyProperties(cModel, customer);
	 * 
	 * customer = cDao.readCustomer(customer);
	 * 
	 * BeanUtils.copyProperties(employee, empEntity); empEntity =
	 * eDao.readEmployee(empEntity);
	 * 
	 * 
	 * return false; }
	 */

	public CustomerModel addCustomer(CustomerModel customerModel) {
		CustomerEntity customer = new CustomerEntity();
		BeanUtils.copyProperties(customerModel, customer);
		try {
			customer = cDao.createCustomer(customer);
		} catch (Exception e) {
			System.out.println("Error occured while Adding customer...");
		}
		return customerModel;
	}

	public CustomerModel deleteCustomer(CustomerModel customerModel) {
		return customerModel;

	}

	public CustomerModel updateCustomer(CustomerModel customerModel) {
    return customerModel;
	}

}
