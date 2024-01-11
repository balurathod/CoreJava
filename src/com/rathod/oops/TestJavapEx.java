package com.rathod.oops;
import java.lang.reflect.*;  
// java.lang.Class class can be used to display the metadata of a class.
public class TestJavapEx {
	   public static void main(String[] args)throws Exception {  
	    Class c=Class.forName(args[0]);  
	      
	    System.out.println("Fields........");  
	    Field f[]=c.getDeclaredFields();  
	    for(int i=0;i<f.length;i++)  
	        System.out.println(f[i]);  
	      
	    System.out.println("Constructors........");  
	    Constructor con[]=c.getDeclaredConstructors();  
	    for(int i=0;i<con.length;i++)  
	        System.out.println(con[i]);  
	      
	        System.out.println("Methods........");  
	    Method m[]=c.getDeclaredMethods();  
	    for(int i=0;i<m.length;i++)  
	        System.out.println(m[i]);  
	   }  
	}  