import java.io.*;
import java.util.*;

public class TestPW 
{
	public static void main(String args[]) 
	{
		double d = 2.0;
		int i = 3;
		Date date = new Date();

		try 
		{
	PrintWriter pw = new PrintWriter(new FileWriter("pw.txt"),true);
		pw.println("The value of d is " + d);
		pw.println("The value of i is " + i);
		pw.println("The time is " + date);
		pw.close();
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