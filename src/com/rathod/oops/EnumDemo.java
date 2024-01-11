package com.rathod.oops;
//An enumeration of apple varieties
enum Apple
{
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}	

class EnumDemo  
{
	public static void main(String[] args) 	
	{
		Apple ap;
		ap = Apple.RedDel;

		System.out.println("Value of ap: "+ap);
		System.out.println("");

		ap = Apple.GoldenDel;

		if (ap == Apple.GoldenDel)
				System.out.println("ap contains GoldenDel\n");
	

		//use an enum to control a switch statement

		switch (Apple.RedDel)
			{
			case Jonathan:
				System.out.println("Jonathan is Red");
				break;
			case GoldenDel:
				System.out.println("Jonathan is Yellow");
				break;
			case RedDel:
				System.out.println("Red Delicious is red");
				break;
			case Winesap:
				System.out.println("Winesap is Red");
				break;
			case Cortland:
				System.out.println("Cortland is Red");
				break;
		}							 
	}
}
