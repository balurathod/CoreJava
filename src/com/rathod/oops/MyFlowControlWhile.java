package com.rathod.oops;
/*
 * MyFlowControlWhile.java
 *
 * Created on 09/09/01
 */

/**
 *
 * @author  Michael Thomas
 * @version 1.0
 */

//#################################################################################
public class MyFlowControlWhile extends MyTrain11 {
//#################################################################################  
  
//----------------------------------------------------------------------------------
  private String init_train() {
//----------------------------------------------------------------------------------

    String strMsg = "";

    strMsg += "Control Flow Examples:" + STRCRLF;

    strMsg += "Example of: while loop" + STRCRLF;
    strMsg += "  * Format #1: while ( boolean expression ) statement;" + STRCRLF;    
    strMsg += "  * Format #2: while ( boolean expression ) { statement(s) };" + STRCRLF;    
    strMsg += "  * The boolean expression is evaluated first.  If true then do loop." + STRCRLF;
    strMsg += "  * Like for loop without declaration & incrementing of variables." + STRCRLF;
    strMsg += STRCRLF;
    strMsg += MyWhile();
    strMsg += STRCRLF;

    strMsg += "Example of: do while loop" + STRCRLF;
    strMsg += "  * Format #1: do statement while (loop expression);" + STRCRLF;
    strMsg += "  * Format #2: do { statement(s) } while (loop expression);" + STRCRLF;
    strMsg += "  * The boolean expression is evaluated after the statements." + STRCRLF;
    strMsg += STRCRLF;
    strMsg += MyDoWhile();
    strMsg += STRCRLF;

    return strMsg;
  }    
  

  //-------------------------------------------------------------------------
  private String MyWhile() {
  //-------------------------------------------------------------------------
  
    String strMsg = "";
    
    int x = 0;
    int y = 0;
    boolean blnContinue = false;

    strMsg += "Basic while loops" + STRCRLF;
    
    //------------------------------------
    strMsg += "  * Very simple while loop ( w/ no code block )" + STRCRLF;
    while ( true ) break;

    //------------------------------------
    strMsg += "  * Very simple while loop ( w/ code blocks )" + STRCRLF;
    while ( true ) {
      break;
    }
    
    //------------------------------------
    strMsg += "  * While loop w/ boolean expression" + STRCRLF;
    x = 0;
    while ( x < 10 ) {
      x++;
    }
    strMsg += "    Loop: x = " + x  + STRCRLF;

    //------------------------------------
    strMsg += "  * Boolean condition is evaluated at the begining !" + STRCRLF;
    x = 11;
    while ( x < 10 ) {
      x++;
      strMsg += " Never gets here! " + STRCRLF;
    }
    strMsg += "    Never entered the while loop." + STRCRLF;
    
    //------------------------------------
    strMsg += "  * Using the break; statement" + STRCRLF;
    x = 0;
    while ( x < 10 ) {
      x++;
      if ( x == 5 ) break; //example of a break!
    }
    strMsg += "    Loop w/break: x = " + x  + STRCRLF;
    
    //------------------------------------
    strMsg += "  * Using the continue; statement" + STRCRLF;
    x = 0; y = 0;
    while ( x < 10 ) {
      x++;
      if ( x < 5  || x > 5 ) continue;  //example of a continue!
      y++;
    }
    strMsg += "    Loop w/continue: x = " + x + " y = " + y  + STRCRLF;

    //------------------------------------
    strMsg += "Additional examples" + STRCRLF;
    strMsg += "  * while ( blnContinue )" + STRCRLF;
    
    blnContinue = true;
    x = 0;
    while ( blnContinue ) {
      x++;
      if ( x == 5 ) blnContinue = false;
    }
    
    return strMsg;
     
  } // MyWhile()

  //-------------------------------------------------------------------------
  private String MyDoWhile() {
  //-------------------------------------------------------------------------
  
    String strMsg = "";
    
    int x = 0;
    int y = 0;

    strMsg += "Basic do/while loops" + STRCRLF;
    
    //------------------------------------
    strMsg += "  * Very simple do/while loop ( w/ no code block )" + STRCRLF;
    x = 0;
    do x++; while ( false );

    strMsg += "    x = " + x + STRCRLF;

    //------------------------------------
    strMsg += "  * Very simple do/while loop ( w/ code blocks )" + STRCRLF;
    x = 0;
    do {
      x++; 
    } while ( false );
    
    strMsg += "    x = " + x + STRCRLF;
    
    //------------------------------------
    strMsg += "  * Very simple do/while loop w/ boolean expression." + STRCRLF;
    x = 0;
    do {
      x++;
    } while ( x < 10 );

    strMsg += "    Loop: x = " + x + STRCRLF;
    
    //------------------------------------
    strMsg += "  * do/while - boolean condition is evaluated at the end !" + STRCRLF;
    x = 11;
    do {
      x++;
      strMsg += "    Gets here one time! " + STRCRLF;
    } while ( x < 5 );

    //------------------------------------
    strMsg += "  * Using the break statement." + STRCRLF;
    x = 0;
    do {
      x++;
      if ( x == 5 ) break; //example of a break!
    } while ( x < 10 );

    strMsg += "    Loop w/break: x = " + x + STRCRLF;
    
    //------------------------------------
    strMsg += "  * Using the continue statement." + STRCRLF;
    x = 0; y = 0;
    do {
      x++;
      if ( x < 5  || x > 5 ) continue;  //example of a continue!
      y++;
    } while ( x < 10 );

    strMsg += "    Loop w/continue: x = " + x + " y = " + y  + STRCRLF;

    return strMsg;
  } // MyDoWhile()

  
//----------------------------------------------------------------------------------  
  public void init () {
//----------------------------------------------------------------------------------  

    super.init_Components( this.init_train() );

  }
//----------------------------------------------------------------------------------      
  public static void main( String args [] ) {
//----------------------------------------------------------------------------------      

    java.awt.Frame objFrame = new java.awt.Frame( "Training Example JDK1.1" );  
    final MyFlowControlWhile applet = new MyFlowControlWhile();         //create the applet.
    MyTrain11.main_init( objFrame, applet, args ); //Static method to setup Applet and/or application.
      
  } //main()

} //eoc
//eof