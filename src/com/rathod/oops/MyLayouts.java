package com.rathod.oops;
/* File.......: MyLayouts.java
   Author.....: Michael Thomas 03/17/99, ver 1.0 - 03/17/99
                      
*/

import java.applet.Applet;  //needed for: extends Applet
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


//***********************************************************************
public class MyLayouts extends Applet implements ActionListener {
//***********************************************************************

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

    appMy = this;
    panDisplay = new Panel();

    layMaster = new BorderLayout();
    setLayout( layMaster );

    setBackground(Color.blue);
    Button butFlowLayout    = new Button("FlowLayout");
    Button butBorderLayout  = new Button("BorderLayout");
    Button butBorderFlow    = new Button("Border & Flow Layout");
    Button butGridLayout    = new Button("GridLayout");
    Button butCardLayout    = new Button("CardLayout");
    Button butGridBagLayout = new Button("GridBagLayout");
    setBackground(Color.white);

    p = new Panel();

    p.add( butFlowLayout );
    p.add( butBorderLayout );
    p.add( butBorderFlow );
    p.add( butGridLayout );
    p.add( butCardLayout );
    p.add( butGridBagLayout );

    setBackground(Color.blue);
    add( BorderLayout.NORTH, p );

    p = new Panel();
    p.add( new Button("Click on one of the above Layout Managers") );
    add( BorderLayout.SOUTH, p );

    setBackground(Color.white);

    //Inner class to handle the event.
    butFlowLayout.addActionListener( new ActionListener()
    {  public void actionPerformed(ActionEvent e)
      {
        appMy.remove(panDisplay);
        panDisplay = MyFlowLayout();
        appMy.add( BorderLayout.CENTER, panDisplay );
        System.out.println("Pressed butFlowLayout");
        appMy.validate();
        appMy.repaint();
      }
    } ); //addActionListener

    //Inner class to handle the event.
    butBorderLayout.addActionListener( new ActionListener()
    {  public void actionPerformed(ActionEvent e)
      { 
        appMy.remove(panDisplay);
        panDisplay = MyBorderLayout();
        appMy.add( BorderLayout.CENTER, panDisplay );
        System.out.println("Pressed butBorderLayout");
        appMy.validate();
        appMy.repaint();
      }
    } ); //addActionListener

    //Inner class to handle the event.
    butBorderFlow.addActionListener( new ActionListener()
    {  public void actionPerformed(ActionEvent e)
      { 
        appMy.remove(panDisplay);
        panDisplay = MyBorderFlow();
        appMy.add( BorderLayout.CENTER, panDisplay );
        System.out.println("Pressed butBorderFlow");
        appMy.validate();
        appMy.repaint();
      }
    } ); //addActionListener

    //Inner class to handle the event.
    butGridLayout.addActionListener( new ActionListener()
    {  public void actionPerformed(ActionEvent e)
      {
        appMy.remove(panDisplay);
        panDisplay = MyGridLayout();
        appMy.add( BorderLayout.CENTER, panDisplay );
        System.out.println("Pressed butGridLayout");
        appMy.validate();
        appMy.repaint();
      }
    } ); //addActionListener

    //Inner class to handle the event.
    butCardLayout.addActionListener( new ActionListener()
    {  public void actionPerformed(ActionEvent e)
      {
        appMy.remove(panDisplay);
        panDisplay = MyCardLayout();
        appMy.add( BorderLayout.CENTER, panDisplay );
        System.out.println("Pressed butCardLayout");
        appMy.validate();
        appMy.repaint();
      }
    } ); //addActionListener

    //Inner class to handle the event.
    butGridBagLayout.addActionListener( new ActionListener()
    {  public void actionPerformed(ActionEvent e)
      {
        appMy.remove(panDisplay);
        panDisplay = MyGridBagLayout();
        appMy.add( BorderLayout.CENTER,  panDisplay );
        System.out.println("Pressed butGridBagLayout");
        appMy.validate();
        appMy.repaint();
      }
    } ); //addActionListener

  }


