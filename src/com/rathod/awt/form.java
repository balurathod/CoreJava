package com.rathod.awt;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class Form extends Frame implements ActionListener
{
	Label l1,l2,l3,l4,l5,l6,l7,l8;
	TextField t1,t2,t3,t4;
	Checkbox c1,c2,c3,c4,c5,c6;
	CheckboxGroup cbg;
	Choice chc1;
	List ls1;
	Button b1;
	TextArea ta1;
	Panel p1,p2,p3;
	public form()
	{
	setLayout(new BorderLayout());
	p1 = new Panel();
	p1.setLayout(new FlowLayout());
	l1 = new Label("Form");
	p1.add(l1,"North");
	
	p2 = new Panel();
	p2.setLayout(new GridLayout(12,2));
	l2 = new Label("Name");
	t1 = new TextField();
	p2.add(l2);
	p2.add(t1);
	l3 = new Label("Address");
	t2 = new TextField();
	t3 = new TextField();
	p2.add(l3);
	p2.add(t2);
	p2.add(new Label(" "));
	p2.add(t3);
	l4 = new Label("City");
	t4 = new TextField();
	p2.add(l4);
	p2.add(t4);
	
	l5 = new Label("Sex");
	p2.add(l5);
	p2.add(new Label(" "));
	cbg = new CheckboxGroup();
	c1 = new Checkbox("Male",true,cbg);
	c2 = new Checkbox("Female",false,cbg);
	p2.add(c1);
	p2.add(c2);
	
	l6 = new Label("Hobbies");
	p2.add(l6);
	p2.add(new Label(" "));
	c3 = new Checkbox("Reading");
	c4 = new Checkbox("Gardening");
	c5 = new Checkbox("Music");
	c6 = new Checkbox("Movies");
	p2.add(c3);
	p2.add(c4);
	p2.add(c5);
	p2.add(c6);
	
	l7 = new Label("Qualification");
	p2.add(l7);
	chc1 = new Choice();
	chc1.addItem("M.C.A");
	chc1.addItem("M.B.A");
	chc1.addItem("B.E.");
	chc1.addItem("Graduate");
	chc1.addItem("P.G");
	p2.add(chc1);
	l8 = new Label("Software");
	p2.add(l8);
	ls1 = new List(10,true);
	ls1.addItem("C");
	ls1.addItem("C++");
	ls1.addItem("VC++");
	ls1.addItem("VB");
	ls1.addItem("Java");
	ls1.addItem("VJ++");
	p2.add(ls1);
	b1 = new Button("Submit");
	b1.addActionListener(this);
	p2.add(b1);
	
	p3 = new Panel();
	p3.setLayout(new FlowLayout());	
	ta1 = new TextArea(3,60);
	p3.add(ta1);
	
	add(p1,"North");
	add(p2,"Center");
	add(p3,"South");
	}
	public void actionPerformed(ActionEvent ae)
	{
	String str = new String();
	str = "Name  :" + t1.getText()+ "\n";
	str += "Address : " + t2.getText() + "\n";
	str += t3.getText()+"\n";	
	str += "City : " + t4.getText()+ "\n"; 
	if(c1.getState())
		str += "Sex : Male" + "\n";
	else
		str += "Sex : Female" + "\n";	
	str += "Hobbies : ";
	if(c3.getState())
		str += "Reading, " ;
	if(c4.getState())
		str += "Gardening, " ;
	 if(c5.getState())
		str += "Music, " ;
	if(c6.getState())
		str += "Movies " ;
	str += "\n";
	str += "Qualification : " + chc1.getSelectedItem()+ "\n";
	str += "Software : ";
	ta1.setText(str);
	String a[] = ls1.getSelectedItems();
	
	for(int i =0 ; i < a.length ; i++)
		ta1.append( a[i] + " ,");
	}
	public Insets getInsets()
	{
	return new Insets(10,50,10,50);
	}
	public static void main(String args[])
	{
		form f = new form();
		f.setVisible(true);
		f.setSize(300,300);
	}
}
/*
<html>
<Applet code="Form.class" height=300 width=300>
</Applet>
</html> 
*/
