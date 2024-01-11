import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CardTest extends JPanel
{
JButton b1,b2,b3,b4;
JPanel p1,p2;
CardLayout cl;
/* public CardTest()
{

	b1 = new JButton("First");
	b2 = new JButton("Next");
	b3 = new JButton("Previous");
	b4 = new JButton("Last");
	p1 = new JPanel();
	p2 = new JPanel();
	cl = new CardLayout();

	p2.setLayout(cl);
	p1.setLayout(new FlowLayout());
	setLayout(new BorderLayout());		

	p2.add(new SimpleJLabelExample());
	p2.add(new AlignmentExample());
	p2.add(new MnemonicLabels());
	p2.add(new ImageLabelDemo());
	

	p1.add(b1);
	p1.add(b2);
	p1.add(b3);
	p1.add(b4);


	add(p2,"Center");
	add(p1,"South");


}

*/
	public static void main(String args[])
	{
JFrame f=new JFrame("Card Layout Example:");
	System.out.println("REached HERE");
//		f.setContentPane(new CardTest());
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