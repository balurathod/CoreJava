package com.rathod.oops;
/**
Program....: MyIOTextFile_txt.java
Programmer.: Michael Thomas
Orig Date..: 3/22/01

Note:  Need to add Security Requests to allow an Applet to access the local file system.
       Runs fine as a Application.

*/

import java.io.*;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.*;        //need to handle window events.
import java.awt.Frame;       
import java.awt.BorderLayout; 
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class MyIOTextFile_txt { //

  String strFileOut = "MyIOTextFile_txt.txt";
  SimpleDateFormat objSimpleDateFormat;
  GregorianCalendar objGC;
  Date objDate;
  String strDate;
  
  public void init() {
    
    try {
      
      //FileWriter fwFileOut      = new FileWriter (strFileOut); //Overwrite
      FileWriter fwFileOut      = new FileWriter (strFileOut, true); //Append
      BufferedWriter bwFileOut  = new BufferedWriter (fwFileOut);
      PrintWriter pwFileOut     = new PrintWriter (bwFileOut);  

      //***************
      objDate = new Date();
      objSimpleDateFormat = new SimpleDateFormat ("MM/dd/yyyy hh:mm:ss aaa");
      strDate = objSimpleDateFormat.format(objDate);
    
      pwFileOut.println ( strDate + " - Hello World from a Java Application: MyIOTextFile_txt.java " );

      pwFileOut.close();
      
    } catch (FileNotFoundException exception) {
      
      System.out.println ();
      System.out.println ( "File not found: " + strFileOut );

    } catch (IOException exception) {
      System.out.println (exception);
    }    
  }
  
  public void paint(Graphics g) {
    g.drawString("Hello world! (MyIOTextFile_txt.java)", 50, 25);
  }

  public static void main( String args [] )
  { 

    MyIOTextFile_txt app = new MyIOTextFile_txt();  //create the application object.
    app.init();                                 //initialize/rum the application.

  } //main()
}  
