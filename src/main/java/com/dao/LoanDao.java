package com.dao;

import com.entity.LoanAccountEntity;

public interface LoanDao {

	LoanAccountEntity createLoan(LoanAccountEntity loanAccount);
	LoanAccountEntity readLoan(LoanAccountEntity loanAccount);
	LoanAccountEntity updateLoan(LoanAccountEntity loanAccount);
	LoanAccountEntity deleteLoan(LoanAccountEntity loanAccount);
	
}
