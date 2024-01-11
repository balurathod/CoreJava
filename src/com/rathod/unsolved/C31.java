package com.rathod.unsolved;
 class C30 
{
	public void m1()
	{
		System.out.println("m1 method in c30 class");
	}
}
public class C31
{
  public C30 m1() //what is meaning?  C30 is name of class but here it is use as a data type nothing else  whose (return type) is public
	{
	  return new C30() //return new C30();  no semicol means what? Define Anonymous innr class here it must b end with ";"
	   {
			public void m1()
			{
				System.out.println("m1 method in anonymous class");
			}
	    };
     }
	public static void main(String  a[] ) 
	{
		C30.C31 obj=new C30.C31();  //		C30 obj=new C31().m1();
		obj.m1();
	}
}

/*//inner class can access in next class also...
o/p-> m1 method in anonymous class

But 1 error r prone..Why?
*/