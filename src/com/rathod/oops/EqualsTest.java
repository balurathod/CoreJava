package com.rathod.oops;
public class EqualsTest 
{
	public static void main(String[] args) 
	{
		Moof one = new Moof(8);
		Moof two = new Moof(8);

		if (one.equals(two))
		{
			System.out.println("One & Two r = " );
		}
	}
}

class Moof {
	private int moofValue;
	
	Moof(int val)
	{
		moofValue  =  val;
	}
	
	public int getMoofValue()
	{
		return moofValue;
	}

	public boolean equals(Object o)
	{
		if((o instanceof Moof) && ((Moof)o).getMoofValue() == this.moofValue))
		{
			return true;
		}else 
		{
			return false;
		}
	}
}
//not compile bcoz here is no IS-A in Moof & Obj . for more scjp-546. 
//conclusion--take care of equals().