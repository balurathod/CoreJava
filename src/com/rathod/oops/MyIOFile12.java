package com.rathod.oops;
/*
 * MyIOFile12.java
 *
 * Created on 09/09/01
 */

/**
 *
 * @author  Michael Thomas
 * @version 1.0
 */

import java.io.File;

//#################################################################################
public class MyIOFile12 extends MyTrain12 {
//#################################################################################  
  
//----------------------------------------------------------------------------------
  private String init_train() {
//----------------------------------------------------------------------------------

    String strMsg = "";

    File objFile;
    
    strMsg += "File's System Dependent Fields" + STRCRLF;
    
    strMsg += "  * pathSeparator: String = " + File.pathSeparator + "Char = " + File.pathSeparatorChar + STRCRLF;
    strMsg += "  * separator: String = " + File.separator + "Char = " + File.separatorChar + STRCRLF;
    
    objFile = new File( "MyIOFile_NoFile.data" );
    
    strMsg += "  * isFile() = " + objFile.isFile() + STRCRLF;
    strMsg += "  * Delete a file if it exists. " + STRCRLF;
    
    objFile = new File( "MyIOFile12_createnewfile.txt" );
    if ( objFile.isFile() ) objFile.delete();
    
    strMsg += "  * Create a new file (empty-> 0 bytes)." + STRCRLF;
    strMsg += "    Warning: If you run from an IDE it may place the file in another directory!" + STRCRLF;
    
    try {
      if ( objFile.createNewFile() ) {
        strMsg += "    Successful" + STRCRLF;
      } else {
        strMsg += "    Failed" + STRCRLF;
      }
    } catch (java.io.IOException e) {
      System.out.println( "File creation problem" );
      System.out.println( e );
    }


    strMsg += "  * isFile() = " + objFile.isFile() + STRCRLF;

    strMsg += "" + STRCRLF;
    
    strMsg += "Directories" + STRCRLF;

    //File list of a directory.
    objFile = new File( "." );
    strMsg += "  * isDirectory() = " + objFile.isDirectory() + STRCRLF;
    strMsg += "  * list().length = " + objFile.list().length + STRCRLF;

    String [] astrDirectoryList = objFile.list();
    strMsg += "Directory List: ";
    for ( int x=0; x < astrDirectoryList.length; x++ ) {
      strMsg += "," + astrDirectoryList[x];
    }

    
    

    strMsg += STRCRLF;
    strMsg += "Sorry, not finished.  Will add more later!" + STRCRLF;
    
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

    javax.swing.JFrame objFrame = new javax.swing.JFrame( "Training Example JDK1.2" );  
    final MyIOFile12 applet = new MyIOFile12();         //create the applet.
    MyTrain12.main_init( objFrame, applet, args ); //Static method to setup Applet and/or application.
      
  } //main()

} //eoc
//eof