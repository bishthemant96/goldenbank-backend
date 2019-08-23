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
				System.out.println("No customer exists for this customerID...");
			} else {
				LoanAccountEntity loanAccount = new LoanAccountEntity();
				BeanUtils.copyProperties(loanModel, loanAccount);
				loanAccount.setCustomer(cEntity);
				try {
					loanAccount = lDao.createLoan(loanAccount);
					BeanUtils.copyProperties(loanAccount, loanModel);
					loanModel.setStatus(true);
				} catch (Exception e) {
					System.out.println("Error occured during loan creation...");
				}
			}
		} catch (Exception e) {
			System.out.println("error occured while gathering customer's information... " + e);
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
			System.out.println("Error occured during loan deletion...");
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
			System.out.println("Error occured during accessing loan info...");
		}
		return loanModel;
	}

}
