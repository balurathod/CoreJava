package com.rathod.unsolved;
//101
import java.io.*;
class Food 
	{
   Food()
    {System.out.print("1");} }

class Fruit extends Food implements Serializable
    {
		Fruit ()
			{System.out.print("2");}//class wise Food & Fruit constor excuted....
       // Food(){}     //once again executed in Fruit class due to inheritance.
public void  serializeBanana2()
 {}
public void  deserializeBanana2()
 {}
}
public class Banana2 extends Fruit
{
	int size=42;
	public static void main(String[] args) 
	{
		Banana2 b=new Banana2();
		b.serializeBanana2();
		b.deserializeBanana2();
		System.out.println("  restored "+b.size+" ");
	}
}
//o/p-->121 restored 42

//But op is 12 restored 42  (according to JVM) why?