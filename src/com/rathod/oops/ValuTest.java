package com.rathod.oops;
class ValuTest 
{
	public static void main(String[] args) 
	{
		int a=10;
		System.out.println("val of a = " + a);

		int b = a;
		System.out.println("A = " + a + " after b = a " );
		System.out.println("A = " + b + " after b = a" );
		b=30;
		System.out.println("A = " + a + " after b = 30" );
		System.out.println("A = " + b + " after b = 30 " );
	}
}
