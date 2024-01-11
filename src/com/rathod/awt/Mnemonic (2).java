import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Mnemonic  extends JPanel
{
	private JPanel buttonPanel = new JPanel();

	public Mnemonic()
	{
		setLayout(new BorderLayout());
		buttonPanel.setLayout(new GridLayout(1,4,4,4));

		addButton("Sports",new ImageIcon("images/d1.gif"));
		addButton("Music",new ImageIcon("images/d2.gif"));
		addButton("Travel",new ImageIcon("images/d3.gif"));
		addButton("Art",new ImageIcon("images/d4.gif"));

		add(new JLabel("Select An Activity"),BorderLayout.NORTH);
		add(buttonPanel,BorderLayout.CENTER);

	}
	public void addButton(String label,Icon icon)
	{
		final char key = label.charAt(0);
		JButton button= new JButton(label,icon);
		button.setMnemonic(key);
		button.setVerticalTextPosition(SwingConstants.BOTTOM);
		button.setHorizontalTextPosition(SwingConstants.CENTER);
		buttonPanel.add(button);

		
	}

	public static void main(String args[])
	{
		JFrame f=new JFrame("Mnemonic:");
		f.setContentPane(new Mnemonic());
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