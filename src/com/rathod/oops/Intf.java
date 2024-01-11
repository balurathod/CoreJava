package com.rathod.oops;
import java.rmi.*;
public interface Intf extends Remote
{ 
	public double add(double x, double y) throws RemoteException;
	public double mult(double x, double y) throws RemoteException;
	public String getModiData(String str)  throws RemoteException;
}