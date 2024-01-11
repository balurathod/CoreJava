package com.rathod.unsolved;
class Test35 
{
	public static void main(String[] args) 
	{
		                                         //type casting.
            int i=(int)16.2d;             //16.2d -double this val assign to int i ,then i=16. 
		     byte b=(int)16.2;          //16.2 - this val assign to byte b ,then b=16. 
		                                                               //o/p->16 16
               System.out.println("val of i="+i);
               System.out.println("val of b="+b);

        int j=-128;
		System.out.println((byte)j<<1);    //what is meaning?
    		int n=8;
			n=n & n+1;                               //what is meaning?
     		n<<=n/2;                                 //what is meaning?
		System.out.println("val of n="+n);
		int x=8 | 12 ^ 8;
		System.out.println("val of x="+x);
             	}
}