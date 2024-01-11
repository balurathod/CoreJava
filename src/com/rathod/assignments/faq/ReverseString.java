package com.rathod.assignments.faq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {
		 
	public static void main(String[] args) {
//Using charAt()
		String str="Hello world";
		String revstring="";
		 
		for(int i=str.length()-1;i>=0;--i){
			revstring +=str.charAt(i);
		}	 
		System.out.println(revstring);
		
		
//Using byte array
		String input = "GeeksforGeeks"; 
		  
        // getBytes() method to convert string  
        // into bytes[]. 
        byte [] strAsByteArray = input.getBytes(); 
  
        byte [] result =  
                   new byte [strAsByteArray.length]; 
  
        // Store result in reverse order into the 
        // result byte[] 
        for (int i = 0; i<strAsByteArray.length; i++) 
            result[i] =  
             strAsByteArray[strAsByteArray.length-i-1]; 
  
        System.out.println(new String(result)); 
        
        
// Using Reverse method
        String strng = "Geeks for Geeks"; 
        
        StringBuilder str1 = new StringBuilder(); 
  
        // append a string into StringBuilder input1 
        str1.append(strng); 
  
        // reverse StringBuilder input1 
        str1 = str1.reverse(); 

        // print reversed String 
        System.out.println(str1); 
        
        // convert String to character array 
        // by using toCharArray 
        char[] try1 = input.toCharArray(); 
  
        for (int i = try1.length-1; i>=0; i--) 
            System.out.print(try1[i]); 
        
        
//Using swapping of chars
        char[] temparray = input.toCharArray(); 
        int left, right=0; 
        right = temparray.length-1; 
  
        for (left=0; left < right ; left++ ,right--) 
        { 
            // Swap values of left and right 
            char temp = temparray[left]; 
            temparray[left] = temparray[right]; 
            temparray[right]=temp; 
        } 
  
        for (char c : temparray) 
            System.out.print(c); 
        System.out.println(); 
        
//Using arraylist
        char[] hello = input.toCharArray(); 
        List<Character> trial1 = new ArrayList<>(); 
  
        for (char c: hello) 
            trial1.add(c); 
  
        Collections.reverse(trial1); 
        ListIterator li = trial1.listIterator(); 
        while (li.hasNext()) 
            System.out.print(li.next()); 

	}
}

