package com.rathod.assignments.faq;

// // JAVA program to find first non-repeating  character
// public class FindFirstNonRepeatingChar {
    
// 	// this function return the index of first non-repeating
// 	// character if found, or else it returns -1
// 	public static int firstNonRepeating(String str)
// 	{
// 		int[] fi
// 			= new int[256]; // array to store First Index

// 		// initializing all elements to -1
// 		for (int i = 0; i < 256; i++)
// 			fi[i] = -1;

// 		// sets all repeating characters to -2 and
// 		// non-repeating characters contain the index where
// 		// they occur
// 		for (int i = 0; i < str.length(); i++) {
// 			if (fi[str.charAt(i)] == -1) {
// 				fi[str.charAt(i)] = i;
// 			}
// 			else {
// 				fi[str.charAt(i)] = -2;
// 			}
// 		}

// 		int res = Integer.MAX_VALUE;

// 		for (int i = 0; i < 256; i++) {

// 			// If this character is not -1 or -2 then it
// 			// means that this character occurred only once
// 			// so find the min index of all characters that
// 			// occur only once, that's our first index
// 			if (fi[i] >= 0)
// 				res = Math.min(res, fi[i]);
// 		}

// 		// if res remains Integer.MAX_VALUE, it means there
// 		// are no characters that repeat only once or the
// 		// string is empty
// 		if (res == Integer.MAX_VALUE)
// 			return -1;
// 		else
// 			return res;
// 	}

// 	public static void main(String args[])
// 	{
// 		String str;
// 		str = "geeksforgeeks";
// 		int firstIndex = firstNonRepeating(str);
// 		if (firstIndex == -1)
// 			System.out.println(
// 				"Either all characters are repeating or string is empty");
// 		else
// 			System.out.println(
// 				"First non-repeating character is "
// 				+ str.charAt(firstIndex));
// 	}
// }
// // This code is contributed by SoumikMondal



//Java code for the above approach

import java.io.*;

public class GFG {
	public static void main(String[] args) {
		String string = "geeksforgeeks";
		int index = -1;
		char fnc = ' ';
	
	if(string.length()==0){
		System.out.println("EMPTY STRING");
	}
	
		for (char i : string.toCharArray()) {
			if (string.indexOf(i) == string.lastIndexOf(i)) {
				fnc = i;
				break;
			}
			else {
				index += 1;
			}
		}
		if (index == string.length()-1) {
			System.out.println("All characters are repeating");
		}
		else {
			System.out.println("First non-repeating character is " + fnc);
		}
	}
}

// This code is contributed by aakansharao1111



// /*package whatever //do not write package name here */

// import java.io.*;
// import java.util.LinkedHashMap;
// import java.util.function.Function;
// import java.util.stream.Collectors;

// class GFG {

// 	private static char findFirstNonRepeatingCharacter(String s) {
// 		return s.chars()
// 				.mapToObj(x -> Character.toLowerCase((char) x))
// 				.collect(Collectors.groupingBy(Function.identity(), 
// 											LinkedHashMap::new, Collectors.counting()))
// 				.entrySet()
// 				.stream()
// 				.filter(x -> x.getValue() == 1)
// 				.findFirst()
// 				.orElseThrow()
// 				.getKey();
// 	}

// 	public static void main (String[] args) {
// 		System.out.println(findFirstNonRepeatingCharacter("geeksforgeeks"));
// 	}
// }
