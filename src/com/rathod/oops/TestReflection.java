package com.rathod.oops;

class Simple{  
		 void message(){System.out.println("Hello Java");}  
		}  
		  
public class TestReflection{  
		 public static void main(String args[]){  
		  try{  
		  Class c=Class.forName("Simple");  
		  Simple s=(Simple)c.newInstance();  
		  s.message();  
		  
		  }catch(Exception e){System.out.println(e);}  
		  
		 }  
		}  