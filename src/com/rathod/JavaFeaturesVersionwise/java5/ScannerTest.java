package com.rathod.java5;
//The java.util.Scanner class can be used to convert text into primitives or Strings.
public class ScannerTest {
	public static void main(String[] args) 
    {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
	    System.out.println("Enter your name:");
	    String name = scanner.next();
	    System.out.println("Enter your age:");
	    int age = scanner.nextInt();
	
	    System.out.printf("Name = %s, age = %d", name, age);
    }
}

/*
 * In the above example, we are reading the user’s name as String and her age as int from console (System.in). We can use Scanner to convert text from console, files, network stream etc into appropriate variables like String, int, float, byte, long, boolean etc.

Yippee! Today we learnt most useful and quite interesting features of Java 5. Isn’t it? But, that’s not the end. Here we have covered those features with only basic examples. You need to practice well with few more variations of syntax and much advanced examples. 
 * 
 */