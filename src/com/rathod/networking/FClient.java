package com.rathod.networking;
import java.net.*;
import java.io.*;
public class FClient
{

	public static void main(String [] args) throws IOException
	{
		Socket echoSocket = null;
		BufferedReader in = null;
		try
		{
			echoSocket = new Socket ("192.168.1.1",95);
			in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
		}
		catch (UnknownHostException e)
		{
			System.err.println("Don't know about host");
			System.exit(1);
		}
		catch(IOException e)
		{
			System.err.println("Couldn't get I/O for the connection");
			System.exit(1);
		}
		String userInput;
		while((userInput= in.readLine()) !=null)
		{
			System.out.println(userInput);
		}
		in.close();
		echoSocket.close();
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