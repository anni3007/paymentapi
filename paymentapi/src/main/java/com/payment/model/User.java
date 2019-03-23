package com.payment.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name="User")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;	
	private String FirstName;
	private String LastName;
	private String emailId;
	private String phoneNumber;
	private long AccountNumber;
	private long Balance;
	
/*	@GenericGenerator(name = "sequence_acc_id", strategy = "com.payment.util.CustomIdGenerator")
	@GeneratedValue(generator = "sequence_acc_id")*/
	@Column(name="AccountNumber") 
	public long getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		AccountNumber = accountNumber;
	}
	@Column(name="Balance") 
	public long getBalance() {
		return Balance;
	}
	public void setBalance(long balance) {
		Balance = balance;
	}
	public User() {
		
	}
	public User(long id,  String firstName,
	String lastName,
	String emailId,
	String phoneNumber) {
		this.id=id;
		this.FirstName=firstName;
		this.LastName=lastName;
		this.emailId=emailId;
		this.phoneNumber=phoneNumber;
	}
	
	/*
	 * @OneToOne(fetch = FetchType.LAZY,mappedBy="acctNumber",cascade =
	 * CascadeType.ALL)
	 * 
	 * @Column(name="ACCT_ID") private Account acct;
	 */
	private boolean isSelf;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	/*
	 * public Account getAcct() { return acct; }
	 * 
	 * public void setAcct(Account acct) { this.acct = acct; }
	 */
	@Column(name="ISSELF")
	public boolean isSelf() {
		return isSelf;
	}
	public void setSelf(boolean isSelf) {
		this.isSelf = isSelf;
	}
	@Column(name="FIRSTNAME")
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	
	@Column(name="LASTNAME")
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	@Column(name="EMAILID")
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Column(name="PHONENUMBER")
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + FirstName + ", lastName=" + LastName + ", emailId=" + emailId+", phoneNumber="+phoneNumber+ "]";
				//", accountNumber ="+acct
				
	}
	
}
