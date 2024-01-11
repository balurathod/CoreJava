package com.rathod.oops;
interface Foo { }
class A implements Foo {} 
class B extends A
{
	public static void main(String[] args) 
	{
		A a=new A();  //this ref limited upto class A only

		A myA=new B(); //supr ref u can always assign to sub class obj.          //A() run   same o/p. how?

		m2(myA);      //method declaracn.

		B b=new  B();// this ref limited upto class B only

		if (b instanceof Object)
		{
		    System.out.println("b is definatly an Object ");
		}
		if (a instanceof Foo)
		{
		    System.out.println("a  is definatly an instance of Foo ");
		}
		if (b instanceof A)
		{
		    System.out.println("b is definatly an instance of A ");
		}
		if (b instanceof Foo)
		{
		    System.out.println("b is definatly an instance of Foo ");
		}

	}
	public static void m2(A a)        //given Class A's ref 'a' as an arg to method. 
	{
		if (a instanceof B)
		   ((B)a).doBstuff();   //downcasting an A ref to a B ref.  Meaning?
	}
	public static void doBstuff()
	{
		System.out.println("'a' refers to a B");
	}
}
