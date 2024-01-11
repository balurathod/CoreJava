package com.rathod.java7;

import java.io.*;
import java.util.*;

public class BinaryLiteral7AllFeatures {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//Binary Literal...
		int binary = 8;			//			java 6
		//int binary = 0b1000;   //2^3 = 8    java 7
		
		int number = 8;
		//if(0b1000 == number)
		
        if (binary == 8){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
        
//Underscores Between Literals :
        int oneMillion_ = 1_000_000; //new in java 7
        int oneMillion = 1000000;
        if (oneMillion_ == oneMillion){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
        
        //1. Consecutive underscores is legal.
        
        int n = 1000______000;
         
       // 2. Underscores can be included in other numeric types as well.
         
        double d = 1000_000.0d;
        long l = 1000_000l;
        int hex = 0xdead_c0de;
        int bytes = 0x1000_0000;
         
       // 3. Underscore can be included after the decimal point.
         
        double example8 = 1000_000.000_000d;
         
       // 4. It is illegal to start a literal with an underscore

         int i = _1000;

        
       // 5. It is illegal to end a literal with an underscore.
         int i = 1000_;

         
        //6. It is also illegal to have underscore be just before or after a decimal point.
         
         double d1 = 1000_00_.0d;
         double d2 = 1000_00_.0d;

        
        
//Diamond Syntax (<<)  i.e (Improved type inference for generic instance creation)
        List<String> list = new ArrayList<String>();		//Java 6
        Map<String List<String>> map = new HashMap<String List<String>>();
        
        
        List<String> list = new ArrayList<String>();		//Java 7
        Map<String List<String>> map = new HashMap<>();
        
        
//Multi-Catch Similar Exceptions:
        try {												//java 6
            throw new FileNotFoundException("FileNotFoundException");
        } catch (FileNotFoundException fnfo) {
            fnfo.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
        
        try {												//java 7
            throw new FileNotFoundException("FileNotFoundException");
        } catch (FileNotFoundException | IOException fnfo) {				
            fnfo.printStackTrace();
        }
        
        
        
//Try with Resources:
        FileInputStream in = null;							//Java 6
        try {
            in = new FileInputStream("java6.txt");
            System.out.println(in.read());
        } finally {
            if (in != null) {
                in.close();
            }
        }
        
        													//Java 7
        try (FileInputStream in = new FileInputStream("java7.txt")) {
            System.out.println(in.read());
        }
        

//Java 7 has added the “precise rethrow” feature which lets you catch and throw the base exception while still throwing the precise exception from the calling method.
//Note the keyword final in the above catch clause. When a parameter is declared final, the compiler statically knows to only throw those checked exceptions that were thrown by the try block and were not caught in any preceding catch blocks.
        try {												//java 7
            loadFileToDb();
        } catch (final Exception ex) {		
        	System.err.print(ex.getMessage());
            throw ex;
        }

	}
}




/*
 * ======JDK 7===>G1 Garbage Collector======

JDK 7 introduced a new Garbage Collector known as G1 Garbage Collection, which is short form of garbage first. G1 garbage collector performs clean-up where there is most garbage. To achieve this it split Java heap memory into multiple regions as opposed to 3 regions in the prior to Java 7 version (new, old and permgen space). It's said that G1 is quite predictable and provides greater through put for memory intensive applications.

Read more: http://javarevisited.blogspot.com/2014/04/10-jdk-7-features-to-revisit-before-you.html#ixzz3lu3kpqVk
 * 
 * 
 * 
 * =========JDK 7====More Precise Rethrowing of Exception========

The Java SE 7 compiler performs more precise analysis of re-thrown exceptions than earlier releases of Java SE. This enables you to specify more specific exception types in the throws clause of a method declaration. before JDK 7, re-throwing an exception was treated as throwing the type of the catch parameter. For example, if your try block can throw ParseException as well as IOException. In order to catch all exceptions and rethrow them, you would have to catch Exception and declare your method as throwing an Exception. This is sort of obscure non-precise throw, because you are throwing a general Exception type (instead of specific ones) and statements calling your method need to catch this general Exception. This will be more clear by seeing following example of exception handling in code prior to Java 1.7

public void obscure() throws Exception{
    try {
        new FileInputStream("abc.txt").read();
        new SimpleDateFormat("ddMMyyyy").parse("12-03-2014");        
    } catch (Exception ex) {
        System.out.println("Caught exception: " + ex.getMessage());
        throw ex;
    }
}

From JDK 7 onwards you can be more precise while declaring type of Exception in throws clause of any method. This precision in determining which Exception is thrown from the fact that, If you re-throw an exception from a catch block, you are actually throwing an exception type which:

   1) your try block can throw,
   2) has not handled by any previous catch block, and
   3) is a subtype of one of the Exception declared as catch parameter

This leads to improved checking for re-thrown exceptions. You can be more precise about the exceptions being thrown from the method and you can handle them a lot better at client side, as shown in following example :

public void precise() throws ParseException, IOException {
    try {
        new FileInputStream("abc.txt").read();
        new SimpleDateFormat("ddMMyyyy").parse("12-03-2014");        
    } catch (Exception ex) {
        System.out.println("Caught exception: " + ex.getMessage());
        throw ex;
    }
}
The Java SE 7 compiler allows you to specify the exception types ParseException and IOException in the throws clause in the preciese() method declaration because you can re-throw an exception that is a super-type of any of the types declared in the throws, we are throwing java.lang.Exception, which is super class of all checked Exception. Also in some places you will see final keyword with catch parameter, but that is not mandatory any more.


Read more: http://javarevisited.blogspot.com/2014/04/10-jdk-7-features-to-revisit-before-you.html#ixzz3lu4eSevU
 * 
 * */
