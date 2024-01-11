package com.rathod.oops;
interface Bounceable extends Movable,Sperical//legal at a time intrfc can extends more than 1 intrfc. 
 {}
 class Ball implements Bounceable 
{
	public void bounce(){}
	public void setBounceFactor(int bf)
	{}
}
class BeachBall extends Ball
{
	public void bounce()
	{
		//BeachBall -specific bounce code
	}
	public void setBounceFactor(int bf)
	{
       //cleaver BeachBall -specific bounce code for setting a bounce factor....
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
