package com.rathod.oops;
import java.rmi.*;
import java.rmi.server.*;

public class EmpImpl extends UnicastRemoteObject implements EmpIntf
{
	int eno;
	String ename;

	public EmpImpl(int eno, String ename) throws RemoteException
	{
		this.eno=eno;
		this.ename=ename;
	}

	public int getEno() throws RemoteException
	{
		System.out.println("getEno() is called...");
		return eno;
	}

	public String getEname() throws RemoteException
	{
		System.out.println("getEname() is called...");
		return ename;
	}

	public void takeData(int data) throws RemoteException
	{
		System.out.println("takeData(int data) is called...");
		System.out.println("takeData is : "+data);
	}
}
