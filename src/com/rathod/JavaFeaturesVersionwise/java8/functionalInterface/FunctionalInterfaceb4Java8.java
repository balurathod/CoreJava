package com.rathod.JavaFeaturesVersionwise.java8;

public class FunctionalInterfaceb4Java8 {
	// Java program to demonstrate functional interface 
    public static void main(String args[]) 
    { 
        // create anonymous inner class object 
        new Thread(new Runnable() 
        { 
            @Override
            public void run() 
            { 
                System.out.println("New thread created"); 
            } 
        }).start(); 
    } 
} 