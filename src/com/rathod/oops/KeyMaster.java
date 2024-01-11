package com.rathod.oops;
//174. Click the Exhibit button.
 import java.util.*; 
 class KeyMaster {
	 public int i;
	 public KeyMaster(int i) { this.i = i; }
	 public boolean equals(Object o) { return i == ((KeyMaster)o).i; }
	 public int hashCode() { return i; }
 }
 public class MapIt {
   public static void main(String[] args) {
		 Set<KeyMaster> set = new HashSet<KeyMaster>();
		 KeyMaster k1 = new KeyMaster(1);
		 KeyMaster k2 = new KeyMaster(2);
		 set.add(k1); 
		 set.add(k1);
		 set.add(k2);
		 set.add(k2);
		 System.out.print(set.size() + ":");
		 k2.i = 1;
		 System.out.print(set.size() + ":");
		 set.remove(k1);
		 System.out.print(set.size() + ":");
		 set.remove(k2);
		 System.out.print(set.size());
   }
 }

 /*
What is the result?
A. 4:4:2:2
B. 4:4:3:2
C. 2:2:1:0
D. 2:2:0:0
E. 2:1:0:0
F. 2:2:1:1
G. 4:3:2:1
Answer: F

*/