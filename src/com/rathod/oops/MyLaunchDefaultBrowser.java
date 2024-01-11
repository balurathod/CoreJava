package com.rathod.oops;
/*
 * MyLaunchDefaultBrowser.java
 *
 * Created on 12/04/02
 */

/**
 *
 * @author  Michael Thomas
 * @version 1.0
 */

//#################################################################################
public class MyLaunchDefaultBrowser {
//#################################################################################  
  
//----------------------------------------------------------------------------------      
  public static void main( String args [] ) {
//----------------------------------------------------------------------------------      

    System.out.println("Example of launching a System Process for Windows.");
    System.out.println("The default application (Default Browser) for .html files will start and display the .html file.");
    
    String strCmd = "";
    String strWindowsCommand = "rundll32 url.dll,FileProtocolHandler" + " ";
    strCmd = strWindowsCommand + "MyLaunchDefaultBrowserExample.html";
    
    try {
      Process p = Runtime.getRuntime().exec(strCmd);
    } catch ( Exception eExec ) {
      System.out.println( eExec.toString() );
    }
      
  } //main()

} //eoc
//eof