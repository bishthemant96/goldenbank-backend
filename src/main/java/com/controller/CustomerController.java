package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


//This controller will handle the customer CRUD in customer management
@Controller
public class CustomerController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String getPage(Model model) {
		return "login";
	}

}
