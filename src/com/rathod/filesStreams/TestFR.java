import java.io.*;

public class TestFR 
{
	public static void main(String args[]) 
	{
		int c;

		try 
		{
		FileReader fr = new FileReader("jrr.txt");
			while ((c = fr.read()) != -1) 
			{
				System.out.print((char) c);
			} 
			fr.close();
		}
		catch (FileNotFoundException fnfe) 
		{
			System.out.println(fnfe);
			return;
		} catch (IOException ioe) 
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