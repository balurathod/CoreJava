package com.rathod.oops;
//complete concept of GENERIC METHOD....

import static java.lang.System.*;
import java.util.*;
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
class AnimalDoctorGeneric
{
   //change d arg from Animal[] to ArrayList<Animal>
   
	public void checkAnimals(ArrayList<Animal> animals )
	{
		for (Animal a : animals)
		{
			a.checkup();
		}
	}



	public static void main(String[] args) 
	{
		//mk Arraylist instead of arrays for Dog,Cat,Bird
		List<Dog> dogs = new ArrayList<Dog>();
			dogs.add(new Dog());
			dogs.add(new Dog());


            //snippets....Error....List<Animal> in AnimalDoctorGeneric can't b applied to List<Dog>
        List<Dog> dogs = new ArrayList<Dog>();
			animals.add(new Dog());
			animals.add(new Dog());
        AnimalDoctorGeneric doc = new AnimalDoctorGeneric();
		    doc.addAnimal(animals);   //this is where it BREAKs...



       List<Cat> cats = new ArrayList<Cat>();
	        cats.add(new Cat());
			cats.add(new Cat());

		
       List<Bird> birds = new ArrayList<Bird>
		    birds.add(new Bird());




/*
	   List<Animal> animals = new Animal[3]; //no problm... 
	        animals[0] = new Cat();
			animals[1] = new Dog();




	   List<Animal> animals = new ArrayList<Animal>(); //no problm... 
	        animals.add(new Cat());     //ok...
			animals.add(new Dog());     //ok...
   
		public void addAnimal(Animal[] animals)
		{
			animals[0] = new Dog();    //no prblm any Animals work in Animal[]
		}


        public void addAnimal(ArrayList<Animal> animals)
		{
			animals.add(new Dog());    //some times allowed...
		}


        public void addAnimal(List<Animal> animals)
		{
			animals.add(new Dog());    //no prblm any Dog can be assign to  Animal ref...alwys legal...
		}




        public void addAnimal(List<Animal> animals)

//or


		public void addAnimal(List<? extends Animal> animals)
		{
			animals.add(new Dog());    //no can't add if we use <? extends Animals>
		}

		
		Error...can not find symbol mtd- add(Dog).  basically u can say here u can't add a Dog here... 





		public void addAnimal(List<? super Dog> animals)
		{
			animals.add(new Dog());    // adding is sometimes ok vt super.
		}
		p.s.v.m(){
		List<Animal> animals = new ArrayList<Animal>(); //no problm... 
	        animals.add(new Cat());     //ok...
			animals.add(new Dog());     //ok...
        AnimalDoctorGeneric doc = new AnimalDoctorGeneric();
            doc.addAnimal(animals);   //ok,since animals matches d metd arg...
	}


  MEANING...
  Hey complr plz acpt any List vt a generc type(i.e.-of type Dog)or a super type of Dog.
  nothing lower in d inheritnc tree can come in ,bt anything higher than Dog is OK.
      
	  so List<Object> ,List<Animal> & List<Dog> can take a Dog.




 Conclusion...
       List<?> --means  Any type.   & List<Object> --means  Only List<Object>.
        
   
*/



		//this code as d same as d array vercn...
       AnimalDoctorGeneric doc = new AnimalDoctorGeneric();

	   //this code workd wen we use arrays instead of Arraylist...
      

	  //doc.addAnimal(animals);   //ok,since animals matches d metd arg...


		doc.checkAnimals(dogs);     //send a List<Dog>
		doc.checkAnimals(cats);    // send a List<Cat>
		doc.checkAnimals(birds);    //send a List<Bird>
		
		out.println("Hello World!");
	}
}
