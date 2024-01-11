package com.rathod.unsolved;
class Foo 
{
    void doStuff(){
                  System.out.println("In Foo....");
            	}
}
 class Bar extends Foo 
	{                                     
		void doStuff(String s)         //how to pass string to  dostuff()?
		{
			System.out.println("In Bar....");
		}
	}
 class BarTest
{
	public static void main(String []  args)
	{
		Foo f=new Foo();
		Bar b=new Bar();
		Foo g=new Bar();             
		Foo h=b;    //The reference vaiable(i.e. b) of the derived class can be asgin to super class object
	                //	Bar b1=f; not possible bcoz obj of subclass is not assign to super class                
		//Bar b1=(Foo)f; //what is meaning?
		
		f.doStuff();
		h.doStuff();
	    g.doStuff();
		//h.doStuff();
	}
}


/*in this prog both r avi overloading & overriding its execution depends upon arg passing.
eg-f.doStuff(str);-overloading      &     f.doStuff();-overriding


REMEMBER.....

When super class is overridden by the sub class method,JVM call only the sub class method
& never the super class method.
i.e.-the sub class method is replacing the super class method.



Is it possible all classes r public or default in inheritance?
Ans-No. a java file contain only 1 public class. & file name of .java file 
    should & must b name of public class.

	All class r may b default ,no problem.



*/