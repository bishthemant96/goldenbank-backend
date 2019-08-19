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
	
	@RequestMapping(value="/news", method = RequestMethod.GET)
	public String getNewsPage(Model model) {
		return "news";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String getLoginPage(Model model) {
		return "login";
	}
	
	@RequestMapping(value="/contact", method = RequestMethod.GET)
	public String getContactPage(Model model) {
		return "contact";
	}
	
	@RequestMapping(value="/employeeDash", method = RequestMethod.GET)
	public String getEmployeePage(Model model) {
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
	@RequestMapping(value="/newCustomer", method = RequestMethod.GET)
	public String getNewCustomerPage(Model model) {
		return "newCustomer";
	}
	@RequestMapping(value="/deleteCustomer", method = RequestMethod.GET)
	public String getDeleteCustomerPage(Model model) {
		return "deleteCustomer";
	}
	@RequestMapping(value="/editCustomer", method = RequestMethod.GET)
	public String getEditCustomerPage(Model model) {
		return "editCustomer";
	}
	@RequestMapping(value="/viewCustomer", method = RequestMethod.GET)
	public String getViewCustomerPage(Model model) {
		return "viewCustomer";
	}

}
