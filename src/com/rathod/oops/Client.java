package com.rathod.oops;
import java.rmi.*;
import java.rmi.server.*;
 
public class Client
{
	public  static void main(String args[])
	{
		if (args.length!=4)
		{
			System.out.println("Client <server addr> <no1> <no2> <msg to server>");
			System.exit(1);
		}

		String addr = args[0];
		double n1 = Double.parseDouble(args[1]);
		double n2 = Double.parseDouble(args[2]);
		String str = args[3];

		try
		{
			Intf inf;

			String urlname = "rmi://"+addr+":1099/MyObj";
			System.out.println("Looking for object on the server");
			inf = (Intf) Naming.lookup(urlname);
			System.out.println("Aha!! got the reference...");
			double res = inf.add(n1,n2);
			System.out.println("The addition is : "+res);
			System.out.println("The multiplication  is : "+inf.mult(n1,n2));
			System.out.println("The modified data  is : "+inf.getModiData(str));

		}
		catch(java.net.MalformedURLException e)
		{
			System.out.println("URL format is wrong....");
		}
		catch(RemoteException e)
		{
			System.out.println("Remote error is.... "+e);
		}
		catch(NotBoundException e)
		{
			System.out.println("Object not bound.... "+e);
		}

	}
}

