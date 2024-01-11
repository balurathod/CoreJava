package com.rathod.unsolved;
class Collar{}

class Dog
{
	Collar c;
	String name;
	public static void main(String[] args) 
	{
		Dog d;              //class (Dog) var 'd' or loc ref to class. 
		                    //is there any relcn in bet loc var & ref? No.
		d=new Dog();
		d.go(d);
//		System.out.println("Hello World!" + dogName);
	}
	void go(Dog dog)        //loc var/ref ? for go()metd only : dog
	{
		//c=new Collar();
        dog.setName("BALU");
	}
	void setName(String dogName)   //loc var/ref : dogName 
	{
		name = dogName;              
		System.out.println("Hello World! say by " + dogName);
		
	}
}
/*

 Class variable is called as ref.?

can we give a loc var of a metd ref to loc var of another metd? how?


ON STACK--method & local variable.

ON HEAP--object 
*/