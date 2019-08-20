package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.CustomerModel;
import com.service.CustomerService;

//This controller will handle the customer CRUD in customer management
@Controller
public class CustomerController {

	CustomerModel customerModel;
	CustomerService customerService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getPage(Model model) {
		return "login";
	}

	// customerManagement/addCustomer
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String addCustomer(@ModelAttribute("customerModel") Model model) {
		boolean isAdded = customerService.addCustomer(customerModel);

		if (isAdded) {
			model.addAttribute("addMessage", "Customer Sucessfully added");
		} else {
			model.addAttribute("addMessage", "Error in adding customer");
		}

		return "dashboard";

	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String deleteCustomer(int id, Model model) {

		boolean isDeleted = customerService.deleteCustomer(id);

		if (isDeleted) {
			model.addAttribute("deleteMessage", "Customer Sucessfully added");
		} else {
			model.addAttribute("deleteMessage", "Error in adding customer");
		}

		return "dashboard";
	}

	@RequestMapping(value = "/customerManagement/updateCustomer", method = RequestMethod.POST)
	public void updateCustomer(Model model) {
		customerService.updateCustomer(model);
	}

}
