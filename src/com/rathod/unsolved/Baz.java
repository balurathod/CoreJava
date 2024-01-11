package pkgA;
public class Foo
{
	int a=5;
	protected int b=6;  //never apply modifiers on variables....
	public int c=7;
}


package com.rathod.unsolved;
import pkgA.*;
public class Baz 
	{
	public static void main(String[] args) 
	{
         Foo f=new Foo();		
		System.out.print(""+f.a);  //compilcn error  at 15 & 16 line
		System.out.print(""+f.b);
		System.out.println(""+f.c);
	}
      
}