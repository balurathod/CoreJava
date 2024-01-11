package com.rathod.unsolved;
//71
class A
{
	public void process()
	{System.out.println("A,");}
}
class B1 extends A
{
public void process() throws IOException
	{
	super.process();
	System.out.println("B,");
	throw new IOException();
	}
	public static void main(String[] args) 
	{
		try
		{
			new B1().process();
		}
		catch (IOException e)
		{
			System.out.println("Exception");
		}
		
	}
}

/*
D-compilation fail

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac B1.java
B1.java:9: cannot find symbol
symbol  : class IOException
location: class B1
public void process() throws IOException
                             ^
B1.java:9: process() in B1 cannot override process() in A; overridden method does not throw IOException
public void process() throws IOException
            ^
B1.java:13: cannot find symbol
symbol  : class IOException
location: class B1
        throw new IOException();
                  ^
B1.java:21: cannot find symbol
symbol  : class IOException
location: class B1
                catch (IOException e)
                       ^
4 errors

*/
