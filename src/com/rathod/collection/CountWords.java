package com.rathod.collection;
import java.util.*;
public class CountWords {
	static public void main(String[] args) {
	    Set words = new HashSet(); 
	    Scanner in = new Scanner(System.in); 
	    String delim = " \t\n.,:;?!-/()[]\"\'";
	    String line; 
	    int count = 0; 
	    boolean itr = in.hasNext();
	    try {
	        while ((line = in.next()) != null) {
	          StringTokenizer st = 
	             new StringTokenizer(line, delim); 
	          while (st.hasMoreTokens()) {
	            count++; 
	            words.add(
	              st.nextToken().toLowerCase()); 
	          }
	        } 
	      } catch (Exception e) {}   
	      System.out.println("Total number of words: "+ count); 
	      System.out.println("Number of different words: "+ words.size()); 
    }

}
