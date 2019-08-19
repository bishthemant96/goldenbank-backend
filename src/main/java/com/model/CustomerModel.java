package com.model;

import java.util.List;

import com.entity.Account;
import com.entity.LoanAccount;

public class CustomerModel {

	private int cusID;
	private String cusName;
	private String cusPassword;
	private String cusAge;
	private String cusGender;
	private int cusNationality;
	private List<String> cusIDProof;
	private long cusNo;
	private String cusEmail;
	private String cusAddress;
	private List<LoanAccount> loanAccount;
	private List<Account> account;
	private boolean status;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getCusID() {
		return cusID;
	}

	public void setCusID(int cusID) {
		this.cusID = cusID;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getCusPassword() {
		return cusPassword;
	}

	public void setCusPassword(String cusPassword) {
		this.cusPassword = cusPassword;
	}

	public String getCusAge() {
		return cusAge;
	}

	public void setCusAge(String cusAge) {
		this.cusAge = cusAge;
	}

	public String getCusGender() {
		return cusGender;
	}

	public void setCusGender(String cusGender) {
		this.cusGender = cusGender;
	}

	public int getCusNationality() {
		return cusNationality;
	}

	public void setCusNationality(int cusNationality) {
		this.cusNationality = cusNationality;
	}

	public List<String> getCusIDProof() {
		return cusIDProof;
	}

	public void setCusIDProof(List<String> cusIDProof) {
		this.cusIDProof = cusIDProof;
	}

	public long getCusNo() {
		return cusNo;
	}

	public void setCusNo(long cusNo) {
		this.cusNo = cusNo;
	}

	public String getCusEmail() {
		return cusEmail;
	}

	public void setCusEmail(String cusEmail) {
		this.cusEmail = cusEmail;
	}

	public String getCusAddress() {
		return cusAddress;
	}

	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}

	public List<LoanAccount> getLoanAccount() {
		return loanAccount;
	}

	public void setLoanAccount(List<LoanAccount> loanAccount) {
		this.loanAccount = loanAccount;
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}

}
