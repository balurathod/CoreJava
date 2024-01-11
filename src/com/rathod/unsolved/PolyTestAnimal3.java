package com.rathod.unsolved;
class Animal
{                                  //poly vt overridden method....but invoking a superclass methods of an 
                                     //overridden methods....     SCJP-105
  public void eat() {}
  public void printYourself()
		{
		System.out.println("ur printing code goes here...");
	}
}
class Horse extends Animal
{
	public void printYourself()
	{
	   super.printYourself();     //without this super keyword u can't invoke b.printYourself()
	}
   public void eat()          //if this is private b.eat() not run....
	{
	   System.out.println("Horse eating hay,oats, "+"and horse treats");
	}
}
public class PolyTestAnimal3
{
	public static void main(String[] args) 
	{
		Animal a=new Animal();
	    Animal b=new Horse();              //Animal->ref  but  Horse->obj
       // a.eat();
		b.eat();                     // meltdown at runtime due to private eat() in Horse class
		b.printYourself();
		System.out.println("ploy vt overridden");
	}
}
