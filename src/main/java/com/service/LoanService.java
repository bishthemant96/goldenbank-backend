package com.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CustomerDao;
import com.dao.LoanDao;
import com.entity.CustomerEntity;
import com.entity.LoanAccountEntity;
import com.model.LoanAccountModel;

@Transactional
@Service
public class LoanService {

	@Autowired
	CustomerDao cDao;
	
	@Autowired
	LoanDao lDao;

	
	public LoanAccountModel createLoan(LoanAccountModel loanModel) {
		loanModel.setStatus(false);

		CustomerEntity cEntity = new CustomerEntity();
		cEntity.setCusID(loanModel.getCusID());
		try {
			
			cEntity = cDao.readCustomer(cEntity);
			if (cEntity == null) {
				System.out.println("Loan creation failed: No such customer.");
				loanModel.setError("Customer does not exist.");
			} else {
				
				LoanAccountEntity loanAccount = new LoanAccountEntity();
				BeanUtils.copyProperties(loanModel, loanAccount);
				loanAccount.setCustomer(cEntity);
				
				try {
					
					loanAccount = lDao.createLoan(loanAccount);
					BeanUtils.copyProperties(loanAccount, loanModel);
					loanModel.setStatus(true);
					
				} catch (Exception e) {
					System.out.println("Loan creation failed.");
					loanModel.setError("Loan could not be created.");
				}
			}
		} catch (Exception e) {
			System.out.println("Loan creation failed: No such customer.");
			loanModel.setError("Customer does not exist.");
		}
		
		return loanModel;
	}


	public LoanAccountModel viewLoan(LoanAccountModel loanModel) {
		loanModel.setStatus(false);
		LoanAccountEntity loanAccount = new LoanAccountEntity();
		BeanUtils.copyProperties(loanModel, loanAccount);

		try {
			
			loanAccount = lDao.readLoan(loanAccount);
			BeanUtils.copyProperties(loanAccount, loanModel);
			loanModel.setCusID(loanAccount.getCustomer().getCusID());
			loanModel.setStatus(true);
			
		} catch (Exception e) {
			System.out.println("Loan view failed.");
			loanModel.setError("Loan does not exist.");
		}
		return loanModel;
	}
	
	
	public LoanAccountModel closeLoan(LoanAccountModel loanModel) {
		loanModel.setStatus(false);
		LoanAccountEntity loanAccount = new LoanAccountEntity();
		BeanUtils.copyProperties(loanModel, loanAccount);

		try {
			
			loanAccount = lDao.deleteLoan(loanAccount);
			BeanUtils.copyProperties(loanAccount, loanModel);
			loanModel.setStatus(true);
			
		} catch (Exception e) {
			System.out.println("Loan deletion failed.");
			loanModel.setError("Loan does not exist.");
		}
		return loanModel;
	}

}
