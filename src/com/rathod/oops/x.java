package com.rathod.oops;
class x 
{
	int x=3;
	public static void main(String[] args) 
	{
		System.out.println("Non-static var x is " + x);
	}
}
/*

G:\SCJP\Scjp6\ch2-Obj Orintcn>javac x.java
x.java:6: non-static variable x cannot be referenced from a static context
                System.out.println("Non-static var x is " + x);
                                                            ^
1 error
*/