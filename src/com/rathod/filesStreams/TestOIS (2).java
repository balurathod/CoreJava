import java.io.*;

public class TestOIS 
{
	public static void main(String args[]) 
	{
		int c;
		double dArray[] = new double[5];
		try 
		{
			ObjectInputStream ois = 
			new ObjectInputStream(new FileInputStream("oos.txt"));
			int size = ois.available();
			for (int i = 0; i < size / 8; ++i) 
			{
				dArray[i] = ois.readDouble();
				System.out.println("At index " + i + " element is "                          + dArray[i]);
			} 
			ois.close();
		}
		catch (FileNotFoundException fnfe) 
		{
			System.out.println("Error: "+fnfe);
		}
		catch (IOException ioe) 
		{
			System.out.println("Error: "+ioe);
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
