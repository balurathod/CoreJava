package com.rathod.unsolved;
class MyException1 extends Exception 
{
	void someMethod()
	{
		doStuff();
	}
	void doStuff()throws MyException1 //How to recognize this code compile or not?
		{
		try
		{
			throw new MyException();   //which type of Exception r ariese?
		}
		catch (MyException me)
		{
			throw me;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*


why unreported exception r arise?

u should must b 100% clear ur concept?????



G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\SCJP6>javac TestExp.java
TestExp.java:7: unreported exception MyException; must be caught or declared to
be thrown
                throw new MyException();   //throw a checked exception
                ^
1 error

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\SCJP6>javac TestExp.java

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\SCJP6>java TestExp
Hello World!
*/