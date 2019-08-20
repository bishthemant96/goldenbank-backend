package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.entity.LoanAccountEntity;

@Service
public class LoanDaoImpl implements LoanDao {

	@PersistenceContext
	EntityManager em;
	
	public LoanAccountEntity createLoan(LoanAccountEntity loan) {
		em.persist(loan);
		return loan;
	}

	public LoanAccountEntity readLoan(LoanAccountEntity loan) {
		LoanAccountEntity reLoan = em.find(LoanAccountEntity.class, loan.getLoanAccNo() ); //Replace 1 with getID function.
		return reLoan;
	}

	public LoanAccountEntity updateLoan(LoanAccountEntity loan) {
		LoanAccountEntity reLoan = em.find(LoanAccountEntity.class, loan.getLoanAccNo()); //Replace 1 with getID function
		reLoan.setAmount(loan.getAmount());
		reLoan.setBranch(loan.getBranch());
		reLoan.setLoanType(loan.getLoanType());
		return reLoan;
	}

	public LoanAccountEntity deleteLoan(LoanAccountEntity loan) {
		LoanAccountEntity reLoan = em.find(LoanAccountEntity.class, loan.getLoanAccNo()); //Replace 1 with getID function
		em.remove(reLoan);
		return loan;
	}
}
