package com.rathod.unsolved;
interface ITest                 //oldscjp\Exam2\Test19.java
{
	public void setVal();
}
public class Test19
{
	private String a;
	void aMethod()
	{
		final String b;   
		

		ITest it=new ITest()                
			{
        public void setVal()
		{
	       a="Hello";//b="World";        // cannot assign a value to final variable b
		}
	};


	it.setVal();
	System.out.println(a);
}
public static void main(String[] args) 
	{
		Test19 t=new Test19();
		t.aMethod();
		
	}
}



/*D:\SCJP\Oldscjp(1-5)\Exam2>javac Test19.java

Test19.java:16: cannot assign a value to final variable b
               a="Hello";b="World";
                         ^
Test19.java:26: cannot find symbol
symbol  : method aMethod()
location: class Test
                t.aMethod();
                 ^
2 errors






interface ITest
{
	public void setVal();
}
public class Test19
{
	private String a;
	void aMethod()
	{
		final String b;            

		ITest it=new ITest()
			{
        public void setVal()
		{
	       a="Hello";   //b="World";        // cannot assign a value to final variable b
		}
	};

	it.setVal();
	System.out.println(a);
}
public static void main(String[] args) 
	{
		Test19 t=new Test19();
		t.aMethod();
		
	}
}
o/p-->Hello




ITest it=new ITest()                //ITest is an interface. so is this possible?yes...BUT how?
			{
        public void setVal()
		{
	       a="Hello";b="World";    
		}
	};
	
	*/