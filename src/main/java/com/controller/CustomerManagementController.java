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

@Controller
public class CustomerManagementController {
	
	CustomerService customerService;
	
	@RequestMapping(value = "/customerManagement/addCustomer", method = RequestMethod.POST)
	public ModelAndView addCustomer(@ModelAttribute CustomerModel customerModel) {
		ModelAndView mv = new ModelAndView("redirect:/dashboard");
		boolean isAdded =customerService.addCustomer(customerModel);
		if (isAdded) {
			mv.addObject("message", "New user successfully added");
			//return new ModelAndView("redirect:/dashboard");
		} else {
			return new ModelAndView("error");
		}
		return mv;
		
	}

	@RequestMapping(value = "/customerManagement/deleteCustomer", method = RequestMethod.GET)
	public ModelAndView deleteCustomer(@PathVariable int id) {
		
		boolean isDeleted = customerService.deleteCustomer(id);
		System.out.println("User deletion respone: " + isDeleted);
		ModelAndView mv = new ModelAndView("redirect:/dashboard");
		return mv;
	}
	@RequestMapping(value = "/customerManagement/updateCustomer", method = RequestMethod.POST)
	public void updateCustomer(Model model) {
		customerService.updateCustomer(model);
	}
	
}
