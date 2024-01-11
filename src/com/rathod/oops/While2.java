package com.rathod.oops;
class While 
{
	public static void main(String[] args) 
	{
		int x=2;       //for other than 2 prog compile but no o/p. 
		while (x==2)  //(test) must evaluate to boolean result.
		{
			System.out.println(x);
			++x;
		}
	}
}
/*while(int x=2)     not legal;

only for expr TRUE while {} run .otherwise(for false) prog may compile but no o/p.

*/