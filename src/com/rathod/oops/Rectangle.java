package com.rathod.oops;
class Rectangle                      //oldscjp\exam2\Rectangle.java
{
	public int area(int length , int width)
	{
		return length*width;
	}
}
class RectTest
{
	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle();
		r.area(5,8);
		System.out.println(r );
	}
}


//o/p-->Rectangle@1eed786   

//Why?
// r is a ref of class Rectangle.it contain a unique addrs i.e.hashcode for itself.