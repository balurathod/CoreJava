package com.rathod.oops;
//50
class Plant 
{
	private String name;
	
	public Plant(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	//D-public Plant()
	//   {this("fern");}
}
public class Tree extends Plant
{
	public void growFruit(){}

	public void dropLeaves(){}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac Tree.java
Tree.java:10: cannot find symbol
symbol  : constructor Plant()
location: class Plant
public class Tree extends Plant
       ^
1 error
*/