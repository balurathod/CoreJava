package com.rathod.unsolved;
class A extends Exception {}
class B extends A{}
class C extends B{}
public class Test16
{
	static void aMethod() throws C{throw new C();}
	public static void main(String[] args) 
	{
		int x=10;
		try
		{
			aMethod();
		}
		
		catch (B e) //Test16.java:18: exception B has already been caught ... catch (B e)
		{
			System.out.println("Error B");
		}
		catch (A e)
		{
			System.out.println("Error A");
		}
	}
}

/*
      Test16.java:18: exception B has already been caught ... catch (B e)
      Bcoz B is a subclass of A. so it must come before A.
	  For multiple catch sts. the RULE is to place the SUBCLASS EXCEPTION
	  before the SUPER CLASS EXCEPTIONS(as shown in follo prog...)






class A extends Exception {}
class B extends A{}
class C extends B{}
public class Test16
{
	static void aMethod() throws C{throw new C();}
	public static void main(String[] args) 
	{
		int x=10;
		try
		{
			aMethod();
		}
		
		catch (B e)                   //Test16.java:18: exception B has already been caught ... catch (B e)
		{
			System.out.println("Error B");
		}
		catch (A e)
		{
			System.out.println("Error A");
		}
	}
}

o/p-->Error B

*/