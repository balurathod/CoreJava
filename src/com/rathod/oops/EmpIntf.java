package com.rathod.oops;
import java.rmi.*;

public interface EmpIntf extends Remote
{
	public int getEno() throws RemoteException;
	public String getEname() throws RemoteException;
	public void takeData(int data) throws RemoteException;
}
