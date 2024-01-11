package com.rathod.oops;
/*
  File.......: MyHello_AppletOrApp.java
  Description: Basic Applet example.  (Run by a browser.)
  Programmer.: Michael Thomas
  Date.......: Updated 1/22/99, Orig 1/17/99

  Description: Basic Hello World program.
               Can be run as Application or Applet.

  Application
  Compile....: javac MyHello_AppletOrApp.java
  Run........: java  MyHello_AppletOrApp 

  Applet                                
  Compile....: javac MyHello_AppletOrApp.java -d bin  (dir .\bin)
  Run........: appletviewer MyHello_AppletOrApp  (or URL in browser)
  Note.......: "-d bin" puts the class file in a subdirectory images.
  

*/
import java.applet.Applet;      //need for extends Applet.
import java.awt.Graphics;       //need for paint()
import java.awt.event.*;        //need to handle window events.
import java.awt.Frame;       
import java.awt.BorderLayout; 

//############################################################################
public class MyHello_AppletOrApp extends Applet {
//############################################################################

  //--------------------------------------------------------------------------
  public void paint(Graphics g) {
  //--------------------------------------------------------------------------
    g.drawString("Hello World from an Application or Applet.",25,25);
  }
  //--------------------------------------------------------------------------
  public static void main( String args [] )  { 
  //--------------------------------------------------------------------------
    
    Frame app = new Frame( "Application - Hello_App2" );  
    app.setSize( 300, 100);                         //set Frame: width, height

    app.addWindowListener(      //Register an anonymous class as a listener.
         new WindowAdapter() {
            public void windowClosing( WindowEvent e ) 
            {  
               System.exit( 0 );
            }
         }
    );

    final MyHello_AppletOrApp applet = new MyHello_AppletOrApp();         //create the applet.
    applet.init();                                //initialize applet.
    applet.start();                               //start applet.

    app.add( applet, BorderLayout.CENTER );       //add applet to center of frame.
    app.setVisible( true );                    //Make frame visible.

  } //main()
}