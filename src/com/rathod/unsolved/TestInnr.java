package com.rathod.unsolved;
class Horse extends Animal 
{
	void buck()
	{}
}
class Animal
{
	void eat()
	{}
}
class TestInnr
{
	public static void main(String[] args) 
	{
		Animal h=new Horse();
		h.eat();    //Legal class Animal has an eat().
	//	h.buck();   //Not Legal class Animal doesn't have a buck();
		System.out.println("Hello World!");
	}
}
//u must b able to spot anonymous inner class that rather than overriding
//a method of the super class. 