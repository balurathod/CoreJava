package com.rathod.oops;
/*
 * MyObjectEqual.java
 *
 * Created on 09/09/01
 */

/**
 *
 * @author  Michael Thomas
 * @version 1.0
 */

//#################################################################################
public class MyObjectEqual extends MyTrain11 {
//#################################################################################  

  private boolean blnMyInstance;
  private String  strMyInstanceEx1;
  private String  strMyInstanceEx2;
 
//----------------------------------------------------------------------------------
  private String init_train() {
//----------------------------------------------------------------------------------

    String strMsg = "";

    strMsg = "All Objects: == vs equals()" + STRCRLF;
    
    boolean blnMy;
    String strEx1;
    String strEx2;
    String strEx3;
    Integer objIntEx1;
    Integer objIntEx2;
    Object objObject1;
    Object objObject2;

    //******************************************************************************************
    // ==
    //******************************************************************************************
    strMsg += STRCRLF;
    strMsg += "The == evaluates if the reference points to the same object in memory." + STRCRLF;
    strMsg += "  * Next, 2 separate objects holding the same value." + STRCRLF;
    strMsg += "    \"==\" returns false because there is 2 separate objects." + STRCRLF;
    
    //---------------------
    strEx1 = new String ("Testing");
    strEx2 = new String ("Testing");
    
    strMsg += "    strEx1 = new String (\"Testing\");" + STRCRLF;
    strMsg += "    strEx2 = new String (\"Testing\");" + STRCRLF;
    
    blnMy = ( strEx1 == strEx2 );
    strMsg += "    blnMy = ( strEx1 == strEx2 ); Results: " + blnMy + STRCRLF;
    
    //---------------------
    strMsg += "  * Next, 2 separate references to the same object." + STRCRLF;
    strMsg += "    \"==\" returns true because they point to the same object." + STRCRLF;
    //---------------------
    
    strEx3 = strEx1;
    strMsg += "    strEx3 = strEx1;" + STRCRLF;
    
    blnMy = ( strEx1 == strEx3 );
    strMsg += "    blnMy = ( strEx1 == strEx3 ); Results: " + blnMy + STRCRLF;
    
    //---------------------
    strMsg += "  * Another example of \"==\" using the Integer class." + STRCRLF;
    //---------------------
    
    objIntEx1 = new Integer( 100 );
    objIntEx2 = new Integer( 100 );
    
    strMsg += "    objIntEx1 = new Integer( 100 );" + STRCRLF;
    strMsg += "    objIntEx2 = new Integer( 100 );" + STRCRLF;    
    
    blnMy     = ( objIntEx1 == objIntEx2 );
    strMsg += "    blnMy = ( objIntEx1 == objIntEx2 ); Results: " + blnMy + STRCRLF;    

    //---------------------
    strMsg += "  * Another example of \"==\" using a Custom class." + STRCRLF;
    //---------------------
    
    MyClass1 objMyClass1A = new MyClass1("Testing");
    MyClass1 objMyClass1B = new MyClass1("Testing");
    
    blnMy = ( objMyClass1A == objMyClass1B );
    strMsg += "    blnMy = ( objMyCass1 == objMyClass2 ); Results: " + blnMy + STRCRLF;    

    //---------------------
    MyClass2 objMyClass2A = new MyClass2();
    MyClass2 objMyClass2B = new MyClass2();
    
    blnMy = ( objMyClass2A == objMyClass2B );
    strMsg += "    blnMy = ( objMyCass2A == objMyClass2B ); Results: " + blnMy + STRCRLF;    

    //---------------------
    objObject1 = new Object();
    objObject2 = new Object();

    blnMy = ( objObject1 == objObject2 );
    strMsg += "    blnMy = ( objObject1 == objObject2 ); Results: " + blnMy + STRCRLF;    

    //******************************************************************************************
    // equals()
    //******************************************************************************************
    strMsg += STRCRLF;
    strMsg += "equals() - returns the results of running the equals method. " + STRCRLF;

    blnMy = strEx1.equals( strEx2 );
    strMsg += "    blnMy = strEx1.equals( strEx2 ); Results: " + blnMy + STRCRLF;
    strMsg += "      strEx1.toString(); Results: " + strEx1.toString() + STRCRLF;
    strMsg += "      strEx2.toString(); Results: " + strEx2.toString() + STRCRLF;    
    
    blnMy = objIntEx1.equals( objIntEx2 );
    strMsg += "    blnMy = ( objIntEx1.equals( objIntEx2 ) ); Results: " + blnMy + STRCRLF;
    strMsg += "      objIntEx1.toString(); Results: " + objIntEx1.toString() + STRCRLF;
    strMsg += "      objIntEx2.toString(); Results: " + objIntEx2.toString() + STRCRLF;    

    blnMy = objMyClass1A.equals( objMyClass1B );
    strMsg += "    blnMy = ( objMyClass1A.equals( objMyClass1B ) ); Results: " + blnMy + STRCRLF;
    strMsg += "      objMyClass1A.toString(); Results: " + objMyClass1A.toString() + STRCRLF;
    strMsg += "      objMyClass1B.toString(); Results: " + objMyClass1B.toString() + STRCRLF;    

    blnMy = objMyClass2A.equals( objMyClass2B );
    strMsg += "    blnMy = ( objMyClass2A.equals( objMyClass2B ) ); Results: " + blnMy + STRCRLF;
    strMsg += "      objMyClass12A.toString(); Results: " + objMyClass2A.toString() + STRCRLF;
    strMsg += "      objMyClass2B.toString(); Results: " + objMyClass2B.toString() + STRCRLF;    
    
    blnMy = objObject1.equals( objObject2 );
    strMsg += "    blnMy = ( objObject1.equals( objObject2 ) ); Results: " + blnMy + STRCRLF;
    strMsg += "      objObject1.toString(); Results: " + objObject2.toString() + STRCRLF;
    strMsg += "      objObject2.toString(); Results: " + objObject2.toString() + STRCRLF;    
    
    
    //******************************************************************************************
    // The String class and literal assignments.
    //******************************************************************************************
    strMsg += STRCRLF;
    strMsg += "Strings created by assignment. (Note: Objects are managed by Java)" + STRCRLF;    
    strMsg += "Note:  If the literal String assignment is identical to another String created by a literal assignment then" + STRCRLF;
    strMsg += "       a new String object is not created.  A reference to an existing String " + STRCRLF;
    strMsg += "       object, which was created by a literal assignment, is returned. (see example code)" + STRCRLF;
    
    strMsg += "  * One String Object w/ 2 references." + STRCRLF;
    
    strEx1 = "Hello World";
    strEx2 = "Hello World";

    strMsg += "    strEx1 = \"Hello World\"; Results: " + strEx1 + STRCRLF;
    strMsg += "    strEx2 = \"Hello World\"; Results: " + strEx2 + STRCRLF;

    blnMy  = (strEx1 instanceof String);
    strMsg += "    (strEx1 instanceof String); Results: " + blnMy + STRCRLF;
    
    blnMy = strEx1.equals( "Hello World" );
    strMsg += "    blnMy = strEx1.equals( \"Hello World\" ); Results: " + blnMy + STRCRLF;

    blnMy = strEx1.equals( strEx2 );
    strMsg += "    blnMy = strEx1.equals( strEx2 ); Results: " + blnMy + STRCRLF;
 
    blnMy = (strEx1 == strEx2 );
    strMsg += "    blnMy = (strEx1 == strEx2 ); Results: " + blnMy + STRCRLF;

    blnMy = (strEx1 == "Hello World");
    strMsg += "    blnMy = (strEx1 == \"Hello World\"); Results: " + blnMy + STRCRLF;

    //---------------------
    strMsg +="  * 2 String Objects w/ 2 references." + STRCRLF;
    //---------------------
    blnMy = (strEx1 == new String("Hello World"));
    strMsg += "    blnMy = (strEx1 == new String(\"Hello World\")); Results: " + blnMy + STRCRLF;

    //---------------------
    strMsg += "  * 2 String Objects w/ 3 references." + STRCRLF;
    //---------------------
    
    strEx1 = "Hello World";
    strEx2 = new String("Hello World");
    strEx3 = "Hello World"; //Now a reference to the same object as strEx1.
    
    strMsg += "    strEx1 = \"Hello World\";" + STRCRLF;
    strMsg += "    strEx2 = new String(\"Hello World\");" + STRCRLF;
    strMsg += "    strEx3 = \"Hello World\";" + STRCRLF;
    
    blnMy = (strEx1 == strEx2 );
    strMsg += "    blnMy = (strEx1 == strEx2 ); Results: " + blnMy + STRCRLF;

    blnMy = (strEx2 == strEx3 );
    strMsg += "    blnMy = (strEx2 == strEx3 ); Results: " + blnMy + STRCRLF;

    blnMy = (strEx1 == strEx3 );
    strMsg += "    blnMy = (strEx1 == strEx3 ); Results: " + blnMy + STRCRLF;

    //---------------------
    strMsg += "  * 3 String objects w/ 3 references." + STRCRLF;
    //---------------------
    
    strEx1 = new String("Hello World");
    strEx2 = new String("Hello World");
    strEx3 = "Hello World"; 
    
    strMsg += "    strEx1 = new String(\"Hello World\");" + STRCRLF;
    strMsg += "    strEx2 = new String(\"Hello World\");" + STRCRLF;
    strMsg += "    strEx3 = \"Hello World\";" + STRCRLF;
    
    blnMy = (strEx1 == strEx2 );
    strMsg += "    blnMy = (strEx1 == strEx2 ); Results: " + blnMy + STRCRLF;

    blnMy = (strEx2 == strEx3 );
    strMsg += "    blnMy = (strEx2 == strEx3 ); Results: " + blnMy + STRCRLF;

    blnMy = (strEx1 == strEx3 );
    strMsg += "    blnMy = (strEx1 == strEx3 ); Results: " + blnMy + STRCRLF;
    
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
    final MyObjectEqual applet = new MyObjectEqual();         //create the applet.
    MyTrain11.main_init( objFrame, applet, args ); //Static method to setup Applet and/or application.
      
  } //main()

//##################################################################################  
  class MyClass1 { 
//##################################################################################  
    private String strHold;
  
    public MyClass1 ( String strEx ) {
      this.strHold = strEx; 
    }
  
    public MyClass1 () {
      this.strHold = "MyClass1 - Hello"; 
    }
    
    public String toString() { return this.strHold; }
    
    public boolean equals( MyClass1 objMyClass1 ) {

      String strThis    = this.toString();
      String strCompare = objMyClass1.toString();
      
      return strThis.equals( strCompare );
    }
  }
//##################################################################################  
  class MyClass2 { 
//##################################################################################  
    //Notice, not equals() method, therefore will call the super.equals() which is 
    //  the Object classes equals() method.
  }
    
} //eoc
//eof