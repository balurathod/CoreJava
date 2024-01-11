package com.rathod.assignments.faq;

public class StaticMtdOvrloding {
	// Compiler Error: cannot redefine staticMethod() 
	/*public void staticMethod(){		 
		System.out.println("staticMethod(): Zero arguments");		 
	}*/
	
	public static void staticMethod(){		 
		System.out.println("staticMethod(): Zero arguments");		 
	} 
	 
	public static void staticMethod(int a){		 
		System.out.println("staticMethod(int a): one argument");		 
	} 
	 
	public static void staticMethod(String str, int x){		 
		System.out.println("staticMethod(String str, int x): two arguments");		 
	}
	 
	public static void main(String []args){		  
		StaticMtdOvrloding.staticMethod();
		StaticMtdOvrloding.staticMethod(12);
		StaticMtdOvrloding.staticMethod("Static method overloading",10);		 
	}
}
