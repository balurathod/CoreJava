package com.rathod.oops;
//176. Given:
 import java.util.*;
 public class Old {
 public static Object get0(List list) {
 return list.get(0);
 }    
 }

 /*
Which three will compile successfully? (Choose three.)
A. Object o = Old.get0(new LinkedList());
B. Object o = Old.get0(new LinkedList<?>());
C. String s = Old.get0(new LinkedList<String>());
D. Object o = Old.get0(new LinkedList<Object>());
E. String s = (String)Old.get0(new LinkedList<String>());
Answer: ADE
*/