//-----------------------------------------------------------------------
  public void paint(Graphics g) {
//-----------------------------------------------------------------------    
    setBackground( Color.white );
    
    showStatus("Running Applet: MyLayouts");
  } //paint()

//-----------------------------------------------------------------------
  public void actionPerformed(ActionEvent e) {
//-----------------------------------------------------------------------
  }

//-----------------------------------------------------------------------
  public Panel MyFlowLayout() {
//-----------------------------------------------------------------------
    
    Panel panReturn = new Panel();

    panReturn.setLayout(new FlowLayout());  

    Button butMy1 = new Button("Hello 1");
    Button butMy2 = new Button("Hello 2");
    Button butMy3 = new Button("Hello 3");

    panReturn.add( butMy1 );
    panReturn.add( butMy2 );
    panReturn.add( butMy3 ); 

    return panReturn;

  } //MyFlowLayout()

//-----------------------------------------------------------------------
  public Panel MyBorderLayout() {
//-----------------------------------------------------------------------
    
    Panel panReturn = new Panel();

    panReturn.setLayout(new BorderLayout());

    panReturn.add( "North", new Button( "North" ) );
    panReturn.add( "South", new Button( "South" ) );
    panReturn.add( "West", new Button( "West" ) );
    panReturn.add( "East", new Button( "East" ) );
    panReturn.add( BorderLayout.CENTER, new Button( "Center" ) );  //used a final
    panReturn.add( new Button( "Hello - Default is Center" ) ); //Default!

    //Note:  appletviewer shows "Hello - Default is Center"
    //Note:  IE 5.0       shows "Center"

    return panReturn;

  }

//-----------------------------------------------------------------------
  public Panel MyBorderFlow() {
//-----------------------------------------------------------------------
    
    Panel panReturn = new Panel();

    Panel panMy   = new Panel();
    panMy.add( new Button("Hello 1") );
    panMy.add( new Button("Hello 2") );
    panMy.add( new Button("Hello 3") );

    panReturn.setLayout(new BorderLayout());

    panReturn.add( "North",  panMy ); // new Button("North" ) );
    panReturn.add( "South",  new Button("South") );
    panReturn.add( "West",   new Button("West") );
    panReturn.add( "East",   new Button("East") );
    panReturn.add( "Center", new Button("Center") );

    return panReturn;
  }


//-----------------------------------------------------------------------
  public Panel MyGridLayout() {
//-----------------------------------------------------------------------
    
    Panel panReturn = new Panel();

    panReturn.setLayout( new GridLayout(3,2) );  //3-Rows, 2-Columns
    panReturn.add( new Button( "Grid Button 1" ) );
    panReturn.add( new Button( "Grid Button 2" ) );
    panReturn.add( new Button( "Grid Button 3" ) );
    panReturn.add( new Button( "Grid Button 4" ) );
    panReturn.add( new Button( "Grid Button 5" ) );
    panReturn.add( new Button( "Grid Button 6" ) );

    return panReturn;
  }

//-----------------------------------------------------------------------
  public Panel MyGridBagLayout() {
//-----------------------------------------------------------------------
    
    Panel panReturn = new Panel();

    GridBagLayout MyGBL = new GridBagLayout();
    panReturn.setLayout( MyGBL );

    Button butBag1 = new Button( "Grid Bag 1 (0,0)" );
    Button butBag2 = new Button( "Grid Bag 2 (1,0)" );
    Button butBag3 = new Button( "Grid Bag 3 (2,0)" );
    Button butBag4 = new Button( "Grid Bag 4 (0,1)" );
    Button butBag5 = new Button( "Grid Bag 5 (1,1)" );
    Button butBag6 = new Button( "Grid Bag 6 (0,2)" );

    GridBagConstraints MyGBC = new GridBagConstraints();

    panReturn.add( butBag1 );          //added with constraints.
    panReturn.add( butBag2 );          //added with default constraints.
    panReturn.add( butBag3 );          //         "
    panReturn.add( butBag4 );          //         "
    panReturn.add( butBag5 );          //         "
    panReturn.add( butBag6 );          //         "

    //Row 0
      MyGBC.gridx = 0; MyGBC.gridy = 0;
      MyGBL.setConstraints( butBag1, MyGBC );
      MyGBC.gridx = 1; MyGBC.gridy = 0;
      MyGBL.setConstraints( butBag2, MyGBC );
      MyGBC.gridx = 2; MyGBC.gridy = 0;
      MyGBL.setConstraints( butBag3, MyGBC );

    //Row 1
      MyGBC.gridx = 0; MyGBC.gridy = 1;
      MyGBL.setConstraints( butBag4, MyGBC );
      MyGBC.gridx = 1; MyGBC.gridy = 1;
      MyGBL.setConstraints( butBag5, MyGBC );

    //Row 2
      MyGBC.gridx = 0; MyGBC.gridy = 2;
      MyGBL.setConstraints( butBag6, MyGBC );

    return panReturn;
  }


