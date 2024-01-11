package com.rathod.awt;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CardTest extends JPanel implements ActionListener
{
JButton b1,b2,b3,b4;
JPanel p1,p2;
CardLayout cl;
public CardTest()
{
	b1 = new JButton("First");
	b2 = new JButton("Next");
	b3 = new JButton("Previous");
	b4 = new JButton("Last");
	p1 = new JPanel();
	p2 = new JPanel();
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);

	cl = new CardLayout();
	p2.setLayout(cl);
	setLayout(new BorderLayout());		
p2.add(new SimpleJLabelExample(),"Card One");
p2.add(new AlignmentExample(),"Card Two");
p2.add(new MnemonicLabels(),"Card Three");
p2.add(new ImageLabelDemo(),"Card Four");
	

	p1.add(b1);
	p1.add(b2);
	p1.add(b3);
	p1.add(b4);

	add(p2,"Center");
	add(p1,"South");

}

public void actionPerformed(ActionEvent ae)
{
	String str = ae.getActionCommand();
	if(str.equals("First"))
	{
		cl.first(p2);
	}
	else if(str.equals("Next"))
	{
		cl.next(p2);
	}
	else if(str.equals("Previous"))
	{
		cl.previous(p2);
	}
	else if(str.equals("Last"))
	{
		cl.last(p2);
	}
}
	public static void main(String args[])
	{
		JFrame f=new JFrame("Card Layout Example:");
		f.setContentPane(new CardTest());
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

/* 
Vedisoft : Java - Module 1 "Desktop Technologies"


Vedisoft
Plot No. 173, Zone II, M.P. Nagar,
Bhopal.
Phone : 0755 - 6541546
Email : contact@vedisoft.com
Web : www.vedisoft.com
*/