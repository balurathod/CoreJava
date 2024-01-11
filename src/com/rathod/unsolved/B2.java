package com.rathod.unsolved;
//72
class A
{
	public void process()
	{System.out.print("A,");}
}
class B2 extends A
{
public void process() throws RuntimeException //Why apply Exception here?
	{
	super.process();
	if (false) throw new RuntimeException();//diff bet THROWS & THROW?
	  System.out.print("B,");
	 }
	public static void main(String[] args) 
	{
		try
		{
			((A)new B2()).process();   //wat is meaning of this st.?
		}
		catch (RuntimeException e)
		{
			System.out.print("Exception");
		}
		
	}//No need to throws RuntimeExceptions
}
/*
o/p-->A Exception



D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac B2.java

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>java B2
A,
Exception



D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac B2.java
B2.java:12: cannot find symbol
symbol  : class IOException
location: class B2
        if (true) throw new IOException();
                            ^
1 error



D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac B2.java
B2.java:9: cannot find symbol
symbol  : class IOException
location: class B2
public void process() throws IOException
                             ^
B2.java:9: process() in B2 cannot override process() in A; overridden method does not throw IOException
public void process() throws IOException
            ^
2 errors



D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac B2.java

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>java B2
A,B,  for this ....cond  if(false) throw new RuntimeException();

*/