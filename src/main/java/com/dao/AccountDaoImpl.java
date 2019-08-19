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
		Account reAccount = em.find(Account.class, account.getAccNo() ); //Replace 1 with getID function.
		return reAccount;
	}

	public Account updateAccount(Account account) {
		Account reAccount = em.find(Account.class, account.getAccNo()); //Replace 1 with getID function
		reAccount.setBranch(account.getBranch());
		reAccount.setAccNominee(account.getAccNominee());
		reAccount.setAmount(account.getAmount());
		reAccount.setAccType(account.getAccType());
		return reAccount;
	}

	public Account deleteAccount(Account account) {
		Account reAccount = em.find(Account.class, 1); //Replace 1 with getID function
		em.remove(reAccount);
		return account;
	}
}
