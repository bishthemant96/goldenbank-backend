package com.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.EmployeeDao;
import com.model.EmployeeModel;

public class EmployeeService {
	
	@Autowired
	EmployeeDao eDao;	
	
	EmployeeModel authentication(EmployeeModel employee) {
		return null;
	}
}
