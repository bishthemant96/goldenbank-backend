package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//This controller is just for navigating through navigation bar

@Controller
public class NavigatorController {
	
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
	
	@RequestMapping(value="/loanCrud", method = RequestMethod.GET)
	public String getLoanPage(Model model) {
		return "loanCrud";
	}
	
	@RequestMapping(value="/transactionCrud", method = RequestMethod.GET)
	public String getTransactionPage(Model model) {
		return "transactionCrud";
	}
}
