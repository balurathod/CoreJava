package com.rathod.unsolved;
class Rectangle 
{
	public int area(int Length , int Width)
	{
		return Length*Width;
	}
}
class Square extends Rectangle
	{
	 public int area(long Length , long Width)
		{
           return (int) Math.pow(Length,2);
	 }
	}
	 class Test13
	 {
	 public static void main(String[] args) 
	{
		 Square r=new Square();
		System.out.println(r.area(5,4));
	}
}



//same fundaaaaa   (which method executes at runtime poly / dyna poly / dynamic binding / overridding?????)

//In the overridding....overriding of derived class method vt parent class method.....
//and replacing derived class method on parent class method,then executes parent class method ,
// which  is decided at run time polymorphisn(dyna poly/dyna binding).