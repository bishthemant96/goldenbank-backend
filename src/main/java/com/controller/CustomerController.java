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
		
		
		model.addAttribute("message", "Customer Created!");
		return "customerCrud";
	}
	
	@RequestMapping(value="/updateCustomer", method = RequestMethod.GET)
	public String updateCustomerForm(@ModelAttribute("updateCustomerForm") CustomerModel customerModel, Model model) {
		
		customerModel = cService.readCustomer(customerModel);
		model.addAttribute("updateCustomerForm", customerModel);

		return "updateCustomer";
	}
	
	@RequestMapping(value="/updateCustomer", method = RequestMethod.POST)
	public String updateCustomer(@ModelAttribute("updateCustomerForm") CustomerModel customerModel, Model model) {
		customerModel = cService.updateCustomer(customerModel);
		model.addAttribute("message1", "Customer Updated!");
		return "customerCrud";
	}

	
	@RequestMapping(value="/deleteCustomer", method = RequestMethod.POST)
	public String deleteCustomer(@ModelAttribute("deleteCus") CustomerModel customerModel, Model model) {
		customerModel = cService.deleteCustomer(customerModel);
		model.addAttribute("message2", "Customer Deleted!");
		return "customerCrud";
	}
	
	@RequestMapping(value="/viewCustomer", method = RequestMethod.POST)
	public String viewCustomer(@ModelAttribute("viewCustomer") CustomerModel customerModel, Model model) {
		
		customerModel = cService.readCustomer(customerModel);
	
		
		  model.addAttribute("UserID", customerModel.getCusID());
		  model.addAttribute("Name", customerModel.getCusName());
		  model.addAttribute("age", customerModel.getCusAge());
		  model.addAttribute("address", customerModel.getCusAddress());
		  model.addAttribute("email", customerModel.getCusEmail());
		  model.addAttribute("gender", customerModel.getCusGender());
		 
		return "viewCustomer";

	}

}
