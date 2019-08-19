package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.LoginModel;
import com.service.*; // import the service method here

@Controller
public class LoginController {
		
	// this method is called when you click on login link to open login page.
	 @RequestMapping(value="/login",method=RequestMethod.GET)
	    public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response)
	    {
	        ModelAndView model = new ModelAndView("login");
	        LoginModel loginModel = new LoginModel();
	        model.addObject("loginModel", loginModel);
	        return model;
	    }
	 
	// this method is called when you SUBMIT on login link on loginPage.
	    @RequestMapping(value="/signin",method=RequestMethod.POST)
	    public ModelAndView executeLogin(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("loginModel")LoginModel loginModel)
	    {
	        ModelAndView model= null;
	        try
	        {						// authenticateUser is a method in service class
	            boolean isValidUser = authenticateUser.isValidUser(loginModel.getUsername(), loginModel.getPassword());
	            if(isValidUser)
	            {
	                System.out.println("User Login Successful");
	                request.setAttribute("loggedInUser", loginModel.getUsername());
	                model = new ModelAndView("dashboard");
	            }
	            else
	            {
	                model = new ModelAndView("login");
	model.addObject("loginModel", loginModel);
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
