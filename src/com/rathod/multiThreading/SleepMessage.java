package com.rathod.multiThreading;

public class SleepMessage {
	    public static void main(String args[]) throws InterruptedException {
	        String importantInfo[] = {
	            "Mares eat oats",
	            "Does eat oats",
	            "Little lambs eat ivy",
	            "A kid will eat ivy too"
	        };

	        for (int i = 0; i < importantInfo.length; i++) {
	            //Pause for 4 seconds
	        	try {
	                Thread.sleep(4000);
	            } catch (InterruptedException e) {
	                //We've been interrupted: no more messages.
	                return;
	            }
	            //Print a message
	            System.out.println(importantInfo[i]);
	        }

	    }
	}
