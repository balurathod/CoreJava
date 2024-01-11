package com.rathod.unsolved;
class Alpha 
{
	Alpha doStuff(char c)   //what is meaning of this st.? Alpha is class name bt here use as a data type.
	{
		return  new Alpha();
	}
}
class Beta extends Alpha
{
   Beta doStuff(char c)
	{                          //legal override in java 5.0
       //return new Bate();
	   return new Beta(); 
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
