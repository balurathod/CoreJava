package com.rathod.unsolved;
public class Test15                                 //oldscjp\Exam2\Test15.java
{
	public static void main(String[] args) 
	{
		int j=0;
		for(;j<3;j++)
		{
			    if(j==1)                           //What is the meaning of this st?
				break out;                       //Error-->undefined label: out   in  break out;
			System.out.println(j+"\n");
	     }
	   out:{System.out.println("bye");}   //here  out is label name  
     }
}


/*public class Test15 
{
	public static void main(String[] args) 
	{
		int j=0;
		out:for(;j<3;j++)
		{
			if(j==1)
				break out;                        //defined label: out at for loop   of  break out;                    
			System.out.println(j+"\n");
	     }
	    // {System.out.println("bye");}
     }
}

o/p ==>0




public class Test15 
{
	public static void main(String[] args) 
	{
		int j=0;
		for(;j<3;j++)
		{
			out:if(j==1)                           //if() condcn is ignore here...
				break out;                         //undefined label: out   in  break out;
			System.out.println(j+"\n");
	     }
	}
}
o/p -->
0
1
2




public class Test15 
{
	public static void main(String[] args) 
	{
		int j=0;
		for(;j<3;j++)
		{
			out:if(j==1)                           //ignore if() contunue for() is the meaning of this st?
				break out;                         //undefined label: out   in  break out;
			System.out.println(j+"\n");
	     }
	   out:{System.out.println("bye");}
     }
}
o/p -->
0
1
2
bye


*/