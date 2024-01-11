package com.rathod.oops;
/* File.......: MyCardLayout.java
   Author.....: Michael Thomas 03/17/99, ver 1.0 - 03/17/99
                      
   Compile....: javac MyCardLayout.java -d bin

   Run Browser: MyCardLayout.html
   Run JDK....: appletviewer MyCardLayout.html

*/

import java.applet.Applet;  //needed for: extends Applet
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//#######################################################################
public class MyCardLayout extends Applet implements ActionListener {
//#######################################################################

  Panel panDisplay;
  Panel panCards = null;

  CardLayout cl = new CardLayout();

  Applet appMy;
  BorderLayout layMaster;

//-----------------------------------------------------------------------
  public void init() {
//-----------------------------------------------------------------------
    Panel p;

    setBackground( Color.white );
    RunCardLayout();

  }

//-----------------------------------------------------------------------
  public void paint(Graphics g) {
//-----------------------------------------------------------------------
    setBackground( Color.white );
    
    showStatus("Running Applet: MyCardLayout");
  } //paint()

//-----------------------------------------------------------------------
  public void actionPerformed(ActionEvent e) {
//-----------------------------------------------------------------------
  }

//-----------------------------------------------------------------------
  public void RunCardLayout() {
//-----------------------------------------------------------------------    
    Panel p;

    setLayout( new BorderLayout() );

    p = new Panel();  //Default Manager is FlowLayout.
      Button butFirst    = new Button("First");
      Button butLast     = new Button("Last");
      Button butPrevious = new Button("Previous");
      Button butNext     = new Button("Next");

      p.add( butFirst );
      p.add( butLast );
      p.add( butPrevious );
      p.add( butNext );

    add( BorderLayout.NORTH, p );

    p = new Panel();
      p.add( new Button ("This applet will cycle through Cards 1-6.") );

    add( BorderLayout.SOUTH, p );

    panCards = new Panel();    //Default Manager is FlowLayout.
      panCards.setLayout( cl );  //Now set to CardLayout!
      panCards.add( "Card1", new Button( "Card 1" ) );
      panCards.add( "Card2", new Button( "Card 2" ) );
      panCards.add( "Card3", new Button( "Card 3" ) );
      panCards.add( "Card4", new Button( "Card 4" ) );
      panCards.add( "Card5", new Button( "Card 5" ) );
      panCards.add( "Card6", new Button( "Card 6" ) );


    add( BorderLayout.CENTER, panCards );

    //Anonymous Inner class to handle the event.
    butPrevious.addActionListener( new ActionListener()
    {  public void actionPerformed(ActionEvent e)
      { cl.previous( panCards );
        System.out.println("Pressed butPrevious");
      }
    } ); //addActionListener

    //Anonymous Inner class to handle the event.
    butNext.addActionListener( new ActionListener()
    {  public void actionPerformed(ActionEvent e)
      { cl.next( panCards  );
        System.out.println("Pressed butNext");
      }
    } ); //inner class for addActionListener

    //Anonymous Inner class to handle the event.
    butFirst.addActionListener( new ActionListener()
    {  public void actionPerformed(ActionEvent e)
      { cl.first( panCards  );
        System.out.println("Pressed butFirst");
      }
    } ); //inner class for addActionListener

    //EventFirst is an Inner class used to handle the event.
    butFirst.addActionListener( new EventFirst() );

    //Anonymous Inner class to handle the event.
    butLast.addActionListener( new EventLast() );

  } //RunCardLayout()

  //Inner class at class level.
//######################################################################
  class EventFirst implements ActionListener {
//######################################################################
    public void actionPerformed(ActionEvent e)
    { cl.first( panCards  );
      System.out.println("Pressed butFirst");
    }
  } //inner class: EventFirst

  //Inner class at class level.
//######################################################################
  class EventLast implements ActionListener {
//######################################################################
    public void actionPerformed(ActionEvent e)
    { cl.last( panCards  );
      System.out.println("Pressed butLast");
    }
  } //inner class for addActionListener
  
//-----------------------------------------------------------------------
  public static void main( String args [] ) {
//-----------------------------------------------------------------------
  
    Frame app = new Frame( "Application - CardLayout" );  
    app.setSize( 760, 378);                         //set Frame: width, height

    app.addWindowListener(      //Register an anonymous class as a listener.
         new WindowAdapter() {
            public void windowClosing( WindowEvent e ) 
            {  
               System.exit( 0 );
            }
         }
    );

    final MyCardLayout applet = new MyCardLayout();         //create the applet.
    applet.init();                                //initialize applet.
    applet.start();                               //start applet.

    app.add( applet, BorderLayout.CENTER );       //add applet to center of frame.
    app.setVisible( true );                    //Make frame visible.

  } //main()


} //class MyCardLayout
