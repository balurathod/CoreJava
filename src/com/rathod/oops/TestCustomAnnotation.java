package com.rathod.oops;
import java.lang.annotation.*;  
import java.lang.reflect.*;  
//Creating annotation  
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface MyAnnotation{  //custom interface creation
	int value();  
}  
  
//Applying annotation  
class Hello{  
	@MyAnnotation(value=10)  
	public void sayHello(){System.out.println("hello annotation");}  
}  
  
//Accessing annotation  
class TestCustomAnnotation{  
	public static void main(String args[])throws Exception{  	  
	Hello h=new Hello();  
	Method m=h.getClass().getMethod("sayHello");  
	System.out.println("mtd  is: "+m);    
	MyAnnotation manno=m.getAnnotation(MyAnnotation.class);  
	System.out.println("value is: "+manno.value());  
	}
}  