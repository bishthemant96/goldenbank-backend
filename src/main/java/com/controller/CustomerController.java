package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//This controller will handle the customer CRUD in customer management
@Controller
public class CustomerController {

	@RequestMapping(value="/addCustomer", method = RequestMethod.GET)
	public String addCustomer(Model model) {
		
		
		return "";
	}
	
	@RequestMapping(value="/updateCustomer", method = RequestMethod.GET)
	public String updateCustomer(Model model) {
		
		
		return "";
	}
	
	@RequestMapping(value="/deleteCustomer", method = RequestMethod.GET)
	public String deleteCustomer(Model model) {
		
		
		return "";
	}
	
	@RequestMapping(value="/viewCustomer", method = RequestMethod.GET)
	public String viewCustomer(Model model) {
		
		
		return "";

	}

}
