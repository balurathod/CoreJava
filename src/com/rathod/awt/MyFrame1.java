package com.rathod.awt;
import java.awt.*;
import java.awt.event.*;
class MyFrame1 extends Frame
{
	public MyFrame1(String str)
	{
	super(str);
	setVisible(true);
	setSize(300,300);
	addWindowListener(new W());
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
MyFrame1 m = new MyFrame1("My Frame");
	}
}