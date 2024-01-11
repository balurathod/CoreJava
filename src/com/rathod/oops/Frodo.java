package com.rathod.oops;
public class Frodo extends Hobbit 
{
  public static void main(String[] args) 
	{
	    Short myGold=7;
         System.out.println(countGold(myGold,6));
     }
}
class Hobbit
	{
	int countGold(int x , int y)
		{     return x+y;   }
	}                      //d)  complcn fail  due to error on line 7
/*

G:\SCJP\Query\LOGIC>javac Frodo.java
Frodo.java:6: non-static method countGold(int,int) cannot be referenced from a static context
         System.out.println(countGold(myGold,6));
                            ^
1 error

G:\SCJP\Query\LOGIC>

*/