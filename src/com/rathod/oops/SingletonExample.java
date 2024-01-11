package com.rathod.oops;

class Singleton
{  
  private static Singleton []array=new Singleton[2];  
  private static Singleton firstInstance=null;  
  private static Singleton secInstance=null;  
  private Singleton() {}
  
public static Singleton[] getInstance()  
{  
if(firstInstance==null){  
firstInstance=new Singleton();  
System.out.println(" firstInstance  : "+firstInstance);
array[0]=firstInstance;  
System.out.println("firstInstance "+ array[0]);
}  
else {  
if(secInstance==null){  
secInstance=new Singleton();  
array[1]=secInstance;  
System.out.println("secInstance "+ array[1]);
}  
}
return array;
}

public void show(){
	System.out.println("show() method");
}
}
  
public class SingletonExample{
	public static void main(String[] args) {
		for(int i=0;i<6;i++){
		System.out.println(i + "  :" +Singleton.getInstance());
		
		}
	}
}


