package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.entity.Account;

@Service
public class AccountDaoImpl implements AccountDao {

	@PersistenceContext
	EntityManager em;
	
	public Account createAccount(Account account) {
		em.persist(account);
		return account;
	}

	public Account readAccount(Account account) {
		Account reAccount = em.find(Account.class, 1 ); //Replace 1 with getID function.
		return reAccount;
	}

	public Account updateAccount(Account account) {
		Account reAccount = em.find(Account.class, 1); //Replace 1 with getID function
		//Call setter functions over here.
		return reAccount;
	}

	public Account deleteAccount(Account account) {
		Account reAccount = em.find(Account.class, 1); //Replace 1 with getID function
		em.remove(reAccount);
		return account;
	}
}
