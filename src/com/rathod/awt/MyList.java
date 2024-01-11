package com.rathod.awt;
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
public class MyList extends Applet 
implements ActionListener
{
	Choice ls;
	TextField tf;
	Button btn1,btn2;
	Label lbl;
	public void init()
	{
		ls = new Choice();
		tf = new TextField(25);
	btn1 = new Button("Add");
	btn2 = new Button("Remove");
	lbl = new Label("Count is : 0");
	btn1.addActionListener(this);
	btn2.addActionListener(this);
	add(ls);
	add(tf);
	add(btn1);
	add(btn2);
	add(lbl);
	
	}
public void actionPerformed(ActionEvent ae)
	{
String str = ae.getActionCommand();
		if(str.equals("Add"))
		{
if(tf.getText().trim().length()>0)
	{
	
	ls.add(tf.getText());
	tf.setText("");
lbl.setText("Count is :" + ls.getItemCount());
	}
		}
		else
		{
	int x = ls.getSelectedIndex();
	if(x!=-1)
	{
		ls.remove(x);
lbl.setText("Count is :" + ls.getItemCount());
}
		}
	
	}
}
/* 
<applet code="MyList.class" width=300 height=300></applet>
*/




