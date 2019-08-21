package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.AccountModel;
import com.service.AccountService;

@Controller
public class AccountController {

	@Autowired
	AccountService accService;
	
	@RequestMapping(value="/addAccount", method = RequestMethod.POST)
	public String createAccount(@ModelAttribute("AccountModel") AccountModel accountModel, Model model) {
		accountModel = accService.createAccount(accountModel);
		if(accountModel.isStatus()) {
			return "accountCrud";
		} else {
			return "employeeDash";
		}
	}
	
	@RequestMapping(value="/deleteAccount", method = RequestMethod.POST)
	public String deleteAccount(@ModelAttribute("AccountModel") AccountModel accountModel, Model model) {
		accountModel = accService.deleteAccount(accountModel);
		if(accountModel.isStatus()) {
			return "accountCrud";
		} else {
			return "employeeDash";
		}
	}
	
}
