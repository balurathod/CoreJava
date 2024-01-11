import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyCheck extends JPanel implements ActionListener
{
	JCheckBox c1,c2,c3,c4;
	JRadioButton c5,c6,c7,c8;
	JLabel lbl1,lbl2;
	ButtonGroup fr;
	JTextArea ta;
	JButton btn;
	JScrollPane jsp;
	public  MyCheck()
	{
		setLayout(null);
		lbl1 = new JLabel("Vegetables");
		c1 = new JCheckBox("Lady Finger",true);
		c2 = new JCheckBox("Potato");
		c3 = new JCheckBox("Green Chilly");
		c4 = new JCheckBox("Ginger");
		lbl2 = new JLabel("Fruits");
		fr = new ButtonGroup();
		c5 = new JRadioButton("Mango");
		c6 = new JRadioButton("Apple");
		c7 = new JRadioButton("Banana");
		c8 = new JRadioButton("Grapes");
		ta = new JTextArea(5,30);
		btn= new JButton("Result");
		jsp = new JScrollPane(ta);
		fr.add(c5);
		fr.add(c6);
		fr.add(c7);
		fr.add(c8);

		btn.addActionListener(this);

		lbl1.setBounds(20,10,100,30);
		c1.setBounds(30,40,100,30);
		c2.setBounds(140,40,100,30);
		c3.setBounds(30,100,100,30);
		c4.setBounds(140,100,100,30);

		lbl2.setBounds(20,150,100,30);
		c5.setBounds(30,200,100,30);
		c6.setBounds(140,200,100,30);
		c7.setBounds(30,220,100,30);
		c8.setBounds(140,220,100,30);

		btn.setBounds(100,300,100,30);
		jsp.setBounds(20,350,400,100);

		add(lbl1);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(lbl2);
		add(c5);
		add(c6);
		add(c7);
		add(c8);
		add(btn);
		add(jsp);
	
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String str=new String();
		str = "Vegetables are :";
		if(c1.isSelected())
			str+="Lady Finger,";
		if(c2.isSelected())
			str+="Potato";
		if(c3.isSelected())
			str+="Green Chilly";
		if(c4.isSelected())
			str+="Ginger";
		str+="\n";
		str+="Fruit is :";

		if(c5.isSelected())
			str+="Mango";
		else if(c6.isSelected())
			str+="Apple";
		else if(c7.isSelected())
			str+="Banana";
		else 
			str+="Grapes";
		ta.setText(str);
	}
	public static void main(String args[])
	{
		JFrame f=new JFrame("Vedisoft : Radio Button and CheckBoxes");
		f.setContentPane(new MyCheck());
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
