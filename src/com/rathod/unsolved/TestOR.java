package com.rathod.unsolved;
class TestOR 
{
	public static void main(String[] args) 
	{
		if ((isItSmall(3))||(isItSmall(7)))//where consider i=3,7,6,9
		{
			System.out.println("Result is true");
		}
		if ((isItSmall(6))|| (isItSmall(2)))
		{
		  System.out.println("Result is true1");
		}
	}
		public static boolean isItSmall(int i)
		{	
		if (i<5)
			{
			  System.out.println("i<5");
			  return true;
			}
			else
		      {
				System.out.println("i>=5");
				return false;
		      }
	}
}
//how short ckt logical operator working here?