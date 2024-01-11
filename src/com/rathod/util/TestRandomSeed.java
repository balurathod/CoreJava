package com.rathod.util;
import java.util.*;

public class TestRandomSeed
 {
  	public static void main(String args[])
	 {
    		long seed = System.currentTimeMillis();
    		Random r1 = new Random(seed);
    		Random r2 = new Random(seed);

    		r2.setSeed(seed + 2);

    		for (int i = 0; i < 5; ++i) 
		{
      		         System.out.println("Random number1: " + r1.nextDouble() + " Random number2: " + r2.nextDouble());
    		} 
  	} 
}
