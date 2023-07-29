package com.bank.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bank_details")
public class Bank {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;	
	private String name,branch,ifscCode;
	private long accNo;
	private int balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Bank(int id, String name, String branch, String ifscCode, long accNo, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.ifscCode = ifscCode;
		this.accNo = accNo;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankEntity [id=" + id + ", name=" + name + ", branch=" + branch + ", ifscCode=" + ifscCode + ", accNo="
				+ accNo + ", balance=" + balance + "]";
	}
	
	
}
