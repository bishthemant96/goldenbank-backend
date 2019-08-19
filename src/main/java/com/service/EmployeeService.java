package com.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.EmployeeDao;
import com.entity.Employee;
import com.model.EmployeeModel;

@Transactional
@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao eDao;	
	
	public EmployeeModel authentication(EmployeeModel employee) {
		Employee empEntity = new Employee();
		BeanUtils.copyProperties(employee, empEntity);
		empEntity = eDao.readEmployee(empEntity);
		return employee;
	}
}
