package com.rathod.oops;
/*
 * MyFlowControlIfElse.java
 *
 * Created on 10/01/01
 */

/**
 *
 * @author  Michael Thomas
 * @version 1.0
 */

//#################################################################################
public class MyFlowControlIfElse extends MyTrain11 {
//#################################################################################  
  
//----------------------------------------------------------------------------------
  private String init_train() {
//----------------------------------------------------------------------------------

    String strMsg = "";

    strMsg += "Control Flow: If/Else & ?" + STRCRLF;
    strMsg += "*** Make sure you look at the source code! ***" + STRCRLF;
    strMsg += STRCRLF;

    strMsg += "Control Flow: If/Else" + STRCRLF;
    strMsg += MyIfElse();    
    strMsg += STRCRLF;
    
    strMsg += "Control Flow: ? (inline if)" + STRCRLF;
    strMsg += MyInlineIf();

    return strMsg;
  }    
  
  //-------------------------------------------------------------------------
  private String MyIfElse() {
  //-------------------------------------------------------------------------

    String strMsg = "";
    boolean blnDebug = true;
    
    int intX = 1;
    int intY = 1;

    strMsg += "Rules & notes:" + STRCRLF;
    strMsg += "  * The if expression needs to evaluate to a boolean." + STRCRLF;
    strMsg += "    if (boolean expression) statement;" + STRCRLF;
    strMsg += "    if (boolean expression) statement; else statement;" + STRCRLF;
    strMsg += "    if (boolean expression) statement; else if (boolean expression); else statement;" + STRCRLF;
    strMsg += "  * For clearer code, I suggest that you always use code braces {}." + STRCRLF;    
    strMsg += STRCRLF;
    
    //------------------------
    
    strMsg += "One line simple if statement.  Good for debuging." + STRCRLF;
    
    if ( blnDebug ) strMsg += "  * blnDebug = true" + STRCRLF;

    //------------------------
    
    strMsg += "Simple if-else, w/ block {} (suggested because clearer coding)" + STRCRLF;

    if ( true ) {
      strMsg += "  * true" + STRCRLF;
    } else {
      strMsg += "  * false" + STRCRLF;
    }
    
    //------------------------
    
    strMsg += "Simple if-else, no block {}" + STRCRLF;

    if ( true )
      strMsg += "  * true" + STRCRLF;
    else
      strMsg += "  * false" + STRCRLF;

    //------------------------
    
    strMsg += "Potential problems if you don't use code blocks {}" + STRCRLF;

    if ( true )
      strMsg += "  * true" + STRCRLF;
    else
      strMsg += "  * false" + STRCRLF;
      strMsg += "  * Why did this show?  See the potential problem!" + STRCRLF;
      
    //------------------------
      
    strMsg += "Code without braces {} can be tricky." + STRCRLF;
    intX = 1; intY = 1;
    if ( intX == 1 )
      if (intY == 0)
        strMsg += "Should not show. X == 1 && intY == 0" + STRCRLF;
    else  // this else goes with ( intY == 0 ), no {} used.
      strMsg += "  * 1-Figure out why this line shows! A littly TRICKY !!!" + STRCRLF;

    //------------------------
    strMsg += "Code with braces {} is clearer." + STRCRLF;
    intX = 1; intY = 1;
    if ( intX == 1 ) {
      if (intY == 0)
        strMsg += "Should not show. X == 1 && intY == 0" + STRCRLF;
    } else {  // this else goes with ( intX == 1 ), becuase of {}
      strMsg += "Now you cann't see me." + STRCRLF;
    }
    strMsg += "  * look at the code!" + STRCRLF;

    //------------------------
    strMsg += "Nested if statements" + STRCRLF;

    if ( true ) {
      strMsg += "  * level #1" + STRCRLF;
      if ( true ) {
        strMsg += "  * level #2" + STRCRLF;
        if ( true ) {
          strMsg += "  * level #3" + STRCRLF;
          boolean blnTesting = false;
          if ( blnTesting ) {
          } else {
            strMsg += "  * level #4" + STRCRLF;
            strMsg += "  * You could add many more!" + STRCRLF;
          }
        }
      }
      strMsg += "  * level #1 (end)" + STRCRLF;
    } else {    
    }


    //------------------------
    strMsg += "if, else if, else (no code blocks {}) - notice compile error! " + STRCRLF;
    intX = 1; intY = 1;
    if ( intX == 1 && intY == 0 )
      strMsg += "  * 1 & 0" + STRCRLF;
    //strMsg += "Problem" + STRCRLF; //Compile Error: 'else' without 'if'. Need code block {}.
    else if ( intX == 0 && intY == 1 )
      strMsg += "  * 0 & 1" + STRCRLF;
    else if ( intX == 1 && intY == 1 )
      strMsg += "  * 1 & 1" + STRCRLF;
    else
      strMsg += "  *else" + STRCRLF;  

    strMsg += "if, else if, else (w/ code blocks {}) " + STRCRLF;
    intX = 1; intY = 1;
    if ( intX == 1 && intY == 0 ) {
      strMsg += "  * 1 & 0" + STRCRLF;
    } else if ( intX == 0 && intY == 1 ) {
      strMsg += "  * 0 & 1" + STRCRLF;
    } else if ( intX == 1 && intY == 1 ) {
      strMsg += "  * 1 & 1" + STRCRLF;
    } else {
      strMsg += "  * else" + STRCRLF;  
    }
    
    strMsg += "Tricky if statements: (see code) - not good programming idea. " + STRCRLF;
    strMsg += "  * One line if, else if, else statement" + STRCRLF;    
    if ( true ) strMsg += "    if-true"; else if ( true ) strMsg += "else if-true"; else strMsg += "else-true";
    
    return strMsg;
    
  }//MyIfElse()

