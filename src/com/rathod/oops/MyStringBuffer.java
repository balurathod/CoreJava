package com.rathod.oops;
/*
 * MyStringBuffer.java
 *
 * Created on 09/09/01
 */

/**
 *
 * @author  Michael Thomas
 * @version 1.0
 */

//#################################################################################
public class MyStringBuffer extends MyTrain11 {
//#################################################################################  
  
//----------------------------------------------------------------------------------
  private String init_train() {
//----------------------------------------------------------------------------------

    String strMsg = "";
    StringBuffer strbufMy;
    StringBuffer strbufTest, strbufTest2;

    strMsg += "StringBuffer Class" + STRCRLF;
    strMsg += "  !!! Make sure you look at the source code !!!" + STRCRLF;

    strMsg += "  * Creating a blank StringBuffer and appending info." + STRCRLF;
    
    strbufMy = new StringBuffer();
    strbufMy.append("Hello World");
    strMsg += "    " + strbufMy + STRCRLF;
    
    strbufMy.append(" - ").append("Michael Thomas").append(", you're #").append(1);
    strMsg += "    " + strbufMy + STRCRLF; 
   
    //-----------------------------------------------
    strMsg += "  * Creating a StringBuffer w/info, then appending additional info." + STRCRLF;
    
    strbufMy = new StringBuffer( "Hello World" );
    strbufMy.append( ',' );
    strbufMy.append( 1 );
    strbufMy.append( ", " );
    strbufMy.append( 10L ).append(", ");
    strbufMy.append( 10.5F ).append(", ");
    strbufMy.append( 10.5D ).append(", ");
    char [] acharMy = {'a','r','r','a','y',' ','o','f',' ','c','h','a','r'};
    strbufMy.append( acharMy ).append(". ");
    
    strMsg += "    " + strbufMy + STRCRLF;

    //-----------------------------------------------
    strMsg += "insert(), JDK1.2 only: delete(), replace()" + STRCRLF;
    strMsg += "  * Indexes start at 0." + STRCRLF;
    strMsg += "  * Include chars upto, but not including, the stop index." + STRCRLF;
    strMsg += "  See code for Examples: " + STRCRLF;
    
    strbufMy = new StringBuffer( "MyHello World" );
//    strbufTest = strbufMy.delete( 2, 7 );
//    strMsg += "    delete(): " + strbufTest + STRCRLF;

    strbufMy = new StringBuffer( "My World" );
    strbufTest = strbufMy.insert( 2, "Hello" );
    strMsg += "    insert(): " + strbufTest + STRCRLF;
    
    strbufMy = new StringBuffer( "MyHello World" );
//    strbufTest = strbufMy.replace( 2, 7, "Excellent" );
//    strMsg += "    replace(): " + strbufTest + STRCRLF;

    //-----------------------------------------------
    strMsg += "length() & toString()" + STRCRLF;

    strbufMy = new StringBuffer( "12345" );
    strMsg += "  strbufMy = new StringBuffer( \"12345\" );" + STRCRLF;
    strMsg += "  * length(): " + strbufMy.length() + STRCRLF;
    strMsg += "  * toString(): " + strbufMy.toString() + STRCRLF;
    
    strbufMy = new StringBuffer();
    strMsg += "  strbufMy = new StringBuffer();" + STRCRLF;
    
    strbufMy.append( 12345 );
    strMsg += "  strbufMy.append( 12345 );" + STRCRLF;

    strMsg += "  * length(): " + strbufMy.length() + STRCRLF;
    strMsg += "  * toString(): " + strbufMy.toString() + STRCRLF;
    
    strbufMy = new StringBuffer( 12345 );
    strMsg += "  WARNING:  This creates a buffer with initial capacity of 12345 chars" + STRCRLF; 
    strMsg += "  strbufMy = new StringBuffer( 12345 );" + STRCRLF;
    strMsg += "  * length(): " + strbufMy.length() + STRCRLF;
    strMsg += "  * toString(): " + strbufMy.toString() + STRCRLF;
    
    //-----------------------------------------------
    strMsg += "You may want to play with:" + STRCRLF;
    strMsg += "  * charAt(), substring(), reverse(), deleteCharAt()" + STRCRLF;

    
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
    final MyStringBuffer applet = new MyStringBuffer();         //create the applet.
    MyTrain11.main_init( objFrame, applet, args ); //Static method to setup Applet and/or application.
      
  } //main()

} //eoc
//eof