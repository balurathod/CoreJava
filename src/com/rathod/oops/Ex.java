package com.rathod.oops;
class Ex 
{
	public static void main(String[] args) 
	{
		//open files... 
		System.out.println("Open files");
        
		int n=args.length;
		System.out.println("n="+n);
		
		//do some processing....
        int a=45/n;
		System.out.println("a="+a);
        
		//close files....
		System.out.println("close files");
	}
}


/*
  run propely & give o/p is .....
  
G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>javac Ex.java

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>javac Ex 11 22 33
javac: invalid flag: 11
Usage: javac <options> <source files>
use -help for a list of possible options

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>javac Ex
error: Class names, 'Ex', are only accepted if annotation processing is explicit
ly requested
1 error

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>java Ex 11 22 33
Open files
n=3
a=15
close files

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>java Ex 11 22 33 44 55 66
Open files
n=6
a=7
close files

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>
*/