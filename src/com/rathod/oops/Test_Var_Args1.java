package com.rathod.oops;
class Test_Var_Args1
{
	void m1(int... x)
	{
		System.out.println("var-args method");
	int total = 0;
	for( int i : x)
	{
		total = i;	
	
	}
		System.out.println("One Arg   :"+total);
	}	


	public static void main(String[] args)
	{
		Test_Var_Args1 t1 = new Test_Var_Args1();
		t1.m1();
		t1.m1(10);
		t1.m1(10,20);
		t1.m1(10, 20,30,40);   //why for 30 it not printed
		t1.m1(10, 20,30,40,50);
		t1.m1(10, 20,30,40,50,60);
	}
}