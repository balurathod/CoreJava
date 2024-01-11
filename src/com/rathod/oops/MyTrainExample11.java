package com.rathod.oops;
/*
 * MyTrainExample11.java
 *
 * Created on 09/09/01
 */

/**
 *
 * @author  Michael Thomas
 * @version 1.0
 */

//#################################################################################
public class MyTrainExample11 extends MyTrain11 {
//#################################################################################  
  
//----------------------------------------------------------------------------------
  private String init_train() {
//----------------------------------------------------------------------------------

    String strMsg = "";
    String strFiller = "This is a test. 123456789 123456789";
      
    for ( int x=1; x <= 50; x++ ) {
      strMsg += "<"+x+"> " + "Training information... (JDK1.1): " + strFiller + STRCRLF;
    }
  
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
    final MyTrainExample11 applet = new MyTrainExample11();         //create the applet.
    MyTrain11.main_init( objFrame, applet, args ); //Static method to setup Applet and/or application.
      
  } //main()

} //eoc
//eof