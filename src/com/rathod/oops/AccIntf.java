package com.rathod.oops;
import java.rmi.*;

public interface AccIntf extends Remote
{
	public void createAccount(Account acc) throws RemoteException, DuplicateAccNoException, NotEnoughBalanceException;
	public Account getDetails(int accno) throws RemoteException, AccNoNotFoundException;
	public void withDraw(int accno, int amt) throws RemoteException, AccNoNotFoundException, NotEnoughBalanceException;
	public void deposit(int accno, int amt) throws  RemoteException, AccNoNotFoundException; 
	
}