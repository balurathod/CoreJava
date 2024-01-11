package com.rathod.oops;
import java.rmi.*;
import java.rmi.server.*;
import java.io.FileOutputStream;
import java.net.*;


public class AccServer 
{
	public  static void main(String args[])
	{
		try
		{
		
			System.out.println("Creating object...");
			AccImpl instance = new AccImpl();
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

	}
}

