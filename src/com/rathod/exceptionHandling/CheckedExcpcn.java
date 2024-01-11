package com.rathod.exceptionHandling;
import java.io.*;
import java.security.PublicKey;

import com.rathod.assignments.faq.Main;

public class CheckedExcpcn {

	public static void main(String[] args) //throws IOException
	{
		FileReader file= new FileReader("C:/test/a.txt");
		BufferedReader fileInput = new BufferedReader(file);

		// Print first 3 lines of file "C:\test\a.txt"
		for (int counter = 0; counter < 3; counter++) 
			System.out.println(fileInput.readLine());

		fileInput.close();

	}
}

/*===========Checked Exception============
 * Exception in thread "main" java.lang.RuntimeException: Uncompilable source code - 
unreported exception java.io.FileNotFoundException; must be caught or declared to be 
thrown
	at Main.main(Main.java:5)
	
	
	To fix the above program, we either need to specify list of exceptions using throws,
	
	

===========Unchecked Exception============
Consider the following Java program. It compiles fine, but it throws ArithmeticException when run. The compiler allows it to compile, because ArithmeticException is an unchecked exception.

	class Main {
   public static void main(String args[]) {
      int x = 0;
      int y = 10;
      int z = y/x;
  }
}


 */