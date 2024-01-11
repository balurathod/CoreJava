import java.io.*;

public class TestBytePos 
{
	public static void main(String args[]) 
	{
		int c;
		int pos = 0;
		try 
		{
			FileInputStream fis = new FileInputStream("jrr.txt");
			while ((c = fis.read()) != -1) 
			{
				System.out.print((char) c);
				++pos;
				if (pos == 5) 
				{
					fis.skip(5);
				} 
			} 
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