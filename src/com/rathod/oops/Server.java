package com.rathod.oops;
import java.rmi.*;
import java.rmi.server.*;
import java.net.*;


 
public class Server 
{
	public  static void main(String args[])
	{
		if (args.length==0)
		{
			System.out.println("Server <msg from server>");
			System.exit(1);
		}
		String msg = args[0];

		try
		{
			System.out.println("Creating object...");
			Impl instance = new Impl(msg);
			System.out.println("Object created...");

			String urlname = "rmi://192.168.41.43:1099/MyObj";
			Naming.rebind(urlname,instance);
			System.out.println("Object bound successfully...");
			
		}
		catch(MalformedURLException e)
		{
			System.out.println("URL format is wrong....");
		}
		catch(RemoteException e)
		{
			System.out.println("Remote error is.... "+e);
		}
		System.out.println("End main");
	}
}

