package com.rathod.assignments.faq;

public class ReturnTypeEx {
//Method without return type  and without arguments.
	public void adds(){		 
		int a=40;
		int b=50;
		int c=a+b;
		System.out.println(c);		 
	}
	
//Method without return type and with arguments.
	public void add(int a, int b){		 
		int c=a+b;
		System.out.println(c);		 
	}
	
//Method with return type  and without arguments.
	public int add(){
		int a=10;
		int b=50;
		int c=a+b;
		//System.out.println(c);
		return c;
	}
	
//Method with return type and with arguments.
	public int addcn(int a, int b){		 
		int c=a+b;
		return c;
	}


	public static void main(String args[]) // ->method prototype.
	{ 	 
		ReturnTypeEx obj= new ReturnTypeEx();
		obj.adds();	
		
		obj.add(13,24);
		
		int x=obj.add(); 
		System.out.println(x);
		
		int y=obj.addcn(1,2);
		System.out.println(y);
	}
}
