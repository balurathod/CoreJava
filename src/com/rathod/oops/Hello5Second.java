package com.rathod.oops;

import java.util.Timer;
import java.util.TimerTask;

public class Hello5Second extends TimerTask {
	   
	public void run() {
      System.out.println("Hello World!"); 
    }
	
	public static void main(String[] args) {
	 // And From your main() method or any other method
	 Timer timer = new Timer();
	 timer.schedule(new Hello5Second(), 0, 5000);
	}
}