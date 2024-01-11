package com.rathod.oops;
/* File.......: MyBorderFlow.java
   Author.....: Michael Thomas 03/17/99, ver 1.0 - 03/17/99
                      

*/

import java.applet.Applet;  //needed for: extends Applet
//import java.awt.*;
//import java.awt.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//#######################################################################
public class MyBorderFlow extends Applet {
//#######################################################################


//-----------------------------------------------------------------------
  public void init() { 
//-----------------------------------------------------------------------
    setBackground( Color.white );
    MyBorderFlow();
  }

//-----------------------------------------------------------------------
  public void paint(Graphics g) {
//-----------------------------------------------------------------------
    setBackground( Color.white );

    showStatus("Running Applet: MyBorderFlow");
  } //paint()

//-----------------------------------------------------------------------
  public void MyBorderFlow() {
//-----------------------------------------------------------------------
    Panel panMy   = new Panel();

    panMy.add( new Button("Hello 1") );
    panMy.add( new Button("Hello 2") );
    panMy.add( new Button("Hello 3") );

    setLayout(new BorderLayout());

    add( "North",  panMy ); // new Button("North" ) );
    add( "South",  new Button("South") );
    add( "West",   new Button("West") );
    add( "East",   new Button("East") );
    add( "Center", new Button("Center") );

  }

//-----------------------------------------------------------------------
  public static void main( String args [] ) {
//-----------------------------------------------------------------------
  
    Frame app = new Frame( "Application - BorderFlow" );  
    app.setSize( 760, 378);                         //set Frame: width, height

    app.addWindowListener(      //Register an anonymous class as a listener.
         new WindowAdapter() {
            public void windowClosing( WindowEvent e ) 
            {  
               System.exit( 0 );
            }
         }
    );

    final MyBorderFlow applet = new MyBorderFlow();         //create the applet.
    applet.init();                                //initialize applet.
    applet.start();                               //start applet.

    app.add( applet, BorderLayout.CENTER );       //add applet to center of frame.
    app.setVisible( true );                    //Make frame visible.

  } //main()


} //eoc
//eof




