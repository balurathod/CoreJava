package com.rathod.oops;
 class ClassConstructor
{
	private int counter=0;
	public static int getInstanceCount()
	{
	  return counter;
	}
	public ClassConstructor(){
		counter++;
       }
}