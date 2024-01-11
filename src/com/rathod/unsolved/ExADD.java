package com.rathod.unsolved;
//Actualy this prog is not related vt any FILE-Handling concept.
class ExADD 
{
	public static void main(String[] args) 
	{
		//open files... 
		System.out.println("Open files");
        
		int n=args.length;             //what is length here? is there any other like this? 
		System.out.println("n="+n);    //lenth is a keyword,count length of args.
		
		//do some processing....
        int a =60+n;
		System.out.println("a="+a);
       
		int d, b=10, c=100; 
		 //a =b+c+n;            error
		 //int d=10+100+n;
		 d=b+c+n;
		System.out.println("d="+d);
        
		//int n1=args.true;                not applicable.. why?
		//int n2=args.null;                not applicabe..  Why?
		//int n3=args.;
		//System.out.println("n2="+n2);
		
		//close files....
		System.out.println("close files");
	}
}
/*

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>javac ExADD.java

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>java ExADD  12 34
Open files
n=2
a=62
close files

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>javac ExADD.java
ExADD.java:16: a is already defined in main(java.lang.String[])
                int a =b+c+n;
                    ^
1 error

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>javac ExADD.java
ExADD.java:15: a is already defined in main(java.lang.String[])
                int a, b=10, c=100;
                    ^
1 error

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>javac ExADD.java
ExADD.java:15: a is already defined in main(java.lang.String[])
                int a;//, b=10, c=100;
                    ^
1 error

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>javac ExADD.java
ExADD.java:17: a is already defined in main(java.lang.String[])
                 int a=10+100+n;
                     ^
1 error

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>javac ExADD.java

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>java ExADD  12 34
Open files
n=2
a=62
a=112
close files

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>javac ExADD.java
ExADD.java:15: a is already defined in main(java.lang.String[])
                int a, b=10, c=100;
                    ^
ExADD.java:18: cannot find symbol
symbol  : variable d
location: class ExADD
                 d=b+c+n;
                 ^
ExADD.java:19: cannot find symbol
symbol  : variable d
location: class ExADD
                System.out.println("d="+d);
                                        ^
3 errors

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>javac ExADD.java

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>java ExADD  12 34 55 666 8888
Open files
n=5
a=65
d=115
close files

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>javac ExADD.java
ExADD.java:21: <identifier> expected
                int n1=args.true;
                            ^
1 error

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>javac ExADD.java
ExADD.java:22: <identifier> expected
                int n2=args.null;
                            ^
1 error

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>javac ExADD.java
ExADD.java:23: <identifier> expected
                int n3=args.null;
                            ^
1 error

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>javac ExADD.java

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>java ExADD  12 34 55 666 8888
Open files
n=5
a=65
d=115
close files

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>
*/