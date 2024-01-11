package com.rathod.oops;
/*
 * MyIOBasics.java
 *
 * Created on 09/09/01
 */

/**
 *
 * @author  Michael Thomas
* @version 1.0
 */

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.ClassNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.BufferedReader;
//#################################################################################
public class MyIOBasics extends MyTrain11 {
//#################################################################################  
  
//----------------------------------------------------------------------------------
  private String init_train() {
//----------------------------------------------------------------------------------

    String strMsg = "";

    strMsg += "Basic I/O Examples" + STRCRLF;
    strMsg += "  * In these examples I'm throwing the Exception in the calling methods" + STRCRLF;
    strMsg += "    and try/catch the Exceptions here in this method." + STRCRLF;
    strMsg += "  * I use the PrintWriter & BufferedReader primarily for Text & XML files." + STRCRLF;
    strMsg += "    You may need the other methods for specific requirements: " + STRCRLF;
    strMsg += "      FileOutputStream/FileInputStream - byte." + STRCRLF;
    strMsg += "      DataOutputStream/DataInputStream - Primitive Data types." + STRCRLF;
    strMsg += "      FileWriter/FileReader - primarily char arrays." + STRCRLF;
    strMsg += STRCRLF;
    
    try {
      strMsg += "FileOutputStream & FileInputStream" + STRCRLF;
      strMsg += "  * Writes & Reads the Primitive Data type byte." + STRCRLF;
      strMsg += myFileOutputStream();
      strMsg += myFileInputStream();
      
      strMsg += "DataOutputStream & DataInputStream" + STRCRLF;
      strMsg += "  * Writes & Reads all Primitive Data types." + STRCRLF;
      strMsg += "  * Builds on to the FileOutputStream & FileInputStream" + STRCRLF;
      strMsg += myDataOutputStream();
      strMsg += myDataInputStream();
      strMsg += STRCRLF;
      
      strMsg += "ObjectOutputStream & ObjectInputStream" + STRCRLF;
      strMsg += "  * Writes & Reads Objects to a file." + STRCRLF;
      strMsg += "  * Objects need to implement Serializable" + STRCRLF;
      strMsg += "  * Also Writes & Reads the Primitive Data type byte." + STRCRLF;
      strMsg += myObjectOutputStream();
      strMsg += myObjectInputStream();
      strMsg += STRCRLF;

      strMsg += "FileWriter & FileReader" + STRCRLF;
      strMsg += myFileWriter();
      strMsg += myFileReader();
      strMsg += STRCRLF;
      
      strMsg += "PrintWriter & BufferedReader" + STRCRLF;
      strMsg += "  * Writes & Reads all Primitive Data types, Strings & Objects." + STRCRLF;
      strMsg += "  * Builds on to the FileOutputStream & FileReader" + STRCRLF;
      strMsg += myPrintWriter("MyIOBasics_PrintWriter.txt");
      strMsg += myBufferedReader("MyIOBasics_PrintWriter.txt");
      strMsg += STRCRLF;

      strMsg += "HTML with PrintWriter & BufferedReader" + STRCRLF;
      strMsg += myPrintWriterHTML("MyIOBasics_PrintWriter.html");
      strMsg += myBufferedReader("MyIOBasics_PrintWriter.html");
      strMsg += STRCRLF;

      strMsg += "XML with PrintWriter & BufferedReader" + STRCRLF;
      strMsg += myPrintWriterXML("MyIOBasics_PrintWriter.xml");
      strMsg += myBufferedReader("MyIOBasics_PrintWriter.xml");
      strMsg += STRCRLF;
      
    } catch ( Exception e) {
      System.out.println( e.getMessage());
      System.out.println( e );
      e.printStackTrace(); //Prints stack trace to the JavaConsole
    }
    
    return strMsg;
  }    
  
//----------------------------------------------------------------------------------
  private String myFileOutputStream() throws IOException, FileNotFoundException {
//----------------------------------------------------------------------------------
    String strMsg = "";
    
    File             objFile   = new File( "MyIOBasics_FileOutputStream.data" );
    FileOutputStream objFileOutputStream = new FileOutputStream( objFile );

    byte [] abyteMy1 = {1, 2, 3, 4, 5};
    objFileOutputStream.write(abyteMy1);

    byte [] abyteMy2 = {10, 20, 30, 40, 50};
    objFileOutputStream.write(abyteMy2);
      
    byte [] abyteMy3 = new byte[6];
    abyteMy3 [0] = '1';
    abyteMy3 [1] = 'A';
    abyteMy3 [2] = 'a';
    abyteMy3 [3] = '\r';
    abyteMy3 [4] = '\n';
    abyteMy3 [5] = '\f';
    objFileOutputStream.write(abyteMy3);
    
    objFileOutputStream.write( 100 ); //Write an int.
    
    objFileOutputStream.close();
    
    return strMsg;
  }

//----------------------------------------------------------------------------------
  private String myFileInputStream() throws IOException, FileNotFoundException {
//----------------------------------------------------------------------------------
    String strMsg = "";

    strMsg += "Using FileInputStream" + STRCRLF;
    
    File objFile = new File("MyIOBasics_FileOutputStream.data");
    FileInputStream objFileInputStream = new FileInputStream(objFile);

    //set up an array to read data in
    int    intFileSize  = (int)objFile.length();
    byte[] abyteMy = new byte[intFileSize];

    //read data in and display them
    objFileInputStream.read(abyteMy);
    for (int i = 0; i < intFileSize; i++) {
       strMsg += abyteMy[i];
    }
      
    strMsg += STRCRLF;

    objFileInputStream.close();
    
    return strMsg;
  }

//----------------------------------------------------------------------------------
  private String myDataOutputStream() throws IOException, FileNotFoundException {
//----------------------------------------------------------------------------------
    String strMsg = "";

    strMsg += "Using DataOuputStream" + STRCRLF;
    
    File objFile = new File("MyIOBasics_DataOutputStream.data");
    FileOutputStream objFileOutputStream  = new FileOutputStream( objFile );
    DataOutputStream objDataOutputStream  = new DataOutputStream( objFileOutputStream );

    objDataOutputStream.writeByte(1);
    objDataOutputStream.writeShort(2);
    objDataOutputStream.writeInt(10);
    objDataOutputStream.writeLong(11L);
    objDataOutputStream.writeFloat(12.0F);
    objDataOutputStream.writeDouble(13D);
    objDataOutputStream.writeChar('A');
    objDataOutputStream.writeBoolean(true);
    objDataOutputStream.writeUTF("B");
    
    objDataOutputStream.writeBytes("abc");    
    objDataOutputStream.writeChars("abc");
    
    strMsg += "  * Size of bytes written: " + objDataOutputStream.size() + STRCRLF;
    
    objDataOutputStream.close();
    
    return strMsg;
  }

//----------------------------------------------------------------------------------
  private String myDataInputStream() throws IOException, FileNotFoundException {
//----------------------------------------------------------------------------------
    String strMsg = "";

    File objFile = new File("MyIOBasics_DataOutputStream.data");
    FileInputStream objFileInputStream = new FileInputStream(objFile);
    DataInputStream objDataInputStream = new DataInputStream(objFileInputStream);
    
    strMsg += "    ";
    strMsg += objDataInputStream.readByte() + ",";
    strMsg += objDataInputStream.readShort() + ",";
    strMsg += objDataInputStream.readInt() + ",";
    strMsg += objDataInputStream.readLong() + ",";
    strMsg += objDataInputStream.readFloat() + ",";
    strMsg += objDataInputStream.readDouble() + ",";
    strMsg += objDataInputStream.readChar() + ",";
    strMsg += objDataInputStream.readBoolean() + ",";
    
    int intAvailable1 = objDataInputStream.available();
    
    strMsg += objDataInputStream.readUTF() + ","; //3 bytes.
    
    int intAvailable2 = objDataInputStream.available();
    
    for ( int x=0; x < 3; x++ ) {
      strMsg += objDataInputStream.readByte() + ","; //byte take 1 byte. (8 bits)
    }

    int intAvailable3 = objDataInputStream.available();
    
    for ( int x=0; x < 3; x++ ) {
      strMsg += objDataInputStream.readChar() + ","; //char take 2 bytes. (16 bits)
    } 
    
    strMsg += STRCRLF;
    
    int intAvailable4 = objDataInputStream.available();
    
    strMsg += "    Values of intAvailable1 - 4: " + 
              intAvailable1 + ", " +
              intAvailable2 + ", " +
              intAvailable3 + ", " +
              intAvailable4 + STRCRLF;
              
    objDataInputStream.close();
    
    return strMsg;
  }
//----------------------------------------------------------------------------------
  private String myObjectOutputStream() throws IOException, FileNotFoundException {
//----------------------------------------------------------------------------------
    String strMsg = "";

    strMsg += "Using ObjectOuputStream" + STRCRLF;
    
    File objFile = new File("MyIOBasics_ObjectOutputStream.data");
    FileOutputStream objFileOutputStream  = new FileOutputStream( objFile );
    ObjectOutputStream objObjectOutputStream  = new ObjectOutputStream( objFileOutputStream );

    int intNumObjects = 5;
    objObjectOutputStream.writeInt( intNumObjects );
    
    for ( int x=0; x < intNumObjects; x++ ) {
      Student objStudent = new Student("Name"+x, 90+x);
      objObjectOutputStream.writeObject( objStudent );
      strMsg += "    Name = " + objStudent.getStrName() + 
                ", Grade = " + objStudent.getDblGrade() + STRCRLF;
    }
        
    objObjectOutputStream.close();
    
    return strMsg;
  }

//----------------------------------------------------------------------------------
  private String myObjectInputStream() throws IOException, FileNotFoundException, 
                                              ClassNotFoundException {
//----------------------------------------------------------------------------------
    String strMsg = "";
    
    strMsg += "Using ObjectInputStream" + STRCRLF;

    File objFile = new File("MyIOBasics_ObjectOutputStream.data");
    FileInputStream objFileInputStream = new FileInputStream(objFile);
    ObjectInputStream objObjectInputStream = new ObjectInputStream(objFileInputStream);
    
    strMsg += "  Bytes available (Why 0?): " + objObjectInputStream.available() + STRCRLF;
    
    Student objStudent = null;
    
      
    int intNumObjects = objObjectInputStream.readInt();
      
    strMsg += "    List of data from Student Objects. # of Objects = " + intNumObjects + STRCRLF;

    for ( int x=0; x < intNumObjects; x++ ) {
      objStudent  = (Student) objObjectInputStream.readObject();
      strMsg += "    Name = " + objStudent.getStrName() + 
                ", Grade = " + objStudent.getDblGrade() + 
                ", Byted Avail (Why 0?) = " + objObjectInputStream.available() + STRCRLF; 
    }
    
    strMsg += "    ";
              
    objObjectInputStream.close();
    
    return strMsg;
  }

//----------------------------------------------------------------------------------
  private String myFileWriter() throws IOException, FileNotFoundException {
//----------------------------------------------------------------------------------
    String strMsg = "";

    File objFile = new File("MyIOBasics_FileWriter.txt");
    FileWriter objFileWriter = new FileWriter( objFile );

    //write values of primitive data types to the stream
    objFileWriter.write( "Line #1\n" );
    objFileWriter.write( "Line #2\n" );
    objFileWriter.write( "Line #3\n" );

    //output done, so close the stream
    objFileWriter.close();
    
    return strMsg;
  }

//----------------------------------------------------------------------------------
  private String myFileReader() throws IOException, FileNotFoundException {
//----------------------------------------------------------------------------------
    String strMsg = "";

    File objFile = new File("MyIOBasics_FileWriter.txt");
    FileReader objFileReader = new FileReader( objFile );

    //set up a char array to read data in.
    int    intFileSize  = (int) objFile.length();
    char[] acharMy = new char[intFileSize];

    //Reads intFileSize chars into a char array starting at 0.
    objFileReader.read(acharMy,0,intFileSize); 
    for (int i = 0; i < intFileSize; i++) {
       strMsg += acharMy[i];
    }

    //output done, so close the stream
    objFileReader.close();
    
    return strMsg;
  }

//----------------------------------------------------------------------------------
  private String myPrintWriter(String strFileName) throws IOException, FileNotFoundException {
//----------------------------------------------------------------------------------
    String strMsg = "";

    File              objFile             = new File(strFileName);
    FileOutputStream  objFileOutputStream = new FileOutputStream(objFile);
    PrintWriter       objPrintWriter      = new PrintWriter(objFileOutputStream);

    objPrintWriter.println("This is Line #1 - println()");
    
    objPrintWriter.print("This");
    objPrintWriter.print(" is");
    objPrintWriter.print(" Line #2 - print() \n");  //Notice: \n - new line. Problem w/Notepad.
    
    objPrintWriter.print("This");
    objPrintWriter.print(" is");
    objPrintWriter.print(" Line #3 - print() \r\n");  //Notice: \r\n - new line. Works w/ Notepad.

    String strExample = "This is Line #4 - println()";
    objPrintWriter.println(strExample);
    
    objPrintWriter.println("This is Line #5 - println()");
    

    //output done, so close the stream
    objPrintWriter.close();

    return strMsg;
  }

//----------------------------------------------------------------------------------
  private String myBufferedReader(String strFileName) throws IOException, FileNotFoundException {
//----------------------------------------------------------------------------------
    String strMsg = "";
    
    File           objFile            = new File(strFileName);
    FileReader     objFileReader      = new FileReader(objFile);
    BufferedReader objBufferedReader  = new BufferedReader(objFileReader);

    String strReadLine;
    while ( true ) {
    
      strReadLine = objBufferedReader.readLine();
      if ( strReadLine == null ) {
        break;
      }
      
      strMsg += strReadLine + STRCRLF;
      
    }
    
    objBufferedReader.close();
    
    return strMsg;
  }

//----------------------------------------------------------------------------------
  private String myPrintWriterHTML(String strFileName) throws IOException, FileNotFoundException {
//----------------------------------------------------------------------------------
    String strMsg = "";

    File              objFile             = new File(strFileName);
    FileOutputStream  objFileOutputStream = new FileOutputStream(objFile);
    PrintWriter       objPrintWriter      = new PrintWriter(objFileOutputStream);

    String strHTML = "";
    strHTML += "<html>" + STRCRLF;
    strHTML += "<head>" + STRCRLF;
    strHTML += "  <title>MyIOBasics HTML Example</title>" + STRCRLF;
    strHTML += "</head>" + STRCRLF;
    strHTML += "<body>" + STRCRLF;
    strHTML += "  <h1 align=\"center\">MyIOBasics HTML Example</h1>" + STRCRLF;
    strHTML += "  <p>This is a test of creating an HTML file from Java.</p>" + STRCRLF;
    strHTML += "</body>" + STRCRLF;
    strHTML += "</html>" + STRCRLF;
    
    objPrintWriter.print(strHTML);
    
    //output done, so close the stream
    objPrintWriter.close();

    return strMsg;
  }


  
//----------------------------------------------------------------------------------
  private String myPrintWriterXML(String strFileName) throws IOException, FileNotFoundException {
//----------------------------------------------------------------------------------
    String strMsg = "";

    File              objFile             = new File(strFileName);
    FileOutputStream  objFileOutputStream = new FileOutputStream(objFile);
    PrintWriter       objPrintWriter      = new PrintWriter(objFileOutputStream);


    String strXml = "";
    strXml += "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + STRCRLF;
    strXml += "<StudentRecords>" + STRCRLF;
    strXml += "  <id1>" + STRCRLF;
    strXml += "    <name>Jane Doe</name>" + STRCRLF;
    strXml += "    <ssn>12-123-1234</ssn>" + STRCRLF;
    strXml += "  </id1>" + STRCRLF;
    strXml += "  <id2>" + STRCRLF;
    strXml += "    <name>John Doe</name>" + STRCRLF;
    strXml += "    <ssn>56-567-5678</ssn>" + STRCRLF;
    strXml += "  </id2>" + STRCRLF;
    strXml += "</StudentRecords>" + STRCRLF;
    
    objPrintWriter.print(strXml);
    
    //output done, so close the stream
    objPrintWriter.close();

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
    final MyIOBasics applet = new MyIOBasics();         //create the applet.
    MyTrain11.main_init( objFrame, applet, args ); //Static method to setup Applet and/or application.
      
  } //main()

  //####################################################################
  private class Student implements java.io.Serializable {  // inner class!
  //####################################################################
    
    private String strName = "";
    private double dblGrade = 0;
    
    private Student( String strName, double dblGrade ) {
      this.strName = strName;
      this.dblGrade = dblGrade;
    }
    
    //-----------------------------------------
    private String getStrName () {
    //-----------------------------------------
      return this.strName;
    }
    //-----------------------------------------
    private void setStrName (String strName) {
    //-----------------------------------------
      this.strName = strName;
    }

    //-----------------------------------------
    public double getDblGrade () {
    //-----------------------------------------
      return this.dblGrade;
    }
    //-----------------------------------------
    public void setDblGrade (double dblGrade) {
    //-----------------------------------------
      this.dblGrade = dblGrade;
    }
  
  }
  
  
} //eoc
//eof