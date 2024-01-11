import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class MyPanel extends JPanel
{

	GridLayout g;
	Container con;
	
	public MyPanel()
	{
		g = new GridLayout(5,5,10,10);
		setLay
JButton btn0 = new JButton("Bevel Raised");
btn0.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		con.add(btn0);


JButton btn = new JButton("Bevel Raised");
btn.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.red,Color.green));
		con.add(btn);
	JButton btn1 = new JButton("Bevel Lowered");
btn1.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED,Color.red,Color.green,Color.yellow,Color.magenta));
	con.add(btn1);

	JButton btn2 = new JButton("Empty Border");
btn2.setBorder(BorderFactory.createEmptyBorder());
		con.add(btn2);


	JButton btn3 = new JButton("Line Border");
btn3.setBorder(BorderFactory.createLineBorder(Color.red));
		con.add(btn3);



	JButton btn4 = new JButton("Line Border");
btn4.setBorder(BorderFactory.createLineBorder(Color.red,10));
		con.add(btn4);


	JButton btn5 = new JButton("Etched Border");
btn5.setBorder(BorderFactory.createEtchedBorder());
		con.add(btn5);



	JButton btn6 = new JButton("Title Border");
btn6.setBorder(BorderFactory.createMatteBorder(5,3,10,15,Color.red));
		con.add(btn6);

JButton btn7 = new JButton("Title Border");
btn7.setBorder(BorderFactory.createTitledBorder("My Title"));
		con.add(btn7);


	JButton btn8 = new JButton("Matte Border");
btn8.setBorder(BorderFactory.createMatteBorder(30,30,30,30,new ImageIcon("Plant.gif")));
		con.add(btn8);

	JButton btn9 = new JButton("Matte Border");
btn9.setBorder(BorderFactory.createMatteBorder(5,3,10,15,new ImageIcon("Plant.gif")));
		con.add(btn9);

 Border b = BorderFactory.createMatteBorder(5,3,10,15,new ImageIcon("Plant.gif")); 
/*Border b1= BorderFactory.createLineBorder(Color.red); */
Border b1= BorderFactory.createBevelBorder(BevelBorder.RAISED);

	JButton btn10 = new JButton("Compound Border");
btn10.setBorder(BorderFactory.createCompoundBorder(b1,b));
		con.add(btn10);

		setVisible(true);
		pack();
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public Insets getInsets()
	{
		return new Insets(40,40,20,20);
	}
	public static void main(String args[])
	{
		MyFrame mf = new MyFrame("Border Implementation");
	}
}