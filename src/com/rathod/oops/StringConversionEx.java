package com.rathod.oops;

public class StringConversionEx {
   public static void main(String[] args)throws Exception { 
		String s = "200";   
		int i=Integer.parseInt(s);  
		System.out.println(s+100);//200100 because + is string concatenation operator  
		System.out.println(i+100);//300 because + is binary plus operator  
		
		i=200;  
		s=String.valueOf(i);  
		System.out.println(i+100);//300 because + is binary plus operator  
		System.out.println(s+100);//200100 because + is string concatenation operator  
		
		i=200;  
		s=Integer.toString(i);  
		System.out.println(i+100);//300 because + is binary plus operator  
		System.out.println(s+100);//200100 because + is string concatenation operator  
		
		s="9990449935";  //string to long
		long l=Long.parseLong(s);  
		System.out.println(l);  
		
		l=9993939399L;  		//L is the suffix for long 
		s=String.valueOf(l);    //Now it will return "9993939399"  
		System.out.println(s); 
		
		s=Long.toString(l);  //long to string
		System.out.println(s);
		
		s="23.6";  //converting String to float
		float f=Float.parseFloat("23.6");  
		System.out.println(f);  
		
		double d=Double.parseDouble(s);  //converting String to double
		System.out.println(d);  
   }
}
