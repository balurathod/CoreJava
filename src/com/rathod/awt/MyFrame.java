package com.rathod.awt;
import java.awt.*;
import java.awt.event.*;
public class MyFrame extends Frame
{
	public MyFrame(String str)
	{
		super(str);
		show();
	setSize(new Dimension(300,300));
	addWindowListener(new W());
	}
	class W extends WindowAdapter
	{
	public void windowClosing(WindowEvent we)
	{
		dispose();
		System.exit(0);
	}
	}
	public static void main(String args[])
	{
MyFrame mf = new MyFrame("My Frame");
	}
}