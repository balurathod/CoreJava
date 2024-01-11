package com.rathod.oops;
//Widening can make ovrloding little tricky.

class EasyOver 
{
	    static void go(byte x)
		{
	        System.out.println(" byte byte ");
	    }
		static void go(long x)
		{
	        System.out.println(" long  long");  //why not print long long?
	    }
		static void go(double x)
		{
	        System.out.println(" double ");
	    }
	public static void main(String[] args) 
	{
		byte b = 5;
		short s = 5;    //it is not avi for ovrldng for that widened use & it convert into long 
		long l = 5;
		float f = 5F;  //5F,5f,5.0f -similrly it convrt into double.
		int i = 5;
		char c = 'c';    //char also convrt into long.how & why?  bcz char is an UNSIGN Integer data types...so int convrt into long
 		go(c);
		go(i);
		go(b);
		go(s);
		go(l);
		go(f);
		
	}
}
/*

RULE for OVERLOADING methods using WIDENING,BOXING & VAR-Args:   IMP for EXAM:

1-Primitive widening uses the "SMALLEST" method arg possible.
	
2-Used individually,boxing & var-args r compatible vt overloading.

3-U CANNOT widen from 1 wrapper type to another.(IS-A fails)

4-U CANNOT widen & then box.(an int  can't bcome a Long)

5-U can box & then widen .(an int  can bcome  an Object ,via Integer) 

6-U can combine var-args vt either widening or boxing. 







Due to WIDENED...byte & short args r imlicitly widened to match d ver of go() that takes an int.

G:\SCJP\Scjp6\ch3-Assignmnt>javac EasyOver.java

G:\SCJP\Scjp6\ch3-Assignmnt>java EasyOver
 int
 int
 long
 double

G:\SCJP\Scjp6\ch3-Assignmnt>javac EasyOver.java

G:\SCJP\Scjp6\ch3-Assignmnt>java EasyOver
 int
 int
 int
 long
 double

G:\SCJP\Scjp6\ch3-Assignmnt>javac EasyOver.java

G:\SCJP\Scjp6\ch3-Assignmnt>java EasyOver
 int
 int
 long
 double

G:\SCJP\Scjp6\ch3-Assignmnt>javac EasyOver.java
EasyOver.java:26: cannot find symbol
symbol  : variable s
location: class EasyOver
                go(s);
                   ^
1 error

G:\SCJP\Scjp6\ch3-Assignmnt>javac EasyOver.java

G:\SCJP\Scjp6\ch3-Assignmnt>java EasyOver
 int
 long
 double

G:\SCJP\Scjp6\ch3-Assignmnt>javac EasyOver.java

G:\SCJP\Scjp6\ch3-Assignmnt>java EasyOver
 long
 int
 long
 double

G:\SCJP\Scjp6\ch3-Assignmnt>javac EasyOver.java

G:\SCJP\Scjp6\ch3-Assignmnt>java EasyOver
 long
 int
 int
 long
 double

G:\SCJP\Scjp6\ch3-Assignmnt>javac EasyOver.java

G:\SCJP\Scjp6\ch3-Assignmnt>java EasyOver
 long
 int
 long
 long
 double

G:\SCJP\Scjp6\ch3-Assignmnt>java EasyOver

*/