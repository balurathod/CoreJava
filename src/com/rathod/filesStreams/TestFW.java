import java.io.*;

public class TestFW 
{
	public static void main(String args[]) 
	{
		String str;
		try 
		{
			BufferedReader br = 
			new BufferedReader(new FileReader("jrr.txt"));

			FileWriter fw = new FileWriter("jrr.txt.copyFW");

			while ((str = br.readLine()) != null) 
			{
				fw.write(str + System.getProperty("line.separator"));
			} 
			fw.flush();
			br.close();
			fw.close();
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