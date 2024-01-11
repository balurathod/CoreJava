package com.rathod.java5;
import java.util.*;
public class AutoBoxUnBox {
	public static void main(String[] args) 
    {
		 Integer age = 31;  // Autoboxing: 31 => Integer.valueOf(31) 
		 
		 List<Double> weights = new ArrayList<Double>();
         weights.add(64.5);  // Autoboxing: 64.5 => Double.valueOf(64.5) 
         weights.add(73.2);  // Autoboxing: 73.2 => Double.valueOf(73.2) 
         
         if (age > 25) {  // Unboxing: age => age.intValue()
     		// do something 
              }
         
         double totalWeight = weights.get(0) + weights.get(1);	// 137.7
         // Unboxing: weights.get(0).doubleValue() 
         //           + weights.get(1).doubleValue()
    }
}
