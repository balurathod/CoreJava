package com.rathod.oops;
/*
  File.......: MyHello_JAppletOrApp.java
  Description: Basic JApplet example.  (App or Applet)
  Programmer.: Michael Thomas
  Date.......: Updated 4/14/01, Orig 4/14/01

  Application
  Compile....: javac MyHello_JAppletOrApp.java
  Run........: java  MyHello_JAppletOrApp 

  Applet                                
  Compile....: javac MyHello_JAppletOrApp.java
  Run........: appletviewer MyHello_JAppletOrApp  (or URL in browser)
  
*/
import javax.swing.JApplet;      //need for extends Applet.
import javax.swing.JFrame;       

import java.awt.Container;
import java.awt.Graphics;       //need for paint()
import java.awt.Color;
import java.awt.event.*;        //need to handle window events.
import java.awt.BorderLayout; 

public class MyHello_JAppletOrApp extends JApplet {

  public void init() {

    Container objContainer = super.getContentPane();
    objContainer.setBackground( Color.white );

  }
  public void start() {
    //Do nothing. 
  }
  
  public void paint(Graphics g) {
    g.drawString("Hello World. (Swing - JApplet).",25,25);
  }

  public static void main( String args [] ) { 
    
    JFrame app = new JFrame( "Swing JApplet (Application or Applet)" );  
    app.setSize( 300, 100);                         //set Frame: width, height

    app.addWindowListener(      //Register an anonymous class as a listener.
         new WindowAdapter() {
            public void windowClosing( WindowEvent e ) 
            {  
               System.exit( 0 );
            }
         }
    );

    MyHello_JAppletOrApp applet = new MyHello_JAppletOrApp();         //create the applet.
    applet.init();                                //initialize applet.
    applet.start();                               //start applet.

    app.getContentPane().add( applet, BorderLayout.CENTER );       //add applet to center of frame.
    app.setVisible( true );                    //Make frame visible.

  } //main()
}