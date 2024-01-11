package com.rathod.oops;
class C24 
{
	public void m1(Object o1)
	{
        System.out.println("object");
	}

    public void m1(String  o1)
	{
        System.out.println("String");
	}
    public int m1(int c)
	{
      //  System.out.println("int");
         return c;
	}

	public static void main(String a[] ) 
	{
		C24 c1=new C24();
		c1.m1("Hai..");
	}
}

/*

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>javac C24.java

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>java C24

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>javac C24.java
C24.java:15: unreachable statement
                System.out.println("int");
                ^
C24.java:16: missing return statement
        }
        ^
2 errors

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>javac C24.java

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>java C24
int

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>javac C24.java

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>java C24
String

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>javac C24.java
C24.java:21: cannot find symbol
symbol  : variable o1
location: class C24
                c1.m1(o1);
                      ^
1 error

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>

*/