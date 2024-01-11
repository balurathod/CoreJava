package com.rathod.unsolved;
class MyException extends Exception
{}
class TestExp
{
	void doStuff()
	{
		//throw new MyException();   //throw a checked exception how?
	    new MyException();       //run properly....  
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\SCJP6>javac TestExp.java
TestExp.java:7: unreported exception MyException; must be caught or declared to
be thrown
                throw new MyException();   //throw a checked exception
                ^
1 error

*/