//-----------------------------------------------------------------------
  public Panel MyCardLayout() {
//-----------------------------------------------------------------------
    
    Panel p;

    Panel panReturn = new Panel();

    panReturn.setLayout( new BorderLayout() );

    p = new Panel();  //Default Manager is FlowLayout.
      Button butFirst    = new Button("First");
      Button butLast     = new Button("Last");
      Button butPrevious = new Button("Previous");
      Button butNext     = new Button("Next");

      p.add( butFirst );
      p.add( butLast );
      p.add( butPrevious );
      p.add( butNext );

    panReturn.add( BorderLayout.NORTH, p );

    p = new Panel();
      p.add( new Button ("This applet will cycle through Cards 1-6.") );

    panReturn.add( BorderLayout.SOUTH, p );

    if ( panCards == null )
    {
      panCards = new Panel();    //Default Manager is FlowLayout.
        panCards.setLayout( cl );  //Now set to CardLayout!

        panCards.add( "Card1", new Button( "Card 1" ) );
        panCards.add( "Card2", new Button( "Card 2" ) );
        panCards.add( "Card3", new Button( "Card 3" ) );
        panCards.add( "Card4", new Button( "Card 4" ) );
        panCards.add( "Card5", new Button( "Card 5" ) );
        panCards.add( "Card6", new Button( "Card 6" ) );
    }

    panReturn.add( BorderLayout.CENTER, panCards );

    //Inner class to handle the event.
    butPrevious.addActionListener( new ActionListener()
    {  public void actionPerformed(ActionEvent e)
      { cl.previous( panCards );
        System.out.println("Pressed butPrevious");
      }
    } ); //addActionListener

    //Inner class to handle the event.
    butNext.addActionListener( new ActionListener()
    {  public void actionPerformed(ActionEvent e)
      { cl.next( panCards  );
        System.out.println("Pressed butNext");
      }
    } ); //inner class for addActionListener

    //Inner class to handle the event.
    butFirst.addActionListener( new ActionListener()
    {  public void actionPerformed(ActionEvent e)
      { cl.first( panCards  );
        System.out.println("Pressed butFirst");
      }
    } ); //inner class for addActionListener

    //Inner class to handle the event.
    butLast.addActionListener( new ActionListener()
    {  public void actionPerformed(ActionEvent e)
      { cl.last( panCards  );
        System.out.println("Pressed butLast");
      }
    } ); //inner class for addActionListener

  return panReturn;

  }
  
//-----------------------------------------------------------------------
  public static void main( String args [] ) {
//-----------------------------------------------------------------------
  
    Frame app = new Frame( "Application - Hello_App2" );  
    app.setSize( 760, 378);                         //set Frame: width, height

    app.addWindowListener(      //Register an anonymous class as a listener.
         new WindowAdapter() {
            public void windowClosing( WindowEvent e ) 
            {  
               System.exit( 0 );
            }
         }
    );

    final MyLayouts applet = new MyLayouts();         //create the applet.
    applet.init();                                //initialize applet.
    applet.start();                               //start applet.

    app.add( applet, BorderLayout.CENTER );       //add applet to center of frame.
    app.setVisible( true );                    //Make frame visible.

  } //main()
} //eoc
//eof




