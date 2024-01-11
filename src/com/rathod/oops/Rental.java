package com.rathod.oops;
//generic declrcn....
public class Rental 
{
	private List rentalPool;
	private int maxNum;
	public Rental(int maxNum , List rentalPool)
	{
		this.maxNum = maxnum;
		this.rentalPool = rentalPool;
	}
	public Object getRental()//getClass()-Returns the runtime class of this Object.
	{
		//blocks untill there's something avilbl
		return rentalPool.get(0);
	}

	public void returnRental(Object o)
	{
		rentalPool.add(0);                   // non-static metd of Object is hashCode()
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
