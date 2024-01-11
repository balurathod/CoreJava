package com.rathod.unsolved;
class  String4  //why we cant give class name as "String"
{
	public static void main(String[] args) 
	{
		String4 s = String4();  //instance of a String.
		s = "BALU";         //why this is not run?

		//OR

		String4 s = new String4("BALU");
		
		//OR only for String

		String4  s ="BALU"; 

		System.out.println("Hello World!");
	}
}
