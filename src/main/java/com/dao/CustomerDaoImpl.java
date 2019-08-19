package com.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.entity.Customer;

@Service
public class CustomerDaoImpl implements CustomerDao {

	@PersistenceContext
	EntityManager em;
	
	public Customer createCustomer(Customer customer) {
		em.persist(customer);
		return customer;
	}

	public Customer readCustomer(Customer customer) {
		Customer reCustomer = em.find(Customer.class, 1 ); //Replace 1 with getID function.
		return reCustomer;
	}

	public Customer updateCustomer(Customer customer) {
		Customer reCustomer = em.find(Customer.class, 1); //Replace 1 with getID function
		//Call setter functions over here.
		return reCustomer;
	}

	public Customer deleteCustomer(Customer customer) {
		Customer reCustomer = em.find(Customer.class, 1); //Replace 1 with getID function
		em.remove(reCustomer);
		return customer;
	}

	public List<Customer> displayAllCustomer(Customer emp) {
		List<?> temp = em.createQuery("Select e from Customer e").getResultList();
		List<Customer> customerList = new ArrayList<Customer>(temp.size());
		
		for(Object obj: temp)
			customerList.add(((Customer)obj));	

		return customerList;
	}
	
}
