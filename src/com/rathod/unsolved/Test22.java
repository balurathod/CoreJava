package com.rathod.unsolved;
import java.io.*;
public class Test22 
{
	public static void main(String[] args) 
	{
		byte out=0;
		RandomAccessFile raf;
		try
		{
			raf=new RandomAccessFile("test1.txt","rw");
			for (int i=0;i<10 ;i++ )
			{
				raf.write(i);
				raf.seek(1);
				out=raf.readByte();
				raf.close();
				System.out.println(out);
			}
		}
		catch (IOException e)
		{
			System.out.println("err");
		}
	}
}

/*o/p-->1

but on our PC


D:\SCJP\Oldscjp(1-5)\Exam2>javac Test22.java
Test22.java:6: cannot find symbol
symbol  : class RandomAccessFile
location: class Test22
                RandomAccessFile raf;
                ^
Test22.java:9: cannot find symbol
symbol  : class RandomAccessFile
location: class Test22
                        raf=new RandomAccessFile("test1.txt","rw");
                                ^
Test22.java:19: cannot find symbol
symbol  : class IOException
location: class Test22
                catch (IOException e)
                       ^
3 errors

*/