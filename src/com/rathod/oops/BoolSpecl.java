package com.rathod.oops;
class BoolSpecl 
{
	public static void main(String[] args) 
	{
		boolean b=true;
		if (b=false)        //(false=b) never use ,unexpected variable.
		{
			System.out.println("B is true");
		}
		else
		{
			System.out.println("B is False");
		}

       boolean b1=false;
		if (b1==true)        //(false==b) never use ,unexpected variable.
		{
			System.out.println("B1 is true");
		}
		else
		{
			System.out.println("B1 is False");
		}
	}
}
/*

To  CHECK Equality...only("==")

only true==false means false  AND   false==true   means false.
AND  false==false means true  AND   true==true  means true 




To CHECK assigned value....("=")(RHS r Ans)

only true=false means false    AND  false=true     means true
only true=true means true      AND  false=false    means false

*/