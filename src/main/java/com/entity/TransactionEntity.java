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
@Table(name = "Transaction")
public class TransactionEntity {

	@Id
	@Column(name = "transId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long transId;

	@ManyToOne
	@Column(name = "fromAcc")
	private AccountEntity fromAcc;
	
	@Column(name = "toAcc")
	private long toAcc;

	@Column(name = "amount")
	private String amount;

	public long getTransId() {
		return transId;
	}

	public void setTransId(long transId) {
		this.transId = transId;
	}

	public long getToAcc() {
		return toAcc;
	}

	public void setToAcc(long toAcc) {
		this.toAcc = toAcc;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public AccountEntity getFromAcc() {
		return fromAcc;
	}

	public void setFromAcc(AccountEntity fromAcc) {
		this.fromAcc = fromAcc;
	}


	
}
