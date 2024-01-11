package com.rathod.oops;
import java.rmi.*;

public interface CallBackIntf extends Remote
{
	public String getMsg() throws RemoteException;
	public void takeObject(EmpIntf e) throws RemoteException;
}
