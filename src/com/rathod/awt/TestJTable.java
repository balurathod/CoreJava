package com.rathod.awt;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class TestJTable extends JPanel implements ActionListener 
{
	JTable jt;
	DefaultTableModel dtm;
	JLabel nameLabel, ageLabel, birthdayLabel;
	JTextField nameTF, ageTF, birthdayTF;
	JButton addButton;
	JPanel p1, p2;
	public TestJTable() 
	{
		Object[][] data = {    	{  "Jackson", new Integer(4), "March 21" }, 
				{ "Zachary", new Integer(2), "May 12" }	   };

		String[] headers = {      "Name", "Age", "Birthday"    };

		dtm = new DefaultTableModel(2, 3);
		dtm.setDataVector(data, headers);

		 jt = new JTable(dtm);
		jt.setGridColor(Color.red);
		jt.setRowSelectionAllowed(true);
		jt.setRowSelectionInterval(1, 1);

		nameLabel = new JLabel("Name: ");
		nameLabel.setForeground(Color.black);
		ageLabel = new JLabel("   Age: ");
		ageLabel.setForeground(Color.black);
		birthdayLabel = new JLabel("   Birthday: ");
		birthdayLabel.setForeground(Color.black);

		nameTF = new JTextField(10);
		ageTF = new JTextField(3);
		birthdayTF = new JTextField(12);
		addButton = new JButton("add");
		addButton.addActionListener(this);
	

		p1 = new JPanel();
		p2 = new JPanel();

		p1.add(new JScrollPane(jt, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
		p2.add(nameLabel);
		p2.add(nameTF);
		p2.add(ageLabel);
		p2.add(ageTF);
		p2.add(birthdayLabel);
		p2.add(birthdayTF);
		p2.add(addButton);

		setLayout(new  BorderLayout());
		add(p1,"Center");
		add(p2,"South");
	
	}


	public void actionPerformed(ActionEvent ae) 
	{
		String name = nameTF.getText();
		Integer age = new Integer(ageTF.getText());
		String birthday = birthdayTF.getText();
		Object[] newData = { name, age, birthday  };
		dtm.addRow(newData);
	} 

	public static void main(String args[])
	{
		JFrame f=new JFrame("Vedisoft : TestJTable");
		f.setContentPane(new TestJTable());
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
