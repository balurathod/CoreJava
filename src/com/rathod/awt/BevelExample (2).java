import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class BevelExample extends JPanel 
{
	BevelBorder bevel;
	EmptyBorder empty;
	JLabel label[] = new JLabel[4];

	public BevelExample() 
	{
		super(true);
		setLayout(new GridLayout(1, 4));
		bevel = new BevelBorder(BevelBorder.RAISED);
		empty = new EmptyBorder(5, 5, 5, 5);

		label[0] = new JLabel("Home");
		label[1] = new JLabel("Back");
		label[2] = new JLabel("Forward");
		label[3] = new JLabel("Stop");

		for (int i = 0; i < label.length; i++) 
		{
			label[i].setHorizontalAlignment(JLabel.CENTER);
			label[i].addMouseListener(new RolloverListener());
			label[i].setBorder(empty);
			add(label[i]);
		}
	}

	public static void main(String s[]) 
	{
		JFrame frame = new JFrame("Bevel Border");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 100);
		frame.setContentPane(new BevelExample());
		frame.setVisible(true);
	}

	class RolloverListener extends MouseAdapter 
	{
		public void mouseEntered(MouseEvent e) 
		{
			((JLabel)e.getComponent()).setBorder(bevel);
			repaint();
		}

		public void mouseExited(MouseEvent e) 
		{
			((JLabel)e.getComponent()).setBorder(empty);
			repaint();
		}

		public void mouseClicked(MouseEvent e) 
		{
			String text = ((JLabel)e.getComponent()).getText();
			System.out.println("You clicked " + text + "!");
		}
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