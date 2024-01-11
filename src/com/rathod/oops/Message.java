//193. Given classes defined in two different files:
 package packageA;
 public class Message {
 String getText() { return "text"; }
 }
and:
 package com.rathod.oops;
 public class XMLMessage extends packageA.Message {
 String getText() { return "<msg>text</msg>";}
 public static void main(String[] args) {
 System.out.println(new XMLMessage().getText());
 }
 }

 /*
What is the result of executing XMLMessage.main?
A. text
B. <msg>text</msg>
C. An exception is thrown at runtime.
D. Compilation fails because of an error in line 2 of XMLMessage.
E. Compilation fails because of an error in line 3 of XMLMessage.
Answer: E
*/