package com.rathod.awt;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class User1 extends Applet implements ActionListener
{
	Button btn1,btn2;
	public void init()
	{
	btn1 = new Button("One");
	btn2 = new Button("Two");
	
	btn1.setFont(new Font("Arial",Font.BOLD,20));
	btn1.setBackground(Color.red);
btn1.setForeground(Color.yellow);
	btn1.setActionCommand("1");

	btn1.addActionListener(this);
	btn2.addActionListener(this);
	
	add(btn1);
	add(btn2);
	}
	public void actionPerformed(ActionEvent ae)
	{
	showStatus(ae.getActionCommand());
	}
}
/*
<applet code="User1.class" height=300 width=400>
</applet>
*/
