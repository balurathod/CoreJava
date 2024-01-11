package com.rathod.oops;
class Command 
{
	public static void main(String[] a1) 
	{
//		System.out.println(a1.length);            //0
		System.out.println(a1.length());          //1
		
		System.out.println(a1[0]);                //2
        System.out.println(a1);                   //3 not prnt due to excpcn arise in //2
	    

//		System.out.println(a1);          //prnt ref addr val vt arry type
//		System.out.println(a1[0]);       //Excpcn-ArryIndOutOfBuondExcpcn
		
	}
}

/*

G:\SCJP\Oldscjp(1-5)\2Spiral\Exam3>javac Command.java
Command.java:6: cannot find symbol
symbol  : method length()
location: class java.lang.String[]
                System.out.println(a1.length());            //1
                                     ^
1 error




if ln //1 remove & add //0


G:\SCJP\Oldscjp(1-5)\2Spiral\Exam3>javac Command.java

G:\SCJP\Oldscjp(1-5)\2Spiral\Exam3>java Command 4 5 6
3
4
[Ljava.lang.String;@3e25a5

G:\SCJP\Oldscjp(1-5)\2Spiral\Exam3>






*/