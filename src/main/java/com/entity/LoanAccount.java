package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LoanAccount")
public class LoanAccount {

	@Id
	@Column(name = "loanAccNo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long loanAccNo;

	@Column(name = "branch")
	private String branch;

	@Column(name = "amount")
	private long amount;

	@Column(name = "loanType")
	private String loanType;

	@ManyToOne
	@JoinColumn(name = "cusID")
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
