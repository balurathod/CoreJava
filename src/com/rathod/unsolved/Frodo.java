package com.rathod.unsolved;
public class Frodo extends Hobbit 
{
  public static void main(String[] args) 
	{
	    Short myGold=7;
         System.out.println(countGold(myGold,6));
     }
}
class Hobbit
	{
	int countGold(int x , int y)
		{     return x+y;   }

}     
//d)  complcn fail  due to error on line 7   why?
