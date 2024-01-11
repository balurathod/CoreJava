package com.rathod.oops;
class DoubleTest
{
public final static void main(String[] args) 
	{
		double d=10.0/-0;
		if(d==Double.POSITIVE_INFINITY)        //o/p is (possitive infinity) but after compile 4 error...
		{
		System.out.println("Possitive infinity");
		}
		else 
		{	System.out.println("Negative infinity");}
	}
}
//run Possitive infinity 