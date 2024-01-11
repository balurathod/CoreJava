package com.rathod.awt;
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
public class MyCheck extends Applet implements ActionListener
{
	Checkbox c1,c2,c3,c4,c5,c6,c7,c8;
	Label lbl1,lbl2;

	CheckboxGroup fr;
	TextArea ta;
	Button btn;
	public void init()
	{
	lbl1 = new Label("Vegetables");
c1 = new Checkbox("Lady Finger",true);
c2 = new Checkbox("Potato");
c3 = new Checkbox("Green Chilly");
c4 = new Checkbox("Ginger");
	lbl2 = new Label("Fruits");
	fr = new CheckboxGroup();
	c5 = new Checkbox("Mango",true,fr);
	c6 = new Checkbox("Apple",false,fr);
	c7 = new Checkbox("Banana",false,fr);
	c8 = new Checkbox("Grapes",false,fr);
	ta = new TextArea(5,30);
	btn= new Button("Result");
	btn.addActionListener(this);
	add(lbl1);
	add(c1);
	add(c2);
	add(c3);
	add(c4);
	add(lbl2);
	add(c5);
	add(c6);
	add(c7);
	add(c8);
	add(btn);
	add(ta);

	}
	public void actionPerformed(ActionEvent ae)
	{
	String str=new String();
	str = "Vegetables are :";
	if(c1.getState())
		str+="Lady Finger,";
	if(c2.getState())
		str+="Potato";
	if(c3.getState())
		str+="Green Chilly";
	if(c4.getState())
		str+="Ginger";
	str+="\n";
	str+="Fruit is :";
	if(c5.getState())
		str+="Mango";
	else if(c6.getState())
		str+="Apple";
	else if(c7.getState())
		str+="Banana";
	else 
		str+="Grapes";
	ta.setText(str);
	}
}
/* 
<applet code="MyCheck.class" width=300 height=300></applet>
*/