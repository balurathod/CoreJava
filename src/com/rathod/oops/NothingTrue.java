package com.rathod.oops;
class  NothingTrue
{
	public static void main(String[] args) 
	{
		boolean a = true;
		boolean b = false;
		boolean c = true;
		if(a==true)    //true go on line 9
			if(b==true)//not true so cursor go on else(14 bcz its 2nd if)
			    if(c==true)
             		   	System.out.println("something r true in this  World!");
		        else
			            System.out.println("nothing is true in this  World!");
		    else if(a && (b = c))//true hence it printed..
			    System.out.println("it is too confusing to tell what is true what is false..");
		else
			System.out.println("Hey this wont compile...");	          
	}
}
/*

G:\SCJP\Query\Solved>javac NothingTrue.java

G:\SCJP\Query\Solved>java NothingTrue
it is too confusing to tell what is true what is false..

G:\SCJP\Query\Solved>

*/