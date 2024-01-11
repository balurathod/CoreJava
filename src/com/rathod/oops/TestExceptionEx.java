//Rule: If the superclass method declares an exception, subclass overridden method can declare same,
//subclass exception or no exception but cannot declare parent exception.
package com.rathod.oops;
	class Parent{  
	  void msg()throws Exception{System.out.println("parent");}  
	}  	  
	class TestExceptionEx extends Parent{  
	  void msg()throws ArithmeticException {System.out.println("child");}  
	  
	  public static void main(String args[]){  
	   Parent p=new TestExceptionEx();  
	   try{  
	   p.msg();  
	   }catch(Exception e){}  
	  }  
	}  