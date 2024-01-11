package com.rathod.oops;
class BigOuter 
{
	static class Nest
	{
		void go()
		{
			System.out.println("Hi..!");
		}
	}

	{           //what is meaning of this block.
	   Nest n = new Nest();
	   n.go();
	}
}
class Broom1
{
	static class B2
	{
		void goB2()
		{
              System.out.println("Hi..2!");
		}
	}

	public static void main(String[] args) 
	{
		//BigOuter.Nest n1=new BigOuter.Nest();//but both class names is complsary.
		Nest n1=new Nest();   //not pocbl, err..
		n1.go();
		
		
		
		//Broom.B2 b2=new Broom.B2();    //no problm..mandatory.. 
		B2 b2 = new B2();            //access the enclosed class.
		b2.goB2();
		System.out.println("Hello World!");
	}
}
/*

G:\SCJP\Scjp6\ch8-Innr class>javac Broom.java

G:\SCJP\Scjp6\ch8-Innr class>java Broom
Hi..!
Hello World!

G:\SCJP\Scjp6\ch8-Innr class>java Broom
Hi..!
Hello World!

G:\SCJP\Scjp6\ch8-Innr class>javac Broom.java
Broom.java:25: cannot find symbol
symbol  : class B2
location: class BigOuter
                BigOuter.B2 n=new BigOuter.B2();         //access the enclosed c
lass.
                        ^
Broom.java:25: n is already defined in main(java.lang.String[])
                BigOuter.B2 n=new BigOuter.B2();         //access the enclosed c
lass.
                            ^
Broom.java:25: cannot find symbol
symbol  : class B2
location: class BigOuter
                BigOuter.B2 n=new BigOuter.B2();         //access the enclosed c
lass.
                                          ^
Broom.java:26: cannot find symbol
symbol  : variable b2
location: class Broom
                b2.goB2();
                ^
4 errors

G:\SCJP\Scjp6\ch8-Innr class>javac Broom.java
Broom.java:25: n is already defined in main(java.lang.String[])
                Broom.B2 n=new Broom.B2();         //access the enclosed class.
                         ^
Broom.java:26: cannot find symbol
symbol  : variable b2
location: class Broom
                b2.goB2();
                ^
2 errors

G:\SCJP\Scjp6\ch8-Innr class>javac Broom.java

G:\SCJP\Scjp6\ch8-Innr class>java Broom
Hi..!
Hi..2!
Hello World!

G:\SCJP\Scjp6\ch8-Innr class>
*/