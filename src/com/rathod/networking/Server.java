package com.rathod.networking;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Server extends JPanel
{
	private JTextArea display;
	private DatagramPacket sendPacket, receivePacket;
	private DatagramSocket socket;
	
	public Server()
	{
		setLayout(new BorderLayout());
		display = new JTextArea();
		display.setBounds(20,10,100,100);
		add(new JScrollPane(display),BorderLayout.CENTER);
		try
		{
			socket = new DatagramSocket(5000);
		}
		catch(SocketException se)
		{
			se.printStackTrace();
			System.exit(1);
		}
	}
	public void waitForPackets()
	{
		while(true)
		{
			try
			{
				byte data[]  =  new byte[100];
				receivePacket = new DatagramPacket(data,data.length);
				socket.receive(receivePacket);
				display.append("\nPacket Received :"+"\nFrom Host: " + receivePacket.getAddress() + "\nHost Port: " + receivePacket.getPort() + "\nLength : "+receivePacket.getLength() + "\nContaining:\n\t" + new String (receivePacket.getData(),0,receivePacket.getLength()));
				display.append("\n\nEcho data To Client...");
				sendPacket = new DatagramPacket( receivePacket.getData(),receivePacket.getLength(), receivePacket.getAddress(),receivePacket.getPort());
				socket.send(sendPacket);
				display.append("Packet Sent\n");
				display.setCaretPosition(display.getText().length());
			}
			catch(IOException io)
			{
				display.append(io.toString() + "\n");
				io.printStackTrace();
			}
		}
	}

	public static void main(String args[])
	{

	JFrame f=new JFrame("Server:");
	Server app = new Server();
	f.setContentPane(app);
	f.setSize(500,500);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	app.waitForPackets();
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