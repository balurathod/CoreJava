package com.rathod.unsolved;
 class Animal
{                                  //poly vt overridden method....     SCJP-105
	public void eat()
	{
		System.out.println("Generic animals eating generically...");
	}
}
class Horse extends Animal
{
   public void eat()          //
	{
	   System.out.println("Horse eating hay,oats, "+"and horse treats");
	}
	public void buck()
		 {      }
}
public class PolyTestAnimals
{
	public static void main(String[] args) 
	{
		Animal a=new Animal();
	    Animal b=new Horse();              
		//Animal c=new Horse();
		Horse h=new Horse();
		a.eat();
		b.eat();               // meltdown at runtime due to private eat() in Horse class
		//c.buck();         //can't invoked bcz Animal class does not have that method
		h.eat();             //Not legal bcz Horse didn't inherit eat();
		System.out.println("ploy vt overridden");
	}
}
