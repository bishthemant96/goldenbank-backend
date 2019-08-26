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

	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
	public String addCustomer(@ModelAttribute("customerModel") CustomerModel customerModel, Model model) {
		customerModel = cService.createCustomer(customerModel);
		model.addAttribute("customerModel", customerModel);
		return "customerCrud";
	}
	
	@RequestMapping(value = "/viewCustomer", method = RequestMethod.POST)
	public String viewCustomer(@ModelAttribute("customerModel") CustomerModel customerModel, Model model) {
		customerModel = cService.readCustomer(customerModel);
		
		if (customerModel.isStatus()) {
			model.addAttribute("customerModel", customerModel);
			return "customerView";
		} else {
			model.addAttribute("customerModel",customerModel );
			return "customerCrud";
		}
	}

	@RequestMapping(value = "/updateCustomer", method = RequestMethod.GET)
	public String getUpdateCustomerForm(@ModelAttribute("customerModel") CustomerModel customerModel, Model model) {
		customerModel = cService.readCustomer(customerModel);
		model.addAttribute("customerModel", customerModel);
		if(customerModel.isStatus()) {
			return "customerUpdate";
		} else {
			return "customerCrud";
		}
		
	}

	@RequestMapping(value = "/updateCustomer", method = RequestMethod.POST)
	public String updateCustomer(@ModelAttribute("customerModel") CustomerModel customerModel, Model model) {
		customerModel = cService.updateCustomer(customerModel);
		model.addAttribute("customerModel",customerModel);
		return "customerCrud";
	}

	@RequestMapping(value = "/deleteCustomer", method = RequestMethod.POST)
	public String deleteCustomer(@ModelAttribute("customerModel") CustomerModel customerModel, Model model) {
		customerModel = cService.deleteCustomer(customerModel);
		model.addAttribute("customerModel", customerModel);
		return "customerCrud";
	}

}
