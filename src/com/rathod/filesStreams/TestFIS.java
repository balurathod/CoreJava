import java.io.*;

public class TestFIS 
{
	public static void main(String args[]) 
	{
		int c;

		try 
		{
			FileInputStream fis = new FileInputStream("jrr.txt");
			while ((c = fis.read()) != -1) 
			{
				System.out.print((char) c);
			} 
			fis.close();
		}
		 catch (FileNotFoundException fnfe) 
		{
			System.out.println(fnfe);
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