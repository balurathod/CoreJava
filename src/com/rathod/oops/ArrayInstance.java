package com.rathod.oops;
class ArrayInstance 
{
	public static void main(String[] args) 
	{
		int [] nums=new int[3];  
		if (nums instanceof Object)
		{
		System.out.println("An ARRAY is always an instance of Object " + nums[1]); //o/p-0 bcz by deflt val is 0
		System.out.println("An ARRAY is always an instance of Object " + nums[3]);//Err-ArrIndxOtOfBound
		}
	}
}
	