package com.rathod.oops;
class MathTest1 
{
	public static void main(String[] args) 
	{
		int x=2;
		int y=3;
		if((y == x++)| (x < ++y))
		System.out.println("X is=" + x + " Y is = "+ y);
        


		final int g=5;
		int h=g++;
		System.out.println("Final variable cant modified..." + h);

	}
}
/*
-->((3==2)|(3<4))
-->(false|true)
-->true  Hence print  x = 3  & y = 4

-->if false then not print.
*/