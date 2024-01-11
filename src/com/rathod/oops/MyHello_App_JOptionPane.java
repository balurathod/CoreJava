package com.rathod.oops;
/*
  File.......: MyHello_App_JOptionPane.java
  Programmer.: Michael Thomas
  Date.......: Updated 09/07/01, Orig 09/07/01

  Description: Basic Application showing the use of JOptionPane.
               

*/
import javax.swing.JOptionPane;        //need to handle window events.

public class MyHello_App_JOptionPane {
  
  public static void main( String args [] ) {

    //Note: null - the parent component. "
    //Find this statement in Java's API!!!, "This parameter may be null, in which case a 
    //default Frame is used as the parent, and the dialog will be centered on the screen 
    //(depending on the L&F)."  
    JOptionPane.showMessageDialog( null, "#A1: Hello using JOptionPane's\nDefault - Information Box");
    JOptionPane.showMessageDialog( null, "#A2: Now look at title bar.", "Hello World", JOptionPane.INFORMATION_MESSAGE );

    JOptionPane.showMessageDialog( null, "#B1: Message Type = ERROR_MESSAGE", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE );
    JOptionPane.showMessageDialog( null, "#B2: Message Type = INFORMATION_MESSAGE", "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE );
    JOptionPane.showMessageDialog( null, "#B2: Message Type = WARNING_MESSAGE", "WARNING_MESSAGE ", JOptionPane.WARNING_MESSAGE );
    JOptionPane.showMessageDialog( null, "#B3: Message Type = QUESTION_MESSAGE", "QUESTION_MESSAGE", JOptionPane.QUESTION_MESSAGE );
    JOptionPane.showMessageDialog( null, "#B4: Message Type = PLAIN_MESSAGE", "PLAIN_MESSAGE ", JOptionPane.PLAIN_MESSAGE  );

    String strMsg;

    strMsg = JOptionPane.showInputDialog("#C1: Basic InputDialog\nEnter Your Name");
    System.out.println( strMsg );
    strMsg = JOptionPane.showInputDialog(null, "#C1: InputDialog Type: ERROR_MESSAGE\nClick OK", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
    System.out.println( strMsg );
    strMsg = JOptionPane.showInputDialog(null, "#C1: InputDialog Type: INFORMATION_MESSAGE\nClick OK", "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
    System.out.println( strMsg );
    strMsg = JOptionPane.showInputDialog(null, "#C1: InputDialog Type: WARNING_MESSAGE\nClick OK", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
    System.out.println( strMsg );
    strMsg = JOptionPane.showInputDialog(null, "#C1: InputDialog Type: QUESTION_MESSAGE\nClick OK", "QUESTION_MESSAGE", JOptionPane.QUESTION_MESSAGE);
    System.out.println( strMsg );
    strMsg = JOptionPane.showInputDialog(null, "#C1: InputDialog Type: PLAIN_MESSAGE\nClick OK", "PLAIN_MESSAGE", JOptionPane.PLAIN_MESSAGE);
    System.out.println( strMsg );


    Object[] possibleValues = { "First", "Second", "Third" };
    Object selectedValue = 
           JOptionPane.showInputDialog(null, 
                                       "Choose one", "Input",
                                       JOptionPane.INFORMATION_MESSAGE, null,
                                       possibleValues, possibleValues[0]);
    System.out.println( String.valueOf ( selectedValue ) );

    System.exit( 0 );

  } //main()
}