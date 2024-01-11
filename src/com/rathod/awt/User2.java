package com.rathod.awt;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class User2 extends Applet implements ActionListener
{
	Label lbl1,lbl2,lbl3;
	Button btn;
	TextField tf1,tf2,tf3;
	public void init()
	{
	lbl1 = new Label("Number 1:");
	lbl2 = new Label("Number 2:");
	lbl3 = new Label("Result");
	btn = new Button("Sum");
	btn.addActionListener(this);
	tf1 = new TextField();
	tf1.setEchoChar('*');
	tf2 = new TextField();
	tf3 = new TextField();
	add(lbl1);
	add(tf1);
	add(lbl2);
	add(tf2);
	add(btn);
	add(lbl3);
	add(tf3);

	}
	public void paint(Graphics g)
	{
	lbl1.setBounds(10,10,100,25);
	lbl2.setBounds(10,40,100,25);
	lbl3.setBounds(10,110,100,25);

	tf1.setBounds(130,10,100,25);
	tf2.setBounds(130,40,100,25);
	tf3.setBounds(130,110,100,25);
	btn.setBounds(10,70,100,25);
	}
	public void actionPerformed(ActionEvent ae)
	{
		float num = Float.parseFloat(tf1.getText());	
		float num1 = Float.parseFloat(tf2.getText());	
	float num2 = num + num1;
	Float i = new Float(num2);
	tf3.setText(i.toString());
	}
}
/*
<applet code="User2.class" height=300 width=400>
</applet>
*/
