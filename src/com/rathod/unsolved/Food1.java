package com.rathod.unsolved;
interface Cookable
{
	public void cook();
}
class  Food1
{
	Cookable c=new Cookable()  // d new just-in-time class is an implmnt of Cookable intrfc
	{
		public void cook()
		{
            System.out.println("Anonymous cookable implmntr");
		}
	};
	public static void main(String[] args) 
	{

		System.out.println("Hello World!");
	}
}


/*
Runnable r=new Runnable();    //can't instantiate interface.



But...This is possible....
it's instantiating an implementor of the Runnable interface
(An anonymous implementation class.)

Runnable r=new Runnable(){
//curly brace , not ;
public void run(){}
};

*/