package com.rathod.unsolved;
import java.util.Date; 

class  GCCheck
{
	public static void main(String[] args) 
	{
        Runtime rt =  Runtime.getRuntime();
		
		System.out.println("Total JVM memory : " + rt.totalMemory());
		System.out.println("Before memory : " + rt.freeMemory());

		Date d = null;
		for (int i = 0; i<10000 ;i++)//10000 obj creates  
		{
			d = new Date();
			d = null;
		}
		System.out.println("After memory : " + rt.freeMemory());
           
		   rt.gc();   //& it eligble for GC

        System.out.println("After GC memory : " + rt.freeMemory());

  }
}

/*
IMP...

-->What is relcn bet Date & Runtime class?

-->At which cond we decide method(User/Factory) vl b static


G:\SCJP\Scjp6\ch3-Assignmnt>javac GCCheck.java
.\String.java:5: cannot find symbol
symbol  : method String()
location: class String
                String s = String();  //instance of a String.
                           ^
.\String.java:6: incompatible types
found   : java.lang.String
required: String
                s = "BALU";
                    ^
.\String.java:10: s is already defined in main(String[])
                String s = new String("BALU");
                       ^
.\String.java:10: cannot find symbol
symbol  : constructor String(java.lang.String)
location: class String
                String s = new String("BALU");
                           ^
.\String.java:14: s is already defined in main(String[])
                String  s ="BALU";
                        ^
.\String.java:14: incompatible types
found   : java.lang.String
required: String
                String  s ="BALU";
                           ^
6 errors

G:\SCJP\Scjp6\ch3-Assignmnt>



*/