package com.entity;

public interface AccountEntity {
	
	AccountEntity createAccount(AccountEntity account);
	AccountEntity readAccount(AccountEntity account);
	AccountEntity updateAccount(AccountEntity account);
	AccountEntity deleteAccount(AccountEntity account);
	
}
