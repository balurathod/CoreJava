package com.rathod.oops;
// File Name: Singleton.java
	public class SingletonEx {

	   private static SingletonEx singleton = new SingletonEx( );
	   
	   /* A private Constructor prevents any other 
	    * class from instantiating.
	    */
	   private SingletonEx(){ }
	   
	   /* Static 'instance' method */
	   public static SingletonEx getInstance( ) {
	      return singleton;
	   }
	   /* Other methods protected by singleton-ness */
	   protected static void demoMethod( ) {
	      System.out.println("demo Method for singleton"); 
	   }
	}