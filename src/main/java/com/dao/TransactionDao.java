package com.dao;

import com.entity.Transaction;

public interface TransactionDao {

	Transaction createTransaction(Transaction emp);
	Transaction readTransaction(Transaction emp);
	Transaction updateTransaction(Transaction emp);
	Transaction deleteTransaction(Transaction emp);
	
}
