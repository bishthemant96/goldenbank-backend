package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.EmployeeModel;
import com.service.EmployeeService;

@Controller
public class LoginController { 
	
	@Autowired
	EmployeeService empService;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String redirectToLogin(Model model) {
		return "redirect:/login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLoginPage(Model model) {
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView submitLoginPage(@ModelAttribute("employeeModel") EmployeeModel employeeModel) {
		employeeModel = empService.authentication(employeeModel);
		
		if(employeeModel.isStatus()) {
			
			ModelAndView mv = new ModelAndView("employeeDash");
			
			mv.addObject("name", employeeModel.getEmpName());
			mv.addObject("branch", employeeModel.getEmpBranch());
			mv.addObject("post", employeeModel.getEmpPost());

			return mv;
		}
		else {
			String str = "Invalid UserId or Password";
			ModelAndView mv = new ModelAndView("login");
			mv.addObject("Error", str);
			return mv;
		}
	}

}
