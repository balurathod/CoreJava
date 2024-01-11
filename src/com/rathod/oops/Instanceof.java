package com.rathod.oops;
class Instanceof 
{
	public static void main(String[] args) 
	{
		String s=new String("Foo");
		Integer i=new Integer(6);
		Character c=new Character('B');
		if (c instanceof Character)
		{
			System.out.println("c is CHARACTER");
		}
		if (i instanceof Integer )
		{
			System.out.println("i is an INTEGER ");
		}
		if (s instanceof String)
		{
			   System.out.println("S is a STRING");
		}
		if (s instanceof Integer)   //never....
		{
			   System.out.println("S is never isntance of an Integer ");
		}
	}
}
