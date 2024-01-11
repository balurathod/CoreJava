package com.rathod.oops;

import java.io.IOException;
import java.util.EmptyStackException;
import java.util.concurrent.ExecutionException;

class OvrdngSubClass extends OverrideMtds
{
	public void add() throws IOException
	{
		System.out.println("In OvrdngSubClass ");
	}

	public void add(int i)
	{
		System.out.println("In OvrdngSubClass vt int I = " + i);
	}
	
	public void addSub() throws ExecutionException
	{
		System.out.println("In OvrdngSubClass ");
	}

	public static void main(String[] args) throws Exception 
	{
		OverrideMtds b = new OvrdngSubClass();
		OvrdngSubClass c = new OvrdngSubClass();
		b.addSub();
		//b.add();
		c.addSub();
		c.add();
//		System.out.println("Hello World!");
	}
}
