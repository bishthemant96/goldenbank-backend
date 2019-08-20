package com.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.model.AccountModel;
import com.service.AccountService;

public class AccountController {

	@Autowired
	AccountService accService;
	
	public AccountModel createAccount(AccountModel accountModel) {
		
		return null;
	}
	
}
