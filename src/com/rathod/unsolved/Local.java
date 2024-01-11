package com.rathod.unsolved;
class Local 
{
	public static void main(String[] args) 
	{
	    //int x = 5;        //err:-x is local var so it must b initialized here. 
		int x;
		if (args[0] != null)       //this vl always b true.
		{
			x=7;                   //complr can't tell that this st will run. 
		}
		int y=x;                  //coimpiler vl choke here.
		
	}
}
/*

why exception?


G:\SCJP\Scjp6\ch3-Assignmnt>javac Local.java
Local.java:10: variable x might not have been initialized
                int y=x;                  //coimpiler vl choke here.
                      ^
1 error
*/