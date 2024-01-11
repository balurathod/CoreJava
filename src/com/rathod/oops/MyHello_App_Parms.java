package com.rathod.oops;
/* (Multiline Comment)
  File.......: MyHello_App_Parms.java
  Description: Basic Application example with passing of parameters from the command line.
  Programmer.: Michael Thomas, 1/17/99
  Compile....: javac MyHello_App_Parms.java
  Run........: java  MyHello_App_Parms Michael Thomas

*/
/**
  This class is an example of a Java application that accepts parameters.  Prints a "Hello World ..." string and also 2 parmaters passed via the command line.<br>
  <br>
  This is a <b>JavaDoc</b> comment for a <b>class</b>.
  @author Michael Thomas - <a href="mailto:thomasma@us.ibm.com">thomasma@us.ibm.com</a>
  @see MyHello_AppletParms
  @see MyHello_Applet
  @see MyHello_Application
  @version 1.0.0
  @since 1.0.0

*/
public class MyHello_App_Parms {
  
  /**
   * This main() method is the only method in this class.  This is a JavaDoc comment for a <b>method</b>.
   * @param args expecting 2 command parameters (first & last name).
   */
  public static void main( String [] args ) {
    //Single line comment.
    System.out.println("Hello World from an Application.");
    
    if ( args.length == 2 ) {
      System.out.println("1st parameter = " + args[0]); //Prints first command parameter.
      System.out.println("2nd parameter = " + args[1]); //Prints second command parameter.
    }
    
  }
}//eoc
//eof