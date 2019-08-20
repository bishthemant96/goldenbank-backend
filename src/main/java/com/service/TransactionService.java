package com.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AccountDao;
import com.dao.TransactionDao;
import com.entity.AccountEntity;
import com.entity.TransactionEntity;
import com.model.TransactionModel;

@Service
public class TransactionService {

	@Autowired
	TransactionDao tDao;

	@Autowired
	AccountDao aDao;

	public TransactionModel createTransaction(TransactionModel transModel) {

		transModel.setStatus(false);

		AccountEntity accEntity = new AccountEntity();
		accEntity.setAccNo(transModel.getAccNo());
		aDao.readAccount(accEntity);

		TransactionEntity transEntity = new TransactionEntity();
		BeanUtils.copyProperties(transModel, transEntity);
		transEntity.setAccount(accEntity);

		try {
			transEntity = tDao.createTransaction(transEntity);
			transModel.setStatus(true);
		} catch (Exception e) {
			System.out.println("Error occured during loan creation...");
		}

		return transModel;

	}

	public TransactionModel deleteTransaction(TransactionModel transModel) {
		transModel.setStatus(false);

		TransactionEntity transEntity = new TransactionEntity();
		BeanUtils.copyProperties(transModel, transEntity);

		try {
			transEntity = tDao.deleteTransaction(transEntity);
			BeanUtils.copyProperties(transEntity, transModel);
			transModel.setStatus(true);
		} catch (Exception e) {
			System.out.println("Error occured during loan deletion...");
		}

		return transModel;

	}

}
