package com.rathod.oops;
/*
 * MyStatic.java
 *
 * Created on 09/09/01
 */

/**
 *
 * @author  Michael Thomas
 * @version 1.0
 */

//#################################################################################
public class MyStatic extends MyTrain11 {
//#################################################################################  
  
  static int intStatic       = 1;
  static String strStaticMsg = "";
  int intNonStatic = 0;
  
  static {   //class static initializer block. Belongs to class!
    //Note:  STRCRLF is static in the super class MyTrain11.
    strStaticMsg += "  Start: static initializer block." + STRCRLF;
    strStaticMsg += "  * intStatic, value: " + intStatic + STRCRLF;
    
    intStatic++;
    strStaticMsg += "  * intStatic++, value: " + intStatic + STRCRLF;
    
    MyStatic.intStatic++; //Same as above.  Must use this if in another object.
    strStaticMsg += "  * MyStatic.intStatic++, value: " + intStatic + STRCRLF;

    strStaticMsg += "  * Example of running a static method in the static initializer" + STRCRLF;
    strStaticMsg += "    " + strStaticHello();
    strStaticMsg += "  * Compile Errors: look at source code examples" + STRCRLF;
    
    //strStaticMsg += " " + intNonStatic; //Can't make a static reference to nonstatic variable.
    //strStaticMsg += " " + strNonStaticHello(); //Can't make static reference to method 
                                                      //private String strNonStaticHello() in class 
                                                      //MyStatic
    
    strStaticMsg += "  * Creating a local variable." + STRCRLF;
    
    int intNewLocal = 2;
    strStaticMsg += "  int intNewLocal = 2;  value =" + intNewLocal + STRCRLF; 
    
    strStaticMsg += "    Stop: static initializer block. " + intStatic + STRCRLF;
  } //static initializer
  
//----------------------------------------------------------------------------------
  private String init_train() {
//----------------------------------------------------------------------------------

    String strMsg = "";
    String strTesting = "";
    //static int intLocalStatic = 0; //This modifier cannot be used in declaring a local variable.
    
    strMsg += "Static vs Non-Static: variables, methods, initializers." + STRCRLF;
    strMsg += "  * Static members belong to the Class.  Objects can access them." + STRCRLF;
    strMsg += "  * Static members cannot access instance (object) members." + STRCRLF;
    strMsg += "  * A local variable cannot be declared static. (see example of intLocalStatic)" + STRCRLF;
    strMsg += "Static Initializers" + STRCRLF;
    strMsg += "  * Static initializer method is run prior to the main() method." + STRCRLF;
    strMsg += "  * Look at the Static Initializer and main() methods first" + STRCRLF;
    strMsg += "  * The following values were loaded in the static initializer & main" + STRCRLF;
    strMsg += strStaticMsg + STRCRLF;

    strMsg += "Accessing static methods" + STRCRLF;
    strMsg += "  * ClassName.methodName()" + STRCRLF;
    
    strTesting = MyStaticEx.getHelloString();
    strMsg += "  * strTesting = MyStaticEx.getHelloString(); Returns: " + strTesting + STRCRLF;
    strMsg += "  * MyStaticEx.STRHELLO = " + MyStaticEx.STRHELLO + STRCRLF;
    
    strMsg += "Static vs NonStatic: Instances of Objects. (see code)" + STRCRLF;
    strMsg += "  * Notice the difference in Static & Non-Static value" + STRCRLF;
    
    MyStaticEx objMyStaticEx1 = new MyStaticEx();
    strMsg += "    #1 Class/Instance:  " +  objMyStaticEx1.intClassConstructVar + ", " +
                                            objMyStaticEx1.intInstanceConstructVar + STRCRLF;

    MyStaticEx objMyStaticEx2 = new MyStaticEx();
    strMsg += "    #2 Class/Instance:  " +  objMyStaticEx2.intClassConstructVar + ", " +
                                            objMyStaticEx2.intInstanceConstructVar + STRCRLF;

    MyStaticEx objMyStaticEx3 = new MyStaticEx();
    strMsg += "    #3 Class/Instance:  " +  objMyStaticEx3.intClassConstructVar + ", " +
                                            objMyStaticEx3.intInstanceConstructVar + STRCRLF;
    
    strMsg += "    #1 Class/Instance:  " +  objMyStaticEx1.intClassConstructVar + ", " +
                                            objMyStaticEx1.intInstanceConstructVar + STRCRLF;
    strMsg += "    #2 Class/Instance:  " +  objMyStaticEx2.intClassConstructVar + ", " +
                                            objMyStaticEx2.intInstanceConstructVar + STRCRLF;
    strMsg += "    #3 Class/Instance:  " +  objMyStaticEx3.intClassConstructVar + ", " +
                                            objMyStaticEx3.intInstanceConstructVar + STRCRLF;
             
    strMsg += "Static vs NonStatic: Changing variable values." + STRCRLF;
    
    objMyStaticEx1.intClassVar = 100;
    objMyStaticEx1.intInstanceVar = 200;
    
    strMsg += "  * (see code) " + STRCRLF;
    
    strMsg += "  * objMyStaticEx1.intClassVar = " + objMyStaticEx1.intClassVar + STRCRLF;
    strMsg += "  * objMyStaticEx2.intClassVar = " + objMyStaticEx2.intClassVar + STRCRLF;

    strMsg += "  * objMyStaticEx1.intInstanceVar = " + objMyStaticEx1.intInstanceVar + STRCRLF;
    strMsg += "  * objMyStaticEx2.intInstanceVar = " + objMyStaticEx2.intInstanceVar + STRCRLF;

    strMsg += "  By Class Name: MyStaticEx.intClassVar = " + MyStaticEx.intClassVar + STRCRLF;
    
    return strMsg;
  }    

//-----------------------------------------------------------------------
  private static String strStaticHello() { 
//-----------------------------------------------------------------------
    return "    Hello World - from strStaticHello().";
  }

//-----------------------------------------------------------------------
  private String strNonStaticHello() { 
//-----------------------------------------------------------------------
    return "    Hello World - from strNonStaticHello().";
  }

//----------------------------------------------------------------------------------  
  public void init () {
//----------------------------------------------------------------------------------  

    super.init_Components( this.init_train() );

  }
//----------------------------------------------------------------------------------      
  public static void main( String args [] ) {
//----------------------------------------------------------------------------------      

    strStaticMsg += "  In main()" + STRCRLF;
    
    java.awt.Frame objFrame = new java.awt.Frame( "Static vs Non-Static JDK1.1" );  
    final MyStatic applet = new MyStatic();         //create the applet.
    MyTrain11.main_init( objFrame, applet, args ); //Static method to setup Applet and/or application.
      
    strStaticMsg += "  * Example of access static variable & method in main()." + STRCRLF;
    strStaticMsg += "    intStatic = " + intStatic + STRCRLF;
    strStaticMsg += "    strStaticHello = " + strStaticHello() + STRCRLF;
    strStaticMsg += "  * Compile Errors: look at source code examples" + STRCRLF;

    //strStaticMsg += " " + intNonStatic; //Can't make a static reference to nonstatic variable.
    //strStaticMsg += " " + strNonStaticHello(); //Can't make static reference to method 
                                                      //private String strNonStaticHello() in class 
                                                      //MyStatic
    
  } //main()

} //eoc
//eof