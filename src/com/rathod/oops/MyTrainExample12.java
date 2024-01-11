package com.rathod.oops;
/*
 * MyTrainExample12.java
 *
 * Created on 09/09/01
 */

/**
 *
 * @author  Michael Thomas
 * @version 1.0
 */

//#################################################################################
public class MyTrainExample12 extends MyTrain12 {
//#################################################################################  
  
//----------------------------------------------------------------------------------
  private String init_train() {
//----------------------------------------------------------------------------------

  String strMsg = "";
  String strFiller = "This is a test. 123456789 123456789";
      
    for ( int intLine=1; intLine <= 50; intLine++ ) {
      strMsg += "<"+intLine+"> " + "Training information... (JDK1.2): " + strFiller + STRCRLF;
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

    javax.swing.JFrame objFrame = new javax.swing.JFrame( "Training Example JDK1.2" );  
    final MyTrainExample12 applet = new MyTrainExample12();         //create the applet.
    MyTrain12.main_init( objFrame, applet, args ); //Static method to setup Applet and/or application.
      
  } //main()

} //eoc
//eof