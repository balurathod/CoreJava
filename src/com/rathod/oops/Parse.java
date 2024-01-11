package com.rathod.oops;
//27
class Parse
{
	public static void parse(String str)
	{
		try
		{
			float f=Float.parseFloat(str);
		}
		catch (NumberFormatException nfe)
		 {
			f=0;
		}
		finally
		{
			System.out.println(f);
		}
    }
    public static void main(String[] args) 
	{
		parse("Invalid");
	}
}



//B-compilation fail...