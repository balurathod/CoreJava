import java.io.*;

public class TestDOS 
{
	public static void main(String args[]) 
	{
		try 
		{
			DataOutputStream dos = 
			new DataOutputStream(new FileOutputStream("dos.txt"));
			String str = "Did this work?";
			dos.writeChars(str);
			dos.close();
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