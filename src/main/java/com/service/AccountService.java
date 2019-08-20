package com.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AccountDao;
import com.entity.AccountEntity;
import com.entity.EmployeeEntity;
import com.model.AccountModel;

@Service
public class AccountService {

	@Autowired
	AccountDao aDao;

	public AccountModel createAccount(AccountModel accModel) {

		AccountEntity accEntity = new AccountEntity();
		BeanUtils.copyProperties(accModel, accEntity);
		EmployeeEntity empEntity= new EmployeeEntity();
		
		accEntity = aDao.createAccount(accEntity);
		BeanUtils.copyProperties(accEntity, accModel);

		return accModel;

	}

	public AccountModel readAccount(AccountModel accModel) {

		AccountEntity accEntity = new AccountEntity();
		BeanUtils.copyProperties(accModel, accEntity);

		accEntity = aDao.readAccount(accEntity);
		BeanUtils.copyProperties(accEntity, accModel);

		return accModel;

	}

	public AccountModel updateAccount(AccountModel accModel) {

		AccountEntity accEntity = new AccountEntity();
		BeanUtils.copyProperties(accModel, accEntity);
		accEntity = aDao.updateAccount(accEntity);
		BeanUtils.copyProperties(accEntity, accModel);

		return accModel;

	}

	public AccountModel deleteAccount(AccountModel accModel) {

		AccountEntity accEntity = new AccountEntity();
		BeanUtils.copyProperties(accModel, accEntity);

		accEntity = aDao.deleteAccount(accEntity);
		BeanUtils.copyProperties(accEntity, accModel);

		return accModel;

	}

}
