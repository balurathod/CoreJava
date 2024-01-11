package com.rathod.oops;
/*
 * MyFlowControlSwitch.java
 *
 * Created on 09/09/01
 */

/**
 *
 * @author  Michael Thomas
 * @version 1.0
 */

//#################################################################################
public class MyFlowControlSwitch extends MyTrain11 {
//#################################################################################  
  
//----------------------------------------------------------------------------------
  private String init_train() {
//----------------------------------------------------------------------------------

    String strMsg = "";

    strMsg += "Switch Control Flow Examples" + STRCRLF;

    strMsg += MySwitch();

    return strMsg;
  }    
  
  //-------------------------------------------------------------------------
  private String MySwitch() {
  //-------------------------------------------------------------------------

    String strMsg = "";
    
    strMsg += "  * Some rules concerning flow of statements:" + STRCRLF;
    strMsg += "    *  Once a case is true, execution of statements continue until a " + STRCRLF;
    strMsg += "       \"break\" statement is encountered.  This includes any cases " + STRCRLF;
    strMsg += "       that follow and the default label." + STRCRLF;
    strMsg += "    *  If a case is not true, then the default statements are run." + STRCRLF;
    strMsg += "  * Switch: break; & int (see code)" + STRCRLF;
    
    strMsg += TestSwitch1( 0 );
    strMsg += TestSwitch1( 1 );
    strMsg += TestSwitch1( 2 );
    strMsg += TestSwitch1( 3 );
    strMsg += TestSwitch1( 4 );
    
    strMsg += "  * Switch: break; in each case & char (see code)" + STRCRLF;
    
    strMsg += TestSwitch2( 'A' );
    strMsg += TestSwitch2( 'C' );
    strMsg += TestSwitch2( 'Z' );
    
    strMsg += "  * Some additional rules: " + STRCRLF;
    strMsg += "    * switch expression must evaluate to a int value (or promoted to)." + STRCRLF;
    strMsg += "      Switch test expression must have byte, char, short, or int type." + STRCRLF;
    strMsg += "    * case expressions must be a literal constant." + STRCRLF;
    strMsg += "    * default label is optional." + STRCRLF;
    
    strMsg += TestSwitchValidTypes();  // Shows possible valid switch data types.

    strMsg += "  * Examples of compile errors" + STRCRLF;
    
    strMsg += TestSwitchInvalidTypes(); //Shows invalid switch data bypes.
    
    strMsg += "Miscellaneous Examples" + STRCRLF;
    strMsg += TestSwitchMisc() + STRCRLF;
   
    return strMsg;
    
  }//MySwitch

  //-------------------------------------------------------------------------
  private String TestSwitch1( int intCase ) {
  //-------------------------------------------------------------------------
  
    String strMsg = "";
    
    strMsg += "    TestSwitch1( " + intCase +" )" + STRCRLF;

    switch ( intCase ) {
      case (1):
        strMsg += "      In case 1" + STRCRLF;
      case (2):
        strMsg += "      In case 2. (Notice break statement)" + STRCRLF;
        break;
      case (3):
        strMsg += "      In case 3" + STRCRLF;
      default:
        strMsg += "      In default." + STRCRLF;
    } //switch

    return strMsg;
    
  }//TestSwitch

  //-------------------------------------------------------------------------
  private String TestSwitch2( char chrCase ) {
  //-------------------------------------------------------------------------

    String strMsg = "";
    strMsg += "    TestSwitch2( '" + chrCase +"' )" + STRCRLF;

    switch ( chrCase )
    { case 'A':
        strMsg += "      In 'A' (w/ break)" + STRCRLF;
        break;
      case 'B':
        strMsg += "      In 'B' (w/ break)" + STRCRLF;
        break;
      case 'C':
        strMsg += "      In 'C' (w/ break)" + STRCRLF;
        break;
      default:
        strMsg += "      In default (w/ break)" + STRCRLF;

    } //switch

    return strMsg;
    
  }//TestSwitch2
  //-------------------------------------------------------------------------
  private String TestSwitchValidTypes( ) {
  //-------------------------------------------------------------------------
  
    String strMsg = "";
    
    byte    myByte    = 1;  
    short   myShort   = 1;  
    int     myInt     = 1;
    long    myLong    = 1; 
                      
    float   myFloat   = 1;
    double  myDouble  = 1;

    char    myChar    = 'A';
    boolean myBoolean = true;

    strMsg += "    Switch: Valid Data Types (see code)" + STRCRLF;

    switch ( myByte ) {
      case 1:
        strMsg += "      byte" + STRCRLF;
    }

    switch ( myShort ) {
      case 1:
        strMsg += "      short" + STRCRLF;
    }

    switch ( myInt ) {
      case 1:
        strMsg += "      int" + STRCRLF;
    }
     
  //switch ( myLong ) {  //Error: Switch test expression must have byte, char, short, or int type.
  //  case 1:
  //    myLong = 100;
  //}

 // switch ( myFloat ) {
 //   case 1:
 //     myFloat = 100;
 // }

 // switch ( myDouble ) {
 //   case 1:
 //     myDouble = 100;
 // }

    switch ( myChar ) {
      case 'A':
        strMsg += "      char" + STRCRLF;
    }

 // switch ( myBoolean ) {
 //   case true:
 //     myBoolean = false;
 // }

    strMsg += "  * Valid switch expressions must evaluate/promote to data type: int" + STRCRLF;
    
    switch ( myInt + myByte ) {
      default:
        strMsg += "      Valid: switch ( myInt + myByte )" + STRCRLF;
    }

    switch ( myChar + myInt ) {
      default:
        strMsg += "      Valid: switch ( myChar + myInt )" + STRCRLF;
    }

    switch ( Integer.parseInt("10") ) {
      default:
        strMsg += "      Valid: switch ( Integer.parseInt(\"10\") )" + STRCRLF;
    }
    
    return strMsg;
    
  }

