package com.dao;

import java.util.List;

import com.entity.EmployeeEntity;

public interface EmployeeDao {

	EmployeeEntity createEmployee(EmployeeEntity employee);
	EmployeeEntity readEmployee(EmployeeEntity employee);
	EmployeeEntity updateEmployee(EmployeeEntity employee);
	EmployeeEntity deleteEmployee(EmployeeEntity employee);
	
	List<EmployeeEntity> displayAllEmployee();
}
