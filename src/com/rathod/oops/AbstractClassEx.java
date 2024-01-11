package com.rathod.oops;

public abstract class AbstractClassEx {
	
	  public void name()              // concrete (non-abstract) method
	  {
	    System.out.println("Name is Jyostna");
	  }
	  public void marks()             // concrete (non-abstract) method
	  {
	    System.out.println("Marks scored are 80");
	  }
	  
	  public abstract void percentage();
	  
	  public static void main(String args[])
	  {
		  AbstractClassEx ace = new AbstractClassEx();   // Error raised, Cannot instantiate the type AbstractClassEx
		  ace.name();
		  ace.percentage();
	  }
}