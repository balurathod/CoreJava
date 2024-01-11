package com.rathod.oops;
public class Test7
{
	int i;
	Test7()
	{
		i++;   //scope of constor is alive till upto end of main() 
	}
	public static void main(String[] args) 
	{
		Test7 t=new Test7();
		System.out.println("Val of i which is stored in t(ref) of  obj is="+t.i);
	}
}

//o/p-->1