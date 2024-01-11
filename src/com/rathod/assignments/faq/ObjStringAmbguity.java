package com.rathod.assignments.faq;

public class ObjStringAmbguity {
	
	public void print(Object obj) {
		System.out.println("Object");
	}
//
//	public void print(String str) {
//		System.out.println("String");
//	}
	
	/*public void print(Integer ints) {
		System.out.println("Integer");
	}*/

	/*public void print(Double str) {
		System.out.println("String");
	}
*/

	public static void main(String[] args) {
		ObjStringAmbguity osa = new ObjStringAmbguity();
		osa.print(null);
	}

}
