package com.rathod.oops;
class Lgic 
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
		
	}
}
