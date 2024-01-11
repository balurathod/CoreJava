package com.rathod.unsolved;
class Base 
{
	Base(int c)                      //parameterized constructor.
	{System.out.println("base");}
}
class Super extends Base
	{
		// Base(){}                //invalid method declaration return type required.
	
		//Base(int d){}    why necessarily define here?

		Super()                     //No argument constructor
    		{System.out.println("super");}

	public static void main(String[] args) 
	{
		Base b=new Super();
		
	}
}

/*

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>javac Base.java
Base.java:9: cannot find symbol
symbol  : constructor Base()
location: class Base
                {System.out.println("super");}
                ^
1 error

*/