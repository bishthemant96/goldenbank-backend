package com.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.EmployeeDao;
import com.entity.EmployeeEntity;
import com.model.EmployeeModel;

@Transactional
@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao eDao;	
	
	public EmployeeModel authentication(EmployeeModel empModel) {
		EmployeeEntity empEntity = new EmployeeEntity();
		BeanUtils.copyProperties(empModel, empEntity);
		empEntity = eDao.readEmployee(empEntity);
		
		if(empEntity==null) {
			empModel.setStatus(false);
		} else if(empModel.getEmpPassword().equals(empEntity.getEmpPassword())) {
			BeanUtils.copyProperties(empEntity, empModel);
			empModel.setStatus(true);
		} else {
			empModel.setStatus(false);
		}
		
		return empModel;
	}
	
	
	
}
