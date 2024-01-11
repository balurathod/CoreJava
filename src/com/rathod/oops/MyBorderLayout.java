package com.rathod.oops;
/* File.......: MyBorderLayout.java
   Author.....: Michael Thomas 03/17/99, ver 1.0 - 03/17/99
                      
   Compile....: javac MyBorderLayout.java -d bin

   Run Browser: MyBorderLayout.html
   Run JDK....: appletviewer MyBorderLayout.html

*/

import java.applet.Applet;  //needed for: extends Applet
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Button;
import java.awt.Frame;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//#######################################################################
public class MyBorderLayout extends Applet {
//#######################################################################

//-----------------------------------------------------------------------
  public void init() {
//-----------------------------------------------------------------------
    setBackground( Color.white );
    MyBorderLayout();

  }

//-----------------------------------------------------------------------
  public void paint(Graphics g) {
//-----------------------------------------------------------------------
    setBackground( Color.white );
    
    showStatus("Running Applet: MyBorderLayout");
  } //paint()

//-----------------------------------------------------------------------
  public void MyBorderLayout() {
//-----------------------------------------------------------------------
    setLayout(new BorderLayout());
    //Position can be a String:  "North","South","West","East","Center"
    // or a final for class BorderLayout: NORHT, SOUTH, WEST, EAST, CENTER.
    add( "North", new Button( "North" ) );
    add( "South", new Button( "South" ) );
    add( "West", new Button( "West" ) );
    add( "East", new Button( "East" ) );

    //Example of using the final
    add( BorderLayout.CENTER, new Button( "Center" ) );  //used a final
    //add( "Center", new Button( "Center" ) );  //Could have used this also!

    //If you do not provide a position, the default is Center!
    add( new Button( "Hello - Default is Center" ) ); //Default!

    //Note:  appletviewer shows "Hello - Default is Center"
    //Note:  IE 5.0       shows "Center"
    //Note:  NetScape 4.6 shows "Hello - Default is Center"
    //Note:  Why?  3 Different companies provide the JVM that is running
    //       in these products.  Should it be the same, YES.
    //       Should show "Hello - Default is Center"
  }

//-----------------------------------------------------------------------
  public static void main( String args [] ) {
//-----------------------------------------------------------------------
  
    Frame app = new Frame( "Application - BorderLayout" );  
    app.setSize( 760, 378);                         //set Frame: width, height

    app.addWindowListener(      //Register an anonymous class as a listener.
         new WindowAdapter() {
            public void windowClosing( WindowEvent e ) 
            {  
               System.exit( 0 );
            }
         }
    );

    final MyBorderLayout applet = new MyBorderLayout();         //create the applet.
    applet.init();                                //initialize applet.
    applet.start();                               //start applet.

    app.add( applet, BorderLayout.CENTER );       //add applet to center of frame.
    app.setVisible( true );                    //Make frame visible.

  } //main()

  
} //class MyBorderLayout




