package com.rathod.oops;
class BITLgic 
{
	public static void main(String[] args) 
	{/*
		System.out.println(8|12^8);
		System.out.println(8|5^8);
		System.out.println(4|1^8);
		System.out.println(2|3^8);
		System.out.println(5|4^8);
		System.out.println(9|2^8);


          128  64  32  16   8  4  2  1

0 =       0    0   0   0    0  0  0  0
1 =       0    0   0   0    0  0  0  1
2 =       0    0   0   0    0  0  1  0
3 =       0    0   0   0    0  0  1  1
4 =       0    0   0   0    0  1  0  0
5 =       0    0   0   0    0  1  0  1
6 =       0    0   0   0    0  1  1  0
7 =       0    0   0   0    0  1  1  1
8 =       0    0   0   0    1  0  0  0


 //System.out.println("5 OR 4 = " + 2|4);   Lgic.java:27: operator | cannot be applied to java.lang.String,int

*/      //binary oprtr
        System.out.println(5|4);   //5 OR 4      o/p=>5  either 1st  bit ON or 2nd

       	System.out.println(5^4);   //5 NOT 4     o/p=1   same bit 0f both i/p

		System.out.println(5&4);   //5 AND 4     o/p=>4  IF all bit r turn ON (same bit 0f both i/p)
		
		//Unary oprtr
		System.out.println(~4);   //NOT 4        o/p=>"-5"(bit val of -5 = 1 1 1 1 1 0 1 1)  FLIPS all BITs of primitives                                          

	    System.out.println(8^5&6);  //8 XOR 5 AND 6 o/p=>12
		System.out.println(5&6);    //5 AND 6       o/p=>4
		System.out.println(8^4);    //8 XOR 5       o/p=>12
	
		
		System.out.println(8|12^6);  //8 OR 12 XOR 6  o/p=>10 solve AND XOR den OR always
		System.out.println(12^6);    //12 XOR 6       o/p=>10
		System.out.println(8|10);    //8 XOR 10       o/p=>10
		
        System.out.println(4*2/10^5);  //4 AND 2 MOD 10  XOR 5  o/p=>13
		System.out.println(4*2);       //4 AND 2        o/p=>8
		System.out.println(10^5);      //10 XOR 5       o/p=>15

		System.out.println(8/15);      //8 XOR 15       o/p=>0

		System.out.println(4*2%10^5);  //4 AND 2 MOD 10  XOR 5  o/p=>13
		System.out.println(4*2);       //4 AND 2        o/p=>8
		System.out.println(10^5);      //10 XOR 5       o/p=>15

		System.out.println(8%15);      //8 XOR 15       o/p=>13

		System.out.println(4*2 & 10^5);  //4 AND 2 MOD 10  XOR 5  o/p=>13
		System.out.println(4*2);       //4 AND 2        o/p=>8
		System.out.println(10^5);      //10 XOR 5       o/p=>15

		System.out.println(8&15);      //8 XOR 15       o/p=>13


		Sysyem.out.println(14^13);

		int n = 8;
        n = n & n + 1;
        n<<=n/2;
		System.out.println(n);//128

        int i =  - 128;
        System.out.println((byte)i << 1);//-256


	   int x = 8 | 12  ^ 8;
	   System.out.println(x);

       int x1 = 8 ^ 12 | 8;
	   System.out.println(x1);

    	 int a =  -8;
		 int b = ~ -33;
		 a>>>=b;
		 System.out.println(a);//-8





		
	}
}



