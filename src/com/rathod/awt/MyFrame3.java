package com.rathod.awt;
import java.awt.*;
import java.awt.event.*;
class MyFrame3 
{
	Frame mf;
	public MyFrame3(String str)
	{
	mf  = new Frame(str);
	mf.setVisible(true);
	mf.setSize(300,300);
	mf.addWindowListener(new W());
	}
	class W extends WindowAdapter
	{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
	}
public static void main(String args[])
	{
MyFrame3 m = new MyFrame3("My Frame");
	}
}