package com.rathod.oops;
class Try34 
{
	public static void main(String[] args) 
	{
		try
		{
			try
			{
				try
				{
					
				}
				catch (RuntimeException e)
				{
				}
			}
			catch (Exception e)
			{
			}
		}
		catch (NullPointerException e)
		{
		}
		finally
		{
		System.out.println("Finally");
	}
 }
 }

 //o/p-->finally         But why error at line no. 3?