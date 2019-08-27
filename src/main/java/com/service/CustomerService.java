package com.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CustomerDao;
import com.entity.CustomerEntity;
import com.model.CustomerModel;

@Transactional
@Service
public class CustomerService {

	@Autowired
	CustomerDao cDao;

	
	public CustomerModel createCustomer(CustomerModel customerModel) {
		customerModel.setStatus(false);
		CustomerEntity customer = new CustomerEntity();
		BeanUtils.copyProperties(customerModel, customer);
		
		try {
			customer = cDao.createCustomer(customer);
			BeanUtils.copyProperties(customer, customerModel);
			customerModel.setStatus(true);
		} catch (Exception e) {
			System.out.println("Customer creation failed.");
			customerModel.setError("Invalid entried:Customer creation failed.");
		}
		return customerModel;
	}
	
	
	public CustomerModel readCustomer(CustomerModel customerModel) {
		customerModel.setStatus(false);
		CustomerEntity customer = new CustomerEntity();
		BeanUtils.copyProperties(customerModel, customer);
		
		try {
			customer = cDao.readCustomer(customer);
			BeanUtils.copyProperties(customer, customerModel);
			customerModel.setStatus(true);
		} catch (Exception e) {
			System.out.println("Customer information fetch failed.");
			customerModel.setError("Customer does not exist.");
		}
		return customerModel;

	}


	public CustomerModel updateCustomer(CustomerModel customerModel) {
		customerModel.setStatus(false);	
		CustomerEntity cEntity = new CustomerEntity();
		cEntity.setCusID(customerModel.getCusID());
		
		try {  
			cEntity = cDao.readCustomer(cEntity);
			if (cEntity == null) {
				System.out.println("Customer Update Failed: No Customer found.");
			} else {
			    BeanUtils.copyProperties(customerModel, cEntity);
			    try {
			    	cEntity= cDao.updateCustomer(cEntity);
			    	BeanUtils.copyProperties(cEntity, customerModel);
			    	customerModel.setStatus(true);
			    } catch (Exception e) {
			    	System.out.println("Customer Update Failed: Operation Error.");
			    	customerModel.setError("Customer update failed.");
			    }
			}
		} catch(Exception e) {
			//Do nothing.
			customerModel.setError("Customer does not exist.");
		}
		return customerModel;
	}
	
	
	public CustomerModel deleteCustomer(CustomerModel customerModel) {
		customerModel.setStatus(false);
		CustomerEntity customer = new CustomerEntity();
		BeanUtils.copyProperties(customerModel, customer);
		
		try {
			customer = cDao.deleteCustomer(customer);
			BeanUtils.copyProperties(customer, customerModel);
			customerModel.setStatus(true);
		} catch (Exception e) {
			System.out.println("Customer Deletion Failed.");
			customerModel.setError("Customer deletion failed.");
		}
		return customerModel;
	}
	
}
