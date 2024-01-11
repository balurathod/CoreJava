package com.rathod.java6;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/*
 * Please execute the following program from command prompt.
 */
public class ConsoleEx {
	 /**
	  * @param args
	  */
	 public static void main(String[] args) {
	  // A. Using the Console class methods... from jdk 1.6

	  Console console = System.console();
	  System.out.println("Please key in  text and press enter:");
	  String readLine = console.readLine();
	  System.out.println("Line from Console class:" + readLine);

	  System.out.println("Please key in  password and press enter:");

	  char[] charArray = console.readPassword();
	  String passwordFromConsole = "";
	  for (int i = 0; i < charArray.length; i++) {
	   passwordFromConsole = passwordFromConsole + charArray[i];
	  }
	  System.out.println("Password from Console class:" + passwordFromConsole);

	  // Other approaches used to follow to get text from console
	  // B. InputStream class
	  BufferedReader bis = new BufferedReader(
	    new InputStreamReader(System.in));
	  String passwordFromInputStream = null;
	  try {
	   passwordFromInputStream = bis.readLine();
	   // There are no special methods to read passwords in InputStream class without echoing
	  } catch (IOException e) {
	   e.printStackTrace();
	  }
	  System.out.println(passwordFromInputStream);

	  // C . Scanner class from java.util.Scanner
	  String scannedLines = "";
	  Scanner scanner = new Scanner(System.in);
	  while (scanner.hasNextLine()) {
	   scannedLines += scanner.nextLine();
	  }
	  System.out.println(scannedLines);
	  // Here both Scanner and InputStreamReader used the class InputStream
	  // (System.in) as an argument to read from the console and they are
	  // designed to read from other input sources also like File, Strings...
	  // Where as Console Class is designed for single purpose to read from
	  // Console.
	  // Also No need to handle exception if we use Console
	 }
}

//=========Java 6 Features===========
//Pluggable Annotation Processing API (JSR 269)
//Common Annotations (JSR 250)
//Java API for XML Based Web Services – 2.0 (JSR 224)
//JAXB 2.0 (JSR 222)
//Web Services Metadata (JSR 181)
//Streaming API for XML (JSR 173)
//XML Digital Signature (JSR 105)
//Java Class File Specification Update (JSR 202)
//Java Compiler API (JSR 199)
//JDBC 4.0 (JSR 221)
//Scripting in the Java Platform (JSR 223)
