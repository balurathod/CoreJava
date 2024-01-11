package com.rathod.oops;
import java.rmi.*;
import java.rmi.server.*;
public class CallBackImpl extends UnicastRemoteObject implements CallBackIntf
{
	String msg;
	int data;

	public CallBackImpl(String msg, int data) throws RemoteException
	{
		this.msg=msg;
		this.data=data;
	}

	public String getMsg() throws RemoteException
	{
		System.out.println("getMsg() method is called...");
		return msg;
	}

	public void takeObject(EmpIntf einf) throws RemoteException
	{
		System.out.println("takeObject method is called...");
		
		try
		{
			int no=einf.getEno(); //calling client methods
			String name = einf.getEname();
			System.out.println("Emp number is : "+no);
			System.out.println("Emp name     is : "+name);
			einf.takeData(data);
		}
		catch (RemoteException e)
		{
			System.out.println("error in calling Client methods : "+e);
		}
	}
}
