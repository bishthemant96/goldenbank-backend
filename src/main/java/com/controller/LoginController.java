package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.service.CustomerService; // import the service method here

@Controller
public class LoginController { 
	CustomerService customerService= null;
	
	@RequestMapping(value="/signin", method = RequestMethod.POST)
	public String getLoginPage(Model model) {
		
		
		
		return "employeeDash";
	}

}
