import java.io.*;

public class TestFileDel 
{
	public static void main(String args[]) 
	{
		File fobj = new File("tmp2");
		if (!fobj.delete()) 
		{
			System.out.println(fobj.getName() + " cannot be deleted");
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
