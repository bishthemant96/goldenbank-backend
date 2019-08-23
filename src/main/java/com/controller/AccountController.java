package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.AccountModel;
import com.service.AccountService;

@Controller
public class AccountController {

	@Autowired
	AccountService accService;
	
	@RequestMapping(value="/addAccount", method = RequestMethod.POST)
	public String createAccount(@ModelAttribute("AccountModel") AccountModel accountModel, Model model) {
		accountModel = accService.createAccount(accountModel);
		model.addAttribute("accModel", accountModel);
		return "accountCrud";
	}
	
	@RequestMapping(value="/deleteAccount", method = RequestMethod.POST)
	public String deleteAccount(@ModelAttribute("AccountModel") AccountModel accountModel, Model model) {
		accountModel = accService.deleteAccount(accountModel);
		model.addAttribute("accModel", accountModel);
		return "accountCrud";
	}
	
	@RequestMapping(value="/readAccount", method = RequestMethod.GET)
	public String readAccount(@RequestParam("accNo") String id, Model model) {
		AccountModel accModel = new AccountModel();
		accModel.setAccNo(Integer.parseInt(id));
		accModel = accService.readAccount(accModel);
		model.addAttribute("accModel", accModel);
		
		if(accModel.isStatus())
			return "accountView";
		else
			return "accountCrud";
	}
	
	
	@RequestMapping(value="/UpdateAccount", method = RequestMethod.POST)
	public String updateAccount(@ModelAttribute("AccountModel") AccountModel accModel, Model model) {
		accModel = accService.updateAccount(accModel);
		model.addAttribute("accModel", accModel);
		return "accountCrud";
	}
	
	
	@RequestMapping(value="/UpdateForm", method = RequestMethod.GET)
	public String updateForm(@RequestParam("accNo") String id, Model model) {
		AccountModel accModel = new AccountModel();
		accModel.setAccNo(Integer.parseInt(id));
		accModel = accService.readAccount(accModel);
		model.addAttribute("accModel", accModel);
		if(accModel.isStatus())
			return "accountUpdate";
		else
			return "accountCrud";
	}


}
