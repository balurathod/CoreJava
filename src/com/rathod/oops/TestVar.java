package com.rathod.oops;
class Test
{
	void m1()
	{
		System.out.println("No argument");		
	}
	void m1(int a, int b)
	{
		System.out.println("Two argument");
	}
	void m1(int a, int b, int c)
	{
		System.out.println("Three argument");
	}

	public static void main(String args[])
	{
		Test t = new Test();
		t.m1();
		t.m1(10, 20);
		t.m1(10,20,30);
	}

}