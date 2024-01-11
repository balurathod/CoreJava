package com.rathod.oops;

public class OverloadingTest {

	public void display(Object obj){
		System.out.println("Hello obj");
	}
	public void display(String str){
		System.out.println("Hello str");
	}
	public void display(Integer it){
		System.out.println("Hello num");
	}
	
	public void print(Integer it){
		System.out.println(it);
	}
	public void print(String str){
		System.out.println(str);
	}
	
	
	
	public static void main(String[] args) {
		
		OverloadingTest ot = new OverloadingTest();
		//ot.display(null);		//mtd confused bcoz all 3 defined mtds r Object type
								//null is applicable for all Object type
		ot.display((Object)null);//to Run or avoid ambiguity
		
		ot.print(null);//ambiguity vl Aries
	}
}
