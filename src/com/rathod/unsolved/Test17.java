package com.rathod.unsolved;
class  Test17
{
	public void someMethod(Object value)
	{
		//check for null val D-appropiate way to handle null val... 
	    if(value==null)
		{
			throw new illegalArgumentException("value is null");
		}
	System.out.println(value.getClass());
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
