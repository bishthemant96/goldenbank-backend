package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.TransactionModel;
import com.service.TransactionService;

@Controller
public class TransactionController {

	@Autowired
	TransactionService tService;

	
	@RequestMapping(value = "/addTransaction", method = RequestMethod.POST)
	public String createTransaction(@ModelAttribute("transactionModel") TransactionModel transactionModel, Model model) {
		transactionModel = tService.createTransaction(transactionModel);
		model.addAttribute("transactionModel", transactionModel);
		return "transactionCrud";
	}
	

	@RequestMapping(value = "/readTransaction", method = RequestMethod.GET)
	public String readTransaction(@RequestParam("transId") long id, Model model) {
		TransactionModel transactionModel = new TransactionModel();
		transactionModel.setTransId(id);
		transactionModel = tService.viewTransaction(transactionModel);
		model.addAttribute("transactionModel", transactionModel);
		if (transactionModel.isStatus()) {
			return "transactionView";

		} else {
			return "transactionCrud";
		}
	}
	
}