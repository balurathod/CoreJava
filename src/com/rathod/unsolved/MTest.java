package com.rathod.unsolved;
class Mammal 
{
	void eat(Mammal m)
	{
		System.out.println("Mammal eats food...");
	}
}
class Cattle extends Mammal
{
   void eat(Cattle c)
	{
	   System.out.println("Cattle eats hay...");
	}
}
class Horse extends Cattle
{
void eat(Horse h)    //What is the meaning of eat(Horse h) create/declr h-ref of Horse class as a arg  
	{
	   System.out.println("Horse eats hay...");
	}
}
public class MTest
{
	public static void main(String[] args) 
	{
		Mammal h=new Horse();       //Mammal class ref h is refer to Horse obj directly.
		Cattle c=new Horse();           //Cattle class ref c is assign/refer  to Horse obj
		c.eat(h);
		//System.out.println("Hello World!");
	}
}


/*Mammal class ref h is refer to Horse obj directly.
i.e-all content of Mammal class stored into Horse obj.

& Cattle class ref c is assign/refer  to Horse obj
i.e.-again ref of Cattle class assign to Horse obj.
      (In above prog only one obj created of Horse class)
*/