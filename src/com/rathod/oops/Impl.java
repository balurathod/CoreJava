package com.rathod.oops;
import java.rmi.*;
import java.rmi.server.*;
 
public class Impl extends UnicastRemoteObject implements Intf
{
	String msg;

	public Impl(String msg) throws RemoteException
	{
		this.msg=msg;
	}

	public double add(double x, double y) throws RemoteException
	{
		double z;
		z = x+y;
		return z;
	}

	public double mult(double x, double y) throws RemoteException
	{
		return x*y;
	}
	
	public String getModiData(String str)  throws RemoteException
	{
		return msg + "  " + str.toUpperCase();
	}
}