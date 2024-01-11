package com.rathod.oops;
/* File.......: MyGridBagLayout.java
   Author.....: Michael Thomas 03/17/99, ver 1.0 - 03/17/99
                      
*/

import java.applet.Applet;  //needed for: extends Applet
//import java.awt.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//#######################################################################
public class MyGridBagLayout extends Applet {
//#######################################################################

//-----------------------------------------------------------------------
  public void init()  { 
//-----------------------------------------------------------------------
    setBackground( Color.white );
    MyGridBagLayout(); //Notice, this is a method, not a constructor!
  }

//-----------------------------------------------------------------------
  public void paint(Graphics g) {
//-----------------------------------------------------------------------
    setBackground( Color.white );

    showStatus("Running Applet: MyGridBagLayout");
  } //paint()

//-----------------------------------------------------------------------
  public void MyGridBagLayout() { //Notice, this is a method, not a constructor!
//-----------------------------------------------------------------------

    GridBagLayout MyGBL = new GridBagLayout();
    setLayout( MyGBL );

    Button butBag1 = new Button( "Button 1 (gridy=0, gridx=0)" );
    Button butBag2 = new Button( "Button 2 (gridy=0, gridx=1)" );
    Button butBag3 = new Button( "Button 3 (gridy=0, gridx=2)" );
    Button butBag4 = new Button( "Button 4 (gridy=1, gridx=0)" );
    Button butBag5 = new Button( "Button 5 (gridy=1, gridx=1)" );
    Button butBag6 = new Button( "Button 6 (gridy=2, gridx=0)" );

    GridBagConstraints MyGBC = new GridBagConstraints();

    add( butBag1 );          //added with constraints.
    add( butBag2 );          //added with default constraints.
    add( butBag3 );          //         "
    add( butBag4 );          //         "
    add( butBag5 );          //         "
    add( butBag6 );          //         "

    //Row=y, Col=x

    //Row 0 
      MyGBC.gridy = 0; MyGBC.gridx = 0; 
      MyGBL.setConstraints( butBag1, MyGBC );
      MyGBC.gridy = 0; MyGBC.gridx = 1; 
      MyGBL.setConstraints( butBag2, MyGBC );
      MyGBC.gridy = 0; MyGBC.gridx = 2; 
      MyGBL.setConstraints( butBag3, MyGBC );

    //Row 1
      MyGBC.gridy = 1; MyGBC.gridx = 0; 
      MyGBL.setConstraints( butBag4, MyGBC );
      MyGBC.gridy = 1; MyGBC.gridx = 1; 
      MyGBL.setConstraints( butBag5, MyGBC );

    //Row 2
      MyGBC.gridy = 2; MyGBC.gridx = 0; 
      MyGBL.setConstraints( butBag6, MyGBC );

  }
  
//-----------------------------------------------------------------------
  public static void main( String args [] ) {
//-----------------------------------------------------------------------
  
    Frame app = new Frame( "Application - GridBagLayout" );  
    app.setSize( 760, 378);                         //set Frame: width, height

    app.addWindowListener(      //Register an anonymous class as a listener.
         new WindowAdapter() {
            public void windowClosing( WindowEvent e ) 
            {  
               System.exit( 0 );
            }
         }
    );

    final MyGridBagLayout applet = new MyGridBagLayout();         //create the applet.
    applet.init();                                //initialize applet.
    applet.start();                               //start applet.

    app.add( applet, BorderLayout.CENTER );       //add applet to center of frame.
    app.setVisible( true );                    //Make frame visible.

  } //main()

  
} //class MyGridBagLayout