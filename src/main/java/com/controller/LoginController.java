package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.CustomerModel;
import com.service.CustomerService; // import the service method here

@Controller
public class LoginController { 
	CustomerService customerService= null;
	
	@RequestMapping(value="/index", method = RequestMethod.GET)
	public String getIndexPage(Model model) {
		return "index";
	}
	
		
	// this method is called when you click on login link to open login page.
	 @RequestMapping(value="/login",method=RequestMethod.GET)
	    public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response)
	    {
	        ModelAndView model = new ModelAndView("login");
	        CustomerModel customerModel = new CustomerModel();
	        model.addObject("customerModel", customerModel);
	        return model;
	    }
	 
	// this method is called when you SUBMIT on login link on loginPage.
	    @RequestMapping(value="/signin",method=RequestMethod.POST)
	    public ModelAndView executeLogin(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("customerModel")CustomerModel customerModel)
	    {
	        ModelAndView model= null;
	        try
	        {						// authenticateUser is a method in service class
	            boolean isValidUser = customerService.authenticateUser(customerModel.getCusName(), customerModel.getCusPassword());
	            if(isValidUser)
	            {
	                System.out.println("User Login Successful");
	                request.setAttribute("loggedInUser", customerModel.getCusName());
	                model = new ModelAndView("");
	            }
	            else
	            {
	                model = new ModelAndView("login");
	                model.addObject("customerModel", customerModel);
	                request.setAttribute("message", "Invalid credentials!!");
	            }
	 
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }
	 
	        return model;
	    }
}
