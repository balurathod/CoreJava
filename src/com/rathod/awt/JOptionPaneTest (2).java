import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JOptionPaneTest extends JPanel
{
	JButton b1,b2,b3;
	JPanel p;
	
	public JOptionPaneTest()
	{
		setLayout(new FlowLayout());
		p=new JPanel();

		b1 = new JButton("Message");
		b1.addActionListener(new A());
		b2 = new JButton("Input");
		b2.addActionListener(new B());
		b3 = new JButton("Confirm");
		b3.addActionListener(new C());


		p.add(b1);
		p.add(b2);
		p.add(b3);
		add(p);

	}
class A  implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			JOptionPane.showMessageDialog(p,"This is Message Dialog","Message",JOptionPane.PLAIN_MESSAGE);
		}
	}
class B  implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			String str = JOptionPane.showInputDialog(p,"Enter Contact to Find","Find",JOptionPane.PLAIN_MESSAGE);
			if (str == null)
				str = "Friend";
			JOptionPane.showMessageDialog(p,"Hello : " + str,"Message",JOptionPane.PLAIN_MESSAGE);
		}
	}
class C  implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			int a= JOptionPane.showConfirmDialog(p,"This is Confirm Dialog","Message",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
			switch(a)
			{
				case JOptionPane.YES_OPTION :  JOptionPane.showMessageDialog(p,"You Selected  Yes","Message",JOptionPane.PLAIN_MESSAGE);
				break;
				case JOptionPane.NO_OPTION :  JOptionPane.showMessageDialog(p,"You Selected  No","Message",JOptionPane.PLAIN_MESSAGE);
				break;
				case JOptionPane.CANCEL_OPTION :  JOptionPane.showMessageDialog(p,"You Selected  Cancle","Message",JOptionPane.PLAIN_MESSAGE);
				break;
				case JOptionPane.CLOSED_OPTION :  JOptionPane.showMessageDialog(p,"You Selected  Closed","Message",JOptionPane.PLAIN_MESSAGE);
				break;
			}

		}
	}

	public static void main(String args[])
	{
		JFrame f=new JFrame("JOptionPaneTest:");
		f.setContentPane(new JOptionPaneTest());
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
