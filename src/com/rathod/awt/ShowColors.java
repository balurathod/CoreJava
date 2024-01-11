package com.rathod.awt;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ShowColors extends JPanel
{
	private JButton changeColor;
	private Color color = Color.lightGray;

	public ShowColors()
	{
		setLayout( new FlowLayout() );
		changeColor = new JButton( "Change Color" );
		changeColor.addActionListener( new ActionListener() 
				{
				public void actionPerformed( ActionEvent e )
            				{
	color =JColorChooser.showDialog( ShowColors.this,"Vedisoft : Choose a color", color );
					if ( color == null )
						color = Color.lightGray;
					setBackground( color );
					repaint();
				}
				}     );
		add( changeColor );
	}

	public static void main(String args[])
	{
		JFrame f=new JFrame("Vedisoft : ShowColors");
		f.setContentPane(new ShowColors());
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
