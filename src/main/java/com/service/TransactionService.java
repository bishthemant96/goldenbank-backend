package com.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AccountDao;
import com.dao.TransactionDao;
import com.entity.AccountEntity;
import com.entity.TransactionEntity;
import com.model.AccountModel;
import com.model.TransactionModel;

@Service
public class TransactionService {

	@Autowired
	TransactionDao tDao;

	@Autowired
	AccountDao aDao;
	
	@Autowired
	AccountService aService;

	
	public TransactionModel createTransaction(TransactionModel transModel) {
		transModel.setStatus(false);
		
		AccountEntity accEntityFrom = new AccountEntity();
		AccountEntity accEntityTo = new AccountEntity();

		accEntityFrom.setAccNo(transModel.getFromAcc());
		accEntityTo.setAccNo(transModel.getToAcc());

		try {
			accEntityFrom = aDao.readAccount(accEntityFrom);
			accEntityTo = aDao.readAccount(accEntityTo);

			if (accEntityFrom == null) {
				System.out.println("No from-account found.");
				return transModel;
				
			} else if (accEntityTo == null) {
				System.out.println("No to-account found.");
				return transModel;
			}
			
			long fromAccBal = accEntityFrom.getAmount();
			long toAccBal = accEntityTo.getAmount();
			
			if (fromAccBal <= Integer.parseInt(transModel.getAmount())) {
				System.out.println("Insufficient Balance.");
				return transModel;
			} else {
				TransactionEntity transEntity = new TransactionEntity();
				BeanUtils.copyProperties(transModel, transEntity);
				transEntity.setFromAcc(accEntityFrom);

				try {
					transEntity = tDao.createTransaction(transEntity);
					fromAccBal = fromAccBal-Integer.parseInt(transModel.getAmount());
					toAccBal = accEntityTo.getAmount() + Integer.parseInt(transModel.getAmount());
					
					// Deduce amount from fromAcc
					accEntityFrom.setAmount(fromAccBal);
					AccountModel accModelFrom= new AccountModel();
					BeanUtils.copyProperties(accEntityFrom,accModelFrom);
					aService.updateAccount(accModelFrom);
					
				
					// Add amount to toAcc
					accEntityTo.setAmount(toAccBal);
					AccountModel accModelTo= new AccountModel();
					BeanUtils.copyProperties(accEntityTo,accModelTo);
					aService.updateAccount(accModelTo);
					
					
					BeanUtils.copyProperties(transEntity, transModel);
					transModel.setStatus(true);
					
				} catch (Exception e) {
					System.out.println("Transaction creation failed.");
				}
			}
		} catch (Exception e) {
			System.out.println("Transaction creation failed - 2.");
		}
		return transModel;

	}

	public TransactionModel viewTransaction(TransactionModel transModel) {
		transModel.setStatus(false);
		TransactionEntity transEntity = new TransactionEntity();
		BeanUtils.copyProperties(transModel, transEntity);

		try {
			
			transEntity = tDao.readTransaction(transEntity);
			BeanUtils.copyProperties(transEntity, transModel);
			transModel.setFromAcc(transEntity.getFromAcc().getAccNo());
			transModel.setStatus(true);
			
		} catch (Exception e) {
			System.out.println("Transaction read fail.");
		}

		return transModel;
	}

	
}
