package com.rathod.oops;
class Enum   //Enum= such class name never allowed
{
		enum Color {RED,BLUE}        //; is optional...

	public static void main(String[] args) 
	{
		Color c1 = Color.RED;
		Color c2 = Color.RED;
		if (c1==c2)
		{
			System.out.println("==");
		}
		if (c1.equals(c2))
		{
			System.out.println("Dot Equals");
		}
	}
}
