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

		Customer reCustomer = em.find(Customer.class, customer.getCusID());
		return reCustomer;
	}

	public Customer updateCustomer(Customer customer) {
		Customer reCustomer = em.find(Customer.class, customer.getCusID()); // Replace 1 with getID function
		reCustomer.setCusName(customer.getCusName());
		reCustomer.setCusAge(customer.getCusAge());
		reCustomer.setCusGender(customer.getCusGender());
		reCustomer.setCusNationality(customer.getCusNationality());
		reCustomer.setCusIDProof(customer.getCusIDProof());
		reCustomer.setCusNo(customer.getCusNo());
		reCustomer.setCusEmail(customer.getCusEmail());
		reCustomer.setCusAddress(customer.getCusAddress());
		return reCustomer;
	}

	public Customer deleteCustomer(Customer customer) {
		Customer reCustomer = em.find(Customer.class, customer.getCusID()); // Replace 1 with getID function
		em.remove(reCustomer);
		return customer;
	}

	public List<Customer> displayAllCustomer() {
		List<?> temp = em.createQuery("Select e from Customer e").getResultList();
		List<Customer> customerList = new ArrayList<Customer>(temp.size());

		for (Object obj : temp)
			customerList.add(((Customer) obj));

		return customerList;
	}

}