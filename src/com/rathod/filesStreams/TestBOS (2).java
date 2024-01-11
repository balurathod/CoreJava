import java.io.*;

public class TestBOS 
{
	public static void main(String args[]) 
	{
		int c;
		try 
		{
			BufferedInputStream bis = 
			new BufferedInputStream(new FileInputStream("jrr.txt"));
			BufferedOutputStream bos = 
			new BufferedOutputStream(new FileOutputStream("jrr.txt.copy"));

			while ((c = bis.read()) != -1) 
			{
				bos.write((char) c);
			} 
			bos.flush();
			bos.close();
			bis.close();
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
