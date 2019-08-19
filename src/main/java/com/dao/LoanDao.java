package com.dao;

import com.entity.LoanAccount;

public interface LoanDao {

	LoanAccount createLoan(LoanAccount emp);
	LoanAccount readLoan(LoanAccount emp);
	LoanAccount updateLoan(LoanAccount emp);
	LoanAccount deleteLoan(LoanAccount emp);
	
}
