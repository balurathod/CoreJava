package com.rathod.oops;
import java.rmi.*;
import java.rmi.server.*;
import java.net.*;

public class  EmpClient
{
	public static void main(String[] args) 
	{
		if (args.length!=2)
		{
			System.out.println("USAGE : EmpClient <eno> <ename>");
			System.exit(1);
		}
		int eno = Integer.parseInt(args[0]);
		String name = args[1];

		try
		{
			System.out.println("RMI CLIENT\n\n");
			
			System.out.println("creating Client object..(EmpImpl's object) ....");
			EmpImpl eimpl = new EmpImpl(eno,name);
			System.out.println("Object created...");
			System.out.println("Looking for keyObj on server side...");
			CallBackIntf inf = (CallBackIntf) Naming.lookup("rmi://192.168.41.43:1099/KeyObj");
			System.out.println("Got the reference...");
			String msg = inf.getMsg();
			System.out.println("Message from server : "+msg);
			System.out.println("Giving Client's Object to server....");
			inf.takeObject(eimpl);
		}
		catch (MalformedURLException e)
		{
			System.out.println("URL format is wrong");
		}
		catch (RemoteException e)
		{
			System.out.println("Remote Error : "+e);
		}
		catch (NotBoundException e)
		{
			System.out.println("Object not bound : "+e);
		}

	}
}
