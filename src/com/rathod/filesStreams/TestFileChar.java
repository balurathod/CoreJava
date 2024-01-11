import java.io.*;
import java.util.*;

public class TestFileChar 
{
	public static void main(String args[]) 
	{
		File fobj = new File("jrr.txt");
		if (fobj.canRead()) 
		{
			System.out.println(fobj + " can be read");
		} 
		if (fobj.canWrite()) 
		{
			System.out.println(fobj + " can be written to");
		} 
		if (fobj.exists()) 
		{
			System.out.println(fobj + " exists");
		} 
		if (fobj.isAbsolute()) 
		{
			System.out.println(fobj + " represents an absolute path");
		} 

		if (fobj.isFile()) 
		{
			System.out.println(fobj + " is a file");
		} 
		if (fobj.isHidden())
		{
			System.out.println(fobj + " is a hidden file");
		} 
		System.out.println("Length is " + fobj.length());
		System.out.println("Length is " + new Date(fobj.lastModified()));	
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

