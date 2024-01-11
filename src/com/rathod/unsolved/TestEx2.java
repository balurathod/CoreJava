package com.rathod.unsolved;
class TestEx2 
{
	public static void main(String[] args) 
	{
		badMethod();
	}
	static void badMethod()        //why this method declr static?
		{
		//no need to declr an err.
		doStuff();

		}
	static void doStuff()      //No need to declr an error
    { 
		try
		{
			throw new Error();
		}
		catch (Error me)
		{
			throw me;    //we catch it but then rethrow it.
		}
    }
}

/*

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\SCJP6>java TestEx2
Exception in thread "main" java.lang.Error
        at TestEx2.doStuff(TestEx2.java:17)
        at TestEx2.badMethod(TestEx2.java:10)
        at TestEx2.main(TestEx2.java:5)
*/
