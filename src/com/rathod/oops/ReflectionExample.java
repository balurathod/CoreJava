package com.rathod.oops;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Hello{
	public void show(){
		System.out.println("public void show()");
		}
	public void show(int a){
		a=10;
		System.out.println("public void show()"+ a);
		}
	public void m(){
		System.out.println("public void m()");
		}
	public void m(int a){
		a=10;
		System.out.println("public void m1()"+ a);
		}
}


public class ReflectionExample {
	public static void main(String[] args) {
		
		try {
			Class cls = Class.forName("com.core.Hello");
			Hello h=(Hello)cls.newInstance();
			Method mm[]=cls.getDeclaredMethods();
			for(int i=0;i<mm.length;i++){
				if(mm[i].getName().equals("m1")){
					mm[i].invoke(h,12);
					
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
