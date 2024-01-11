package com.rathod.unsolved;
class C8 
{
	static String m(int i)
	   { return "int";}

	static String m(float i)
	    { return "float";}

	public static void main(String[] args) 
	{
		long a1=1;
		//float b1=2;

		System.out.println(m(a1)+" , "+m(a1));
	}
}
/*

CONCLUSION....

	-->	double is grtst data type in java(practicaly).
	
	-->	long & int can convrt into float directly
	
	-->	double not convert into float & any other data type(Byte Short Int & Long )

	my que is that on which strategy LONG directly convrt into FLOAT?


G:\SCJP\Oldscjp(1-5)\2Spiral\Exam3>javac C8.java
C8.java:14: cannot find symbol
symbol  : method m(double)
location: class C8
                System.out.println(m(a1)+" , "+m(b1));
                                               ^
1 error

G:\SCJP\Oldscjp(1-5)\2Spiral\Exam3>javac C8.java

G:\SCJP\Oldscjp(1-5)\2Spiral\Exam3>java C8

G:\SCJP\Oldscjp(1-5)\2Spiral\Exam3>javac C8.java
C8.java:14: cannot find symbol
symbol  : variable b1
location: class C8
                System.out.println(m(a1)+" , "+m(b1));
                                                 ^
1 error

G:\SCJP\Oldscjp(1-5)\2Spiral\Exam3>javac C8.java
C8.java:14: cannot find symbol
symbol  : method m(double)
location: class C8
                System.out.println(m(b1)+" , "+m(b1));
                                   ^
C8.java:14: cannot find symbol
symbol  : method m(double)
location: class C8
                System.out.println(m(b1)+" , "+m(b1));
                                               ^
2 errors

G:\SCJP\Oldscjp(1-5)\2Spiral\Exam3>javac C8.java

G:\SCJP\Oldscjp(1-5)\2Spiral\Exam3>java C8
float , float

G:\SCJP\Oldscjp(1-5)\2Spiral\Exam3>javac C8.java

G:\SCJP\Oldscjp(1-5)\2Spiral\Exam3>java C8
int , float

G:\SCJP\Oldscjp(1-5)\2Spiral\Exam3>javac C8.java

G:\SCJP\Oldscjp(1-5)\2Spiral\Exam3>java C8
float , float

G:\SCJP\Oldscjp(1-5)\2Spiral\Exam3>javac C8.java

G:\SCJP\Oldscjp(1-5)\2Spiral\Exam3>java C8
int , float

G:\SCJP\Oldscjp(1-5)\2Spiral\Exam3>javac C8.java

G:\SCJP\Oldscjp(1-5)\2Spiral\Exam3>java C8
int , float

G:\SCJP\Oldscjp(1-5)\2Spiral\Exam3>





class C8 
{
	static String m(int i)
	   { return "int";}

	static String m(float i)
	    { return "float";}

	public static void main(String[] args) 
	{
		long a1=1;
		double b1=2;

		System.out.println(m(a1)+" , "+m(b1));
	}
}


in main 0
D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>javac C8.java
C8.java:14: cannot find symbol
symbol  : method m(double)
location: class C8
                System.out.println(m(a1)+" , "+m(b1));
                                               ^
1 error









*/