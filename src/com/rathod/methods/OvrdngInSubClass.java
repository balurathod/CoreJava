package com.rathod.methods;
// in subclass also OVERLOADING is pocbl... 
class Ovrd 
{
	public void addSub()
	{
		System.out.println("In A ");
	}
		
}
class OvrdngInSubClass extends Ovrd
{
	public void add()
	{
		System.out.println("In B ");
	}

	public void add(int i)
	{
		System.out.println("In B vt int I = " + i);
	}

	public static void main(String[] args) 
	{
		Ovrd b = new OvrdngInSubClass();
		OvrdngInSubClass c=new OvrdngInSubClass();
		b.addSub();
		//c.add();
		c.add();
//		System.out.println("Hello World!");
	}
}
