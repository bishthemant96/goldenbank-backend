package com.model;

import com.entity.Customer;

public class LoanAccountModel {

	private long loanAccNo;
	private String branch;
	private long amount;
	private String loanType;
	private Customer customer;

	public long getLoanAccNo() {
		return loanAccNo;
	}

	public void setLoanAccNo(long loanAccNo) {
		this.loanAccNo = loanAccNo;
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

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
