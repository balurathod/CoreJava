package com.rathod.awt;
import java.awt.*;
import javax.swing.*;
public class ImageLabelDemo extends JPanel
{
	JLabel[] labels;

	public ImageLabelDemo()
	{
		setLayout(new FlowLayout(FlowLayout.CENTER,3,3));

		labels = new  JLabel[9]; 			
		labels[0] = makeLabel(JLabel.TOP,JLabel.CENTER);
		labels[1] = makeLabel(JLabel.TOP,JLabel.CENTER);
		labels[2] = makeLabel(JLabel.TOP,JLabel.RIGHT);
		labels[3] = makeLabel(JLabel.CENTER,JLabel.LEFT);
		labels[4] = makeLabel(JLabel.CENTER,JLabel.CENTER);
		labels[5] = makeLabel(JLabel.CENTER,JLabel.RIGHT);
		labels[6] = makeLabel(JLabel.BOTTOM,JLabel.LEFT);
		labels[7] = makeLabel(JLabel.BOTTOM,JLabel.CENTER);
		labels[8] = makeLabel(JLabel.BOTTOM,JLabel.RIGHT);

		labels[0].setEnabled(false);
		
		labels[1].setDisabledIcon(new ImageIcon("images/pointed.gif"));
		labels[1].setEnabled(false);

		labels[2].setIconTextGap(15);
		labels[3].setIconTextGap(0);

		for(int i=0;i<9;i++)
		add(labels[i]);
	}
	protected static JLabel makeLabel(int vert,int horiz)
	{
		Icon icon=  new ImageIcon("images/vedisoft.gif");
		JLabel l = new JLabel("Java Module 1",icon,SwingConstants.CENTER);
		l.setBackground(Color.white);
		l.setVerticalTextPosition(vert);
		l.setHorizontalTextPosition(horiz);
		l.setBorder(BorderFactory.createLineBorder(Color.black));
		return l;
	}

	public static void main(String args[])
	{
		JFrame f=new JFrame("Vedisoft :  ImageLabelDemo");
		f.setContentPane(new ImageLabelDemo());
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