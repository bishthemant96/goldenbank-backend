package com.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.entity.CustomerEntity;

@Service
public class CustomerDaoImpl {

	@PersistenceContext
	EntityManager em;
	
	public CustomerEntity createCustomer(CustomerEntity customer) {
		em.persist(customer);
		return customer;
	}

	public CustomerEntity readCustomer(CustomerEntity customer) {
		CustomerEntity reCustomer = em.find(CustomerEntity.class, 1 ); //Replace 1 with getID function.
		return reCustomer;
	}

	public CustomerEntity updateCustomer(CustomerEntity customer) {
		CustomerEntity reCustomer = em.find(CustomerEntity.class, 1); //Replace 1 with getID function
		//Call setter functions over here.
		return reCustomer;
	}

	public CustomerEntity deleteCustomer(CustomerEntity customer) {
		CustomerEntity reCustomer = em.find(CustomerEntity.class, 1); //Replace 1 with getID function
		em.remove(reCustomer);
		return customer;
	}

	public List<CustomerEntity> displayAllCustomer(CustomerEntity emp) {
		List<?> temp = em.createQuery("Select e from Customer e").getResultList();
		List<CustomerEntity> customerList = new ArrayList<CustomerEntity>(temp.size());
		
		for(Object obj: temp)
			customerList.add(((CustomerEntity)obj));	

		return customerList;
	}
	
}
