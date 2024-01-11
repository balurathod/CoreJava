package com.rathod.networking;
import java.net.*;

public class InetAddressTest
{
	public static void main (String args[])
	{
		try
		{
	InetAddress add = InetAddress.getLocalHost();
System.out.println("Address Of Local Host Is : " + add);
	System.out.println(add.getHostName());
	System.out.println(add.getHostAddress());
InetAddress add1 = InetAddress.getByName("www.yahoo.com");
System.out.println("Address Of Local Host Is : "+ add1);
System.out.println(add1.getHostName());
InetAddress ia[] = InetAddress.getAllByName("vedisoft1");
for(int i = 0 ; i < ia.length;i++)
System.out.println(ia[i]);    
		}
		catch(Exception e)
		{
			System.out.println("Throwing Exception ");
		}
	}
}

/* 
Vedisoft : Java - Module 1 "Desktop Technologies"


Vedisoft
Plot No. 173, Zone II, M.P. Nagar,
Bhopal.
Phone : 0755 - 6541546
Email : contact@vedisoft.com
Web : www.vedisoft.com
*/