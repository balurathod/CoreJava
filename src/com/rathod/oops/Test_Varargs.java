package com.rathod.oops;
//Demo Var-args() method
/*
class Test_Simple
{
	void m1()
	{
		System.out.println("No argument");
	}
	void m1(int i)
	{
		System.out.println("Single argument");
	}
	void m1(int i, int j, int k)
	{
		System.out.println("THree argument");
	}
	public static void main(String[] args)
	{
		Test_Simple t1 = new Test_Simple();
		t1.m1();
		t1.m1(10);
		t1.m1(10, 20, 30);
	}
	
}

Note:-Its comple successfully.
	It runs also successfully
o/p--No argument
        Single argument
        Three argument                                  
----------------------------------------------------------------------

But there is one proble, the proble is that by using of same object we are calling the different types of argument.
We want that concept which can useful to work every method of same method
then var4 args concept came in java 1.5 ver

----------------------------------------------------------------------
*/
class Test_Varargs
{
	public static void m1(int ... i)
	{
		System.out.println("var-args  method");
	}
	public static void main(String args[])
	{
		Test_Varargs t1 = new Test_Varargs();
		t1.m1();
		t1.m1(10);
		t1.m1(10, 20);
		t1.m1(10, 20, 30);	
	}
}	