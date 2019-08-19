package com.dao;

import com.entity.LoanEntity;

public interface LoanDao {

	LoanEntity createLoan(LoanEntity emp);
	LoanEntity readLoan(LoanEntity emp);
	LoanEntity updateLoan(LoanEntity emp);
	LoanEntity deleteLoan(LoanEntity emp);
	
}
