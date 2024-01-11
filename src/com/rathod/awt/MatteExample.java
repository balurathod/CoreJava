package com.rathod.awt;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class MatteExample extends JPanel 
{

	public MatteExample() 
	{
		super(true);
		this.setLayout(new GridLayout(1, 2, 5, 5));

		JLabel label1 = new JLabel("Matte Border");
		JLabel label2 = new JLabel("Matte Border (Icon)");

		label1.setHorizontalAlignment(JLabel.CENTER);
		label2.setHorizontalAlignment(JLabel.CENTER);

		Icon icon = new ImageIcon("plant.gif");
		MatteBorder matte = new MatteBorder(35, 35, 35, 35, Color.blue);
		MatteBorder matteicon = new MatteBorder(35, 35, 35, 35, icon);
		label1.setBorder(matte);
		label2.setBorder(matteicon);
		add(label1);
		add(label2);
	}

	public static void main(String s[]) 
	{
		JFrame frame = new JFrame("Matte Borders");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 200);
		frame.setContentPane(new MatteExample());
		frame.setVisible(true);
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