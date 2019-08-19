package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.entity.LoanAccount;

@Service
public class LoanDaoImpl implements LoanDao {

	@PersistenceContext
	EntityManager em;
	
	public LoanAccount createLoan(LoanAccount loan) {
		em.persist(loan);
		return loan;
	}

	public LoanAccount readLoan(LoanAccount loan) {
		LoanAccount reLoan = em.find(LoanAccount.class, loan.getLoanAccNo() ); //Replace 1 with getID function.
		return reLoan;
	}

	public LoanAccount updateLoan(LoanAccount loan) {
		LoanAccount reLoan = em.find(LoanAccount.class, loan.getLoanAccNo()); //Replace 1 with getID function
		reLoan.setAmount(loan.getAmount());
		reLoan.setBranch(loan.getBranch());
		reLoan.setLoanType(loan.getLoanType());
		return reLoan;
	}

	public LoanAccount deleteLoan(LoanAccount loan) {
		LoanAccount reLoan = em.find(LoanAccount.class, loan.getLoanAccNo()); //Replace 1 with getID function
		em.remove(reLoan);
		return loan;
	}
}
