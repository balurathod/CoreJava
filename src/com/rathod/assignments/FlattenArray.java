package com.rathod.assignments;

// i/p  --> Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };
// o/p  --> Object[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };


import java.util.*;

public class FlattenArray {
	public static void main(String[] args) throws Exception{
	    Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };
	    
        Integer[] flattenedArray = flatten(array);
        
        System.out.println(Arrays.toString(flattenedArray));
	}
	
	public static Integer[] flatten(Object[] inputArray) throws Exception {
	    
	    System.out.println(Arrays.toString(inputArray));
	    if(Arrays.toString(inputArray).contain(Integer)) {
	        System.out.println(Arrays.toString(inputArray));
	    }	    
	    return  null;	    
	}	
}