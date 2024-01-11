package com.rathod.networking;
import java.net.*;
import java.io.*;

class DatagramClient
{
	public static void main(String args[]) throws Exception
	{
		DatagramSocket ds;
		byte buffer[]=new byte[100];
		int clientport = 111 ;
		ds = new DatagramSocket(clientport);
		System.out.println("Client Is Waiting For Server To Get Data ");
		System.out.println("Press Ctrl C To Come Out");
		while(true)
		{
			DatagramPacket p = new DatagramPacket(buffer,buffer.length);
			ds.receive(p);
			String psx = new String(p.getData(),0,p.getLength());
			System.out.println(psx);
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