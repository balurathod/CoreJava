package com.rathod.oops;
import static java.lang.System.*;
//Animal(2).java
abstract class Animal 
{
	public abstract void checkup();
}
class Dog extends Animal
{
   public void checkup()
	{
		out.println("Dog checkup...");
	}
}

class Cat extends Animal
{
   public void checkup()
	{
		out.println("Cat checkup...");
	}
}
class Bird extends Animal
{
   public void checkup()
	{
		out.println("Bird checkup...");
	}
}
class AnimalDoctor
{
	public void checkAnimals(Animal[] animals )
	{
		for (Animal a : animals)
		{
			a.checkup();
		}
	}

	public static void main(String[] args) 
	{
		//test it
		Dog[] dogs = {new Dog() , new Dog()};
		Cat[] cats = {new Cat() , new Cat() , new Cat()};
		Bird[] birds = {new Bird()};

		AnimalDoctor doc = new AnimalDoctor();

		doc.checkAnimals(dogs);    //pass the Dog[]
		doc.checkAnimals(cats);    //pass the Cat[]
		doc.checkAnimals(birds);    //pass the bird[]
		
		out.println("Hello World!");
	}
}
/*

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>javac Animal.java

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>java Animal
Exception in thread "main" java.lang.NoSuchMethodError: main

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>java AnimalDoctor
Dog checkup...
Dog checkup...
Cat checkup...
Cat checkup...
Cat checkup...
Bird checkup...
Hello World!

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>
*/