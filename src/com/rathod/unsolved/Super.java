package com.rathod.unsolved;
class base 
{
	base()
	{
		System.out.println("base");
	}
	base(int i1)
	{
		
	}
}
class Super extends base
{
     Super()
	{
           System.out.println("super");
	         super(1);
	}
public static void main(String [] a ) 
	{
	   base b1=new Super();
   }
}