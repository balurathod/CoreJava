package com.rathod.oops;
class For15 
{
	public static void main(String[] args) 
	{
		boolean problem =true;
		while (true)
		{
			if (problem)
			{
				System.out.println("There was a problem");

				//break; //breaks only "IF loop"
			}
			//break; //breaks "while loop & IF loop also"  
		
		}//from here cursor is going to main() directly if "IF" condition is FALSE

System.out.println("Next line of code"); //it is a simple st of main() why it is
// not excuted without break ? bcz when IF loop closed (after execucn) cursor is 
//haulting in "While loop" means continuousy looping in WHILE only so this st goes on waiting state in "main" thread.
 


//due to not gioving "break st"(in "While") it("While & If loop") is executed compltly.& cursor go to "main" directly.Bcz each outermost loop reach directly to fun  so Error prone at follo st.definatly .
//otherwise(if "IF" is false) cursor is in "While loop" on waiting state(main thread).
	}
}







/*

class Tests 
{
	public static void main(String[] args) 
	{
		boolean prog = true;
		if (prog)
		{
          System.out.println("Hello !");
		  break;  //error.
		}
		System.out.println("Hello World!");
	}
}

*/