/*

Microsoft Windows [Version 6.0.6001]
Copyright (c) 2006 Microsoft Corporation.  All rights reserved.

C:\Users\PRADIP>G:

G:\>cd SCJP\Query\Solved

G:\SCJP\Query\Solved>javac SuprThis.java
SuprThis.java:86: cannot find symbol
symbol  : method Supr()
location: class Subsub
           super.Supr();
                ^
1 error

G:\SCJP\Query\Solved>javac Lgic.java

G:\SCJP\Query\Solved>java Lgic
12

G:\SCJP\Query\Solved>javac Lgic.java

G:\SCJP\Query\Solved>java Lgic
12
13
13
11
13
11

G:\SCJP\Query\Solved>javac Lgic.java

G:\SCJP\Query\Solved>java Lgic
12
13
13
11
13
11
5

G:\SCJP\Query\Solved>javac Lgic.java

G:\SCJP\Query\Solved>java Lgic
5
1

G:\SCJP\Query\Solved>javac Lgic.java

G:\SCJP\Query\Solved>java Lgic
5
1
4

G:\SCJP\Query\Solved>javac Lgic.java

G:\SCJP\Query\Solved>java Lgic
5
6
1
4

G:\SCJP\Query\Solved>javac Lgic.java
Lgic.java:27: operator | cannot be applied to java.lang.String,int
        System.out.println("5 OR 4 = " + 5|4);   //5 OR 4      o/p=>5  either 1st  bit ON or 2nd
                                          ^
Lgic.java:29: operator | cannot be applied to java.lang.String,int
        System.out.println("5 OR 4 = " + 2|4);
                                          ^
2 errors

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>javac Lgic.java
Lgic.java:31: illegal start of expression
                                  ^
                                  ^
1 error

G:\SCJP\Query\Solved>javac Lgic.java
Lgic.java:31: illegal start of expression
                                  ^
                                  ^
1 error

G:\SCJP\Query\Solved>javac Lgic.java

G:\SCJP\Query\Solved>java Lgic
5
1
4

G:\SCJP\Query\Solved>javac Lgic.java

G:\SCJP\Query\Solved>java Lgic
5
1
2

G:\SCJP\Query\Solved>javac Lgic.java

G:\SCJP\Query\Solved>java Lgic
5
1
4

G:\SCJP\Query\Solved>javac Lgic.java
Lgic.java:36: ')' expected
                System.out.println(5~4);   //5 OR 4      o/p=>5  either 1st  bit ON or 2nd
                                    ^
1 error

G:\SCJP\Query\Solved>javac Lgic.java

G:\SCJP\Query\Solved>java Lgic
5
1
4
-5

G:\SCJP\Query\Solved>javac Lgic.java

G:\SCJP\Query\Solved>java Lgic
5
1
4
-5
12

G:\SCJP\Query\Solved>javac Lgic.java

G:\SCJP\Query\Solved>java Lgic
5
1
4
-5
12
4
13

G:\SCJP\Query\Solved>javac Lgic.java

G:\SCJP\Query\Solved>java Lgic
5
1
4
-5
12
4
13
4

G:\SCJP\Query\Solved>javac Lgic.java

G:\SCJP\Query\Solved>java Lgic
5
1
4
-5
12
4
12

G:\SCJP\Query\Solved>

12

G:\SCJP\Query\Solved>javac Lgic.java

G:\SCJP\Query\Solved>java Lgic
5
1
4
-5
12
4
13

G:\SCJP\Query\Solved>javac Lgic.java

G:\SCJP\Query\Solved>java Lgic
5
1
4
-5
12
4
13
4

G:\SCJP\Query\Solved>javac Lgic.java

G:\SCJP\Query\Solved>java Lgic
5
1
4
-5
12
4
12

G:\SCJP\Query\Solved>javac Lgic.java

G:\SCJP\Query\Solved>java Lgic
5
1
4
-5
12
4
12

G:\SCJP\Query\Solved>javac Lgic.java

G:\SCJP\Query\Solved>java Lgic
5
1
4
-5
12
4
12

G:\SCJP\Query\Solved>javac Lgic.java

G:\SCJP\Query\Solved>java Lgic
5
1
4
-5
12
4
12

G:\SCJP\Query\Solved>javac Lgic.java

G:\SCJP\Query\Solved>java Lgic
5
1
4
-5
12
4
12

G:\SCJP\Query\Solved>javac Lgic.java

G:\SCJP\Query\Solved>java Lgic
5
1
4
-5
12
4
12

G:\SCJP\Query\Solved>javac BITLgic.java

G:\SCJP\Query\Solved>
G:\SCJP\Query\Solved>java BITLgic
Exception in thread "main" java.lang.NoClassDefFoundError: BITLgic

G:\SCJP\Query\Solved>java BITLgic
Exception in thread "main" java.lang.NoClassDefFoundError: BITLgic

G:\SCJP\Query\Solved>javac BITLgic.java

G:\SCJP\Query\Solved>java BITLgic
5
1
4
-5
12
4
12
10
10
14

G:\SCJP\Query\Solved>javac BITLgic.java

G:\SCJP\Query\Solved>java BITLgic
5
1
4
-5
12
4
12
10
10
10

G:\SCJP\Query\Solved>javac BITLgic.java

G:\SCJP\Query\Solved>java BITLgic
5
1
4
-5
12
4
12
10
22
10

G:\SCJP\Query\Solved>javac BITLgic.java

G:\SCJP\Query\Solved>java BITLgic
5
1
4
-5
12
4
12
10
10
10
13
8
15
15

G:\SCJP\Query\Solved>java BITLgic
5
1
4
-5
12
4
12
10
10
10
13
8
15
15

G:\SCJP\Query\Solved>javac BITLgic.java

G:\SCJP\Query\Solved>java BITLgic
5
1
4
-5
12
4
12
10
10
10
13
8
15
7

G:\SCJP\Query\Solved>javac BITLgic.java

G:\SCJP\Query\Solved>java BITLgic
5
1
4
-5
12
4
12
10
10
10
13
8
15
8

G:\SCJP\Query\Solved>javac BITLgic.java

G:\SCJP\Query\Solved>java BITLgic
5
1
4
-5
12
4
12
10
10
10
5
8
15
0

G:\SCJP\Query\Solved>javac BITLgic.java

G:\SCJP\Query\Solved>java BITLgic
5
1
4
-5
12
4
12
10
10
10
5
8
15
0
13
8
15
8
13
8
15
8

G:\SCJP\Query\Solved>


*/