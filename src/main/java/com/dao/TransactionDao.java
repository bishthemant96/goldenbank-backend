package com.dao;

import com.entity.TransactionEntity;

public interface TransactionDao {

	TransactionEntity createTransaction(TransactionEntity transaction);
	TransactionEntity readTransaction(TransactionEntity transaction);
	TransactionEntity updateTransaction(TransactionEntity transaction);
	TransactionEntity deleteTransaction(TransactionEntity transaction);
	
}
