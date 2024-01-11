package com.rathod.oops;

public class Department {
	private int age ;
	
	public Department( int age )
	{
		super();
		this.age = age;
	}
	
	public int hashCode()
	{
		return age;
	}
	public boolean equals( Object obj )
	{
		boolean flag = false;
		Department dmp = ( Department )obj;
		if( dmp.age == age )
			flag = true;
		return flag;
	}
}
