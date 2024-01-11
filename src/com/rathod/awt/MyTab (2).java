import java.awt.*;
import javax.swing.*;
public class MyTab extends JPanel
{
	JTabbedPane jtb;
	public MyTab()
	{
		setLayout(new BorderLayout());
		jtb = new JTabbedPane();
jtb.addTab("Label Example 1",new SimpleJLabelExample());
jtb.addTab("Label Example 2",new MnemonicLabels());
jtb.addTab("Label Example 3",new AlignmentExample());
jtb.addTab("Label Example 4",new ImageLabelDemo());
jtb.setTabPlacement(SwingConstants.BOTTOM);
		add(jtb);
	}
	public static void main(String args[])
	{
		JFrame f=new JFrame("Vedisoft : MyTab");
		f.setContentPane(new MyTab());
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