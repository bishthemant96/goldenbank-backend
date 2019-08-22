package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//This controller is just for navigating through navigation bar

@Controller
public class NavigatorController {
	
	
	@RequestMapping(value="/index", method = RequestMethod.GET)
	public String getIndexPage(Model model) {
		return "index";
	}
	
	@RequestMapping(value="/contact", method = RequestMethod.GET)
	public String getContactPage(Model model) {
		return "contact";
	}
	
	@RequestMapping(value="/employeeDash", method = RequestMethod.GET)
	public String getEmployeePage(Model model) {
		return "employeeDash";
	}
	@RequestMapping(value="/employeeDash", method = RequestMethod.POST)
	public String getEmployeeDash(Model model) {
		return "employeeDash";
	}
	@RequestMapping(value="/customerCrud", method = RequestMethod.GET)
	public String getCustomerCrudPage(Model model) {
		return "customerCrud";
	}
	@RequestMapping(value="/accountCrud", method = RequestMethod.GET)
	public String getAccountCrudPage(Model model) {
		return "accountCrud";
	}
	@RequestMapping(value="/transaction", method = RequestMethod.GET)
	public String getTransactionPage(Model model) {
		return "transaction";
	}
	

}
