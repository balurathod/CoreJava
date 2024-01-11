package com.rathod.oops;
//Demo Var-args() method
/*
class Test_Simple
{
	void m1()
	{
		System.out.println("No argument");
	}
	void m1(int i)
	{
		System.out.println("Single argument");
	}
	void m1(int i, int j, int k)
	{
		System.out.println("THree argument");
	}
	public static void main(String[] args)
	{
		Test_Simple t1 = new Test_Simple();
		t1.m1();
		t1.m1(10);
		t1.m1(10, 20, 30);
	}
	
}

Note:-Its comple successfully.
	It runs also successfully
o/p--No argument
        Single argument
        Three argument                                  
----------------------------------------------------------------------

But there is one proble, the proble is that by using of same object we are calling the different types of argument.
We want that concept which can useful to work every method of same method
then var4 args concept came in java 1.5 ver

----------------------------------------------------------------------

class Test_Varargs
{
	public static void m1(int...  i)
	{
		System.out.println("var-args  method");
	}
	public static void main(String args[])
	{
		Test_Varargs t1 = new Test_Varargs();
		t1.m1();
		t1.m1(10);
		t1.m1(10, 20);
		t1.m1(10, 20, 30);	
	}
}

Note:-It compiles properly.
o/p-var-args method
       var-args method
       var-args method
       var-args method
----------------------------------------------------------------------
There is one benefits of that method is that by using of single 
method we can call every methods with argument.
Here we have taken 4 methods with different - different arguments

----------------------------------------------------------------------	
class Test_Varargs1
{
	public static void main(String  args[])
	{
		Test_Varargs1 t1 = new Test_Varargs1();
		t1.sum();
		t1.sum(10);
		t1.sum(10,20);
		t1.sum(10, 20, 30, 40);	
	}
	public static void sum(int  ...x)
	{	
		int total = 0;
		for(int i : x)
		{
			total = total+i;
		}
		System.out.println("The sum is  .."+total);
		System.out.println("THe no. of argments  			:"+x.length);
	}
}

Note:-It compiles properly.
          The sum is               .0
          The no of arguments           0

          The sum is               10
          The no of arguments           1

          The sum is               30
          The no of arguments           2

          The sum is               100
          The no of arguments           4
--------------------------------------------------------------------------
public static void sum(int  x...)

If we will compile the above program then there is a compile time error. The error is that 
Error:-                 ')' expected
...............................................................
public static void sum(int.  ..x)

If we will comple the above program then there is a compile time error.
The error is that 
Error   :-         malformed floating point literal
..............................................................
public static void sum(int.  x..)

If we will comple the above program then there is a compile time error.
The error is that 
Error   :-         malformed floating point literal

public static void sum(int  .x..)

If we will comple the above program then there is a compile time error.
The error is that 
Error   :-         malformed floating point literal
---------------------------------------------------------------------------
*/
class Test_Varargs2
{
	public static void main(String  args[])
	{
		Test_Varargs2 t1 = new Test_Varargs2();
		//t1.sum();
		t1.sum(10);
		t1.sum(10,20);
		t1.sum(10, 20);	
		t1.sum(10, 20,49,56,67,78);	
	}
	public static void sum(int j, int... s )
	{	
		System.out.println(j);
		for(int i : s)
		{

			System.out.println("The str o/p  :");
		}
		
		
	}
}