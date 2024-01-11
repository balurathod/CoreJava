package com.rathod.unsolved;
class Doo
{
	short size=27;
	public void setSize(short size)
	{
		this.size=size;
		System.out.println("Size=" + this.size);//why value of size is not display?
	}
	public static void main(String[] args) 
	{
		System.out.println("Importance of 'this'...");
	}
}
//without creation of constor u cant execute it.bcz "this" is first st of constor
//for execution.but how to run?