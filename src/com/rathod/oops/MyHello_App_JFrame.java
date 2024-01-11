package com.rathod.oops;
/*
  File.......: MyHello_App_JFrame.java
  Programmer.: Michael Thomas
  Date.......: Updated 09/07/01, Orig 09/07/01

  Description: Basic Application example extending java.awt.Frame.
               

*/
import java.awt.event.*;        //need to handle window events.

public class MyHello_App_JFrame extends javax.swing.JFrame {
  
  public void paint(java.awt.Graphics g) {
    
    super.paint(g); //Calls superclasses paint(Graphics) method in Component.

    //Find insets (X,Y point inside the Border box (Title & Frame) because the frame takes up some 
    //of the screen - especially the title area at top.
    //Note:
    // 1) 0,0 would be where the Title area begins.  You cann't see items written there.
    // 2) Remember that character are draw from the X,Y point upward and to the right.
    // 3) Try removing the "+ 25" and you will only see the tips of "p,g, & j" of the string. 
    //    see #2 for reason.
    java.awt.Insets objInsets = this.getInsets(); //Find the containers (Frame) insets.
    int intX = objInsets.left + 25;  //Remember characters 
    int intY = objInsets.top + 25;
    System.out.println("intX = " + intX + ", intY = " + intY); //For debugging to see the new value.    
    
    //Now draw a graphic string to the screen using Graphics.drawString().

    g.drawString( "Hello World from an Application extending awt.java.JFrame.", intX, intY);

  }

  public static void main( String args [] )
  { 
    MyHello_App_Frame objAppFrame = new MyHello_App_Frame();

    objAppFrame.addWindowListener(      //Register an anonymous class as a listener.
         new WindowAdapter() {
            public void windowClosing( WindowEvent e ) 
            {  
               System.exit( 0 );
            }
         }
    );

    objAppFrame.setTitle( "Java Application extending java.awt.JFrame");
    objAppFrame.setSize( 500, 100);                    //set Frame: width, height
    objAppFrame.setVisible( true );                    //Make frame visible. (replaces JDK 1.1's .show())

  } //main()
}