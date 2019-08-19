package com.dao;

import com.entity.LoanAccount;

public interface LoanDao {

	LoanAccount createLoan(LoanAccount loanAccount);
	LoanAccount readLoan(LoanAccount loanAccount);
	LoanAccount updateLoan(LoanAccount loanAccount);
	LoanAccount deleteLoan(LoanAccount loanAccount);
	
}
