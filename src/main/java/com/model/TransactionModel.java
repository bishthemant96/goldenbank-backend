package com.model;

public class TransactionModel {

	private long transId;
	private long fromAcc;
	private long toAcc;
	private String amount;
	private boolean status;

	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
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

	public long getFromAcc() {
		return fromAcc;
	}

	public void setFromAcc(long fromAcc) {
		this.fromAcc = fromAcc;
	}



}
