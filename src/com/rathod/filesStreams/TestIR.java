import java.io.*;

public class TestIR 
{
	public static void main(String args[]) 
	{
		String s;
		System.out.println("Input lines of text, CTRL-C to quit");

		try 
		{
			BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

			while ((s = br.readLine()) != null) 
			{
				System.out.println(s);
			} 
			br.close();
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