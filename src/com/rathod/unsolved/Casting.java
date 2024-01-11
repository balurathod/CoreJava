package com.rathod.unsolved;
class Casting 
{
	public static void main(String[] args) 
	{
		//int x = 3957.229;
		int x = (int)3957.229;

		long l = 56L;
		byte b = (byte)1;
		System.out.println("The byte b is = " + b);
		System.out.println("int x = " + x);

	
		long l1 = 130L;  //no mater for byte b2 = (byte)120;
		
		//byte b2 = (byte)130;//why o/p is -126
        
		byte b2 = (byte)120;

		System.out.println("The byte b2 is = " + b2);   //o/p - >the byte is -126
	}
}
//how? 