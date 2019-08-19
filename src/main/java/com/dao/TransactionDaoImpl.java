package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.entity.TransactionEntity;

@Service
public class TransactionDaoImpl implements TransactionDao {

	@PersistenceContext
	EntityManager em;
	
	public TransactionEntity createTransaction(TransactionEntity transaction) {
		em.persist(transaction);
		return transaction;
	}

	public TransactionEntity readTransaction(TransactionEntity transaction) {
		TransactionEntity reTransaction = em.find(TransactionEntity.class, 1 ); //Replace 1 with getID function.
		return reTransaction;
	}

	public TransactionEntity updateTransaction(TransactionEntity transaction) {
		TransactionEntity reTransaction = em.find(TransactionEntity.class, 1); //Replace 1 with getID function
		//Call setter functions over here.
		return reTransaction;
	}

	public TransactionEntity deleteTransaction(TransactionEntity transaction) {
		TransactionEntity reTransaction = em.find(TransactionEntity.class, 1); //Replace 1 with getID function
		em.remove(reTransaction);
		return transaction;
	}

}
