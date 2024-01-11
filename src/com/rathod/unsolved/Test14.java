package com.rathod.unsolved;
//78
class Test14
{
  	public static void main(String[] args) 
	{
		try
		{
			args=null;
			args[0]="test";
			System.out.println(args[0]);
		}
		catch (Exception ex)
		{
			System.out.println("Exception");
		}
        catch (NullPointerException npe)
		{
			System.out.println("NullPointerException");
		}

	
	}
}
/*
Ans-->Compilation Fail ...But due to what?
*/