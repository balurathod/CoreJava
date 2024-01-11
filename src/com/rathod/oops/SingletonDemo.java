package com.rathod.oops;
// File Name: SingletonDemo.java
public class SingletonDemo {
   public static void main(String[] args) {
	   SingletonEx tmp = SingletonEx.getInstance( );
	   //SingletonEx tmp1 = SingletonEx();
      tmp.demoMethod( );
   }
}