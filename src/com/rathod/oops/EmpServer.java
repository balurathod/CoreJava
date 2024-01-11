package com.rathod.oops;
import java.rmi.*;
import java.rmi.server.*;
import java.net.*;

public class  EmpServer
{
	public static void main(String[] args) 
	{
		if (args.length!=2)
		{
			System.out.println("USAGE : EmpServer <msg to client> <number to client>");
			System.exit(1);
		}

		String msg = args[0];
		int data = Integer.parseInt(args[1]);

		try
		{
			System.out.println("RMI SERVER\n\n");
			
			System.out.println("creating server object..(CallBackImpl's object) ....");
			CallBackImpl cimpl = new CallBackImpl(msg,data);
			System.out.println("Object created...");

			Naming.rebind("rmi://192.168.41.43:1099/KeyObj",cimpl);
			System.out.println("Object bound...");
		}
		catch (MalformedURLException e)
		{
			System.out.println("URL format is wrong");
		}
		catch (RemoteException e)
		{
			System.out.println("Remote Error : "+e);
		}
	}
}
