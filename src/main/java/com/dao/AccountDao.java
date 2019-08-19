package com.dao;

import com.entity.Account;

public interface AccountDao {
	 Account createAccount(Account account);
	 Account readAccount(Account account);
	 Account updateAccount(Account account);
	 Account deleteAccount(Account account);
}
