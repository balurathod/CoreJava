package com.rathod.oops;
/*
 * MyFlowControlFor.java
 *
 * Created on 09/09/01
 */

/**
 *
 * @author  Michael Thomas
 * @version 1.0
 */

//#################################################################################
public class MyFlowControlFor extends MyTrain11 {
//#################################################################################  
  
//----------------------------------------------------------------------------------
  private String init_train() {
//----------------------------------------------------------------------------------

    String strMsg = "";

    strMsg += "Control Flow Examples:" + STRCRLF;


    strMsg += "Example of: for loop " + STRCRLF;
    strMsg += MyFor();

    strMsg += "Example of: for loop & Labels" + STRCRLF;
    strMsg += MyForLabel();

    return strMsg;
  }    
  

  //-------------------------------------------------------------------------
    private String MyFor() {
  //-------------------------------------------------------------------------

    String strMsg = "";
    
    int intX  = 0;

    strMsg += "Format: for ( declare & initialization ; loop while ; modification ) " + STRCRLF;

    //----------------------------
    strMsg += "  * for loop w/ no code blocks" + STRCRLF;
    for ( int x = 1; x <= 2; x++ )
      strMsg += "    Loop #  " + x + STRCRLF;

    //----------------------------
    strMsg += "  * for loop w/ code blocks" + STRCRLF;
    for ( int x = 1; x <= 2; x++ ) {
      strMsg += "    Loop #  " + x + STRCRLF;
    }

    //----------------------------
    strMsg += "  * Variables declared in for expression is local to the block." + STRCRLF;
    for ( int z = 1; z <= 2; z++ ) {
      strMsg += "    Loop #  " + z + STRCRLF;
    }
    
    strMsg += "    See code for a compile error.  z is local to for loop." + STRCRLF;
    //z++; //Compile error: Undefined variable, class, or package name: z

    //----------------------------
    strMsg += "Use methods in the for expression." + STRCRLF;    
    for ( int x= testingMethod(); ( testingMethodCondition(x) ) ; x=testingMethodX(x) ) { 
      strMsg += "  * " + x;
    }

    //----------------------------
    strMsg += "Example: Use a commas to allow multiple statements in the for." + STRCRLF;
    intX = 0;
    for ( int x = 1, y = 1; (x <= 5 && intX <= 10) ; x++, y++ ) {
      intX += x + y;
    }
    strMsg += "  * intX = " + intX + STRCRLF;

    //----------------------------
    strMsg += "Example #1: Nesting for's (no code blocks)" + STRCRLF;
    intX = 0;
    for ( int x = 1; x <= 2; x++ )
      for ( int y = 1; y <= x; y++ )
         intX++;
    strMsg += "  * intX = " + intX + STRCRLF;

    //----------------------------
    strMsg += "Example #2: Nesting for's (w/code blocks)" + STRCRLF;
    intX = 0;
    for ( int x = 1; x <= 2; x++ ) {
      for ( int y = 1; y <= x; y++ ) {
         intX++;
      }
    }
    strMsg += "  * intX = " + intX + STRCRLF;

    //----------------------------
    strMsg += "Example: infinite loop & the break statement !" + STRCRLF;
    for ( ; ; ) { //Example of an infinite loop!
      intX++;
      if ( intX == 100 ) {
        strMsg += "  intX = " + intX + STRCRLF;
        break; //Break out of loop!
      } 
    }

    strMsg += "Example: continue statement" + STRCRLF;
    for ( int x = 0; x <= 10; x++ ) {
       if ( x <= 4 || x >= 6 ) //Allows value of 5 through.
         continue;
       strMsg += "  x = " + x  + STRCRLF;
    }

    strMsg += "Example of compile errors" + STRCRLF;    
    strMsg += "  * Cannot declare multiple data types in declare statement. (see code)" + STRCRLF;
    strMsg += "    ( int x=1, int y=1 ) should be (int x=1, y=1)" + STRCRLF;

    //for ( int x = 1, int y = 1; ( x <= 2 ) ; x++, y++ ) { 
    //  intX += x + y;
    //}

    return strMsg;
    
  } // MyFor()

  //-------------------------------------------------------------------------
  private int testingMethod() {
  //-------------------------------------------------------------------------
    int intMy = 5;
    
    return intMy;
  }  
  //-------------------------------------------------------------------------
  private int testingMethodX(int x) {
  //-------------------------------------------------------------------------
    x++;
    
    return x;
  }  

  //-------------------------------------------------------------------------
  private boolean testingMethodCondition(int x) {
  //-------------------------------------------------------------------------
    boolean blnReturn;
    
    if ( x <= 5 ) {
      blnReturn = true; 
    } else {
      blnReturn = false;
    }
    
    return blnReturn;
  }  

  
  //-------------------------------------------------------------------------
  private String MyForLabel() {
  //-------------------------------------------------------------------------
  
    String strMsg = "";
    
    int intRow = 0;
    int intCol = 0;

    outer: for ( intRow = 0; intRow < 10; intRow++) {

      inner: for( intCol = 0; intCol < 10; intCol++) {

        if ( intRow == 1 && intCol == 1 ) {
          break; //Breaks out of the for loop.
        }
        if ( intRow == 2 && intCol == 2 ) {
          break inner; //Breaks out of the inner for loop.
        }
        if ( intRow == 3 && intCol == 3 ) {
          break outer; //Breaks out of the outer for loop.
        }
        
      } // inner: for

      strMsg += "  * outer: intRow = " + intRow + " intCol = " + intCol + STRCRLF;

    } // outer: for
    strMsg += "  * Exit for loop: intRow = " + intRow + " intCol = " + intCol + STRCRLF;

  //zzz I need to add an example of "continue"

    return strMsg;
  } // MyLabel()

  
//----------------------------------------------------------------------------------  
  public void init () {
//----------------------------------------------------------------------------------  

    super.init_Components( this.init_train() );

  }
//----------------------------------------------------------------------------------      
  public static void main( String args [] ) {
//----------------------------------------------------------------------------------      

    java.awt.Frame objFrame = new java.awt.Frame( "Training Example JDK1.1" );  
    final MyFlowControlFor applet = new MyFlowControlFor();         //create the applet.
    MyTrain11.main_init( objFrame, applet, args ); //Static method to setup Applet and/or application.
      
  } //main()

} //eoc
//eof