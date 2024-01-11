package com.rathod.oops;
//21
public abstract class Shape1 
{
	int x;
	int y;
	
	public abstract void draw() ;
	public void setAnchor(int x,int y)
		{
		this.x=x;
		this.y=y;
	}
}
//Shape s=new Circle();
//s.setAnchor(10,10);  s.draw();