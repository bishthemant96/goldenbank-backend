package com.model;

import java.util.List;

import com.entity.Customer;
import com.entity.Transaction;

public class AccountModel {

	private long accNo;
	private String branch;
	private long amount;
	private String accType;
	private String accNominee;
	private Customer customer;
	private List<Transaction> transaction;
	private boolean status;

	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public String getAccNominee() {
		return accNominee;
	}

	public void setAccNominee(String accNominee) {
		this.accNominee = accNominee;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Transaction> getTransaction() {
		return transaction;
	}

	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}

}
