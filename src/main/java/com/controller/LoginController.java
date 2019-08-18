package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.CustomerDao;
import com.model.CustomerModel;

@Controller
public class LoginController {

	@Autowired
	CustomerDao customerDao;

//	@RequestMapping(value = "/loginpage", method = RequestMethod.GET)
//	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
//		ModelAndView mav = new ModelAndView("login");
//		customerService.checkEmployee(username,password);
//		mav.addObject("login", new Login());
//
//	}
	
	@RequestMapping(value="/doLogin", method = RequestMethod.GET)
    public ModelAndView authenticateEmployee(@ModelAttribute CustomerModel customerModel,BindingResult result, HttpSession session)
    {
        ModelAndView view = null;
        List<CustomerModel> bean=new ArrayList<CustomerModel>();
        
		bean=customerDao.authenticateEmployee(customerModel.getUsername());
         if(!result.hasFieldErrors())
         {
        if(bean!=null && customerModel.getUsername()!=null && customerModel.getPassword()!=null) 
        {   
            session.setAttribute("bean",bean);
            System.out.println("username and password are correct");
            view =new ModelAndView("dashboard"); 
        } 
        else
        {
            view=new ModelAndView("login");
            System.out.println("username and password are wrong");
        }
         }
        return view;
    }

}
