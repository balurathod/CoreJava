package com.rathod.unsolved;
class MyOuter5 
{
	private String x="Outer5";
	void doStuff()
	{
		class MyInner
		{
			public void seeOuter()
			{
				System.out.println("Outer X is = "+x);
			}
		}	

		//this line must come after inner class.
		MyInner in = new MyInner();
		in.seeOuter();
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

//this not run why?  
