package com.rathod.unsolved;
class MyOuter7 
{
	private String x="Outer4";
	void doStuff()
	{
		class MyInner
		{
			public void seeOuter()
			{
				System.out.println("Outer X is = "+x);
			}
		}	;
		//this line must come after inner class.
		//MyInner in=new MyInner();
	}
	public static void main(String[] args) 
	{
		MyOuter7.MyInner oi = new MyOuter7().new MyInner();
		oi.seeOuter();
		System.out.println("Hello World!");
	}
}
