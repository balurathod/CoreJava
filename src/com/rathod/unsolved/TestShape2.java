package com.rathod.unsolved;
class GameShape 
{                                                  //common use of inheritance......
	public void displayShape()
	{
		System.out.println("Displaying shape");
	}
     //more code....
}
class PlayerPiece extends GameShape
{
	public  void movePiece()                         //generic functionality-display()
	{
		System.out.println("moving game piece");
	}
	//more code...
	}
	class TilePiece extends GameShape  //if extnd GameShape here u cant  inherit PlayerPiece
	                                                                //  class
{
	public  void getAdjacent() 
	{
		System.out.println("Getting adjacent Tiles");
	}
}
	public class TestShape2
	{
		public static void main(String[] args)
		{
			PlayerPiece  player=new  PlayerPiece();
			TilePiece tile=new TilePiece();
			doShapes(player);
			doShapes(tile);
		}
			public static void doShapes(GameShape shape)
			{
				shape.displayShape();                   //why doShapes() is declared vt GameShape only?
				}
		}
