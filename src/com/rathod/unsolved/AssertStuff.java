package com.rathod.unsolved;
//65
public class AssertStuff
{
	public static void main(String[] args) //if main() is private,compl bt excepcn :Main method not a private. 
	{
		int x=5;
		int y=7;
		//assert(x>y):"Stuff";     //not understand properly..legal-assert st 
		System.out.println("passed");
        
		AssertStuff a = new AssertStuff();
		a.Assert();
	}

   private  void Assert()
     {		
		int g=5;
  		int h=7;
		assert(g>h) : "Stuff";     //not understand properly..why "stuff" not print.?
		System.out.println("Pri passed");
	}
}

/*
-->Do not use ASSERTION to validate args to public metd.
-->Do use ASSERTION even in public metd, to validate dat a perticulr codevl 
   never b reached.(see above prog o/p.)



G:\SCJP\Query>javac AssertStuff.java

G:\SCJP\Query>java -ea AssertStuff
Exception in thread "main" java.lang.AssertionError: Stuff
        at AssertStuff.main(AssertStuff.java:8)

G:\SCJP\Query>java -da AssertStuff
passed

G:\SCJP\Query>




D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>java AssertStuff
passed

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>java -ea AssertStuff
passed
*/