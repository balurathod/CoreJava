package com.rathod.awt;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Tool extends JPanel implements ActionListener,ItemListener
{
	JButton b1,b2,b3;
	JComboBox jcb;

	Tool()
	{
		addtool();                
	}                

	public void addtool()
	{
		ImageIcon i = new ImageIcon("callout.jpg");
		ImageIcon ii = new ImageIcon("warning.gif");
		JToolBar tb = new JToolBar();
		setLayout(new BorderLayout());
		add(tb,"South");
               
		b1 = new JButton("One");
		b1.addActionListener(this);
		b1.setToolTipText("This is Button One");
		tb.add(b1);
		tb.addSeparator();
		b2 = new JButton(i);
		b2.addActionListener(this);
		tb.add(b2);
		tb.addSeparator();
		b3 = new JButton(ii);
		b3.addActionListener(this);
		tb.add(b3);
		tb.addSeparator();
		jcb = new JComboBox();
		jcb.addItem("This is Item 1");
		jcb.addItem("This is Item 2");
		jcb.addItem("This is Item 3");
		jcb.addItem("This is Item 4");
		jcb.addItemListener(this);
		tb.add(jcb);
	}

	public void itemStateChanged(ItemEvent ie)
	{

		if(ie.getStateChange() == ItemEvent.SELECTED)
		JOptionPane.showMessageDialog(this,"This is " + (String) ie.getItem());
               
	}

	public void actionPerformed(ActionEvent e)
	{
		JOptionPane.showMessageDialog(this,"This is " + e.getActionCommand());
	}
public static void main(String args[])
	{
		JFrame f=new JFrame("Tool:");
		f.setContentPane(new Tool());
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