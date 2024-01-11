package com.rathod.genericCollection;

public class BankAccount {
	private String AccName;
	private double AccNo;
	
	public BankAccount(String AccName, double AccNo  ){
		this.AccName = AccName;
		this.AccNo = AccNo;
	}
	public String getAccName() {
		return AccName;
	}
	public void setAccName(String accName) {
		AccName = accName;
	}
	public double getAccNo() {
		return AccNo;
	}
	public void setAccNo(double accNo) {
		AccNo = accNo;
	}
	

}
