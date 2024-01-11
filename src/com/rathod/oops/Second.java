package com.rathod.oops;
class First
	{
		public First (String s)
			{
		       System.out.println(s);
            }
    }
public class Second extends First
	{
       public static void main(String args [])
		   {
                new Second();
           }
}
/*

G:\SCJP\Query\Solved>javac Second.java
Second.java:8: cannot find symbol
symbol  : constructor First()
location: class First
public class Second extends First
       ^
1 error

G:\SCJP\Query\Solved>
*/