import java.io.*;

public class TestOOS 
{
	public static void main(String args[]) 
	{
		int c;
		double dArray[] = { 1.0, 2.0, 3.0, 4.0 };
		try
		{
			ObjectOutputStream oos = 
			new ObjectOutputStream(new FileOutputStream("oos.txt"));

			for (int i = 0; i < dArray.length; ++i) 
			{
				oos.writeDouble(dArray[i]);
			 } 
			oos.close();
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
