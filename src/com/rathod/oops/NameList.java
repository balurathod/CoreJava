package com.rathod.oops;
import java.util.*;
public class NameList 
{
	private List names =new LinkedList();

	public synchronized void add(String name)
	{
		names.add(name);
	}
	public synchronized String removeFirst()
	{
		if (names.size() > 0)
		return (String) names.remove(0);
		else
			return null;
	}
	public static void main(String[] args) 
	{
	}
}

/*
it is thread Safe prog in scjp - 744
*/