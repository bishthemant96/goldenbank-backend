package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.entity.Transaction;

@Service
public class TransactionDaoImpl implements TransactionDao {

	@PersistenceContext
	EntityManager em;
	
	public Transaction createTransaction(Transaction transaction) {
		em.persist(transaction);
		return transaction;
	}

	public Transaction readTransaction(Transaction transaction) {
		Transaction reTransaction = em.find(Transaction.class, transaction.getTransId() ); //Replace 1 with getID function.
		return reTransaction;
	}

	public Transaction updateTransaction(Transaction transaction) {
		Transaction reTransaction = em.find(Transaction.class, transaction.getTransId()); //Replace 1 with getID function
		
		return reTransaction;
	}

	public Transaction deleteTransaction(Transaction transaction) {
		Transaction reTransaction = em.find(Transaction.class, transaction.getTransId()); //Replace 1 with getID function
		em.remove(reTransaction);
		return transaction;
	}

}
