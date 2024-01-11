package com.rathod.awt;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CardDeck extends JFrame
                      implements ActionListener {
   private CardLayout cardManager;
   private JPanel deck;
   private JButton controls[];
   private String names[] = { "First card", "Next card",
                              "Previous card", "Last card" };

   public CardDeck()
   {
      super( "CardLayout " );


      // create the JPanel with CardLayout
      deck = new JPanel();
      cardManager = new CardLayout(); 
      deck.setLayout( cardManager );  

deck.add(new SimpleJLabelExample(),"Example One");
deck.add(new AlignmentExample(),"Example Two");
deck.add(new MnemonicLabels(),"Example Three");
deck.add(new ImageLabelDemo(),"Example Four");




      // create and layout buttons that will control deck
      JPanel buttons = new JPanel();
      buttons.setLayout( new GridLayout( 2, 2 ) );
      controls = new JButton[ names.length ];

      for ( int i = 0; i < controls.length; i++ ) {
         controls[ i ] = new JButton( names[ i ] );
         controls[ i ].addActionListener( this );
         buttons.add( controls[ i ] );
      }

      // add JPanel deck and JPanel buttons to the applet
      add( buttons, BorderLayout.WEST );
      add( deck, BorderLayout.EAST );

      setSize( 450, 200 );
      show();
   }

   public void actionPerformed( ActionEvent e )
   {
      if ( e.getSource() == controls[ 0 ] )    
         cardManager.first( deck ); // show first card
      else if ( e.getSource() == controls[ 1 ] )    
         cardManager.next( deck );  // show next card
      else if ( e.getSource() == controls[ 2 ] )
         cardManager.previous( deck );  // show previous card
      else if ( e.getSource() == controls[ 3 ] )
         cardManager.last( deck );  // show last card            
   }

   public static void main( String args[] )
   {
      CardDeck cardDeckDemo = new CardDeck();

      cardDeckDemo.addWindowListener(
         new WindowAdapter() {
            public void windowClosing( WindowEvent e )
            {
               System.exit( 0 );
            }
         }
      );
   }
}

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
