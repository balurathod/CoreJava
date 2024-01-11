package com.rathod.unsolved;
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
        return c;
	}

	public static void main(String a[] ) 
	{
		C24 c=new C24();
		c.m1("Hai...");
		c.m1(new C24());  //here call m1() vt paramtr as a obj how?

		c.m1(new Object());  //why this is not pocibl?
	}
}
