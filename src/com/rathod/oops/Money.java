package com.rathod.oops;
//8
public class Money
{
	private String name,country;
	
	public String getCountry()
	{
		return country;
	}
}
class Yen extends Money
{
	public String getCountry()
	{
		return super.country;
	}
	
}
class Euro extends Money
{
	public String getCountry(String timeZone)
	{
		return super.getCountry();
		
	}
}

//Ans-BE