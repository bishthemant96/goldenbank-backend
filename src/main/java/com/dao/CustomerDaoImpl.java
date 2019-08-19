package com.dao;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
import javax.servlet.http.HttpSession;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.CustomerModel;

public class CustomerDaoImpl implements CustomerDao {

	

	public int addTransaction() {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<CustomerModel> authenticateEmployee(String username) {
		
		
		
		
		return null;
	}



	



}

=======
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
>>>>>>> 15fcee83c79fec7876b3559a4b4307797258dd51
