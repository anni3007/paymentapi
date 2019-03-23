package com.payment.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TRANSACTION")
public class Transactions {

	/*
	 * "TransactionID": "58", "AccountNumber": "30", "TransactionDate":
	 * "3/22/2019 5:53:22 AM", "Credit": "0", "Debit": "100", "Balance": "-3424",
	 * "TransactionStatus": "Sucess", "TransactionDescription": "Loan amount"
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="transactionID")
	public Long transactionID;
	
	@Column(name="accountNumber")
	public String accountNumber;
	
	@Column(name="transactionDate")
	public String transactionDate;
	
	@Column(name="credit")
	public Long credit;
	
	@Column(name="debit")
	public Long debit;
	
	@Column(name="balance")
	public Long balance;
	
	@Column(name="transactionStatus")
	public String transactionStatus;
	
	@Column(name="transactionDescription")
	public String transactionDescription;

	public Long getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(Long transactionID) {
		this.transactionID = transactionID;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String AccountNumber) {
		this.accountNumber = AccountNumber;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Long getCredit() {
		return credit;
	}

	public void setCredit(Long credit) {
		this.credit = credit;
	}

	public Long getDebit() {
		return debit;
	}

	public void setDebit(Long debit) {
		this.debit = debit;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public String getTransactionDescription() {
		return transactionDescription;
	}

	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}
	/*
	@Override
	public String toString() {
		return "User [TransactionID" + TransactionID + ", AccountNumber" + AccountNumber + ", TransactionDate " + TransactionDate + ", Credit " + Credit+", Debit "+Debit+", Balance "+ Balance +", TransactionStatus "+ TransactionStatus+", TransactionDescription "+TransactionDescription+ "]";
				//", accountNumber ="+acct
				
	}*/
}
