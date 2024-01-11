package com.rathod.oops;
// interface Serializable{} no need of define it.
class SaveMe implements Serializable //bt not came in action
{
	 transient int x;   //it is not effected in compl & run
	int y;
	SaveMe(int xVal , int yVal)
	{
		x = xVal;
		y = yVal;
	}
	public int hashCade()
	{
		return(x ^ y);
	}
	public boolean equals(Object o)
	{
		SaveMe test = (SaveMe)o;
		if (test.y == y && test.x == x)     //legal but not correct why? x is transient & transient var never serialize
		{
			return true;

		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
