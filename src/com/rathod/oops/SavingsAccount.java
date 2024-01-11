package com.rathod.oops;
import java.io.*;



public class SavingsAccount implements Externalizable {
	private int acno;
	private String name;
	private double balance;
	
	public String toString() {
		return acno+"\t"+name+"\t"+balance;
	}
	public SavingsAccount() {
		System.out.println("No-Arg ctor of SavingsAccount");
	}
	public SavingsAccount(int acno, String name, double balance) {
		
		this.acno = acno;
		this.name = name;
		this.balance = balance;
	}
	
	public void readExternal(ObjectInput arg0) throws IOException, ClassNotFoundException {
		System.out.println("readExternal is called..");
		name = (String) arg0.readObject();
		balance = arg0.readDouble();
	}
	public void writeExternal(ObjectOutput arg0) throws IOException {
		System.out.println("writeExternal is called..");
		arg0.writeObject(name);
		arg0.writeDouble(balance);
	}
	
}
