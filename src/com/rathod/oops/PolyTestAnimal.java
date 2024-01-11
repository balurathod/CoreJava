package com.rathod.oops;
 class Animal
{
	public void eat()
	{
		System.out.println("Generic animals eating generically...");
	}
}
class Horse extends Animal
{
   public void eat()
	{
	   System.out.println("Horse eating hay,oats, " + "and horse treats");
	}
}
public class PolyTestAnimal
{
	public static void main(String[] args) 
	{
		Animal a=new Animal();
		Animal b=new Horse();              //Animal &  Horse->class AND 
		                                   //Animal() &  Horse()->constor
		a.eat();                           //a,b r ref of class Animal assign to obj's of class Animal & Horse resptly
		b.eat();
		System.out.println("ploy vt overridden");
	}
}
//Erro...two public class as above 


//REMEMBER....
//File name & public class name of .java  file must b same.
//& a .java file maximum  only a class is PUBLIC 
