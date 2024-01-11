package com.rathod.oops;
/*
 * MyEscape.java
 *
 * Created on 09/18/01
 */

/**
 *
 * @author  Michael Thomas
 * @version 1.0
 */

//#################################################################################
public class MyEscape extends MyTrain11 {
//#################################################################################  

//----------------------------------------------------------------------------------
  private String init_train() {
//----------------------------------------------------------------------------------

    String strMsg = "";

    strMsg += "Escape Characters" + STRCRLF;

    strMsg += "  * tab - \\t" + STRCRLF;
    strMsg += "    10\t11\t12\t13\t14" + STRCRLF;
    strMsg += "    100\t101\t102\t103\t104" + STRCRLF;
    strMsg += "   " + 100 + '\t' + 101 + '\t' + 102 + '\t' + 103 + '\t' + 104 + STRCRLF;
    strMsg += "    Look at the source code for the next line of code" + STRCRLF;
    strMsg += "   " + (100 + '\t' ) + STRCRLF; //Numeric sum of 100 + the Unicode value of '\t'

    strMsg += "  * newline - \\n" + STRCRLF;
    strMsg += "This is the first line.\nThis is the second line." + STRCRLF;
    
    strMsg += "  * return - \\r" + STRCRLF;
    strMsg += "This is the first line.\rThis is the second line. (Note: needs newline)" + STRCRLF;   
    
    strMsg += "  * CR and LF - works with editors (notepad) \\r\\n" + STRCRLF;
    strMsg += "This is the first line.\r\nThis is the second line." + STRCRLF;
    
    strMsg += "  * Using backslash for special characters" + STRCRLF;
    strMsg += "    Look at this code: \\, \', \" " + STRCRLF;
    
    strMsg += "  * Backspace \\b - Not sure how to use this.  Maybe strikeout when printing." + STRCRLF;
    strMsg += "    I\bX" + STRCRLF;
    
    strMsg += "  * Formfeed \\f - note I used to use this for Formfeed when printing." + STRCRLF;
    strMsg += "    \f" + STRCRLF;
    
    return strMsg;
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
    final MyEscape applet = new MyEscape();         //create the applet.
    MyTrain11.main_init( objFrame, applet, args ); //Static method to setup Applet and/or application.
      
  } //main()

} //eoc
//eof