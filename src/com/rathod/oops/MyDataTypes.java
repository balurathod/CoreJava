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
public class MyDataTypes extends MyTrain11 {
//#################################################################################  

  //Min Value of Integers: -2^(bits-1) 
  //Max Value of Integers:  2^(bits-1)-1

  //No decimals (Integers )
  byte    bytMy;    //signed 8 -bit  -128    to 127
  short   shtMy;    //signed 16-bit  -32,768 to 32,767
  int     intMy;    //signed 32-bit  -2,147,483,648 to 2,147,483,647 
  long    lngMy;    //signed 64-bit  -9,223,372,036,854,775,808L
                    //             to 9,223,372,036,854,775,807L
  //Floating decimals
  float   fltMy;    //signed 32-bit +/- 3.4 E 38   (6-7 digits of accuracy)
  double  dblMy;    //signed 64-bit +/- 1.7 E 308  (14-15 digits of accuracy)

  char    chrMy;    //16-bit Unicode character  ( 2-Bytes ! ) Range: 0 to 65535
  boolean blnMy;    //true or false

  Character CharMy; //Character object!
  String strInstVars; 
  String strInstDefaultValues_Integer; //Instance default Integer values,
  String strInstDefaultValues_Decimal; //Instance default Decimal values.
  String strInstDefaultValues_Char;    //Instance default Character values,
  String strInstDefaultValues_Boolean; //Instance default Boolean values.

 
//----------------------------------------------------------------------------------
  private String init_train() {
//----------------------------------------------------------------------------------

    String strMsg = "";

    strMsg += "Check declaration of instance variable's comments for Max & Min values." + STRCRLF;
    
    strMsg += Ex_Primitive_Initialization();
    strMsg += Ex_Primitive_MaxMin_Ranges();
    strMsg += Ex_Primitive_Character();
    strMsg += Ex_Primitive_Bases();
    strMsg += Ex_Casting();
    strMsg += Ex_DivideByZero();
    
    return strMsg;
  }    

//-----------------------------------------------------------------------
  private String Ex_Primitive_Initialization() {
//-----------------------------------------------------------------------
    int intMyLocal;
    String strMsg = "";
    
    //Start:  Examples of default values for instance variables.
    strInstDefaultValues_Integer =   //Example of instance default values!
      "  * " +
      "Integer's = 0 Ex: "+
      "byte-"+bytMy+","+
      "short-"+shtMy+","+
      "int-"+intMy+","+
      "long-"+lngMy;
      
    strInstDefaultValues_Decimal =   //Example of instance default values!
      "  * " +
      "Floating Numbers = 0.0 Ex: "+
      "float-"+fltMy+","+
      "double-"+dblMy;
      
    strInstDefaultValues_Char =      //Example of instance default values!
      "  * " +
      "Characters = '\\u0000' (not a space-'\\u0020'): Ex: " +
      Integer.toHexString( chrMy )+"-hex";
    //Start:  Examples of default values for instance variables.

    strInstDefaultValues_Boolean =   //Example of instance default values!
      "  * " +
      "Booleans = false Ex: "+blnMy ;

    strMsg += "Default values (Instance vs Local variables)" + STRCRLF;

    strMsg += "  * Local var's: must initialized before use or compile error! (see code)" + STRCRLF;
    //strMsg += "Local int: "+ intMyLocal + STRCRLF; // compile error!

    strMsg += "  * Instance variables: have default values and don't need to be initialized." + STRCRLF;
    strMsg += "Instance variables: have default values." + STRCRLF;
    strMsg += strInstDefaultValues_Integer + STRCRLF;
    strMsg += strInstDefaultValues_Decimal + STRCRLF;
    strMsg += strInstDefaultValues_Char + STRCRLF;
    strMsg += strInstDefaultValues_Boolean + STRCRLF;
  
    return strMsg;
  }
//-----------------------------------------------------------------------
  private String Ex_Primitive_MaxMin_Ranges() {
//-----------------------------------------------------------------------
    String strMsg = "";
  
    strMsg += "Min to Max Ranges: " + STRCRLF;
    strMsg += "  Integer values:  -2^(bits-1) to 2^(bits-1)-1 " + STRCRLF;
    strMsg += "  * byte, 8-bits: "+Byte.MIN_VALUE+" to " + Byte.MAX_VALUE + STRCRLF;
    strMsg += "  * short 16-bits: "+Short.MIN_VALUE+" to "+ Short.MAX_VALUE + STRCRLF;
    strMsg += "  * integer 32-bits: "+Integer.MIN_VALUE+" to " + Integer.MAX_VALUE + STRCRLF;
    strMsg += "  * long 64-bits: "+Long.MIN_VALUE + " to "+Long.MAX_VALUE + STRCRLF;
    strMsg += "  Floating-point (decimal) values:  " + STRCRLF;
    strMsg += "  * float (dec) 32-bits: "+Float.MIN_VALUE + " to "+Float.MAX_VALUE + STRCRLF;
    strMsg += "  * double (dec) 64-bits: "+Double.MIN_VALUE + " to "+Double.MAX_VALUE + STRCRLF;
    strMsg += "  Other special data types: " + STRCRLF;
    strMsg += "  * char 16-bits -hex: "+Integer.toHexString( Character.MIN_VALUE )+" to "+
                                Integer.toHexString( Character.MAX_VALUE ) + STRCRLF;
    strMsg += "  * boolean is: "+true+" or "+false + STRCRLF;

    return strMsg;
  }
//-----------------------------------------------------------------------
  private String Ex_Primitive_Character()  {
//-----------------------------------------------------------------------
    String strMsg = "";
    
    strMsg += "char: Unicode 16 bits (which includes Ascii chars)" + STRCRLF;
    //Note (see line below for example): '\u0020' = space, '\u002c' = comma
    strMsg += "  * Ascii is from '\\u0000' to '\\u00ff' (1 byte or 8 bits) ex: "+'\u0030'+" to "+'\u0039'+
              '\u002c'+'\u0020'+'\u0041'+" to "+'\u0020'+'\u005a' + STRCRLF;
    strMsg += "  * Unicode is from '\\u0000' to '\\uffff' ( 2 bytes or 16 bits) International use." + STRCRLF;
    strMsg += "  * Casting an integer to char. (char) 65 = " + (char) 65 + STRCRLF;
    strMsg += "  * Casting a char to integer. (int) 'A' = " + (int) 'A' + STRCRLF;
    strMsg += "  * Casting a char to byte. (byte) 'A' = " + (byte) 'A' + STRCRLF;

    char charMy1, charMy2, charMy3;
    
    charMy1 = 65; //Ascii value in decimal for 'A'
    charMy2 = 'A';
    charMy3 = '\u0041'; //Unicode for 'A' in hexidecimal
    strMsg += "    65,'A','\\u0041' = " + charMy1 + ", " + charMy2 + ", " + charMy3 + STRCRLF;

    bytMy = (byte) 7;
    //chrMy = bytMy; //Error: possible loss of percision
    chrMy = (char) bytMy;
        strMsg += "  * Casting to a char (byte) (see code): " + chrMy + STRCRLF;
    
    shtMy = (short) 65;
    //chrMy = shtMy; //Error: possible loss of percision
    chrMy = (char) shtMy;
    strMsg += "  * Casting to a char (short) (see code): " + chrMy + STRCRLF;
    
    intMy = 65;    
    //chrMy = shtMy; //Error: possible loss of percision
    chrMy = (char) intMy;
    strMsg += "  * Casting to a char (int) (see code): " + chrMy + STRCRLF;
    
    lngMy = (long) 65;
    chrMy = (char) lngMy;
    //chrMy = lngMy; //Error: possible loss of percision
    strMsg += "  * Casting to a char (long) (see code): " + chrMy + STRCRLF;

    
    return strMsg;
  }
//-----------------------------------------------------------------------
  private String Ex_Primitive_Bases() {
//-----------------------------------------------------------------------
    String strMsg = "";
    
    strMsg += "Bases for Integers: Decimal, Octal(0[num]), Hex (0x[num])" + STRCRLF;
    strMsg += "  * 10   base 10 = "+
           Integer.toBinaryString( 10 ) +" base 2, or "+
           10   + " base 10" + STRCRLF;
    strMsg += "  * 010  base 8  = "+
           Integer.toBinaryString( 010 ) +" base 2, or "+
           010  + " base 10" + STRCRLF;
    strMsg += "  * 0x10 base 16 = "+
           Integer.toBinaryString( 0x10 ) +" base 2 or "+
           0x10 + " base 10" + STRCRLF;
    
    return strMsg;
  }
//-----------------------------------------------------------------------
  private String Ex_Casting()  {
//-----------------------------------------------------------------------
    String strMsg = "";
    
    strMsg += "Casting: See examples in the code!" + STRCRLF;
    strMsg += "  * Must cast explicitly if to lesser data type." + STRCRLF;

    // F forces a float, if not, default is double for floating point!
    // L forces a long  

    //**** Primitive Data: byte ****
    bytMy = 127;
  //bytMy = 128;  //Compile error, 128 is greater than MAX_VALUE for bytes!
    bytMy = (byte) 128;
    strMsg += "  * bytMy = (byte) 128 , bytMy = "+ bytMy +" - lost some bytes!" + STRCRLF;

    shtMy = (short) 10;
    //bytMy = shtMy; //Implicit cast error. Incompatible type.  Can't convert short to byte.
    bytMy = (byte) shtMy;
    
    //**** Primitive Data: short ****
    shtMy = 10;  //use of short's is not that common.
  //shtMy = 10L; //Compile error, need an explicit cast. Can't convert long to short.
    
    intMy = 10;
    //shtMy = intMy; //Compile error, need an explicit cast. Can't convert int to short.
    shtMy = (short) intMy;

    //**** Primitive Data: int ****
    intMy = 10;
  //intMy = 10L;        //Compile error, must explicitly cast! (long to int)
    intMy = (int) 10L;  //Compile error, must explicitly cast!
  //intMy = 10.0;       //Compile error, because decimals default to double!
    intMy = (int) 10.0; //Explicit cast from double to int!

    shtMy = (short) 10;
    lngMy = (long) 10;
    //intMy = lngMy; //Compile error, must explicitly cast!  Can't convert long to int.
    intMy = (int) lngMy;
    intMy = shtMy; //Implicit cast!
    
    //**** Primitive Data: long ****
    lngMy = 10;  //implicit cast to long.
    lngMy = 10L; //upper case
    lngMy = 10l; //lower case 

    dblMy = 10.0D;
    fltMy = 10.0F;
    //lngMy = dblMy; //Compile error, must explicitly cast! Can't convert double to long.
    lngMy = (long) dblMy;
    //lngMy = fltMy; //Compile error, must explicitly cast! Can't convert float to long
    lngMy = (long) fltMy;
    
    //Can implicitly cast to a greater data type..
    shtMy = bytMy;
    intMy = bytMy;
    lngMy = intMy;

    //Compile errors:  Need explicit casting if casting to a lesser data type.!
    //bytMy = intMy;  //explicit cast needed !
    //shtMy = intMy;  //explicit cast needed !

    strMsg += "  * bytMy = (byte) intMy //Must cast up the hierarchy!" + STRCRLF;
    bytMy = (byte) intMy;
    shtMy = (short) intMy;

    fltMy = 10;   //Implicit cast from int.
    fltMy = 10F;
    fltMy = 10f;
  //fltMy = 10.0;  //Compile error, because default is a double!
    fltMy = (float) 10.0;  //Explicit cast from double to float!
    fltMy = (float) 10.0d;
    fltMy = (float) 10.0D;

    dblMy = 10;   //Implicit cast from int.
    dblMy = 10L;  //Implicit cast from long.
    dblMy = 10F;  //Implicit cast from float.
    dblMy = 10.0;
    dblMy = 10.0d;
    dblMy = 10.0D;
    dblMy = 10D;

    strMsg += "  * implicit double Cast: (5.0/10) = " + ( 5.0 / 10 ) +
              " or (5/10.0) = " + ( 5/ 10.0 )  + STRCRLF;
    
    strMsg += "  * char" + STRCRLF;

    //Can implicitly cast to a greater data type..
    dblMy = fltMy;
    
    //Must explicitly cast to a lesser data type.
    ///fltMy = dblMy; //Need explicit cast.  Can't convert double to float.
    fltMy = (float) dblMy;
    
    return strMsg;
  }

//-----------------------------------------------------------------------
  public int Ex_ImplicitCast_char_to_int() {
//-----------------------------------------------------------------------
   char a = 'd';
   return a; // legal - char is implicitly casted to an int.
}
//-----------------------------------------------------------------------
  public short Ex_ImplicitCast_char_to_short() {  //Illegal - Java Compile Error!
//-----------------------------------------------------------------------
   
   char myChar = 'd';
   /* Here is the error message if you return a char to a short.
      MyDataTypes.java:295: possible loss of precision
      found   : char
      required: short
        return myChar; // illegal
               ^
      1 error
   */
   //return myChar; // illegal if it was uncommented.
   
   /* Why is it illegal?  They are both 16 bit however char is unsigned and short is signed.
      Short range: -32,768 to 32,767
      Char  range: 0 to 65535
      
      Unless you cast, they may be loss of precision! 
   */
   
   short myShort = (short) 10;
   return myShort;
}


//-----------------------------------------------------------------------
  private String Ex_DivideByZero()  { 
//-----------------------------------------------------------------------    
    String strMsg = "";
    
    double dblMy1 = 0.0;
    double dblMy2 = 0.0;
    int    intZero = 0;
    double dblZero = 0.0;

    strMsg += "Divide by Zero (Ineger vs Floating Point)" + STRCRLF;
    strMsg += "  * Floating-point never throw Divide by Zero exceptions. (see code)" + STRCRLF;

    //Integer's through the exception.
    intMy = 10;
    intMy = 10; //intMy /= 0;       //runtime error: java.lang.ArithmeticException: / by zero
    intMy = 10; //intMy /= intZero; //runtime error: java.lang.ArithmeticException: / by zero
    
    dblMy = 10.0; dblMy /= 0;                  // OK! Because implicit cast to double.
    dblMy = 10.0; dblMy /= intZero;            // OK! Because implicit cast to double.
    intMy = 10;   intMy /= 0.0;                // OK! Because implicit cast to double.
    intMy = 10;   intMy = (int) (intMy / 0.0); // OK! Because implicit cast to double. (int) cast if after the division.

    dblMy = 10.0; dblMy /= 0.0;

    dblMy = 1.0; intMy = 1;
    strMsg += "  * Erroneous: 1 /= 0.0   or intMy /= dblZero is: " + ( intMy /= dblZero ) + " - WARNING !!!" + STRCRLF;
    strMsg += "  * infinity.: 1.0 /= 0.0 or dblMy /= dblZero is: " + ( dblMy /= dblZero ) + STRCRLF;
    strMsg += "  * infinity.: 1.0 /= 0   or dblMy /= intZero is: " + ( dblMy /= intZero ) + STRCRLF;

    dblMy /= 0; dblMy++; dblMy *= 10;
    strMsg += "  * infinity.: If infinity then, ++dblMy; dblMy *= 10 still equals " + dblMy + STRCRLF;

    strMsg += "  * NaN (Not a Number)" + STRCRLF;
    strMsg += "  *   NaN......: (0.0 / 0.0): " + ( 0.0 / 0.0 ) + STRCRLF;
    strMsg += "  *   NaN......:or dblMy1 / dblMy2 = " + (dblMy1 / dblMy2) + STRCRLF;

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
    final MyDataTypes applet = new MyDataTypes();         //create the applet.
    MyTrain11.main_init( objFrame, applet, args ); //Static method to setup Applet and/or application.
      
  } //main()

} //eoc
//eof