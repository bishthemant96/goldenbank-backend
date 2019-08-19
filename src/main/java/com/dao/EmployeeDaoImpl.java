package com.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.entity.Employee;

@Service
public class EmployeeDaoImpl implements EmployeeDao {

	@PersistenceContext
	EntityManager em;
	
	public Employee createEmployee(Employee employee) {
		em.persist(employee);
		return employee;
	}

	public Employee readEmployee(Employee employee) {
		Employee reEmployee = em.find(Employee.class, employee.getEmpID() ); //Replace 1 with getID function.
		return reEmployee;
	}

	public Employee updateEmployee(Employee employee) {
		Employee reEmployee = em.find(Employee.class, employee.getEmpID()); //Replace 1 with getID function
		
	    reEmployee.setEmpName(employee.getEmpName());
	    reEmployee.setEmpBranch(employee.getEmpBranch());
	    reEmployee.setEmpPost(employee.getEmpPost());
	    reEmployee.setEmpAge(employee.getEmpAge());
	    reEmployee.setEmpNo(employee.getEmpNo());
	    reEmployee.setEmpEmail(employee.getEmpEmail());
	    
		return reEmployee;
	}

	public Employee deleteEmployee(Employee employee) {
		Employee reEmployee = em.find(Employee.class, employee.getEmpID()); //Replace 1 with getID function
		em.remove(reEmployee);
		return employee;
	}

	public List<Employee> displayAllEmployee() {
		List<?> temp = em.createQuery("Select e from Employee e").getResultList();
		List<Employee> employeeList = new ArrayList<Employee>(temp.size());
		
		for(Object obj: temp)
			employeeList.add(((Employee)obj));	

		return employeeList;
	}

}
