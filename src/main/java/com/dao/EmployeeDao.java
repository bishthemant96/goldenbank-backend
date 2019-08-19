package com.dao;

import java.util.List;

import com.entity.Employee;

public interface EmployeeDao {

	Employee createEmployee(Employee employee);
	Employee readEmployee(Employee employee);
	Employee updateEmployee(Employee employee);
	Employee deleteEmployee(Employee employee);
	
	List<Employee> displayAllEmployee(Employee employee);
}
