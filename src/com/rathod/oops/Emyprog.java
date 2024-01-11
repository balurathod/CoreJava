package com.rathod.oops;
class Emyprog 
{
	public static void main(String argv[]) 
	{
		System.out.println(argv[]); //no. must b pass in arry otherwise err
	}
}


/*
error->ArrayIndexOutOfBoundsException  

why?
Bcoz--->arg can pass through command here, i cant pass any arg so error.




G:\SCJP\Query>javac Emyprog.java

G:\SCJP\Query>java Emyprog
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
        at Emyprog.main(Emyprog.java:5)

G:\SCJP\Query>java Emyprog  1 3 5 7 9
5     (val of argv[2])

G:\SCJP\Query>java Emyprog  1 3 5 7 9
3     (val of argv[1])



G:\SCJP\Query>


*/