package com.rathod.networking;
import java.net.*;
import java.io.*;

public class FServer
{
	public static void main(String[] args) throws IOException
	{
		ServerSocket serverSocket = null;
		try 
		{
			serverSocket = new ServerSocket(95);
		}
		catch (IOException e)
		{
			System.err.println("Could not listen on port :95.");
			System.exit(1);
		}

		Socket clientSocket = null;
		try 
		{
			clientSocket = serverSocket.accept();
			System.out.println("Connected to : " +clientSocket);
		}
		catch (IOException e)
		{
			System.out.println("Accept failed.");
			System.exit(1);
		}
	
		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);
		String inputLine,outputLine;
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter data in server");
		String s=stdin.readLine();
		File f= new File(s);
		if (f.exists ())
		{
			BufferedReader d= new BufferedReader(new FileReader(s));
			String line;
			while ((line=d.readLine())!=null)
			{
				out.write(line);
				out.flush();
			}
			d.close();
		}
		out.close();
		clientSocket.close();
		serverSocket.close();
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
