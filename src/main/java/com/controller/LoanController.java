package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.LoanAccountModel;
import com.service.LoanService;;

@Controller
public class LoanController {

	@Autowired
	LoanService loanService;
	
	@RequestMapping(value="/createLoan", method = RequestMethod.POST)
	public String createLoan(@ModelAttribute("loanModel") LoanAccountModel loanModel, Model model) {
		loanModel = loanService.createLoan(loanModel);
		if(loanModel.isStatus()) {
			return "loan";
		} else {
			return "employeeDash";
		}
	}
	
	@RequestMapping(value="/deleteLoan", method = RequestMethod.POST)
	public String deleteLoan(@ModelAttribute("loanModel") LoanAccountModel loanModel, Model model) {
		loanModel = loanService.closeLoan(loanModel);
		if(loanModel.isStatus()) {
			return "loan";
		} else {
			return "employeeDash";
		}
	}
	
	@RequestMapping(value="/readLoan", method = RequestMethod.GET)
	public String readAccount(@RequestParam("loanAccNo") String id, Model model) {
		LoanAccountModel loanAccModel = new LoanAccountModel();
		loanAccModel.setLoanAccNo(Integer.parseInt(id));
		loanAccModel = loanService.viewLoan(loanAccModel);
		model.addAttribute("loanAccModel", loanAccModel);
		return "loanView";
	}

}
