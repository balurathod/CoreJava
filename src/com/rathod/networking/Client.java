package com.rathod.networking;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Client extends JPanel implements ActionListener
{
	private JTextField enter;
	private JTextArea display;
	private DatagramPacket sendPacket,receivePacket;
	private DatagramSocket socket;
	
	public Client()
	{
		setLayout(new BorderLayout());
		enter = new JTextField("Type message here");
		enter.addActionListener(this);
		add(enter,BorderLayout.NORTH);
		display = new JTextArea();
		add(new JScrollPane(display),BorderLayout.CENTER);
		try
		{
			socket = new DatagramSocket();
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
				byte data[] = new byte[100];
				receivePacket = new DatagramPacket(data,data.length);
				socket.receive(receivePacket);
				display.append("\nPacket Received :"+"\nFrom Host: " + receivePacket.getAddress() + "\nHost Port: " + receivePacket.getPort() + "\nLength : "+receivePacket.getLength() + "\nContaining:\n\t" + new String (receivePacket.getData(),0,receivePacket.getLength()));
				display.setCaretPosition(display.getText().length());
			}
			catch(IOException io)
			{
				display.append(io.toString() + "\n");
				io.printStackTrace();
			}
		}
	}

	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			display.append("\n Sending packet containing: " + ae.getActionCommand() + "\n");
			String s = ae.getActionCommand();
			byte data[] = s.getBytes();
			sendPacket = new DatagramPacket(data,data.length,InetAddress.getLocalHost(),5000);
			socket.send(sendPacket);
			display.append("Packet Send\n");
			display.setCaretPosition(display.getText().length());
		}
		catch(IOException exception)
		{
			display.append(exception.toString() + "\n");
			exception.printStackTrace();
		}	
	}

	public static void main(String args[])
	{

	JFrame f=new JFrame("Client:");
	Client app=new Client();
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