package com.rathod.unsolved;
class Arry2dim 
{

	int [] blots;
	int [][]sequeegees = new int[3][];
	blots = sequeegees;   //Not OK sequeegees is 2 dim arry  of int arry.

	
	int [] blots = new int[6];
    blots = sequeegees;   //blots is an int arry.



	int [][] books = new int[3][];
	int[] number = new int[6];
	int aNumber = 7;
	book[0] = aNumber;       //NOT OK expecting an int arry not an int. 
	book[0] = number;       //Ok numbers is an int arry

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//line 10 & 18 r ok?