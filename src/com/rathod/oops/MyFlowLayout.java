package com.rathod.oops;
/* File.......: MyFlowLayout.java
   Author.....: Michael Thomas 03/17/99, ver 1.0 - 03/17/99
                      
   Compile....: javac MyFlowLayout.java -d bin

   Run Browser: MyFlowLayout.html
   Run JDK....: appletviewer MyFlowLayout.html

*/

import java.applet.Applet;  //needed for: extends Applet
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Button;
import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//#######################################################################
public class MyFlowLayout extends Applet {
//#######################################################################

//-----------------------------------------------------------------------
  public void init()  { 
//-----------------------------------------------------------------------
    setBackground( Color.white );
    MyFlowLayout();

  }

//-----------------------------------------------------------------------
  public void paint(Graphics g) {
//-----------------------------------------------------------------------
    setBackground( Color.white );

    showStatus("Running Applet: MyFlowLayout");
  } //paint()


//-----------------------------------------------------------------------
  public void MyFlowLayout() {
//-----------------------------------------------------------------------
    setLayout(new FlowLayout());  

    Button butMy1 = new Button("Hello 1");
    Button butMy2 = new Button("Hello 2");
    Button butMy3 = new Button("Hello 3");

    add( butMy1 );
    add( butMy2 );
    add( butMy3 ); 

  } //MyFlowLayout()
  
//-----------------------------------------------------------------------
  public static void main( String args [] ) {
//-----------------------------------------------------------------------
  
    Frame app = new Frame( "Application - FlowLayout" );  
    app.setSize( 760, 378);                         //set Frame: width, height

    app.addWindowListener(      //Register an anonymous class as a listener.
         new WindowAdapter() {
            public void windowClosing( WindowEvent e ) 
            {  
               System.exit( 0 );
            }
         }
    );

    final MyFlowLayout applet = new MyFlowLayout();         //create the applet.
    applet.init();                                //initialize applet.
    applet.start();                               //start applet.

    app.add( applet, BorderLayout.CENTER );       //add applet to center of frame.
    app.setVisible( true );                    //Make frame visible.

  } //main()

  
} //class MyFlowLayout