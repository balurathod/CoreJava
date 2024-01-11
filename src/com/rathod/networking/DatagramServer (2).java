import java.net.*;
import java.io.*;

class DatagramServer
{
public static void main(String args[]) 
	{
		DatagramSocket ds;
		int clientport=111,serverport=222;
		byte buffer[] = new byte[100];
		try
		{
			ds = new DatagramSocket(serverport);
			BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(" Server Waiting For Input ");
			InetAddress ia = InetAddress.getLocalHost();
			while(true)
	 		{
				 String str = dis.readLine();
				 if((str==null || str.equals("end")))
					break;
				buffer = str.getBytes();
				ds.send(new DatagramPacket(buffer,str.length(),ia,clientport));
			}
		}
		catch(Exception io)
		{
			System.out.println("Error in program");
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