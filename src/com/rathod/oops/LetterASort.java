package com.rathod.oops;
//188. Given:
 import java.util.*;
 public class LetterASort{
 public static void main(String[] args) {
 ArrayList<String> strings = new ArrayList<String>();
 strings.add("aAaA");
 strings.add("AaA");
 strings.add("aAa");
 strings.add("AAaa");
 Collections.sort(strings);
 for (String s : strings) { System.out.print(s + " "); }   }  }

 /*
What is the result?
A. Compilation fails.
B. aAaA aAa AAaa AaA
C. AAaa AaA aAa aAaA
D. AaA AAaa aAaA aAa
E. aAa AaA aAaA AAaa
F. An exception is thrown at runtime.
Answer: C
*/
