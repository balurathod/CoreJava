package com.rathod.awt;
import java.awt.*;
import java.applet.Applet;
public class Layout1 extends Applet
{
	Button btn[];
	FlowLayout f;
	public void init()
	{
		btn =  new Button[5];
	f = new FlowLayout();
		f.setAlignment(FlowLayout.RIGHT	);
f.setHgap(60);
f.setVgap(60);
		setLayout(f);
	for(int i=0;i<btn.length;i++)
	{
	btn[i]=new Button("Button : " + (i + 1));
	add(btn[i]);
	
	}
	}
}
/*
<applet code="Layout1.class" Height=300 width=300>
</applet> 
*/