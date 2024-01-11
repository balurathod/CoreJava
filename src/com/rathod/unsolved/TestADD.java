package com.rathod.unsolved;
class Adder 
{
	public int addThem(int x , int y)
	{
		return x+y;    //only string val u can return......
	}
	public double addThem(double x , double y)
	{
		return x+y;
	}
}
public class TestAdder
{

	public static void main(String[] args) 
	{
		Adder a=new Adder();
		int b=27;
		int c=3;
		int result=a.addThem(23,7);
		double doubleResult=a.addThem(22.5,9.3);
		System.out.println(" hi...guess,....");
   		System.out.println("Int add= " + x+y + "double add= " + x+y);
 
	}
}
