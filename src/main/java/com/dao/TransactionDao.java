package com.dao;

import com.entity.TransactionEntity;

public interface TransactionDao {

	TransactionEntity createTransaction(TransactionEntity emp);
	TransactionEntity readTransaction(TransactionEntity emp);
	TransactionEntity updateTransaction(TransactionEntity emp);
	TransactionEntity deleteTransaction(TransactionEntity emp);
	
}
