package com.rathod.unsolved;
class Simple 
{
	private void methodA(int num)
		{
		int x = 0;
    		if (num >= 0)
	        	{
			      useNum (num + x);
		        }
			else
		       {
				//num must b <o
				//this code should never b reached
			   System.out.println("Yikes num is -ve no.!" + num);
	          }
       }
	public static void main(String[] args) 
	{
	}
}