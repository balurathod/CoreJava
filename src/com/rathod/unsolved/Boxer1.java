package com.rathod.unsolved;
//86
public class  Boxer1
{
	Integer i;
	int x;
	public Boxer1(int y){x=i+y;System.out.println(x);}
	public static void main(String[] args) 
	{
		new Boxer1(new Integer(4));
		System.out.println("Hello World!");
	}
}
/*
D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>
D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac Boxer1.java

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>java Boxer1
Exception in thread "main" java.lang.NullPointerException
        at Boxer1.<init>(Boxer1.java:5)
        at Boxer1.main(Boxer1.java:8)

*/