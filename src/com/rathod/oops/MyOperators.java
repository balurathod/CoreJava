package com.rathod.oops;
/*
 * MyOperators.java
 *
 * Created on 09/18/01
 */

/**
 *
 * @author  Michael Thomas
 * @version 1.0
 */

//#################################################################################
public class MyOperators extends MyTrain11 implements java.awt.event.ActionListener {
//#################################################################################  

//----------------------------------------------------------------------------------
  private String init_train() {
//----------------------------------------------------------------------------------

    String strMsg = "";

    strMsg += "Operators" + STRCRLF;

    strMsg += ex_Op_Standard();
    strMsg += ex_Op_Unary();
    strMsg += ex_Op_Trinary();
    strMsg += ex_Op_Assignment();
    strMsg += ex_Op_Comparison();
    
    strMsg += ex_Op_Objects();
    strMsg += ex_Op_Instanceof();
    strMsg += ex_Op_Bitwise_Boolean();
    strMsg += ex_Op_Bitwise_Shift();
    
    return strMsg;
  }    

//-----------------------------------------------------------------------
  private String ex_Op_Standard()  { 
//-----------------------------------------------------------------------
    String strMsg = "";

    byte   bytMy = 0;
    short  shtMy = 0;
    int    intMy = 0;
    long   lngMy = 0L;    
    double dblMy = 0.0;
    float  fltMy = 0.0F;

    byte   bytTest;
    short  shtTest;
    int    intTest;
    long   lngTest;
    double dblTest;
    float  fltTest;
    
    strMsg += "Arithmentic Precedence rules: (), unary, */%, +-" + STRCRLF;
    intTest = 3 + 2 * 3;    strMsg += "  3 + 2 * 3 = " + intTest + " (not 15)" + STRCRLF;
    intTest = (3 + 2) * 3;  strMsg += "  (3 + 2) * 3 = " + intTest + STRCRLF;
    strMsg += "  intMy = 1; (look at following code)" + STRCRLF;
    intMy = 1;
    intTest = 3 + intMy++ * 3; strMsg += "  3 + intMy++ * 3 = " + intTest + " intMy=" + intMy + STRCRLF;
    strMsg += "  intMy = 1; (look at following code)" + STRCRLF;
    intMy = 1;
    intTest = 3 + ++intMy * 3; strMsg += "  3 + ++intMy * 3 = " + intTest + " intMy=" + intMy + STRCRLF;
    
    strMsg += "Arithmetic operators" + STRCRLF;
    dblTest = 3 * 4;  strMsg += "  3 * 4 = "  + dblTest + STRCRLF;
    dblTest = 12 / 3; strMsg += "  12 / 3 = " + dblTest + STRCRLF;
    dblTest = 12 % 3; strMsg += "  12 % 3 = " + dblTest + STRCRLF;
    dblTest = 13 % 3; strMsg += "  13 % 3 = " + dblTest + STRCRLF;
    intTest = 3 + 4;  strMsg += "  3 + 4 = "  + intTest + STRCRLF;
    intTest = 3 - 4;  strMsg += "  3 - 4 = "  + intTest + STRCRLF;
    
    strMsg += "  * '%'-Modulus  (remainder from division): ( 100 % 10 ) = "+
              ( 100 % 10 ) + STRCRLF;

    //Example of Modulas - %
    int y = 0;
    for (int x = 1; x <= 1000; x++) {
      if ( (x % 100) == 0 ) {
        y++;  // 100 / 100 = 1 with 0 remainder!
      }
    }
    
    strMsg += "  * See code for example of % in a for loop: y = " + y + STRCRLF;

    //Integer Division
    //Note:  Integers do not have decimals!
    //If there is a floating point involved, the answer is floating point!
    strMsg += "  * Integer Divison: 1 / 2 = "   + ( 1 / 2 ) + STRCRLF;
    strMsg += "  * Floating Point: 1 / 2.0 = " + ( 1 / 2.0 ) + STRCRLF;

    strMsg += "Unary: Operator Types and Conversions" + STRCRLF;
    strMsg += "  * Remains the same type." + STRCRLF;
    strMsg += "  * See code for examples!" + STRCRLF;
    
    bytTest = bytMy++;
    shtTest = shtMy++;
    intTest = intMy++;
    lngTest = lngMy++;
    fltTest = fltMy++;
    dblTest = dblMy++;
    
    strMsg += "Binary: Operator Types and Conversions" + STRCRLF;
    strMsg += "  * If either operand is double - convert to double." + STRCRLF;
    strMsg += "    else if either operand is float - convert to float." + STRCRLF;
    strMsg += "    else if either operand is long - convert to long." + STRCRLF;
    strMsg += "    else convert to int." + STRCRLF;
    strMsg += "  * See code for examples!" + STRCRLF;

    //bytTest = bytMy + bytMy; //Error: Can't convert int to byte.
    //shtTest = shtMy + shtMy; //Error: Can't convert int to short.
    bytTest = (byte) (bytMy + bytMy);
    intTest = bytMy + bytMy;

    lngTest = intMy + lngMy;
    //intTest = intMy + lngMy; //Error: Can't convert long to int.
    
    dblTest = fltMy + dblMy;
    //fltTest = fltMy + dblMy;  //Error: Can't convert double to float.
    
    dblTest = intMy + dblMy;
    //intTest = intMy + dblMy; //Error: Can't convert double to int.
    
    return strMsg;
  }

//-----------------------------------------------------------------------
  private String ex_Op_Unary() {
//-----------------------------------------------------------------------
    String strMsg = "";
    
    int x = 0;
    int y = 0;

    strMsg += "Uninary: Increment/Decrement:  Pre ++y / --y, Post y++ / y--" + STRCRLF;
    y = 0;
    strMsg += "  * Post Increment: y=0; y++ = " + y++ + " after " + y + STRCRLF;
    y = 0;
    strMsg += "  * Pre  Increment: y=0; ++y = " + ++y + " after " + y + STRCRLF;

    y = 0; x = y++;
    strMsg += "  * Post Increment: y=0; x=y++; Results: y=" + y + " x=" + x + STRCRLF;
    y = 0; x = ++y;
    strMsg += "  * Pre  Increment: y=0; x=++y; Results: y=" + y + " x=" + x + STRCRLF;

    return strMsg;
  }
//-----------------------------------------------------------------------
  private String ex_Op_Trinary() {
//-----------------------------------------------------------------------
    String strMsg = "";
    String strMy = "";

    strMsg += "Trinary (<boolean> ? <true> : <false> )" + STRCRLF;
    
    strMy = ( (5 > 3) ? "Yes" : "No" );
    strMsg += "  * (see code) Ex: is 5 > 3 - " + strMy + STRCRLF;
    
    strMy = ( (5 < 3) ? "Yes" : "No" );
    strMsg += "  * (see code) Ex: is 5 < 3 - " + strMy + STRCRLF;

    return strMsg;
  }
//-----------------------------------------------------------------------
  private String ex_Op_Assignment()  {
//-----------------------------------------------------------------------
    String strMsg = "";
    int intMy = 0;
   
    strMsg += "Assignment Operators" + STRCRLF;
    
    intMy  = 5; strMsg += "  intMy  = 5; //value is " + intMy + STRCRLF; //5
    intMy += 1; strMsg += "  intMy += 1; //value is " + intMy + STRCRLF; //6
    intMy -= 1; strMsg += "  intMy -= 1; //value is " + intMy + STRCRLF; //5
    intMy *= 3; strMsg += "  intMy *= 1; //value is " + intMy + STRCRLF; //15
    intMy /= 3; strMsg += "  intMy /= 1; //value is " + intMy + STRCRLF; //5
    intMy %= 3; strMsg += "  intMy %= 1; //value is " + intMy + STRCRLF; //2
    
    // Others: &= |= ^= <<= >>= >>>=
    
    return strMsg;
  }
//-----------------------------------------------------------------------
  private String ex_Op_Comparison()  {
//-----------------------------------------------------------------------
    String strMsg = "";
    String strMy = "";
    int intMy = 0;
    boolean blnMy = false;
   
    strMsg += "Comparison Operators" + STRCRLF;
    
    strMsg += "Operators: ==, !=, >, <, >=, <= (see code)" + STRCRLF;
    
    strMy = ( 5 > 2 )  ? "true" : "false"; strMsg += "  ( 5 > 2 ) ? \"true\" : \"false\"; //returns " + strMy + STRCRLF;
    strMy = ( 5 > 5 )  ? "true" : "false"; strMsg += "  ( 5 > 5 ) ? \"true\" : \"false\"; //returns " + strMy + STRCRLF; 
    strMy = ( 5 >= 5 ) ? "true" : "false"; strMsg += "  ( 5 >= 5 ) ? \"true\" : \"false\"; //returns " + strMy + STRCRLF; 
    strMy = ( 5 >= 2 ) ? "true" : "false"; strMsg += "  ( 5 >= 2 ) ? \"true\" : \"false\"; //returns " + strMy + STRCRLF; 
    
    strMy = ( 2 < 5 )  ? "true" : "false"; strMsg += "  ( 2 < 5 ) ? \"true\" : \"false\";  //returns " + strMy + STRCRLF; 
    strMy = ( 5 < 5 )  ? "true" : "false"; strMsg += "  ( 5 < 5 ) ? \"true\" : \"false\";  //returns " + strMy + STRCRLF; 
    strMy = ( 5 <= 5 ) ? "true" : "false"; strMsg += "  ( 5 <= 5 ) ? \"true\" : \"false\";  //returns " + strMy + STRCRLF; 
    strMy = ( 2 <= 5 ) ? "true" : "false"; strMsg += "  ( 2 <= 5 ) ? \"true\" : \"false\";  //returns " + strMy + STRCRLF; 
    
    strMsg += "Bitwise Comparison - &,| (Both sides are always evaluated)" + STRCRLF;
    intMy = 0;
    strMsg += "  intMy=0;" + STRCRLF;
    strMy = ( false & (++intMy == 1) ) ? "true" : "false";
    strMsg += "  ( false & (++intMy == 1) ) ? \"true\" : \"false\"; strMy=" + 
              strMy + " intMy=" + intMy + STRCRLF;

    intMy = 0;
    strMsg += "  intMy=0;" + STRCRLF;
    strMy = ( true | (++intMy == 1) ) ? "true" : "false";
    strMsg += "  ( true & (++intMy == 1) ) ? \"true\" : \"false\"; strMy=" + 
              strMy + " intMy=" + intMy + STRCRLF;

    strMsg += "Shortcut Comparison - &&,|| (Sides are evaluated if needed.)" + STRCRLF;
    intMy = 0;
    strMsg += "  intMy=0;" + STRCRLF;
    strMy = ( false && (++intMy == 1) ) ? "true" : "false";
    strMsg += "  ( false && (++intMy == 1) ) ? \"true\" : \"false\"; strMy=" + 
              strMy + " intMy=" + intMy + STRCRLF;

    intMy = 0;
    strMsg += "  intMy=0;" + STRCRLF;
    strMy = ( true || (++intMy == 1) ) ? "true" : "false";
    strMsg += "  ( true || (++intMy == 1) ) ? \"true\" : \"false\"; strMy=" + 
              strMy + " intMy=" + intMy + STRCRLF;

    strMsg += "NOT Operator" + STRCRLF;
    
    blnMy = ! false;
    strMsg += "  * blnMy = ! false; //value is " + blnMy + STRCRLF;
    
    blnMy = ! true;
    strMsg += "  * blnMy = ! true; //value is " + blnMy + STRCRLF;

    
    return strMsg;
  }

//-----------------------------------------------------------------------
  private String ex_Op_Objects()  {
//-----------------------------------------------------------------------

    String strMsg = "";
    
    String strTest1 = "";
    String strTest2 = "";
    
    strMsg += "Objects: equals() and ==" + STRCRLF;
    strMsg += "  == tests is object references point to same object." + STRCRLF;
    strMsg += "  equals(), if overridden by the class, tests the value of." + STRCRLF;
    strMsg += "  Object.equals() and '==' test the same thing!" + STRCRLF;

    Boolean b1 = new Boolean(true);
    Boolean b2 = new Boolean(true);
    strMsg += "  * b1.equals( b2 ) = " + ( b1.equals( b2 ) ) + STRCRLF;
    strMsg += "  * b1 == b2        = " + ( b1 == b2 )        + STRCRLF;
    Object  b3 = (Object) b2;  //Warning, this is tricky !!!
    //Tricky, still calls Boolean.equals() because it was a Boolean
    //  before the cast!
    strMsg += "  * b3.equals( b2 ) = " + ( b3.equals( b2) )  + STRCRLF;

    //Arrays - use Object.equals()  Remember arrays are objects!
    int [] aintX = {1};
    int [] aintY = {1};
    strMsg += "  * Arrays use Object.equals(): aintX.equals( aintY ) = " + ( aintX.equals( aintY ) )  + STRCRLF;  //Tricky, still calls Boolean.equals()

    strTest1 = new String("Hello");
    strTest2 = new String("Hello");
    strMsg += "  * See source.  How is strTest1 & strTest2 initialized. " + STRCRLF;
    strMsg += "  * object references: (strTest1 == strTest2) = "+
              (strTest1 == strTest2) + STRCRLF;
    strMsg += "  * value of object: ( strTest1.equals( strTest2 ) ) = "+
              ( strTest1.equals( strTest2 ) ) + STRCRLF;

    strTest2 = strTest1;
    strMsg += "  * If strTest2 = strTest1; then " + STRCRLF;
    strMsg += "  * object reference: ( strTest1 == strTest2 ) = "+
              ( strTest1 == strTest2 ) + STRCRLF;

    strTest1 = "Hello";
    strTest2 = "Hello";
    strMsg += "  * See source.  How is strTest1 & strTest2 initialized. " + STRCRLF;
    strMsg += "    Tricky: compiler choose to reference the same object!" + STRCRLF;
    strMsg += "    object reference: ( strTest1 == strTest2 ) = "+
              ( strTest1 == strTest2 ) + STRCRLF;

    return strMsg;
  }
//-----------------------------------------------------------------------
  private String ex_Op_Instanceof()  {
//-----------------------------------------------------------------------
    String strMsg = "";
    
    strMsg += "instanceof:" + STRCRLF;
    strMsg += "  * interface: this instanceof ActionListener = "+
              (this instanceof java.awt.event.ActionListener) + STRCRLF;
    strMsg += "  * subclass: this instanceof Applet = "+
              (this instanceof java.applet.Applet) + STRCRLF;
    strMsg += "  * subclass: y instanceof Number = "+
              ((new Integer(5)) instanceof Number) + STRCRLF;

    return strMsg;
  }

//-----------------------------------------------------------------------
  private String ex_Op_Bitwise_Boolean()  {
//-----------------------------------------------------------------------

    String strMsg = "";
    int y = 0;
    
    strMsg += "Bitwise: &, | " + STRCRLF;

    strMsg += "  * 17 = " + Integer.toBinaryString( 17 ) + STRCRLF;
    strMsg += "  * 18 = " + Integer.toBinaryString( 18 ) + STRCRLF;
    strMsg += "  * Bitwise And (17 & 18) = "+Integer.toBinaryString( 17 & 18 ) + STRCRLF;
    strMsg += "  * Bitwise Or  (17 | 18) = "+Integer.toBinaryString( 17 | 18 ) + STRCRLF;

    strMsg += "Bitwise Boolean: | (or) and & (and)" + STRCRLF;
    y = 0;
    strMsg += "  * &,| - Always Evaluates both sides: "+ (true | (y=5) == 5) + STRCRLF;
    strMsg += "  * y = "+ y + STRCRLF;

    strMsg += "Logical Boolean: || (or) and && (and)" + STRCRLF;
    y = 0;
    strMsg += "  * &&,|| - Evaluates if it needs to!: "+ (true || (y=5) == 5) + STRCRLF;
    strMsg += "  * y = "+ y + STRCRLF;

    return strMsg;
  }
//-----------------------------------------------------------------------
  private String ex_Op_Bitwise_Shift()  {
//-----------------------------------------------------------------------

    String strMsg = "";
    int intTest;
    
    strMsg += "Bitwise: >>, <<, >>> (Hint: 2 right keep tight! )" + STRCRLF;

    intTest = 0x00000001;  //  1
    strMsg += "  * intTest = 0x00000001" + STRCRLF;
    strMsg += "  * " + Integer.toBinaryString( intTest ) + " base 2 = " + intTest + STRCRLF;

    intTest = 0xffffffff;  // -1
    strMsg += "  * intTest = 0xffffffff" + STRCRLF;
    strMsg += "  * " + Integer.toBinaryString( intTest ) + " = " + intTest + STRCRLF;

    intTest = -2;
    strMsg += "  * " + Integer.toBinaryString( intTest ) + " = " + intTest + STRCRLF;

    intTest = -3;
    strMsg += "  * " + Integer.toBinaryString( intTest ) + " = " + intTest + STRCRLF;

    intTest = -4;
    strMsg += "  * " + Integer.toBinaryString( intTest ) + " = " + intTest + STRCRLF;

    intTest = 0x80000008;
    strMsg += "  * intTest = 0x80000008" + STRCRLF;
    strMsg += "  * " + Integer.toBinaryString( intTest ) + " = " + intTest + STRCRLF;

    intTest = intTest >>> 1;
    strMsg += "  * intTest >>> 1 = " + STRCRLF;
    strMsg += "  * _"+Integer.toBinaryString( intTest ) + " = " + intTest + STRCRLF;

    intTest = intTest << 1;
    strMsg += "  * intTest << 1  = " + STRCRLF;
    strMsg += "  * " + Integer.toBinaryString( intTest ) + " = " + intTest + STRCRLF;

    intTest = intTest << 1;
    strMsg += "  * intTest << 1  = " +
              Integer.toBinaryString( intTest ) + " = " + intTest +
              " - sign bit dropped" + STRCRLF;

    intTest = 0x80000008;
    strMsg += "  * Reset back to: intTest = 0x80000008, then ..."  + STRCRLF;

    intTest = intTest >> 1;
    strMsg += "  * intTest >> 1  = " + STRCRLF;
    strMsg += "  * " + Integer.toBinaryString( intTest ) + " = " + intTest + STRCRLF;

    intTest = intTest >> 1;
    strMsg += "  * intTest >> 1  = " + STRCRLF;
    strMsg += "  * " + Integer.toBinaryString( intTest ) + " = " + intTest + STRCRLF;

    intTest = 0x00000001;
    intTest = intTest << 31;
    strMsg += "  * intTest = 0x1, then intTest << 31 = " + STRCRLF;
    strMsg += "  * " + Integer.toBinaryString( intTest ) + STRCRLF;

    //Bitwise Operator returns an int.
    
    strMsg += "Bitwise Operator and primitive data types." + STRCRLF;
    
    byte byteTest = 1;
    char charTest = 'a';
    short shortTest = 1;
    long longTest = 1;
    float floatTest = 1;
    double doubleTest = 1;
    
    strMsg += "  * Returns an int if applied to: byte, char, short, int" + STRCRLF;

    strMsg += "    intTest = byteTest >> 1" + STRCRLF;
    intTest = byteTest >> 1;
    
    strMsg += "    intTest = charTest >> 1" + STRCRLF;
    intTest = charTest >> 1;

    strMsg += "    intTest = shortTest >> 1" + STRCRLF;
    intTest = shortTest >> 1;
    
    strMsg += "    intTest = intTest >> 1" + STRCRLF;
    intTest = intTest >> 1;
    
    strMsg += "  * Returns a long if applied to a long." + STRCRLF;
    
    strMsg += "    longTest = longTest >> 1" + STRCRLF;
    longTest = longTest >> 1;
    //intTest = longTest >> 1; //Error: possible loss of precision
    
    strMsg += "  * Can not be applied to a real number (float or double)." + STRCRLF;
    strMsg += "    Compile Error for float or double: operator >> cannot be applied to double,int" + STRCRLF;
    //intTest = floatTest >> 1; //Error: operator >> cannot be applied to double,int
    //intTest = doubleTest >> 1; //Error: operator >> cannot be applied to double,int
    //floatTest = floatTest >> 1; //Error: operator >> cannot be applied to double,int
    //doubleTest = doubleTest >> 1; //Error: operator >> cannot be applied to double,int
    
    strMsg += "  * Bitwise Operator will cast to int first, then shifts bits (for: byte,char,short)." + STRCRLF;
    strMsg += "    (That's why bitwise operators don't seem to work on negatives for: byte, char, and short)" + STRCRLF;

    strMsg += "    Example with an int." + STRCRLF;
    intTest = -1;
    strMsg += "    * " + Integer.toBinaryString( intTest ) + " = " + intTest + " (all bits are 1)" + STRCRLF;

    intTest = intTest >>> 1;
    strMsg += "      intTest = intTest >>> 1;" + STRCRLF;
    strMsg += "      _" + Integer.toBinaryString( intTest ) + " - intTest = " + intTest + STRCRLF; //Value is 2147483647
    
    strMsg += "    For a byte you would expect: " + STRCRLF;
    strMsg += "      1111 1111 = -1 " + STRCRLF;
    strMsg += "      0111 1111 = 127 (Expect this after shifting bits '>>> 1') " + STRCRLF;
    strMsg += "      Warning: This is not the results !!!!! (see below)" + STRCRLF;

    strMsg += "    Byte converted is to an int, then bitwise shift is performed." + STRCRLF;
    byteTest = -1;
    intTest = byteTest >>> 1;
    strMsg += "      intTest = byteTest >>> 1;" + STRCRLF;
    strMsg += "      intTest = " + intTest + " - Notice results is the same as an int. " + STRCRLF; //Value is 2147483647

    strMsg += "    * Note: Negative #'s & bits" + STRCRLF;
    strMsg += "      Left most bit is the sign bit.  If set, then the number is negative." + STRCRLF;
    strMsg += "      To determine the value of the negative #,  apply 2's compliment, then add 1." + STRCRLF;
    strMsg += "        Steps: " + STRCRLF;
    strMsg += "        11111111111111111111111111111111 - Bits for -1 " + STRCRLF;
    strMsg += "        00000000000000000000000000000000 - After 2's compliment" + STRCRLF;
    strMsg += "        00000000000000000000000000000001 - After adding 1." + STRCRLF;
    strMsg += "        Value is -1." + STRCRLF;

    strMsg += "  * Casting to a lower data type (int to byte)." + STRCRLF;
    strMsg += "    The bits to the left are droped. " + STRCRLF;
    
    intTest = 255;
    strMsg += "    " + Integer.toBinaryString( intTest ) + " - int " + intTest + STRCRLF;
    
    byte byteTestCast;
    byteTestCast = (byte) 255;
    strMsg += "    byteTestCast = (byte) 255;" + STRCRLF;
    strMsg += "    byteTestCast = " + byteTestCast + " - 1111 1111 as a byte = -1" + STRCRLF;

    strMsg += "Bitwise Operators on a negative int." + STRCRLF;
    intTest = -8;
    strMsg += "  * intTest = " + intTest + STRCRLF;
    strMsg += "  * " + Integer.toBinaryString( intTest ) + " = " + intTest + STRCRLF;
    
    intTest = intTest >> 1;
    strMsg += "  * intTest = intTest >> 1; (Note: 2 Right, keep tight - negative bit)" + STRCRLF;
    strMsg += "  * " + Integer.toBinaryString( intTest ) + " = " + intTest + STRCRLF;

    intTest = intTest << 1;
    strMsg += "  * intTest << 1;" + STRCRLF;
    strMsg += "  * " + Integer.toBinaryString( intTest ) + " = " + intTest + STRCRLF;

    intTest = intTest >>> 1;
    strMsg += "  * intTest >>> 1; (Note:  Negative bit is dropped.)" + STRCRLF;
    strMsg += "  * _" + Integer.toBinaryString( intTest ) + " = " + intTest + STRCRLF;

    return strMsg;
  }

  public void actionPerformed( java.awt.event.ActionEvent e){}  //Used just for training.

  
//----------------------------------------------------------------------------------  
  public void init () {
//----------------------------------------------------------------------------------  

    super.init_Components( this.init_train() );

  }
//----------------------------------------------------------------------------------      
  public static void main( String args [] ) {
//----------------------------------------------------------------------------------      

    java.awt.Frame objFrame = new java.awt.Frame( "Training Example JDK1.1" );  
    final MyOperators applet = new MyOperators();         //create the applet.
    MyTrain11.main_init( objFrame, applet, args ); //Static method to setup Applet and/or application.
      
  } //main()

} //eoc
//eof