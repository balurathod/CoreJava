package com.rathod.awt;
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
public class MyButton extends Applet implements ActionListener
{
	Button btn1,btn2;
	public void init()
	{
	btn1 = new Button("One");
	btn2 = new Button();
	btn2.setLabel("Two");
btn1.setBackground(Color.red);
btn2.setBackground(Color.yellow);
btn1.setForeground(Color.yellow);
btn2.setForeground(Color.red);
btn1.setFont(new Font("Arial",Font.BOLD,30));
btn1.setActionCommand("1");

btn1.addActionListener(this);
btn2.addActionListener(this);

	add(btn1);
	add(btn2);

	}
public void paint(Graphics g)
{
	btn1.setBounds(10,10,100,25);
}
public void actionPerformed(ActionEvent ae)
{
String str = ae.getActionCommand();
showStatus("This is :" + str);
}
}
/*
<applet code="MyButton.class" width=300 height=300>
</applet>
*/