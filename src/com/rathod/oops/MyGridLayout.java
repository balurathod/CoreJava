package com.rathod.oops;
/* File.......: MyGridLayout.java
   Author.....: Michael Thomas 03/17/99, ver 1.0 - 03/17/99
                      
   Compile....: javac MyGridLayout.java -d bin

   Run Browser: MyGridLayout.html
   Run JDK....: appletviewer MyGridLayout.html

*/

import java.applet.Applet;  //needed for: extends Applet
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//***********************************************************************
public class MyGridLayout extends Applet {
//***********************************************************************

//-----------------------------------------------------------------------
  public void init()  {
//-----------------------------------------------------------------------
    setBackground( Color.white );
    MyGridLayout();  //Notice, this is a method, not a constructor!

  }
//-----------------------------------------------------------------------
  public void paint(Graphics g) {
//-----------------------------------------------------------------------
    setBackground( Color.white );
    
    showStatus("Running Applet: MyGridLayout");
  } //paint()

//-----------------------------------------------------------------------
  public void MyGridLayout() {  //Notice, this is a method, not a constructor!
//-----------------------------------------------------------------------
    setLayout( new GridLayout(3,2) );  //3-Rows, 2-Columns

    add( new Button( "Grid Button 1" ) );
    add( new Button( "Grid Button 2" ) );
    add( new Button( "Grid Button 3" ) );
    add( new Button( "Grid Button 4" ) );
    add( new Button( "Grid Button 5" ) );
    add( new Button( "Grid Button 6" ) );

  }
  
//-----------------------------------------------------------------------
  public static void main( String args [] ) {
//-----------------------------------------------------------------------
  
    Frame app = new Frame( "Application - GridLayout" );  
    app.setSize( 760, 378);                         //set Frame: width, height

    app.addWindowListener(      //Register an anonymous class as a listener.
         new WindowAdapter() {
            public void windowClosing( WindowEvent e ) 
            {  
               System.exit( 0 );
            }
         }
    );

    final MyGridLayout applet = new MyGridLayout();         //create the applet.
    applet.init();                                //initialize applet.
    applet.start();                               //start applet.

    app.add( applet, BorderLayout.CENTER );       //add applet to center of frame.
    app.setVisible( true );                    //Make frame visible.

  } //main()

} //class MyGridLayout