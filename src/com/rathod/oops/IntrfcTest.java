package com.rathod.oops;
interface Zed {
    public void Iadd();
	public void Isub();
	public void Idiv();
 }
abstract class  A implements Zed 
{
	public abstract void Vadd();
	public void Iadd()
	{
		System.out.println("Intrfc mtd Iadd() in Class A");
	}
}
 abstract class B extends A //implements Zed
{
	public void Isub()
	{
		System.out.println("Intrfc mtd Isub() in Class B");
	}
}
abstract class C extends B //implements Zed
{
	public abstract void Vadd();
	public void Idiv()
	{ 
         System.out.println("Intrfc mtd in class C");
	}
}	
class IntrfcTest extends C implements Zed
{
	public static void main(String[] args) 
	{
		//A  a = new  IntrfcTest();
        //B  b = new  IntrfcTest();
		C  c = new  IntrfcTest();
		c.Idiv();
		System.out.println("Hello World!");
	}
	
}
/*
Microsoft Windows [Version 6.0.6001]
Copyright (c) 2006 Microsoft Corporation.  All rights reserved.

C:\Users\PRADIP>G:

G:\>cd SCJP\Query\Solved

G:\SCJP\Query\Solved>javac IntrfcTest.java
IntrfcTest.java:13: class, interface, or enum expected
clas B implements Zed
^
IntrfcTest.java:15: class, interface, or enum expected
        public void Isub()
               ^
IntrfcTest.java:18: class, interface, or enum expected
        }
        ^
3 errors

G:\SCJP\Query\Solved>javac IntrfcTest.java
IntrfcTest.java:6: A is not abstract and does not override abstract method Idiv() in Zed
class  A implements Zed
^
IntrfcTest.java:13: B is not abstract and does not override abstract method Idiv() in Zed
class B implements Zed
^
IntrfcTest.java:20: C is not abstract and does not override abstract method Isub() in Zed
class C implements Zed
^
3 errors

G:\SCJP\Query\Solved>javac IntrfcTest.java
IntrfcTest.java:13: B is not abstract and does not override abstract method Idiv() in Zed
class B implements Zed
^
IntrfcTest.java:20: C is not abstract and does not override abstract method Isub() in Zed
class C implements Zed
^
2 errors

G:\SCJP\Query\Solved>javac IntrfcTest.java
IntrfcTest.java:20: C is not abstract and does not override abstract method Isub() in Zed
class C implements Zed
^
1 error

G:\SCJP\Query\Solved>javac IntrfcTest.java

G:\SCJP\Query\Solved>java IntrfcTest
Hello World!

G:\SCJP\Query\Solved>javac IntrfcTest.java
IntrfcTest.java:31: incompatible types
found   : IntrfcTest
required: A
                A  a =new  IntrfcTest();
                      ^
IntrfcTest.java:32: incompatible types
found   : IntrfcTest
required: B
        B  b =new  IntrfcTest();
              ^
IntrfcTest.java:33: incompatible types
found   : IntrfcTest
required: C
                C  c =new  IntrfcTest();
                      ^
3 errors

G:\SCJP\Query\Solved>javac IntrfcTest.java
IntrfcTest.java:33: incompatible types
found   : IntrfcTest
required: C
                C  c =new  IntrfcTest();
                      ^
1 error

G:\SCJP\Query\Solved>javac IntrfcTest.java
IntrfcTest.java:31: incompatible types
found   : IntrfcTest
required: A
                A  a =new  IntrfcTest();
                      ^
IntrfcTest.java:32: incompatible types
found   : IntrfcTest
required: B
        B  b =new  IntrfcTest();
              ^
IntrfcTest.java:33: incompatible types
found   : IntrfcTest
required: C
                C  c =new  IntrfcTest();
                      ^
3 errors

G:\SCJP\Query\Solved>javac IntrfcTest.java
IntrfcTest.java:33: incompatible types
found   : IntrfcTest
required: C
                C  c = new  IntrfcTest();
                       ^
1 error

G:\SCJP\Query\Solved>javac IntrfcTest.java
IntrfcTest.java:27: IntrfcTest is not abstract and does not override abstract method Idiv() in Zed
class IntrfcTest implements Zed
^
IntrfcTest.java:33: incompatible types
found   : IntrfcTest
required: C
                C  c = new  IntrfcTest();
                       ^
2 errors

G:\SCJP\Query\Solved>javac IntrfcTest.java

G:\SCJP\Query\Solved>java IntrfcTest
Intrfc mtd in class C
Hello World!

G:\SCJP\Query\Solved>javac IntrfcTest.java

G:\SCJP\Query\Solved>java IntrfcTest
Intrfc mtd in class C
Hello World!

G:\SCJP\Query\Solved>javac IntrfcTest.java
IntrfcTest.java:41: ';' expected
                System.out.println(" abs mtd in abs Class C define in main")
                                                                            ^
1 error

G:\SCJP\Query\Solved>javac IntrfcTest.java
IntrfcTest.java:29: IntrfcTest is not abstract and does not override abstract method Vadd() in IntrfcTest
class IntrfcTest extends C implements Zed
^
IntrfcTest.java:39: abstract methods cannot have a body
        public abstract void Vadd()
                             ^
2 errors

G:\SCJP\Query\Solved>javac IntrfcTest.java

G:\SCJP\Query\Solved>java IntrfcTest
Intrfc mtd in class C
Hello World!

G:\SCJP\Query\Solved>



*/