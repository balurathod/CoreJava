package com.rathod.unsolved;
public class  Fabric
{
	public enum color
	{
		RED(0xff0000),GREEN(0x00ff00),BLUE(0x0000ff);
	}
	private final int rgb();
	color(int rgb)
	{
		this.rgb=rgb;
	}
	public int getRGB()
	{
		return rgb;
	};
	public static void main(String[] argv) 
	{
		//code here
		//B-Color treeColor=Color.GREEN;
		//F-if(Color.RED.ordinal()<Color.BLUE.ordinal())
		System.out.println("Hello World!");
	}
}
