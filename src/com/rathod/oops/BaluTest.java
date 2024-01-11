package com.rathod.oops;
//toString()....of Object class overide in this class

public class BaluTest
{
	public static void main(String[] args) 
	{
		Balu b = new Balu(" GoBaluGo : ",19);
			System.out.println(b);
	}
}
class Balu
{
	int shoeSize;
	String nickName;

	Balu(String nickName , int shoeSize)
	{
		this.nickName = nickName;
		this.shoeSize = shoeSize;
	}
	public String toString()
	{
		return ("I am Balu but U can call me " +nickName + ", My shoe Size is " + shoeSize);
	}
}
//toString()-USE-spit(to eject) out obj's state i.e-currnt val of imp instnce vars.