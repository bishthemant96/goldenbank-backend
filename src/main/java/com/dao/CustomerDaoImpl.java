package com.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.entity.CustomerEntity;

@Service
public class CustomerDaoImpl implements CustomerDao {

	@PersistenceContext
	EntityManager em;

	public CustomerEntity createCustomer(CustomerEntity customer) {
		em.persist(customer);
		return customer;
	}

	public CustomerEntity readCustomer(CustomerEntity customer) {

		CustomerEntity reCustomer = em.find(CustomerEntity.class, customer.getCusID());
		return reCustomer;
	}

	public CustomerEntity updateCustomer(CustomerEntity customer) {
		CustomerEntity reCustomer = em.find(CustomerEntity.class, customer.getCusID()); // Replace 1 with getID function
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

	public CustomerEntity deleteCustomer(CustomerEntity customer) {
		CustomerEntity reCustomer = em.find(CustomerEntity.class, customer.getCusID()); 
		em.remove(reCustomer);
		return customer;
	}

	public List<CustomerEntity> displayAllCustomer() {
		List<?> temp = em.createQuery("Select e from Customer e").getResultList();
		List<CustomerEntity> customerList = new ArrayList<CustomerEntity>(temp.size());

		for (Object obj : temp)
			customerList.add(((CustomerEntity) obj));

		return customerList;
	}

}