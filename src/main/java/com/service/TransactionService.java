package com.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.TransactionDao;
import com.entity.TransactionEntity;
import com.model.TransactionModel;

@Service
public class TransactionService {
	
	@Autowired
	TransactionDao tDao;
	
	public TransactionModel createTransaction(TransactionModel transModel) {
		
		TransactionEntity transEntity = new TransactionEntity();
		BeanUtils.copyProperties(transModel, transEntity);
		transEntity=tDao.createTransaction(transEntity);
		BeanUtils.copyProperties( transEntity,transModel);
		
		return transModel;
		
	}

public TransactionModel readTransaction(TransactionModel transModel) {
		
		TransactionEntity transEntity = new TransactionEntity();
		BeanUtils.copyProperties(transModel, transEntity);
		transEntity=tDao.readTransaction(transEntity);
		BeanUtils.copyProperties( transEntity,transModel);
		
		return transModel;
		
	}

}
