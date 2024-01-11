package com.rathod.oops;
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
	{
		return Boolean.valueOf(str);
	}

	public static void main(String[] args) 
	{
		//MethInvok mk = new MethInvok(); If not avi in code then user can consider it.
		//mk.testIfA();
	}
}
/*
o/p-->True    according to book


but nothing is on screen of  o/p?
why
Bcz- ln 19 & 20 offline 

*/