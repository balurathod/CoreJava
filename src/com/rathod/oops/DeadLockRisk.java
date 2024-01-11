package com.rathod.oops;
public class DeadLockRisk 
{
	private static class Resource
	{
		public int value;
	}
    private Resource resourceA  = new Resource();
    private Resource resourceB  = new Resource();

    public int read()
	{
		synchronized(resourceA)
		{//may Deadlock here
			synchronized(resourceB)
		     {
               return resourceB.value + resourceA.value; 
			 }
		}
	}
	public void write(int a , int b)
	{
		synchronized(resourceB)
		{//may Deadlock here
			synchronized(resourceA)
		     {
			   resourceA.value = a;
               resourceB.value = b; 
			 }
		}

	}
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
	}
}
