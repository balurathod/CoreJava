import java.io.*;

class MyFilter implements FilenameFilter 
{
	String ext;
	
	public MyFilter(String str) 
	{
		ext = "."+str;
	}

	public boolean accept(File fobj, String filename)
	{
		return filename.endsWith(ext);
	}
}

class TestFF
{
	public static void main(String args[]) 
	{
		File fobj = new File("tmp");
		if ( fobj.exists() )  
		{
			String[] fileList = fobj.list( new MyFilter("java") );
			System.out.print("Files in "+fobj.getName()+" are ");
			for (int i=0; i<fileList.length; ++i)  
			{
				System.out.print(fileList[i]+"  ");
			}
			System.out.println();
		}
		else
		System.out.println("directory doesn't exist");
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
