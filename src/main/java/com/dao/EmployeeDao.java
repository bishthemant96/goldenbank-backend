package com.dao;

import java.util.List;

import com.entity.EmployeeEntity;

public interface EmployeeDao {

	EmployeeEntity createEmployee(EmployeeEntity emp);
	EmployeeEntity readEmployee(EmployeeEntity emp);
	EmployeeEntity updateEmployee(EmployeeEntity emp);
	EmployeeEntity deleteEmployee(EmployeeEntity emp);
	
	List<EmployeeEntity> displayAllEmployee(EmployeeEntity emp);
}
