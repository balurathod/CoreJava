package com.rathod.unsolved;
class BoxAndWiden 
{
	static void go(Object o)
	{
		Byte b2 =  (Byte)o;    //ok it's Byte obj.2-Byte ref was widen to Object(Byte extends Object)
		System.out.println(b2);
	}
	public static void main(String[] args) 
	{
		byte b =5;
		go(b);         //can this byte turn into an Object? 3-go()got an Obj ref that actualy refer to Byte obj

	 //1- byte b was boxed to Byte
	//4-go() cast Obj ref back to a Byte ref.
	//5-go() print d Byte Val (5)
	}
}

/*
REMEMBER....

There was never obj of type Object in this scenario,Only an obj of type Byte!
means what...Object o =new Object() ; is it not possible.? 
*/