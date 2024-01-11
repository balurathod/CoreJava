package com.rathod.unsolved;
 class Animal{  }
 class Horse extends Animal
 {
 }
 class UseAnimals
{                                  //poly vt overridden method....but methods r not overrides     SCJP-105
public void dostuff(Animal a)
	{
		System.out.println("In Animals Version...");
	}
	public void dostuff(Horse h)
	{
		System.out.println("In Horse Version...");
	}

	public static void main(String[] args) 
	{
		UseAnimals ua=new UseAnimals();
	   
		Animal animalObj=new Animal();      
		
		Horse horseObj=new Horse();

		Animal animalRefToHorse=new Horse();     //Animal animalRefToHorse-obj declrcn. new Horse();-obj creation of type Horse, 
   		ua.dostuff(animalRefToHorse);                   //=-assignment of obj.
		ua.dostuff(animalObj);
		ua.dostuff(horseObj);               
	}
}