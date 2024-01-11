package com.rathod.oops;
/*
 * MyStringTokenizer.java
 *
 * Created on 09/09/01
 */

/**
 *
 * @author  Michael Thomas
 * @version 1.0
 */



//#################################################################################
public class MyStringTokenizer extends MyTrain11 {
//#################################################################################  
  
//----------------------------------------------------------------------------------
  private String init_train() {
//----------------------------------------------------------------------------------

    String strMsg = "";
    String strMy, strTest;
    java.util.StringTokenizer strtokMy;

    strMsg += "StringTokenizer Class" + STRCRLF;
    
    //---------------------------------------
    strMsg += "  * StringTokenizer: Example w/ hasMoreTokens() & nextToken()" + STRCRLF;
    
    strMy = "This is a test of the StringTokenizer.";
    strMsg += "    strMy = \"This is a test of the StringTokenizer.\";" + STRCRLF;
    
    strtokMy = new java.util.StringTokenizer ( strMy );
    strMsg += "    strtokMy = new java.util.StringTokenizer ( strMy );" + STRCRLF;
    
    while (strtokMy.hasMoreTokens()) {
      strMsg += "    <" + strtokMy.nextToken() + ">" + STRCRLF;
    }
    
    //--------------------------------------------------------------------------------
    strMsg += "  * StringTokenizer: Example w/ hasMoreElements() & nextElement()" + STRCRLF;
    
    strMy = "This is a test of the StringTokenizer.";
    strMsg += "    strMy = \"This is a test of the StringTokenizer.\";" + STRCRLF;
    
    strtokMy = new java.util.StringTokenizer ( strMy );
    strMsg += "    strtokMy = new java.util.StringTokenizer ( strMy );" + STRCRLF;
    
    
    while (strtokMy.hasMoreElements()) {
      strTest = (String) strtokMy.nextElement();
      strMsg += "    <" + strTest + ">" + STRCRLF;
    }

    //------------------------------------------------    
    strMsg += "  * countTokens()" + STRCRLF;
    strTest = "";
    strtokMy = new java.util.StringTokenizer ( strMy );
    strMsg += "    Tokens before while loop = " + strtokMy.countTokens() + STRCRLF;  
    while (strtokMy.hasMoreElements()) {
      strTest += (String) strtokMy.nextElement();
      //strTest += strtokMy.nextElement().toString();  //This is identicle to line above.
    }
    strMsg += "    Tokens after while loop = " + strtokMy.countTokens() + STRCRLF;  
    strMsg += "    strTest = " + strTest + STRCRLF;

    //---------------------------------------
    strMsg += "  * StringTokenizer: Token = , (Comma Delimited)" + STRCRLF;
    
    strMy = "1,2,3";
    strMsg += "    strMy = \"1,2,3\";" + STRCRLF;
    
    strtokMy = new java.util.StringTokenizer ( strMy, "," );
    strMsg += "    strtokMy = new java.util.StringTokenizer ( strMy, \",\" );" + STRCRLF;
    
    while (strtokMy.hasMoreTokens()) {
      strMsg += "    <" + strtokMy.nextToken() + ">" + STRCRLF;
    }

    //---------------------------------------
    strMsg += "  * StringTokenizer (Return Token!!!): Token = , (Comma Delimited)" + STRCRLF;
    
    strMy = "1,2,3";
    strMsg += "    strMy = \"1,2,3\";" + STRCRLF;
    
    strtokMy = new java.util.StringTokenizer ( strMy, ",", true ); //Return Token is true.
    strMsg += "    strtokMy = new java.util.StringTokenizer ( strMy, \",\", true );" + STRCRLF;
    
    while (strtokMy.hasMoreTokens()) {
      strMsg += "    <" + strtokMy.nextToken() + ">" + STRCRLF;
    }

    //---------------------------------------
    strMsg += "  * StringTokenizer: Token \",\" (Comma & Quote Delimited)" + STRCRLF;
    
    strMy = "\"1\",\"2\",\"3\"";
    strMsg += "    strMy = \"\"1\",\"2\",\"3\"\";" + STRCRLF;
    
    strtokMy = new java.util.StringTokenizer ( strMy, "\",\"" );
    strMsg += "    strtokMy = new java.util.StringTokenizer ( strMy, \"\",\"\" );" + STRCRLF;
    
    while (strtokMy.hasMoreTokens()) {
      strMsg += "    <" + strtokMy.nextToken() + ">" + STRCRLF;
    }

    //---------------------------------------
    strMsg += "  * StringTokenizer (Return Tokens): Token \",\" (Comma & Quote Delimited)" + STRCRLF;
    
    strMy = "\"1\",\"2\",\"3\"";
    strMsg += "    strMy = \"\"1\",\"2\",\"3\"\";" + STRCRLF;
    
    strtokMy = new java.util.StringTokenizer ( strMy, "\",\"", true); //Return tokens = true.
    strMsg += "    strtokMy = new java.util.StringTokenizer ( strMy, \"\",\"\" );" + STRCRLF;
    
    while (strtokMy.hasMoreTokens()) {
      strMsg += "    <" + strtokMy.nextToken() + ">" + STRCRLF;
    }


    //---------------------------------------
    strMsg += "  * StringTokenizer: Default Tokens (\" \\t\\n\\r\\f\")" + STRCRLF;
    
    strMy = "1 2\t3\n4\r5\f";
    strMsg += "    (see code for String value)" + STRCRLF;
    strMsg += "    Note: Default tokens include the space, " + STRCRLF;
    strMsg += "    \\t=tab, \\n=newline, \\r-carriage-return, \\f-form feed" + STRCRLF;
    
    strtokMy = new java.util.StringTokenizer ( strMy );
    strMsg += "    strtokMy = new java.util.StringTokenizer ( strMy );" + STRCRLF;
    
    while (strtokMy.hasMoreTokens()) {
      strMsg += "    <" + strtokMy.nextToken() + ">" + STRCRLF;
    }

    //-------------------------------------------
    strMsg += "You may want to play with:" + STRCRLF;
    strMsg += "  * nextToken(String delim)" + STRCRLF;
    
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
    final MyStringTokenizer applet = new MyStringTokenizer();         //create the applet.
    MyTrain11.main_init( objFrame, applet, args ); //Static method to setup Applet and/or application.
      
  } //main()

} //eoc
//eof