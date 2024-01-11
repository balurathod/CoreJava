package com.rathod.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/**
 * Java Program to demonstrate how to find duplicate words in String.
 */
public class RepeatedWords {

	 public static void main(String[] args) {
	        String test = "This sentence contains two words, one and two";
	        Set<String> duplicates = duplicateWords(test);
	        System.out.println("input : " + test);
	        System.out.println("output : " + duplicates);
	    }
	    /**
	     * Method to find duplicate words in a Sentence or String
	     * @param input String 
	     * @return set of duplicate words
	     */
	    public static Set<String> duplicateWords(String input){
	        
	        if(input == null || input.isEmpty()){
	            return Collections.emptySet();
	        }
	        Set<String> duplicates = new HashSet<>();
	        
	        String[] words = input.split("\\s+");
	        Set<String> set = new HashSet<>();
	        
	        for(String word : words){
	            if(!set.add(word)){
	                duplicates.add(word);
	            }
	        }
	        return duplicates;
	    }

}


