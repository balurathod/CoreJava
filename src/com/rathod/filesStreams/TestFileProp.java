import java.io.*;
import java.util.*;

public class TestFileProp 
{
	public static void main(String args[]) 
	{
		File fobj = 
		new File("/usr/people/palmer/Java_Book/java.io","jrr.txt");
		if ( fobj.exists() ) 
		{
			System.out.println("Name of file is "+fobj.getName());
			System.out.println("Parent directory is "+fobj.getParent());
			System.out.println("File is "+fobj.length()+" bytes long");
			long time = fobj.lastModified();
			Date date = new Date(time);
			System.out.println("File was last modified "+date);
		}
		else 
		{
			System.out.println("File does not exist");
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
