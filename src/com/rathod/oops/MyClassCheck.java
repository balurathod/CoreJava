package com.rathod.oops;
/*
 * MyClassCheck.java
 *
 * Created on 05/14/02
 */

/**
 *
 * @author  Michael Thomas
 * @version 1.0
 */

//#################################################################################
public class MyClassCheck extends MyTrain11 {
//#################################################################################  
  
//----------------------------------------------------------------------------------
  private String init_train() {
//----------------------------------------------------------------------------------

    String strMsg = "";
    String strClassName = "";
    
    strMsg += "Class Check example (see if Class exists in JRE):" + STRCRLF;
    strMsg += "  Look at the source code's checkClassExist() method." + STRCRLF;
    strMsg += STRCRLF;

    strClassName = "java.lang.String";
    strMsg += "  Check exist (since 1.0): " + strClassName + " = " + checkClassExist( strClassName ) + STRCRLF;

    strClassName = "java.beans.Beans";
    strMsg += "  Check exist (since 1.1): " + strClassName + " = " + checkClassExist( strClassName ) + STRCRLF;


    strClassName = "java.util.Collections";
    strMsg += "  Check exist (since 1.2): " + strClassName + " = " + checkClassExist( strClassName ) + STRCRLF;

    strClassName = "java.awt.Robot";
    strMsg += "  Check exist (since 1.3): " + strClassName + " = " + checkClassExist( strClassName ) + STRCRLF;

    strClassName = "org.apache.crimson.parser.ValidatingParser";
    strMsg += "  Check exist (since 1.4 or crimson.jar): " + strClassName + " = " + checkClassExist( strClassName ) + STRCRLF;

    strClassName = "org.jdom.output.XMLOutputter";
    strMsg += "  Check exist (special JDOM class): " + strClassName + " = " + checkClassExist( strClassName ) + STRCRLF;
      
    return strMsg;
  }    
//----------------------------------------------------------------------------------
  public static boolean checkClassExist(String strClassName) {
//----------------------------------------------------------------------------------

    boolean blnCheck = false;
    
  	try {
  		Class.forName( strClassName );
  		blnCheck = true;
    } catch ( ClassNotFoundException e ) {
    	//Do nothing.
    } catch ( Exception e ) {
    	//Do nothing.
    }
  	
  	return blnCheck;
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
    final MyClassCheck applet = new MyClassCheck();         //create the applet.
    MyTrain11.main_init( objFrame, applet, args ); //Static method to setup Applet and/or application.
      
  } //main()

} //eoc
//eof