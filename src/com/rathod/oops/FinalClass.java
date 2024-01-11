package com.rathod.oops;
final class  FinalClass
{
	int i;
	final void vitu()
	{
		System.out.println("final method");
	}
	public int  vitu1(int i)
	{
		System.out.println(" it is not final method in final class & val of i = " + i);
		return 0;
	}
	public static void main(String[] args) 
	{
		Test t = new Test();
		FinalClass fc = new FinalClass();
		fc.vitu();
		fc.vitu1(56);
		//t.vitu1(45);
		System.out.println("Hello World!");
	}
}
 class FinalClassTest
{
	public int  vitu1(int i)
	{
		System.out.println(" it is not final method of final class in Test & val of i = " + i);
		return 0;
	}
	
}
