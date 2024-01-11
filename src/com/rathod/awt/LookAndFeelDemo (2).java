import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LookAndFeelDemo extends JPanel
{
	private String strings[] = { "Metal", "Motif", "Windows" };
	private UIManager.LookAndFeelInfo looks[];
	private JRadioButton radio[];
	private ButtonGroup group;
	private JButton button;
	private JLabel label;
	private JComboBox comboBox;

	public LookAndFeelDemo()
	{	
		setLayout(new BorderLayout());
		JPanel northPanel = new JPanel();
		northPanel.setLayout( new GridLayout( 3, 1, 0, 5 ) );
		label = new JLabel( "This is a Metal look-and-feel",
		SwingConstants.CENTER );
		northPanel.add( label );
		button = new JButton( "JButton" );
		northPanel.add( button );
		comboBox = new JComboBox( strings );
		northPanel.add( comboBox );
		add( northPanel, BorderLayout.NORTH );
		
		JPanel southPanel = new JPanel();
		radio = new JRadioButton[ strings.length ];
		group = new ButtonGroup();
		ItemHandler handler = new ItemHandler();
		southPanel.setLayout(new GridLayout( 1, radio.length ) );

		for ( int i = 0; i < radio.length; i++ ) 
		{
			radio[ i ] = new JRadioButton( strings[ i ] );
			radio[ i ].addItemListener( handler );
			group.add( radio[ i ] );
			southPanel.add( radio[ i ] );
		}

			add( southPanel, BorderLayout.SOUTH );
			looks = UIManager.getInstalledLookAndFeels();
			

			radio[ 0 ].setSelected( true );
	}

	private void changeTheLookAndFeel( int value )
	{
		try 
		{
			UIManager.setLookAndFeel(looks[ value ].getClassName() );
			SwingUtilities.updateComponentTreeUI( this );
		}
		catch ( Exception e ) 
		{
			e.printStackTrace();
		}
	}

	public static void main(String args[])
	{
		JFrame f=new JFrame("LookAndFeelDemo:");
		f.setContentPane(new LookAndFeelDemo());
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
 
	private class ItemHandler implements ItemListener 
	{
		public void itemStateChanged( ItemEvent e )
		{
			for ( int i = 0; i < radio.length; i++ )
			if ( radio[ i ].isSelected() ) 
			{
				label.setText( "This is a " + strings[ i ] + " look-and-feel" );
				comboBox.setSelectedIndex( i );
				changeTheLookAndFeel( i );
			}
		}
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


/**************************************************************************
 * (C) Copyright 1999 by Deitel & Associates, Inc. and Prentice Hall.     *
 * All Rights Reserved.                                                   *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
