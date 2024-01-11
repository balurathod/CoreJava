package com.rathod.oops;
final class  FinalClass
{
	int i;
	final void vitu()
	{
		System.out.println(" final method");
	}
	public int  vitu1(int i)
	{
		System.out.println(" it is not final method in final class & val of i = " + i);
		return 0;
	}
	public static void main(String[] args) 
	{
		FinalClassTest fct = new FinalClassTest();
		FinalClass fc = new FinalClass();   //here seprt class obj is must for its method exection
		fc.vitu();
		fc.vitu1(56);
		fct.vitu1("MY LOGIC");
 	}
}
public class FinalClassTest
{
	public String  vitu1(String s)
	{
		System.out.println(" it is not final method of final class in FinalClassTest class & val of s = " + s);
		return " ";
	}
	
}
/*

G:\SCJP\Query\Solved>javac FinalClassTest.java

G:\SCJP\Query\Solved>java FinalClassTest
Exception in thread "main" java.lang.NoSuchMethodError: main

G:\SCJP\Query\Solved>java FinalClass
final method
 it is not final method in final class & val of i = 56
 it is not final method of final class in Test & val of i = 45
Hello World!

G:\SCJP\Query\Solved>javac FinalClassTest.java

G:\SCJP\Query\Solved>java FinalClass
final method
 it is not final method in final class & val of i = 56
 it is not final method of final class in FinalClassTest class & val of i = 45
Hello World!

G:\SCJP\Query\Solved>

















*/