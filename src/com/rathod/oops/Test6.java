package com.rathod.oops;
//56
class Test6 
{
	public static void main(String[] args) 
	{
		String str="null";
		if (str==null)    //obj val not/never assign to keyword
		{
			System.out.println("Null");
		}
		
		else(str.length()==0)
		{System.out.println("Zero");}
		
		else
		{System.out.println("some");}
		
	}
}
//D-compilation fail..






/*

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac Test6.java
Test6.java:12: not a statement
                else(str.length()==0)
                    ^
Test6.java:12: ';' expected
                else(str.length()==0)
                                     ^
Test6.java:15: 'else' without 'if'
                else
                ^
3 errors



//57
given....
Float pi=new Float(3.14f);
if(pi>3.14){s.o.p("pi is bigr than 3");}
else{s.o.p("pi is not bigr than 3");}
finally{s.o.p("Hav a nic day...")}

o/p-->compilation Fail



*/