package com.rathod.oops;
class base 
{
	base()
	{
		//super();  o/p-base super

		//super(1); Err-int cant apply on Object(by default base is subclass of Object class )   
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
		   //super(1);   //o/p- super 
           System.out.println("super");
	         super(1);  //Err-call to super must b 1st st in constor. 
	}
public static void main(String [] a ) 
	{
	   base b1=new Super();
   }
}

/*

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>javac Super.java
Super.java:17: call to super must be first statement in constructor
                 super(1);
                      ^
1 error

*/