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
	public String createTransaction(@ModelAttribute("addTransaction") TransactionModel transactionModel, Model model) {

		transactionModel = tService.createTransaction(transactionModel);
		model.addAttribute("message", "Transaction Created!");
		return "transaction";
	}

	@RequestMapping(value = "/readTransaction", method = RequestMethod.GET)
	public String readTransaction(@RequestParam("transId") long id, Model model) {

		TransactionModel transModel = new TransactionModel();
		transModel.setTransId(id);
		transModel = tService.viewTransaction(transModel);
		String msg = "No Transaction Exists for transaction ID :" + transModel.getTransId();

		if (transModel.isStatus()) {

			model.addAttribute("transModel", transModel);
			return "transactionView";

		} else {
			model.addAttribute("transModel", transModel);
			model.addAttribute("message", msg);
			return "transactionView";
		}

	}
}