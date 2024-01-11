package com.rathod.oops;
//create manualy on current path.dir searchThis vt dir1, dir2,dir3,some .txt files   & to  exist it for that some rule..   
import java.io.*;
class  Writer10
{
	public static void main(String[] args) 
	{
		try //warng exception pocbl.
		{
			
			String [] files = new String[100];
		    
			File search = new File("searchThis");  //it's only an obj.
			files = search.list();
			for (String fn :files )
				System.out.println("Found  " + fn);
			
	    }
		catch (Exception e)        //HOW can search diffrnt files?
		{
			e.printStackTrace();
		}
				
	}
}
/*

G:\SCJP\Scjp6\ch6-Str IO Formtng Parcng\File Formtng>javac Writer10.java

G:\SCJP\Scjp6\ch6-Str IO Formtng Parcng\File Formtng>java Writer10
Found  dir3
Found  dir1
Found  dir2
Found  fileWriter2.txt
Found  fileWrite1.txt
Found  fileWriter1.txt


*/