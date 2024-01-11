package com.rathod.oops;
/*
 * MyDateJdk11.java
 *
 * Created on 09/09/01
 */

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author  Michael Thomas
 * @version 1.0
 */

//#################################################################################
public class MyDateJdk11 extends MyTrain11 {
//#################################################################################  
  
//----------------------------------------------------------------------------------
  private String init_train() {
//----------------------------------------------------------------------------------

    SimpleDateFormat objSimpleDateFormat;
    GregorianCalendar objGC;
    Date objDate;
    String strDate;
    
    String strMsg = "";
      
    strMsg += "Dates & Java: \n";
    strMsg += "Note:  You must look at the source code to make sense of this information. \n";
    strMsg += "\n";

    //***************
    objDate = new Date();

    //***************
    objSimpleDateFormat = new SimpleDateFormat ("MM/dd/yyyy");
    strDate = objSimpleDateFormat.format(objDate);
    
    strMsg += "SimpleDateFormat format (\"MM/dd/yyyy\"): " + "\n" + strDate + "\n";
    strMsg += "\n";

    //***************
    objSimpleDateFormat = new SimpleDateFormat ("MM/dd/yyyy hh:mm:ss aaa");
    strDate = objSimpleDateFormat.format(objDate);
    
    strMsg += "SimpleDateFormat format (\"MM/dd/yyyy hh:mm:ss aaa z\"): (12hr format)" + "\n" + strDate + "\n";
    strMsg += "\n";

    //***************
    objSimpleDateFormat = new SimpleDateFormat ("MM/dd/yyyy HH:mm:ss z");
    strDate = objSimpleDateFormat.format(objDate);
    
    strMsg += "SimpleDateFormat format (\"MM/dd/yyyy HH:mm:ss z\"): (24hr format - Military)" + "\n" + strDate + "\n";
    strMsg += "\n";
    
    //***************
    objGC = new GregorianCalendar();
    
    strMsg += "GregorianCalendar's toString() = " + objGC.toString() + "\n";
    strMsg += "\n";
    
    //***************
    objDate = objGC.getTime();
    objSimpleDateFormat = new SimpleDateFormat ("MM/dd/yyyy");
    strDate = objSimpleDateFormat.format(objDate);
    
    strMsg += "GregorianCalendar -> Date -> SimpleDateFormat = " + strDate + "\n";
    strMsg += "\n";
   
    //***************

    objGC.setTime( objDate );  //Set the date/time from a java.util.Date.
    
    strMsg += "Date -> GregorianCalendar -> SimpleDateFormat = " + objSimpleDateFormat.format( objGC.getTime() ) + "\n";

    //Start: Subtract 1 day from a java.util.Date
    objSimpleDateFormat = new SimpleDateFormat ("MM/dd/yyyy");
    objGC = new GregorianCalendar(); //Get an instance.
    objGC.setTime( objDate ); //Set the Date & Time to equal the java.util.Date object.
    objGC.add(Calendar.DATE , -1); //Subtract 1 day.
    strDate = objSimpleDateFormat.format( objGC.getTime() );

    strMsg += "Use GregorianCalendar to subtract a day from a java.util.Date: " + objSimpleDateFormat.format( objGC.getTime() );
    //Stop: Subtract 1 day from a java.util.Date
    
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
    final MyDateJdk11 applet = new MyDateJdk11();         //create the applet.
    MyTrain11.main_init( objFrame, applet, args ); //Static method to setup Applet and/or application.
      
  } //main()

} //eoc
//eof