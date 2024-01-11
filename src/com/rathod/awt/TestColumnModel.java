package com.rathod.awt;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TestColumnModel extends JPanel
{
	JTable jt;
	DefaultTableColumnModel dtcm;
	TableColumn column1, column2, column3;
	DefaultTableModel dtm;
	Vector v1, v2;

	public TestColumnModel() 
	{
	setLayout(new BorderLayout());
	column1 = new TableColumn(0);
	column1.setHeaderValue("First Name");
	column1.setPreferredWidth(50);

	column2 = new TableColumn(1);
	column2.setHeaderValue("Last Name");
	column2.setPreferredWidth(100);

	column3 = new TableColumn(2);
	column3.setHeaderValue("Member Since");

	dtcm = new DefaultTableColumnModel();
	dtcm.addColumn(column1);
	dtcm.addColumn(column2);
	dtcm.addColumn(column3);

	v1 = new Vector();
	v1.addElement("Lisa");
	v1.addElement("Reid");
	v1.addElement(new Integer(1990));

	v2 = new Vector();
	v2.addElement("Cheryl");
	v2.addElement("Spada");
	v2.addElement(new Integer(1979));

	dtm = new DefaultTableModel(0, 3);
	dtm.addRow(v1);
	dtm.addRow(v2);

	jt = new JTable(dtm, dtcm);


	JScrollPane jsp = new JScrollPane(jt);
	add(jsp, BorderLayout.CENTER);

}

	public static void main(String args[])
	{
		JFrame f=new JFrame("Vedisoft : TestColumnModel");
		f.setContentPane(new TestColumnModel());
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
