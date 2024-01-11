import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
public class MyFrame extends JPanel
{

	GridLayout g;
	public MyFrame()
	{
		g = new GridLayout(4,3,10,10);
		setLayout(g);
		JButton btn1 = new JButton("Bevel Raised");
		btn1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		add(btn1);

		JButton btn2 = new JButton("Bevel Raised");
		btn2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.red,Color.green));
		add(btn2);

		JButton btn3 = new JButton("Bevel Lowered");
	btn3.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED,Color.red,Color.green,Color.yellow,Color.magenta));
		add(btn3);

		JButton btn4 = new JButton("Empty Border");
		btn4.setBorder(BorderFactory.createEmptyBorder());
		add(btn4);


		JButton btn5 = new JButton("Line Border");
		btn5.setBorder(BorderFactory.createLineBorder(Color.red));
		add(btn5);


		JButton btn6 = new JButton("Line Border");
		btn6.setBorder(BorderFactory.createLineBorder(Color.red,10));
		add(btn6);


		JButton btn7 = new JButton("Etched Border");
		btn7.setBorder(BorderFactory.createEtchedBorder());
		add(btn7);

		JButton btn8 = new JButton("Matte Border");
		btn8.setBorder(BorderFactory.createMatteBorder(5,3,10,15,Color.red));
		add(btn8);

		JButton btn9 = new JButton("Title Border");
		btn9.setBorder(BorderFactory.createTitledBorder("My Title"));
		add(btn9);


		JButton btn10 = new JButton("Matte Border");
		btn10.setBorder(BorderFactory.createMatteBorder(30,30,30,30,new ImageIcon("images/Plant.gif")));
		add(btn10);

		JButton btn11 = new JButton("Matte Border");
		btn11.setBorder(BorderFactory.createMatteBorder(5,3,10,15,new ImageIcon("images/Plant.gif")));
		add(btn11);

		Border b = BorderFactory.createMatteBorder(5,3,10,15,new ImageIcon("images/Plant.gif")); 
		Border b1= BorderFactory.createBevelBorder(BevelBorder.RAISED);

		JButton btn12 = new JButton("Compound Border");
		btn12.setBorder(BorderFactory.createCompoundBorder(b1,b));
		add(btn12);

	}

	public Insets getInsets()
	{
		return new Insets(40,40,20,20);
	}
	public static void main(String args[])
	{
		JFrame f=new JFrame("Vedisoft : BorderFactory Implementation");
		f.setContentPane(new MyFrame());
		f.setSize(700,500);
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