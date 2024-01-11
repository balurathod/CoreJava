package com.rathod.unsolved;
class  String2
{
	public static void main(String[] args) 
	{
		String s = new String();  //instance of a String.
		s = "BALU";                          //why this is not run?

		//OR

    	//String s = new String("BALU");      //run
		
		//OR only for String

		//String  s ="BALU";                  //run

		System.out.println("Hello World!" +  s.toString());
		System.out.println("Hello World!" +  s.toUpperCase());
		System.out.println("Hello World!" +  s.toLowerCase());
		System.out.println("Hello World!" +  s.subSequence(2,4));
	}
}
