import javax.swing.*;
import java.awt.*;
public class AlignmentExample  extends JPanel
{
	JLabel label1;
	JLabel label2;
	JLabel label3;

		public AlignmentExample()
	{
		setLayout(new GridLayout(3,1));

		label1= new JLabel("Bottom Right",SwingConstants.RIGHT);
		label2= new JLabel("Center Left",SwingConstants.LEFT);
		label3= new JLabel("Top Center",SwingConstants.CENTER);
		
		label1.setVerticalAlignment(SwingConstants.BOTTOM);
		label2.setVerticalAlignment(SwingConstants.CENTER);
		label3.setVerticalAlignment(SwingConstants.TOP);

		label1.setBorder(BorderFactory.createLineBorder(Color.black));
		label2.setBorder(BorderFactory.createLineBorder(Color.black));
		label3.setBorder(BorderFactory.createLineBorder(Color.black));

	
		add(label1);
		add(label2);
		add(label3);
	}

	public static void main(String args[])
	{
		JFrame f=new JFrame("AlignmentExample:");
		f.setContentPane(new AlignmentExample());
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