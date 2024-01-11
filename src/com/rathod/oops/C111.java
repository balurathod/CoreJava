package com.rathod.oops;
class C11 
{
	public static void main(String[] args) 
	{
		byte b=33;        //1
		System.out.println("Byte b = " + b);

		b++;                //2
		System.out.println(" incrmntd Byte b = " + b);
		
		b+=2;
		System.out.println(" incrmtd by 2 Byte b = " + b);


		byte b2=55;     //3
		b2 = b+1;          //4 where b is byte & 1 is int type so int/short/long is 
		                   //(bigger than byte) cant covrt into byte.
		System.out.println("Hello World!");
	}
}
//exceed range of byte