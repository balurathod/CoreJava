import java.io.*;

public class TestBR 
{
	public static void main(String args[]) 
	{
		String str;

		try 
		{
		BufferedReader br = 
		new BufferedReader(new FileReader("TestBR.java"));
			while ((str = br.readLine()) != null) 
			{
			System.out.println(str);
			} 
		br.close();
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