package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.CustomerModel;
import com.service.CustomerService;


//This controller will handle the customer CRUD in customer management
@Controller
public class CustomerController {
	
	@Autowired
	CustomerService cService;
	
	@RequestMapping(value="/addCustomer", method = RequestMethod.POST)
	public String addCustomer(@ModelAttribute("addCustomer") CustomerModel customerModel, Model model) {
		
		customerModel = cService.createCustomer(customerModel);
		
		return "customerCrud";
	}
	
	@RequestMapping(value="/updateCustomer", method = RequestMethod.POST)
	public String updateCustomer(Model model) {
		
		
		return "";
	}
	
	@RequestMapping(value="/deleteCustomer", method = RequestMethod.POST)
	public String deleteCustomer(Model model) {
		
		
		return "";
	}
	
	@RequestMapping(value="/viewCustomer", method = RequestMethod.POST)
	public String viewCustomer(Model model) {
		
		
		return "";

	}

}
