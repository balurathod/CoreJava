package com.rathod.oops;
class For5 
{
	//static Byte doStuff()
	//static Short doStuff()
	//static byte doStuff()
	static short doStuff() //all above r elegible for "int type" return.(c ln 15)     
	{
		for (int x = 0 ; x < 3 ; x++ )
		{
			System.out.println("In FOR loop...");
        //break;  //not allowed why? bcz BREAK st. is not allowed without any
		        //cond in loop.here not any cond in fOR loop.
 		}
		//break;     Err-it is out of SWITCH or loop
		//continue;  Err-it is outside of  loop
	return 0;
	//break;       Err-it is out of loop

	}
	public static void main(String argd[])
	{
		For5 f = new For5();
        byte s = (byte)doStuff(); 
	}
	
}