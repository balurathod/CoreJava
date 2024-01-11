package com.rathod.oops;
class Frog 
{
	static int frogCount = 0;
	public Frog()
	{
		frogCount +=1 ;   //modify value in constor.
	}
	public static void main(String[] args) 
	{
		Frog f= new Frog();
		new Frog();
		new Frog();
		new Frog();   //3-instances r created.  

		System.out.println("Frog Count is now = " + frogCount);

		System.out.println("Frog Count is now = " + f.frogCount);
	}
}
/*

frogCount.Frog()-there is no derefrncd to call Frog().


The method behavior has no dependency on the state (instance variable values)
of an object.why not just ask the class itself to run the method.

*/