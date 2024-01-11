package com.rathod.oops;
import java.io.Serializable;

public class Account implements Serializable {
	private int acno;
	private String name;
	private double balance;
	
	public String toString() {
		return acno+"\t"+name+"\t"+balance;
	}
	public Account(int acno, String name, double balance) {
		super();
		this.acno = acno;
		this.name = name;
		this.balance = balance;
	}
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}