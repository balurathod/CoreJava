package com.rathod.unsolved;
 class Animal{  }
 class Horse extends Animal
 {
 }
 class UseAnimal
{   
	//poly of ovrloding in method....but methods r not overrides     SCJP-105
    
	public void dostuff(Animal a)  //Animal class ref 'a' is here as a arg.
	{
		System.out.println("In Animals Version...");
	}
	public void dostuff(Horse h)      //Horse class ref 'h' is here as a arg.
	{
		System.out.println("In Horse Version...");
	}

	public static void main(String[] args) 
	{
		UseAnimal ua=new UseAnimal();
	   
		Animal animalObj=new Animal();      
		
		Horse horseObj=new Horse();

		Animal animalRefToHorse=new Horse();     //not understand betterly

		ua.dostuff(animalRefToHorse);
		ua.dostuff(animalObj);
		ua.dostuff(horseObj);               
	}
}