package com.rathod.oops;
class C41 
{
	public static void main(String[] args) 
	{
		String s1="HHH";          //s1 & sb2 r pting to diff ref.
		StringBuffer sb2=new StringBuffer(s1);   
		System.out.println(sb2.equals(s1)+","+s1.equals(sb2));
		System.out.println(4+5+"Hello World!");
	}
}

//o/p -->