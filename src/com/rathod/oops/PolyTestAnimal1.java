package com.rathod.oops;
class Animal
{            //poly vt overridden method,but invoking a superclass methods of an 
                                     //overridden methods....     SCJP-105
  public void eat() {}

  public void printYourself()
		{
		System.out.println("ur printing code goes here in Animl..");
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
public class PolyTestAnimal1
{
	public static void main(String[] args) 
	{
		Animal a=new Animal();
	    Animal b=new Horse();              //Animal class->ref is a,b  but  Horse & Animal class cret->obj
        a.eat();
		b.eat();                     // meltdown at runtime due to private eat() in Horse class
		b.printYourself();
		System.out.println("ploy vt overridden");
	}
}
/*
why 2 times not printed eat().?
Ans- Yes definatly eat() metd can printed/executed two times,but....first eat()
     is empty.thats why what it print man.
	 so "a.eat();" is useless to print eat() metd  in coding,Bcoz it creates obj 
	 of Animal class,& put d content of "printYourself()" metd.
	      Using second ref of Animal class i.e.-'b' we can executes eat() of 
     subclass.


G:\SCJP\Query>javac PolyTestAnimal1.java

G:\SCJP\Query>java PolyTestAnimal1
Horse eating hay,oats, and horse treats
ur printing code goes here in Animl..
ploy vt overridden

G:\SCJP\Query>

*/