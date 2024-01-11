package com.rathod.oops;
import java.util.*;
class  RentalGeneric<T>    //T-for type paramtr
{
	private List<T> rentalPool;    //use class type for List type.

	private int maxNum;
	public RentalGeneric(int maxNum , List<T> rentalPool)
	{
		//constor takes a List of class type
		this.maxNum = maxNum;
		this.rentalPool = rentalPool;
	}
	public T getRental()     //we rnt out a T
	{
		//blocks untill ther is something avi...
		return rentalPool.get(0);
	}
	public void returnRental(T returnedThing)   
	{
		//& d renter returns a T.
		rentalPool.add(returnedThing); 
	}
}
class TestRental
{
	public static void main(String[] args) 
	{
		//mk some Cars for d Pool....
		Car c1 = new Car();
		Car c2 = new Car();

		List<Car> carList = new ArrayList<Car>();
		carList.add(c1);
		carList.add(c2);

		RentalGeneric<Car> carRental = new RentalGeneric<Car>(2 , carList);
		//now get a car out ,& it won't need a cast.
		Car carToRent = carRental.getRental();
		carRental.returnRental(carToRent);

		//can we stick something else in d original carList?
		carlist.add(new Cat("Fluffy"));

		System.out.println("Hello World!");
	}
}



//625-scjp6-Ref....