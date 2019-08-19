package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.entity.LoanEntity;

@Service
public class LoanDaoImpl implements LoanDao {

	@PersistenceContext
	EntityManager em;
	
	public LoanEntity createLoan(LoanEntity loan) {
		em.persist(loan);
		return loan;
	}

	public LoanEntity readLoan(LoanEntity loan) {
		LoanEntity reLoan = em.find(LoanEntity.class, 1 ); //Replace 1 with getID function.
		return reLoan;
	}

	public LoanEntity updateLoan(LoanEntity loan) {
		LoanEntity reLoan = em.find(LoanEntity.class, 1); //Replace 1 with getID function
		//Call setter functions over here.
		return reLoan;
	}

	public LoanEntity deleteLoan(LoanEntity loan) {
		LoanEntity reLoan = em.find(LoanEntity.class, 1); //Replace 1 with getID function
		em.remove(reLoan);
		return loan;
	}
}
