import java.io.*;

public class TestFileList 
{
	public static void main(String args[]) 
	{
		File fobj = new File("tmp");
		String[] fileList = fobj.list();
		System.out.print("Files in " + fobj.getName() + " are ");
		for (int i = 0; i < fileList.length; ++i) 
		{
			System.out.print(fileList[i] + " ");
		} 
		System.out.println("");
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
