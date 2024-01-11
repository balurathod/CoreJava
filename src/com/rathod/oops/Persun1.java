package com.rathod.oops;
//171. Given:  
public class Persun1 { private String name;
 public Person(String name) { this.name = name; }
 public boolean equals(Person p) {
 return p.name.equals(this.name);   }   }

 /*
Which is true?
A. The equals method does NOT properly override the Object.equals method.
B. Compilation fails because the private attribute p.name cannot be accessed in line 5.
C. To work correctly with hash-based data structures, this class must also implement the hashCode method.
D. When adding Person objects to a java.util.Set collection, the equals method in line 4 will prevent duplicates.
Answer: A


172. Which two statements are true about the hashCode method? (Choose two.)
A. The hashCode method for a given class can be used to test for object equality and object inequality for that class.
B. The hashCode method is used by the java.util.SortedSet collection class to order the elements within that set.
C. The hashCode method for a given class can be used to test for object inequality, but NOT object equality, for that class.
D. The only important characteristic of the values returned by a hashCode method is that the distribution of values must follow a
Gaussian distribution.
E. The hashCode method is used by the java.util.HashSet collection class to group the elements within that set into hash buckets for
swift retrieval.
Answer: CE

173. Given:  enum Example { ONE, TWO, THREE }
Which is true? 
A. The expressions (ONE == ONE) and ONE.equals(ONE) are both guaranteed to be true.
B. The expression (ONE < TWO) is guaranteed to be true and ONE.compareTo(TWO) is guaranteed to be less than one.
C. The Example values cannot be used in a raw java.util.HashMap; instead, the programmer must use a java.util.EnumMap.
D. The Example values can be used in a java.util.SortedSet, but the set will NOT be sorted because enumerated types do NOT
implement java.lang.Comparable.   
Answer: A

*/
