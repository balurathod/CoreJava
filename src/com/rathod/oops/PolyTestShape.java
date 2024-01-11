package com.rathod.oops;
class GameShape 
{
	//common use of polymorphism......
	
	public void displayShape()
	{
		System.out.println("Displaying shape");
	}
     //more code....
}
interface Animatable
{
	public void animate();
	
}
class PlayerPiece extends GameShape implements Animatable 
                           //IS-A test for both GameShape & Animatable
{
	public  void movePiece()             //generic functionality-display()
	{
		System.out.println("moving game piece");
	}
	public void animate()
	{
		System.out.println("Animating.....");
	}
}
public class PolyTestShape
	{
		public static void main(String[] args)
		{
			PlayerPiece  player=new  PlayerPiece();//error=shape allready define
			/*Object o=player;
			GameShape shape = player;
			Animitable mover = player; legal declaration, see discriprtions below*/
			
			player.displayShape();
			player.movePiece();
			player.animate();
		}

	}





	/*polymorphism..... (v  v  v imp)

	         IS-A test for both GameShape class & Animatable interface
			 so PlayerPiece class can be treated as polymorphicaly as one of 
			 4-things at any given time,depending on declared type of ref variable.
                       1-An Object   (since any obj inherits from Object)
					   2-A Gameshape  (since PlayerPiece extends from GameShape)
					   3-A PlayerPiece (since i.e. what it really is)
					   4-Animatable      (since PlayerPiece implmnts Animitable)

            
			[Polymorphic method invocation apply only to instance methods.
			  u can always refer to an obj with a more general ref variable type
			  (a super class or interface),but at runtime,the only things that r 
			  dynamically selected based on the actual obj(rather than ref type)
			  r instance methods.Not static methods .Not variables.only overriden 
			  instance methods r dynamically invoked based on the real objects type]
			  
			  
			  
			  */