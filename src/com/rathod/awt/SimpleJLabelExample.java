package com.rathod.awt;
import javax.swing.*;
public class SimpleJLabelExample extends JPanel
{
	JLabel label;
	public SimpleJLabelExample()
	{
	label = new JLabel("A Very Simple Text Label");
	add(label);
	}

	public static void main(String args[])
	{
	JFrame f=new JFrame("Vedisoft : SimpleJLabelExample");
	f.setContentPane(new SimpleJLabelExample());
	f.pack();
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