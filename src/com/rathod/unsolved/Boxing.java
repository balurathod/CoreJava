package com.rathod.unsolved;
class Boxing 
{
	static Integer x;
	public static void main(String[] args) 
	{
        doStuff(x);    //x does not refers to Integer obj(ther is no val..)
	}
	static void doStuff(int z)
	{
		int z2 = 5;
		System.out.println(z2 + z);
	}
}
/*
Error..NullPointerException.


Bcoz,....
Wrapr ref var can b NULL. 
*/