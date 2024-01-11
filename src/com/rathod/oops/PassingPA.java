package com.rathod.oops;
class C5 
{
	static int s;
	public static void main(String a[]) 
	{
		C5 obj=new C5();
		obj.m1();

		System.out.println("S= "+s); //only obj & arrays r passed by ref
	}
	void m1()
	{
		int x=1;
		m2(x);
		System.out.println("X= " + x);   //print x=1 bcoz var is pass by val (not pass by ref.)

	}
void m2(int x)
	{
	System.out.println(" In m2() X= " + x);
	x=x*2;     //x is ref var .it only pass by value.(x=1)
	System.out.println(" In m2() X= " + x);
	s=x;     // val of x assign to static var s i.e. 2 it's alive upto end of main 

	}
}
