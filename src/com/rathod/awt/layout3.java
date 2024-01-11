package com.rathod.awt;
import java.awt.*;
import java.applet.Applet;
public class Layout3 extends Applet
{
	Button btn1,btn2,btn3,btn4;
	TextArea ta;
	BorderLayout b;
	public void init()
	{
		b = new BorderLayout(10,20);
		setLayout(b);
		btn1= new Button("Top");
	btn2= new Button("Bottom");
	btn3= new Button("Left");
	btn4= new Button("Right");
	ta = new TextArea();
	add(btn1,"North");
	add(btn2,"South");
	add(btn3,"West");
	add(btn4,"East");
	add(ta,"Center");
	}
	public Insets getInsets()
	{
		return new Insets(25,25,25,25);
	}
}

/*
<applet code="Layout3.class" Height=300 width=300>
</applet> 
*/