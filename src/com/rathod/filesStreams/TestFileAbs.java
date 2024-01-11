import java.io.*;

public class TestFileAbs 
{
	public static void main(String args[]) 
	{
		File fobj = new File("jrr.txt");
		System.out.println("Path of " + fobj.getName() + " is " + fobj.getPath());
		System.out.println("Parent of " + fobj.getName() + " is " + fobj.getParent());
		File fobj2 = fobj.getAbsoluteFile();
		System.out.println("Path of " + fobj2.getName() + " is "  + fobj2.getPath());
		System.out.println("Parent of " + fobj2.getName() + " is " + fobj2.getParent());
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

