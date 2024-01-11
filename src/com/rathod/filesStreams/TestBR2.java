import java.io.*;
import java.util.*;

public class TestBR2 
{
	public static void main(String args[]) 
	{
		String str;
		double radius;
		StringTokenizer stk;

		try 
		{
BufferedReader br = 	new BufferedReader(new FileReader("sphere.txt"));
		
		while ((str = br.readLine()) != null) 
		{
			stk = new StringTokenizer(str);
			
			while (stk.hasMoreTokens()) 
			{
				str = stk.nextToken();
			} 
			radius = Double.parseDouble(str);
System.out.println("area is " + Math.PI*radius*radius);
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