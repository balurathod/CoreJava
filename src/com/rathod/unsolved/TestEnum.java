package com.rathod.unsolved;
enum Animals
{
	DOG("woof") , CAT("meow") , FISH("burble");
		String sound;
	
	Animals(String s)       //para constor..
	   {sound=s;}
}
class TestEnum
{
	static Animals a;      //a is ref for class Animals
	public static void main(String[] args) 
	{
		
		System.out.println(a.DOG.sound + " " + a.FISH.sound);
	}
      
}
//o/p-->?