package com.rathod.awt;
import java.awt.*;
import java.awt.event.*;
public class MyFrame2 implements ActionListener
{
	Frame mf;
	MenuBar mb;
	Menu m1,m2,m3,m4;
	MenuItem m11,m31,m32,m33;
	CheckboxMenuItem m41,m42,m43;
	public MyFrame2(String str)
	{
		mf = new Frame(str);
		mf.show();
		mf.setSize(300,300);
		mf.addWindowListener(new W());
		addMenu();
	}
	public void addMenu()
	{
		mb = new MenuBar();
		m1 = new Menu("File");
		m2 = new Menu("Color");
		m3 = new Menu("Background");
		m4 = new Menu("Foreground");
		m11 = new MenuItem("Exit");
m31 = new MenuItem("Red");
m32 = new MenuItem("Green");
m33 = new MenuItem("Blue");
m31.addActionListener(this);
m32.addActionListener(this);
m33.addActionListener(this);
m41 = new CheckboxMenuItem("Yellow");
m42 = new CheckboxMenuItem("Cyan");
m43 = new CheckboxMenuItem("Magenta");

	m1.add(m11);

	m2.add(m3);
	m2.add(m4);

	m3.add(m31);
	m3.add(m32);
	m3.add(m33);

	m4.add(m41);
	m4.add(m42);
	m4.add(m43);

	mb.add(m1);
	mb.add(m2);
	mf.setMenuBar(mb);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		if(str=="Red")
	mf.setBackground(Color.red);
		else if(str=="Green")
	mf.setBackground(Color.green);
		else if(str=="Blue")
	mf.setBackground(Color.blue);
	}
	class W extends WindowAdapter
	{
		public void windowClosing(WindowEvent we)
	{
		mf.dispose();
		System.exit(0);
	}
	}
	public static void main(String args[])
	{
		MyFrame2 mf = new MyFrame2("Frame One");
	}
	}
