package com.rathod.unsolved;
class Test35 
{
	public static void main(String[] args) 
	{
		int i=(int)16.2d;                  //type casting.
        byte b=(int)16.2;             
		                                      //o/p->16 16
        int j=-128;
		System.out.println((byte)j<<1);    //what is meaning?
    		int n=8;
			n=n & n+1;                               //what is meaning?
     		n<<=n/2;                                 //what is meaning?
		System.out.println("val of n="+n);
               System.out.println("val of i="+i);
               System.out.println("val of b="+b);
	}
}