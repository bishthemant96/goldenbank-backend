package com.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.TransactionDao;
import com.entity.TransactionEntity;
import com.model.TransactionModel;

@Service
public class TransactionalService {


	@Autowired
	TransactionDao tDao;
	
	
	
	
	public TransactionModel createTransaction(TransactionModel transactionModel) {
		transactionModel.setStatus(false);
		TransactionEntity transactionEntity = new TransactionEntity();
		BeanUtils.copyProperties(transactionModel, transactionEntity);
		try {
			transactionEntity = tDao.createTransaction(transactionEntity);
			BeanUtils.copyProperties(transactionEntity, transactionModel);
			transactionModel.setStatus(true);
		} catch (Exception e) {
			System.out.println("Error occured while Adding transaction...");
		}
		return transactionModel;
	}

	public TransactionModel readTransaction(TransactionModel transactionModel) {
		transactionModel.setStatus(false);
		TransactionEntity transactionEntity = new TransactionEntity();
		BeanUtils.copyProperties(transactionModel, transactionEntity);
		try {
			transactionEntity = tDao.readTransaction(transactionEntity);
			BeanUtils.copyProperties(transactionEntity, transactionModel);
			transactionModel.setStatus(true);
		} catch (Exception e) {
			System.out.println("Error occured while reading transaction...");
		}
		return transactionModel;
	}
	
	
}
