package com.rathod.oops;
class MyOuter1 
{
	private   int x=7;

	 class MyInner
	{
		 
		public void seeOuter()
		{
			System.out.println("Outer x is define in innr " + x);
		}
	}
	MyInner i = new MyInner();//outside(must) of IC u can any where create obj of
	public void MyOuter()     //IC within OC.
	{
		//MyInner i = new MyInner();
		i.seeOuter();
	}
  
	public static void main(String[] args) 
	{
		MyOuter1.MyInner io = new  MyOuter1().new MyInner();
	  	io.seeOuter();
	}
}