import java.io.*;

public class TestDIS 
{
	public static void main(String args[]) 
	{
		try 
		{
			DataInputStream dis = 
			new DataInputStream(new FileInputStream("jrr.txt"));
			byte[] data = new byte[dis.available()];
			dis.readFully(data);
			String str = new String(data);
			System.out.println(str);
			dis.close();
		}
		 catch (FileNotFoundException fnfe) 
		{
			System.out.println(fnfe);
			return;
		}
		 catch (IOException ioe) 
		{
			System.out.println(ioe);
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