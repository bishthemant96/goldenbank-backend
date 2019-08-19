package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.EmployeeDao;
import com.model.EmployeeModel;

@Transactional
@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao eDao;	
	
	EmployeeModel authentication(EmployeeModel employee) {
		EmployeeEntity empEntity = eDao.readEmployee(employee);
		return null;
	}
}
