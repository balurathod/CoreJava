package com.rathod.unsolved;
//Plain-old Anonymous inner class -flavor one.....
class Popcorn 
{
	public void pop()
	{
		System.out.println("popcorn");
	}
}
class Food
{ 
	Popcorn p=new Popcorn()
	{                        //anonymous class is started here...
		public void sizzle()
		{
			System.out.println("Anonymous sizzling popcorn");
		}
		public void pop()
		{
            System.out.println("anonymous  popcorn");
		}
	};//anonymous class is ended here...
	public void popIt()
	{
		p.pop();        //ok Popcorn class has a pop() method.
		//p.sizzle();     //not legal Popcorn does not have sizzle()

	}
	public static void main(String[] args) 
	{
		Food f=new Food();
		
		f.sizzle();
		f.pop();
	}
}
