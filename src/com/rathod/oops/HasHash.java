package com.rathod.oops;
//implmntng Hash Code.....
class HasHash 
{
	public int x;
	
	HasHash(int xVal)
	{
		x =xVal;
	}
	public boolean equals(Object o)
	{
		//HasHash h = new (HasHash)o;   //why not try.. Bcz there is no IS-A test in HasHash & Object 
	    //for any type of CAST IS-A test success is imp. then cast only..
		HasHash h = new HasHash();
		if (h.x == this.x)
	    {
			return true;
	    }else
		{
			return false;
		}

	}
	
	public int hashCode() //return same val for all instnc weather dey = or !. is still legal. 
	{
		return (x * 17);
	}
	
	public static void main(String[] args) 
	{

	//	System.out.println("Hello World!");
	}
}
//for details....scjp-552