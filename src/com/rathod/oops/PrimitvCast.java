package com.rathod.oops;
class  PrimitvCast
{
	public static void main(String[] args) 
	{
        //chota to badda(size)--legal
		int i = (int)1.223;                 // i     to i
		byte b = (byte)(long)(double)1234.2;  // b,l,d to b print -42 garbage val
		long l = (byte)(short)(int)0.2;     // b,s,i to l
		long l1 = (byte)(short)10.2;        // b,s   to l
	    byte b2 = (int)16.2;                // i     to b
        byte b1 = (int)(long)16.2;          // i,l   to i
        byte b3 = (byte)(long)16.2;         // b,l   to i   //legal
        double d = (int)23.56;
        
		
		//badda to chota(size)--illegal
		//byte b3 = (float)16.2; // pocbl loss of precgn
        //byte b3 = (long)16.2;  // pocbl loss of precgn
     	//int i1 = (double)23.56;
		 
		System.out.println(i);
		System.out.println(b);
		System.out.println(l);
		System.out.println(l1);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(d);
		System.out.println();
		/*
		System.out.println(b3);
		System.out.println(b3);
		System.out.println(b3);
    */
	}
}
