package com.rathod.oops;
 class Animal1
{
	public void eat()
	{
		System.out.println("Generic animals eating generically...");
	}
}
class Horse extends Animal1
{
   public void eat()
	{
	   System.out.println("Horse eating hay,oats, "+"and horse treats");
	}
}
public class Animal
{
	public static void main(String[] args) 
	{
		Animal1 a=new Animal1();             //obj is created(obj is nothing but a reserve memory for Animal class)
		Animal1 b=new Horse();              //Animal->ref class, b->ref var  &  Horse->Constructor of Horse class
		a.eat();
		b.eat();
		System.out.println("ploy vt overridden");
	}
}
