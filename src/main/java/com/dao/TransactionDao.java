package com.dao;

import com.entity.Transaction;

public interface TransactionDao {

	Transaction createTransaction(Transaction transaction);
	Transaction readTransaction(Transaction transaction);
	Transaction updateTransaction(Transaction transaction);
	Transaction deleteTransaction(Transaction transaction);
	
}
