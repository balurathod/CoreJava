package com.rathod.oops;
class Cat   {}
class Dog
{
	public static void main(String[] args) 
	{
		Dog d=new Dog();
		System.out.println(d instanceof Cat);
	}
}

/*

u can't   use "instanceof" OPERATOR to test accross two diffrent class hirearchies.


G:\SCJP\Scjp6\ch4-Oprtor>javac Dog.java
Dog.java:7: inconvertible types
found   : Dog
required: Cat
                System.out.println(d instanceof Cat);
                                   ^
1 error
*/