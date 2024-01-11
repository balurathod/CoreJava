package com.rathod.oops;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Stringex {
	int a=10;
	String str ="india1";
	String str1="india2";
	String str2=new String("india");
	String str4="india";
	
	public void show(){
		System.out.println("show");
	}
	public static void main(String[] args) {
		try{
		Class e= Class.forName("com.core.Stringex");
		Stringex ex=(Stringex)e.newInstance();
		ex.show();
		Field f[]=e.getFields();
		Method mm[]=e.getDeclaredMethods();
		
		ex.show();
		for(int i=0;i<f.length;i++){
			System.out.println("fields: "+f[i].getName());
			mm[i].invoke(e);
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	

}
