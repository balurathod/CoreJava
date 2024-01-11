package com.rathod.awt;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridBagDemo   extends JPanel
{ 
	private GridBagLayout gbLayout;
	private GridBagConstraints gbConstraints; 
    
	JTextArea ta ;
	JTextArea tx;
	String names[] = { "Iron", "Steel", "Brass" };;
	JComboBox cb;
	JTextField tf ;
	JButton b1 ;
	JButton b2 ;
	JButton b3 ;

	public GridBagDemo()
   {

	gbLayout= new GridBagLayout();
	gbConstraints = new GridBagConstraints();
	setLayout(gbLayout);

	ta = new JTextArea( "TextArea1", 5, 10 );
	tx = new JTextArea( "TextArea2", 2, 2 );
	cb = new JComboBox( names );
	tf = new JTextField( "TextField" );
	b1 = new JButton( "Button 1" );
	b2 = new JButton( "Button 2" );
	b3 = new JButton( "Button 3" );

	gbConstraints.fill = GridBagConstraints.BOTH;
	addComponent( ta, 0, 0, 1, 3 );    
   

	gbConstraints.fill = GridBagConstraints.HORIZONTAL;
	addComponent( b1, 0, 1, 2, 1 );
      
	addComponent( cb, 2, 1, 2, 1 );             

	gbConstraints.weightx = 1000;  
	gbConstraints.weighty = 1;     
	gbConstraints.fill = GridBagConstraints.BOTH;
	addComponent( b2, 1, 1, 1, 1 );
       
	gbConstraints.weightx = 0;
	gbConstraints.weighty = 0;    
	addComponent( b3, 1, 2, 1, 1 );
       
	addComponent( tf, 3, 0, 2, 1 );
	addComponent( tx, 3, 2, 1, 1 );

}

	private void addComponent( Component c, int row, int column, int width, int height )
	{
		gbConstraints.gridx = column;
		gbConstraints.gridy = row;

		gbConstraints.gridwidth = width;   
		gbConstraints.gridheight = height;
		gbLayout.setConstraints( c, gbConstraints );  
		add( c );
	}

	public static void main(String args[])
	{
		JFrame f=new JFrame("Vedisoft : GridBagDemo");
		f.setContentPane(new GridBagDemo());
		f.setSize(500,500);
		f.show();
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