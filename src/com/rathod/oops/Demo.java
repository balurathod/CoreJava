package com.rathod.oops;
class Demo
{
	public static void main(String  args[])
	{
		Test_Varargs1 t1 = new Test_Varargs1();
		t1.sum();
		t1.sum(10);
		t1.sum(10,20);
		t1.sum(10, 20);	
	}
	public static void sum(int j,int... s )
	{	
		System.out.println(j);
		for(int i : s)
		{

			System.out.println("The string o/p :");
		}
		
		
	}
}