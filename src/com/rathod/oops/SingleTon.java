package com.rathod.oops;

public class SingleTon {
	  private static SingleTon singleton = new SingleTon( );
	   
	   /* A private Constructor prevents any other 
	    * class from instantiating.
	    */
	   private SingleTon(){ }
	   
	   /* Static 'instance' method */
	   public static SingleTon getInstance( ) {
	      return singleton;
	   }
	   /* Other methods protected by singleton-ness */
	   protected static void demoMethod( ) {
	      System.out.println("demoMethod for singleton"); 
	   }
}
