package com.rathod.unsolved;
//100
import java.io.*;
class Food implements Serializable
 {	int good=3;
 }
class Fruit extends Food
{
	int juice=5;
    public void  serializeBanana()
    {}

}
public class Banana extends Fruit
{
	int yellow=4;
    public Banana deserializeBanana()      //No serialised -desearialised in this prog
    {
		return new Banana();
	}
	public static void main(String[] args) 
	{
		Banana b=new Banana();
		Banana b2=new Banana();
		b.serializeBanana();
		b2=b.deserializeBanana();
		System.out.println("restore"+b2.yellow+b2.juice+b2.good);
	}
}
