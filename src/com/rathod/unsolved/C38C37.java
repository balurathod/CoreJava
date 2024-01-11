package com.rathod.unsolved;
class C37 extends Exception  {}
class C38
{
	static void m1()
	{
		throw new C37();
	}
	public static void main(String a[] ) 
	{
		
	}
}
/*

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>javac C38.java
C38.java:6: unreported exception C37; must be caught or declared to be thrown
                throw new C37();
                ^
1 error

*/