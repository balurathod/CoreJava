package com.rathod.oops;
class GameShape 
{                                     //common use of inheritance......
	public void displayShape()
	{
		System.out.println("Displaying shape");
	}
     //more code....
}
class PlayerPiece extends GameShape
{
	public  void movePiece()              //generic functionality-display()
	{
		System.out.println("moving game piece");
	}
	//more code...
	}
	class PlayerQuantity extends PlayerPiece 
	{
		//if extnd GameShape here u cant  inherit PlayerPiece class

	public  void measurePlayer() 
	{
		System.out.println("measuring game player");
	}
}
	public class TestShape1
	{
		public static void main(String[] args)
		{
			//GameShape shape=new  GameShape();
			//PlayerPiece  shape=new  PlayerPiece();//error=shape allready define
			//PlayerPiece  shape1=new  PlayerPiece();//bcz ref is unique... 
            PlayerQuantity shape=new PlayerQuantity();
			shape.displayShape();
			shape.movePiece();
			shape.measurePlayer();
		}

	}

/*    NOTE
           -> so all sublcass of GameShape class  r capable of more generic subclasses
			    no need of rewrite display() code in each subclass...
           ->if u extends GameShape then u definatly got displayShape() method,
		        so i know i can call it....(in any subclass of GameShape).


	conclusion---
	         1-superclass obj does not access subclass methods
			 2-subclass obj access superclass as well as subclass method also.
			 3-each classes can creates its own obj indivisualy...
			 4-extend each(10000000) class in chain only
        */