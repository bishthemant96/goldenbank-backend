package com.dao;

import java.util.List;

import com.entity.Employee;

public interface EmployeeDao {

	Employee createEmployee(Employee emp);
	Employee readEmployee(Employee emp);
	Employee updateEmployee(Employee emp);
	Employee deleteEmployee(Employee emp);
	
	List<Employee> displayAllEmployee(Employee emp);
}
