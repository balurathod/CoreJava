import java.io.*;

public class TestFileChange 
{
	public static void main(String args[]) 
	{
		File fobj = new File("jrr.txt");
		//    fobj.renameTo(new File("jrr2.txt"));
		fobj.setReadOnly();
		if (!fobj.canWrite()) 
		{
			System.out.println(fobj.getName() + " is read-only");
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

