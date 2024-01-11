package com.rathod.oops;
class MyClass 
{
    private int x=34;
	public void makeInner()
	{
		MyInner im=new MyInner();
		im.seeOuter();   
	}
	class MyInner
	{
	public void seeOuter()
	{
		System.out.println("Hello World! WELCOME to INNER class..");
		System.out.println("Outer x is= " + x);
		System.out.println("Inner class ref is= " + this); 
		System.out.println("Outer clkass ref is= " + MyClass.this);
	}
	}//main() method is not allowed in inner class never Why? it is also a memeber of outer class as like main()
	public static void main(String[] args) 
	{
		MyClass.MyInner im=new MyClass().new MyInner();
		im.seeOuter();
			}
}

/*


G:\SCJP\Scjp6\ch8-Innr class>javac  MyClass.java

G:\SCJP\Scjp6\ch8-Innr class>java MyClass
Hello World!
Outer x is= 34
Inner class ref is= MyClass$MyInner@19821f
Outer clkass ref is= MyClass@addbf1



SOME RULES....

1-To ref d "inner class" instance itself from within the innner class code(use this).

2-To ref d "Outer class"(d outer class instance)from within the inner code,use NameOfOuterClass.this
eg-MyOuter.this

3-regular inner class is nothing but a member of outer class just as like instance variable & methods.

4-Following modifiers applied to inner class:
  final,abstract, public, private,protected,strictfp,static(but "static" turns it into a static nested class not an inner class) 




  
  G:\SCJP\Scjp6\ch8-Innr class>javac  MyClass.java
MyClass.java:17: inner classes cannot have static declarations
        public static void main(String[] args)
                           ^
1 error






code snnipet....

class MyClass 
{

	public void myMethod()
	{
		MyClass mc=new MyClass();
		mc.doStuff(this);         //pass a ref to obj running myMethod.
	}
the THIS ref is the way an obj can pass a ref to itself to some other code,
as a method code argument.
*/