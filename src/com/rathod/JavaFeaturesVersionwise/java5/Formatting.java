package com.rathod.java5;
//
public class Formatting {
	public static void main(String[] args) 
    {
		int m1 = 78, m2 = 93, m3= 85;
	    int total = m1 + m2 + m3;
	    double avg = total / 3.0;
	    String result = String.format("Marks: %d, %d, %d. Total: %d, Avg: %.2f", 
	                                    m1, m2, m3, total, avg);
	    System.out.println(result);
    }
}

/*
 * 
 * Output: Marks: 78, 93, 85. Total: 256, Avg: 85.33
 * 
 * 
 * Java 5 provides an interpreter for C language printf-style format strings. This feature provides support for layout justification and alignment, common formats for numeric, string, and date/time data, and locale-specific output. The String class has a method called ‘format’ which takes first argument as formatted string and the remaining arguments as values to be substituted for conversions (%d, %f, etc) inside the formatted string.
The above example shows how to use different type conversions for formatting strings:
 
 The following are the commonly used conversions in formatting:
%d denotes decimal integer types such as byte, short, long and double.
%f denotes floating point types such as float and double.
%b denotes boolean.
%c denotes character.
%s denotes String.
 *
 */