  //-------------------------------------------------------------------------
  private String TestSwitchInvalidTypes( ) {
  //-------------------------------------------------------------------------

    String strMsg = "";
    
    strMsg += "  * Invalid Data Types:" + STRCRLF;
    strMsg += "    Examples use: switch ( myInt )" + STRCRLF;

    int intMyTest = 0;
    int intMy = 1;
    int byteMy = 1;
    
    strMsg += "    Compile Error: Constant expression required" + STRCRLF;
    switch ( intMy ) {
    //case (myInt >= 1 ):      
    //  strMsg += "      Error!" + STRCRLF;
      default:
        strMsg += "      Error: case (myInt >= 1 ):" + STRCRLF;
    }

    strMsg += "    Compile Error: Constant expression required" + STRCRLF;
    intMyTest = 1;
    
    switch ( intMy ) {
    //case (myIntTest):      
    //  strMsg += "      Error!" + STRCRLF;
      default:
        strMsg += "      Error: case (myIntTest):" + STRCRLF;
    }

    strMsg += "    Compile Error: Constant expression required" + STRCRLF;
    
    switch ( intMy ) {
    //case (10.0):      
    //  strMsg += "      Error!" + STRCRLF;
      default:
        strMsg += "      Error: case (10.0):" + STRCRLF;
    }
    
    
    
    return strMsg;
  }

  //-------------------------------------------------------------------------
  private String TestSwitchMisc( ) {
  //-------------------------------------------------------------------------

    String strMsg = "";
    int intMy;    

    //-------------------------------------------
    strMsg += "  * cases must be unique in value" + STRCRLF;
    
    intMy = 1;
    switch ( intMy ) {
      case (1):
      //case (1):  //Compile Error:  duplicate case label
      case (2):
    }
    
    //-------------------------------------------
    strMsg += "  * Placement of default & case." + STRCRLF;

    strMsg += "    #1 - Placing 'default' at top w/ no break;. (BAD CODING!!!)." + STRCRLF;
    
    intMy = 2;
    switch ( intMy ) {
      default:
        strMsg += "    In Default" + STRCRLF;
      case (1):
        strMsg += "    In case (1): " + STRCRLF;
    }

    strMsg += "    #2 - Placing 'default' at bottom w/ no break;. (GOOD CODING)." + STRCRLF;
    
    intMy = 2;
    switch ( intMy ) {
      case (1):
        strMsg += "    In case (1): " + STRCRLF;
      default:
        strMsg += "    In Default" + STRCRLF;
    }

    strMsg += "    #3 - Placing 'default' at top w/ break;. (BAD CODING)." + STRCRLF;
    
    intMy = 2;
    switch ( intMy ) {
      default:
        strMsg += "    In Default" + STRCRLF;
        break;
      case (1):
        strMsg += "    In case (1): " + STRCRLF;
        break;
    }

    strMsg += "    #4 - Placing 'default' at top w/ break;. (BAD CODING)." + STRCRLF;
    
    intMy = 1;  // Now 1 vs 2
    switch ( intMy ) {
      default:
        strMsg += "    In Default" + STRCRLF;
        break;
      case (1):
        strMsg += "    In case (1): " + STRCRLF;
        break;
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
    final MyFlowControlSwitch applet = new MyFlowControlSwitch();         //create the applet.
    MyTrain11.main_init( objFrame, applet, args ); //Static method to setup Applet and/or application.
      
  } //main()

} //eoc
//eof