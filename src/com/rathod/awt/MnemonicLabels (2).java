import javax.swing.*;
import java.awt.*;
public class MnemonicLabels extends JPanel
{
	JLabel lastName;
	JLabel middleName;
	JLabel firstName ;
	JTextField lastField;
	JTextField middleField ;
	JTextField firstField;

	
	public MnemonicLabels()
	{
		setLayout(new GridLayout(3,2,5,5));

		lastName = new JLabel("Last Name",JLabel.RIGHT);
		middleName = new JLabel("Middle Name",JLabel.RIGHT);
		firstName = new JLabel("First Name",JLabel.RIGHT);

		lastField = new JTextField(10);
		middleField = new JTextField(10);
		firstField = new JTextField(10);

		lastName.setDisplayedMnemonic('L');
		middleName.setDisplayedMnemonic('M');
		firstName.setDisplayedMnemonic('F');

		lastName.setLabelFor(lastField);
		middleName.setLabelFor(middleField);
		firstName.setLabelFor(firstField);

		add(lastName);
		add(lastField);
		add(middleName);
		add(middleField);
		add(firstName);
		add(firstField);
	}	

	public static void main(String args[])
	{
		JFrame f=new JFrame("MnemonicLabels:");
		f.setContentPane(new MnemonicLabels());
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