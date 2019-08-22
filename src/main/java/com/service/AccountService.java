package com.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.AccountDao;
import com.dao.CustomerDao;
import com.entity.AccountEntity;
import com.entity.CustomerEntity;

import com.model.AccountModel;

@Transactional
@Service
public class AccountService {

	@Autowired
	AccountDao aDao;

	@Autowired
	CustomerDao cDao;

	public AccountModel createAccount(AccountModel accModel) {
		CustomerEntity cusEntity = new CustomerEntity();
		cusEntity.setCusID(accModel.getCusID());
		cusEntity = cDao.readCustomer(cusEntity);

		if (cusEntity == null) {
			accModel.setStatus(false);
			return accModel;
		} else {
			AccountEntity accEntity = new AccountEntity();
			BeanUtils.copyProperties(accModel, accEntity);
			accEntity.setCustomer(cusEntity);
			try {
				accEntity = aDao.createAccount(accEntity);
				BeanUtils.copyProperties(accEntity, accModel);
				accModel.setStatus(true);
				return accModel;
			} catch (Exception e) {
				accModel.setStatus(false);
				return accModel;
			}
		}
	}

	public AccountModel readAccount(AccountModel accModel) {
		AccountEntity accEntity = new AccountEntity();
		BeanUtils.copyProperties(accModel, accEntity);
		accEntity = aDao.readAccount(accEntity);
		BeanUtils.copyProperties(accEntity, accModel);
		
		int cusID = accEntity.getCustomer().getCusID();
		accModel.setCusID(cusID);
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
		try {
			accEntity = aDao.deleteAccount(accEntity);
			accModel.setStatus(true);
			return accModel;
		} catch (Exception e) {
			accModel.setStatus(false);
			return accModel;
		}
	}
}
