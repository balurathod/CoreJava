package com.rathod.awt;
import java.awt.*;
import javax.swing.*;
public class FancyButtonImp extends JPanel
{
	FancyButton b1,b2; 

	public FancyButtonImp()
	{

	b1= new FancyButton(new ImageIcon("images/d1.gif"),new ImageIcon("images/d2.gif"),new ImageIcon("images/d3.gif"));
	b2 = new FancyButton(new ImageIcon("images/a1.gif"),new ImageIcon("images/a2.gif"),new ImageIcon("images/a3.gif"));
	
	add(b1);
	add(b2);
	}

	public static void main(String args[])
	{

	JFrame f=new JFrame("Vedisoft : FancyButton Implementation");
	f.setContentPane(new FancyButtonImp());
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