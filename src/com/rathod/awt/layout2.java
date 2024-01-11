package com.rathod.awt;
import java.awt.*;
import java.applet.Applet;
public class Layout2 extends Applet
{
	Button btn[];
	GridLayout g;
	public void init()
	{
		g = new GridLayout();
		g.setRows(5);
		g.setColumns(6);
		g.setHgap(10);
		g.setVgap(15);
	System.out.println(g.getHgap());
	System.out.println(g.getVgap());
		setLayout(g);
		btn= new Button[30];
	for(int i = 0 ; i < btn.length;i++)
		{
btn[i] = new Button("Button : " + (i+1));
	add(btn[i]);
		}
	}
	public Insets getInsets()
	{
	return new Insets(25,50,75,100);
	}
}

/*
<applet code="Layout2.class" Height=300 width=300>
</applet> 
*/