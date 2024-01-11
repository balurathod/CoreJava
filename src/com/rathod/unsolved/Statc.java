package com.rathod.unsolved;
//Initialization Blocks
class  Statc
{
	static int x;
	int y;

	static    
		{
		   x = 7;
		   System.out.println("Only one block in JAVA is to execute without main()..");
           System.out.println("Which is Static..block ,X = " + x);

        
		}      //static init block
	
	
	//instance init block   What is role of this block?
	{
		y=8;
		System.out.println("Static.." + y);
	}

}
/*




Illegal Array Ref Assignment....

-->Can't assign 1-D array to a 2-D array ref.
eg - myCats = myCats[0]


-->Can't assign Non-array  obj to a 2-D array ref.
 eg - myCats = myCats[0][0]; 


-->Can't assign Non-array to a 1-D array ref.
eg- myCats = myCats[1];
    myCats[1] = myCats[1][2];


-->Can't assign an array obj to a non  array ref.
eg - myCats = moreCats;




*/