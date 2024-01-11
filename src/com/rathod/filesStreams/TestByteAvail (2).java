import java.io.*;

public class TestByteAvail 
{
	public static void main(String args[]) 
	{
		int c;
		try 
		{
			FileInputStream fis = new FileInputStream("jrr.txt");
			int i = fis.available();
			System.out.println("The number of bytes available is " + i);
			fis.close();
		}
		catch (FileNotFoundException fnfe) 
		{
		}
		catch (IOException ioe) 
		{
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
