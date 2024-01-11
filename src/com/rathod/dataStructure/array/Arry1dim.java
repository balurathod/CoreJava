package com.rathod.dataStructure.array;
//Arry ref assign for 1-dim..
class Arry1dim
{
	int splats;
	int dats = new int[4];
	char [] letters = new char[5];

	splats = dats;   // not ok dats refer to an int arry

	//splats = letters ;  //not ok letters refer to a char arry.

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*



Why err at ln .9?
IS-A relcncip....

Car [] cars;

Honda[] cuteCars = new Honda(5);
cars = cuteCars;   OK bcz Honda is a type of Car.

Beer [] beers = new Beer[99];
cars = beers   NOT OK beer is not a typr of car.
*/