  //-------------------------------------------------------------------------
  private String MyInlineIf() {
  //-------------------------------------------------------------------------

    String strMsg = "";
    boolean blnDebug = true;
    
    strMsg += "Rules:" + STRCRLF;
    strMsg += "  * ( boolean expression ) ? <true statement> : <false statements>; " + STRCRLF;
    strMsg += "  * boolean expression ? <true statement> : <false statements>; " + STRCRLF;

    strMsg += "Fundamental examples" + STRCRLF;
    strMsg += "  * Not using () around boolean expression: ";
    strMsg +=  blnDebug  ? "true" : "false" ;
    strMsg += STRCRLF;
    
    strMsg += "  * Using () around boolean expression is clearer: ";
    strMsg +=  ( blnDebug )  ? "true" : "false" ;
    strMsg += STRCRLF;

    strMsg += "Additional examples" + STRCRLF;
    strMsg += "  * String returned: " + ( ( blnDebug ) ? "blnDebug = true" : "blnDebug = true" ) + STRCRLF;
    strMsg += "  * Primative int returned: " + ( ( blnDebug ) ? 1 : 2 ) + STRCRLF;
    strMsg += "  * Methods: " + ( ( blnDebug ) ? MyTrue() : MyFalse() ) + STRCRLF;
    
    return strMsg;
  }

  //-------------------------------------------------------------------------
  private String MyTrue() {
  //-------------------------------------------------------------------------
    return "true";
  }

  //-------------------------------------------------------------------------
  private String MyFalse() {
  //-------------------------------------------------------------------------
    return "false";
  }
//----------------------------------------------------------------------------------  
  public void init () {
//----------------------------------------------------------------------------------  

    super.init_Components( this.init_train() );

  }
//----------------------------------------------------------------------------------      
  public static void main( String args [] ) {
//----------------------------------------------------------------------------------      

    java.awt.Frame objFrame = new java.awt.Frame( "Training Example JDK1.1" );  
    final MyFlowControlIfElse applet = new MyFlowControlIfElse();         //create the applet.
    MyTrain11.main_init( objFrame, applet, args ); //Static method to setup Applet and/or application.
      
  } //main()

} //eoc
//eof