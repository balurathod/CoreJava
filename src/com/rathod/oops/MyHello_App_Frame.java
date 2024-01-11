package com.rathod.oops;
/*
  File.......: MyHello_App_Frame.java
  Programmer.: Michael Thomas
  Date.......: Updated 09/07/01, Orig 09/07/01

  Description: Basic Application example extending java.awt.Frame.
               

*/
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyHello_App_Frame extends java.awt.Frame {

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
    System.out.println("objInsets.left = " + objInsets.left + ", " + " objInsets.top = " + objInsets.top );
    System.out.println("intX = " + intX + ", intY = " + intY); //For debugging to see the new value.    
    
    //Now draw a graphic string to the screen using Graphics.drawString().

    g.drawString( "Hello World from an Application extending awt.java.Frame.", intX, intY);
    //The above and below statement will write in the same location.
    //g.drawString("Hello World from an Application extending awt.java.Frame.",29,48);
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

    objAppFrame.setTitle( "Java Application extending java.awt.Frame");
    objAppFrame.setSize( 500, 100);                    //set Frame: width, height
    objAppFrame.setVisible( true );                    //Make frame visible. (replaces JDK 1.1's .show())

  } //main()
}