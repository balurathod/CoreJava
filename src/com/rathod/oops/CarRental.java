package com.rathod.oops;
import java.util.*;

public class CarRental extends Rental 
{
	public CarRental(int maxNum ,  List<Car> rentalPool)
	{
		super(maxNum,rentalPool);
	}
	public Car getRental()
	{
		return (Car) super.getRental();
	}
	public void returnRental(Car c)
	{
       super.returnRental(c);
	}
	public void returnRental(Object o)
	{
		if (o instanceof Car)
		{
		       super.returnRental(o);
		}else
		{
			System.out.println("Can not add a non-car");
			//probably throw an excpcn
		}
	}
}
