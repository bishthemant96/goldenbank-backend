package com.dao;

import com.entity.AccountEntity;

public interface AccountDao {
	 AccountEntity createAccount(AccountEntity account);
	 AccountEntity readAccount(AccountEntity account);
	 AccountEntity updateAccount(AccountEntity account);
	 AccountEntity deleteAccount(AccountEntity account);
}
