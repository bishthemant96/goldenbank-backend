package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Account")
public class AccountEntity {

	@Id
	@Column(name = "accNo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long accNo;

	@Column(name = "branch")
	private String branch;

	@Column(name = "amount")
	private long amount;

	@Column(name = "accType")
	private String accType;

	@Column(name = "accNominee")
	private String accNominee;

	@ManyToOne
	@JoinColumn(name = "cusID")
	private CustomerEntity customer;

	@OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
	List<TransactionEntity> transaction;

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

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	public List<TransactionEntity> getTransaction() {
		return transaction;
	}

	public void setTransaction(List<TransactionEntity> transaction) {
		this.transaction = transaction;
	}

}
