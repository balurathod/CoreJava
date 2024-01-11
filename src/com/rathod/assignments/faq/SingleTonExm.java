package com.rathod.assignments.faq;

public class SingleTonExm {

	 static SingleTonExm obj;
	 
	 private  SingleTonExm(){
	 }
	 
	 public static SingleTonExm getInstance(){
	  if(obj!=null){
	   return  obj;
	  }
	  else{
	   obj=new SingleTonExm();
	  return obj;
	  }
	 }
	 
	 public static void main(String[] args) {
	  
		 SingleTonExm obj = SingleTonExm.getInstance();
		 SingleTonExm obj1 = SingleTonExm.getInstance();
	  
	  if(obj==obj1){
	  System.out.println("SingleTon Object"); 
	  }
	  else{
	   System.out.println("Not SingleTon Object");
	  }
	  System.out.println(obj==obj1);
	 }
}
