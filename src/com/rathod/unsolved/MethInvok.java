package com.rathod.unsolved;
//54
class  MethInvok
{
	public void testIfA()
	{
		if (testIfB("True"))
		{
			System.out.println("True");
		}
		else 
		{System.out.println("Not True");}
	}
	public Boolean testIfB(String str)
	{return Boolean.valueOf(str);}

	public static void main(String[] args) 
	{	}
}
/*
o/p-->True    according to book


but nothing is on screen of  o/p?why

*/