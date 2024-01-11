package com.rathod.oops;
/*
 * MyLiterals.java
 *
 * Created on 09/18/01
 */

/**
 *
 * @author  Michael Thomas
 * @version 1.0
 */

//#################################################################################
public class MyLiterals extends MyTrain11 {
//#################################################################################  

  //Integers
  byte    bytMy;    
  short   shtMy;    
  int     intMy;     
  long    lngMy;    
                    
  //Floating decimals
  float   fltMy;    //signed 32-bit +/- 3.4 E 38   (6-7 digits of accuracy)
  double  dblMy;    //signed 64-bit +/- 1.7 E 308  (14-15 digits of accuracy)

  char    chrMy;    //16-bit Unicode character  ( 2 - Bytes ! )
  boolean blnMy;    //true or false
  
  String  strMy;    //String Object

 
//----------------------------------------------------------------------------------
  private String init_train() {
//----------------------------------------------------------------------------------

    String strMsg = "";

    strMsg += "Literals" + STRCRLF;

    strMsg += "Assigning Literal Values to Primitives (see code)" + STRCRLF;
    
    bytMy = (byte) 10;  strMsg += "  * bytMy = (byte) 10;  //display: " + bytMy + STRCRLF; 
    shtMy = (short) 10; strMsg += "  * shtMy = (short) 10; //display: " + shtMy + STRCRLF; 
    intMy = 10;         strMsg += "  * intMy = 10;         //display: " + intMy + STRCRLF; 
    lngMy = 10L;        strMsg += "  * lngMy = (long) 10;  //display: " + lngMy + STRCRLF; 
  
    fltMy = 10.0F;      strMsg += "  * fltMy = 10.0F;      //display: " + fltMy + STRCRLF; 
    dblMy = 10.0;       strMsg += "  * dblMy = 10.0;       //display: " + dblMy + STRCRLF; 
    
    chrMy = 'A';        strMsg += "  * chrMy = 'A';        //display: " + chrMy + STRCRLF; 
    chrMy = '\u0041';   strMsg += "  * chrMy = \'\\u0041\\';  //display: " + chrMy + STRCRLF;     
    blnMy = true;       strMsg += "  * blnMy = true;       //display: " + blnMy + STRCRLF; 
    blnMy = false;      strMsg += "  * blnMy = false;      //display: " + blnMy + STRCRLF; 

    strMsg += "  * Look at source code for other possiblities and compile errors." + STRCRLF;
    //Other possibilities
    lngMy = 10l;   //Use lower case vs 10L (Note: Look like the number 1 - confusing!)
    fltMy = 10.0f; //Use lower case vs 10.0F
    fltMy = 10F;   //Possible but not clear. I suggest using: 10.0F
    
    lngMy = (long) 10.0; //Use casting instead of 10.0L
    fltMy = (float) 10;  //Use casting instead of 10F.
    
    //Compile errors.
    //lngMy = 10.0L; //Compile Error: Incompatible type.  Can't convert double to long.
    
    strMsg += "Assigning Literal Values to Strings (see code)" + STRCRLF;

    strMy = "Hello World"; strMsg += "  * strMy = \"Hello World\";   //display: " + strMy + STRCRLF;
    
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
    final MyLiterals applet = new MyLiterals();         //create the applet.
    MyTrain11.main_init( objFrame, applet, args ); //Static method to setup Applet and/or application.
      
  } //main()

} //eoc
//eof