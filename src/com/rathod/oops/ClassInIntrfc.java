package com.rathod.oops;
interface I
{
	final class C34
	{                                //1
         static int i=9;;       //2
	}
}
class   C35 implements I
{
	public static void main(String  a[] ) 
	{
		System.out.println(I.C34.i);   //3
	}
}
