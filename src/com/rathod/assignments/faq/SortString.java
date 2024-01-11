package com.rathod.assignments.faq;

import java.util.Arrays;

public class SortString {
	public static void main(String[] args) { 
	 
	  String original = "rathod";	 
	  char[] chars = original.toCharArray();	 
	  Arrays.sort(chars);
	 
	  String sorted = new String(chars);
	  System.out.println("Using String API ==>"+sorted);
	  
	  
	  //Without using String API
	  String orignal = "rathod";
	  int j=0;
	  char temp=0;
	   
	  char[] chrs = orignal.toCharArray();	   
	  for (int i = 0; i <chrs.length; i++) {
	   
	     for ( j = 0; j < chrs.length; j++) {
	   
	         if(chrs[j]>chrs[i]){
	              temp=chrs[i];
	             chrs[i]=chrs[j];
	             chrs[j]=temp;
	         }	   
	     }  	   
	  }	   
	  System.out.print("Without String API ==>");
	  for(int k=0;k<chrs.length;k++){		  
		  System.out.print(chrs[k]);
	  }
	  
	} 
}
