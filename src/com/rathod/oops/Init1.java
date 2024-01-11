package com.rathod.oops;
//An instance initialization block runs once every time a new instance is created.
class  Init1
{
	Init1 (int x)
	{
		System.out.println("1-arg const");
	}
Init1 ()
	{
		System.out.println("no-arg const");
	}
	static 
	{
		System.out.println("1-static block");
	}
	
	{
		System.out.println("1-instance  init");
	}
	
	{
		System.out.println("2nd instance init");
	}
	static 
	{
		System.out.println("2nd-static block");
	}

	public static void main(String[] args) 
	{
		new Init1();
		new Init1(7);
		System.out.println("Hello World!");
	}
}

/*

Instance init block r oftenly used as a place to put code that al d constor 
in class should share.that way d code does not have duplicated across d constors.



G:\>cd scjp\scjp6\ch3-Assignmnt

G:\SCJP\Scjp6\ch3-Assignmnt>javac Init1.java

G:\SCJP\Scjp6\ch3-Assignmnt>java Init1
1-static block
2nd-static block
1-instance  init
2nd instance init
no-arg const
1-instance  init
2nd instance init
1-arg const
Hello World!

G:\SCJP\Scjp6\ch3-Assignmnt>



*/