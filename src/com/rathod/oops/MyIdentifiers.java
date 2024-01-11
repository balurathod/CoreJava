package com.rathod.oops;
/*
 * MyIdentifiers.java
 * Author.....: Michael Thomas 04/28/99, ver 1.0 - 04/28/99
 *
 * Created on.: 04/28/99, ver 1.0 - 04/28/99
 *              09/15/01 - converted to extend MyTrain11
 */

/**
 *
 * @author  Michael Thomas
 * @version 1.0
 */

//#################################################################################
public class MyIdentifiers extends MyTrain11 {
//#################################################################################  
  
//----------------------------------------------------------------------------------
  private String init_train() {
//----------------------------------------------------------------------------------

    String strMsg = "";
    String strFiller = "This is a test. 123456789 123456789";
      
    strMsg += "Look at the source code for examples." + STRCRLF;
    strMsg += "  1) Legal Identifier Examples (see code)" + STRCRLF;
 
    int Test      = 0;  //Must begin with letter, $ or _ .
    int $Test_    = 0;  //   "
    int _Test$    = 0;  //   "
    int test2     = 0;  //After first letter, may have letters, digits, $ or _
    int test$test = 0;  //   "
    int test_test = 0;  //   "

    strMsg += "  2) Illegal Identifier Examples (see code)" + STRCRLF;
    
/*  
    //These lines are compile errors.

    int 1Test = 0;     //Error: Begins with digit.
    int Test Test = 0; //Error: Has spaces.
    int Test+Test = 0; //Error: Has a Java operators
    int new = 0;       //Error: Has a java keyword.
    int double = 0;    //Error: Has a java keyword.   

    int !Test = 1;  //Error: Begins with a special character
    int @Test = 1;
    int #Test = 1;
    int %Test = 1;
    int ^Test = 1;
    int &Test = 1;
    int *Test = 1;
    int (Test = 1;
    int )Test = 1;
    int -Test = 1;
    int +Test = 1;
    int =Test = 1;
    int |Test = 1;
    int \Test = 1;
    int {Test = 1;
    int }Test = 1;
    int ]Test = 1;
    int [Test = 1;

    int Test!Test = 1;  //Error: Has special character.
    int Test@Test = 1;
    int Test#Test = 1;
    int Test%Test = 1;
    int Test^Test = 1;
    int Test&Test = 1;
    int Test*Test = 1;
    int Test(Test = 1;
    int Test)Test = 1;
    int Test-Test = 1;
    int Test+Test = 1;
    int Test=Test = 1;
    int Test|Test = 1;
    int Test\Test = 1;
    int Test{Test = 1;
    int Test}Test = 1;
    int Test]Test = 1;
    int Test[Test = 1;

 */
 
    
    strMsg += "Unicode training examples:"  + STRCRLF;
    strMsg += "  Unicode: " + " \\u0030 = " + '\u0030' +
                       "  to  \\u0039 = " + '\u0039' + STRCRLF;
    strMsg += "  Unicode: " + " \\u0041 = " + '\u0041' +
                       "  to  \\u005A = " + '\u005A' + STRCRLF;
    strMsg += "  Unicode: " + " \\u0061 = " + '\u0061' + 
                       "  to  \\u007A = " + '\u007A' + STRCRLF;
    strMsg += "  Unicode: " + " \\u00C0 = " + '\u00C0' +
                       "  to  \\uD7A3 = " + '\uD7A3' + STRCRLF;

    strMsg += "Unicode Legal Identifiers - very unusual! (see code)"  + STRCRLF;    
    
    int Test\u0030 = 0;  //Same as Test0
      Test0++;
    int \u0041Test = 0;  //Same as ATest
      ATest++;
    int \u00C0Test = 0;  //Not sure why this works?
    int \uD7A3Test = 0;  //Same as ?Test. Not sure why this works?
    
    strMsg += "Unicode Illegal Identifiers - very unusual! (see code)"  + STRCRLF;
    //int \u0030Test = 0;  //Same as 0Test = 0;
    //int \u0039Test = 0;  //Same as 9Test = 0;
    
    strMsg += "Legal & Illegal method names (identifiers). (see code)"  + STRCRLF;
    strMsg += "  * Note - I don't suggest starting methods with '$' or '_'. "  + STRCRLF;
    strMsg += "Legal & Illegal class names (identifiers). (see inner class at end of code)"  + STRCRLF;
    
    return strMsg;
  }    

  //Start of legal methods. 
  private void legal_method_identifiers () {}
  private void _legal_method_identifiers () {} //Starts with "_"
  private void $legal_method_identifiers () {} //Starts with "$"
  
  //Start of illegal methods.
  //private void 2illegal_method1 () {} //Starts with "2" - a digit.
  //private void ?illegal_method1 () {} //Starts with "?" - a special character.
  //private void +illegal_method1 () {} //Starts with "+" - a special character and Java operator.
  
//----------------------------------------------------------------------------------  
  public void init () {
//----------------------------------------------------------------------------------  

    super.init_Components( this.init_train() );

  }
//----------------------------------------------------------------------------------      
  public static void main( String args [] ) {
//----------------------------------------------------------------------------------      

    java.awt.Frame objFrame = new java.awt.Frame( "Training Example JDK1.1" );  
    final MyIdentifiers applet = new MyIdentifiers();         //create the applet.
    MyTrain11.main_init( objFrame, applet, args ); //Static method to setup Applet and/or application.
      
  } //main()

//  
  //Start:  Legal Class names
  class legal_class_identifiers {}
  class _legal_class_identifiers{}
  class $legal_class_identifiers {}
  
  //Stop: Illegal Class names
  //class 2illegal_class_identifiers {}//Starts with "2"
  //class ?illegal_class_identifiers {}//Starts with "?"  
  //class +illegal_class_identifiers {}//Starts with "+"    
  
} //eoc
//eof