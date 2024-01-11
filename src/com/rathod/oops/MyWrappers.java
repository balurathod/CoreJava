package com.rathod.oops;
/*
 * MyWrappers.java
 *
 * Created on 09/09/01
 */

/**
 *
 * @author  Michael Thomas
 * @version 1.0
 */

//#################################################################################
public class MyWrappers extends MyTrain11 {
//#################################################################################  


 
//----------------------------------------------------------------------------------
  private String init_train() {
//----------------------------------------------------------------------------------

    String strMsg = "";

    String strMy;
    int intMy;
    double dblMy;
    Integer MyInteger;
    Double MyDouble;
    
    //--------------
    
    strMsg += "Wrapper Classes. (see source code)" + STRCRLF;
    strMsg += "  Very limited examples here (Integer & Double)." + STRCRLF;  
    strMsg += "  Remember, each Primitive data type has a Wrapper." + STRCRLF;
    strMsg += STRCRLF;
    strMsg += "Converting Strings to Primitives" + STRCRLF;
    
    strMy = "10";   intMy = Integer.parseInt( strMy );

    
    strMsg += "  * strMy = \"10\";   intMy = Integer.parseInt( strMy ); - Result: " + intMy + STRCRLF;

    strMsg += "  * Creating the Double Object (JDK 1.1 vs JDK 1.2)" + STRCRLF;
    //Note: This next line of code only works with JDK1.2 and above.  Therefore I've commented it out
    //      because IE 5.5 implements JDK 1.1.4.
    //strMy = "10.5"; dblMy = Double.parseDouble( strMy );
    strMsg += "    Following code works w/JDK 1.2 (commented out for this example)" + STRCRLF;    
    strMsg += "      strMy = \"10.5\"; dblMy = Double.parseDouble( strMy ); - Result: would be 10.5" + STRCRLF;

    //Note: The following code works with JDK 1.1
    strMy = "10.5";
    Double objDouble = new Double( strMy );
    dblMy = objDouble.doubleValue(); 

    strMsg += "    Following code works w/JDK 1.1" + STRCRLF;
    strMsg += "      strMy = \"10.5\";" + STRCRLF;
    strMsg += "      Double objDouble = new Double( strMy );" + STRCRLF;
    strMsg += "      dblMy = objDouble.doubleValue(); - Result: " + dblMy + STRCRLF;
    //--------------
    
    strMsg += "Converting Primitives to Strings" + STRCRLF;
    
    intMy = 10;   strMy = Integer.toString( intMy );
    dblMy = 10.0; strMy = Double.toString( dblMy );
    
    strMsg += "  * intMy = 10;   strMy = Integer.toString( intMy ); - Result: " + strMy + STRCRLF;
    strMsg += "  * dblMy = 10.0; strMy = Double.toString( dblMy ); - Result: " + strMy + STRCRLF;

    strMsg += "Look at the code for other notes." + STRCRLF;
    //Compile Errors:
    //strMy = Integer.toString( 10.0 ); //No method found matching toString(double);
    
    //OK, but not clear enough.
    strMy = Double.toString( 10 ); //Should be 10.0 to denote a double instead of implicit cast.
    
    //--------------
    strMsg += "Instantiating Wrapper Classes" + STRCRLF;
    
    strMy = "10";   MyInteger = new Integer(strMy);
    intMy = 10;     MyInteger = new Integer(intMy);
    strMy = "10.5"; MyDouble  = new Double(strMy);
    dblMy = 10.5;   MyDouble  = new Double(dblMy);
    
    strMsg += "  * strMy = \"10\";   MyInteger = new Integer(strMy); - Result: " + strMy + STRCRLF;
    strMsg += "  * intMy = 10;     MyInteger = new Integer(intMy); - Result: "   + intMy + STRCRLF;
    strMsg += "  * strMy = \"10.5\"; MyDouble  = new Double(strMy); - Result: "  + strMy + STRCRLF;
    strMsg += "  * dblMy = 10.5;   MyDouble  = new Double(dblMy); - Result: "    + dblMy + STRCRLF;
    
    //------------------------------------------------------
    strMsg += "Character Wrapper class" + STRCRLF;
    
    strMsg += "  * Character.isDigit('A'); Results: " + Character.isDigit('A') + STRCRLF;
    strMsg += "  * Character.isLetter('A'); Results: " + Character.isLetter('A') + STRCRLF;
    
    strMsg += "  * Character.isDigit('2'); Results: " + Character.isDigit('2') + STRCRLF;
    strMsg += "  * Character.isLetter('2'); Results: " + Character.isLetter('2') + STRCRLF;

    strMsg += "  * Character.isJavaIdentifierStart('A'); Results: " + Character.isJavaIdentifierStart('A') + STRCRLF;
    strMsg += "  * Character.isJavaIdentifierStart('2'); Results: " + Character.isJavaIdentifierStart('2') + STRCRLF;
    strMsg += "  * Character.isJavaIdentifierPart('2'); Results: " + Character.isJavaIdentifierPart('2')  + STRCRLF;
    
    // isDefined(), isDigit, isLetter(
    
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
    final MyWrappers applet = new MyWrappers();         //create the applet.
    MyTrain11.main_init( objFrame, applet, args ); //Static method to setup Applet and/or application.
      
  } //main()

} //eoc
//eof