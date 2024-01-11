package com.rathod.assignments.faq;

public class ObjectClonning implements Cloneable{
    int a=0; 
    String name="";
    ObjectClonning (int a,String name){ 
	    this.a=a;
	    this.name=name;
	}

	public ObjectClonning clone() throws CloneNotSupportedException{
	
		return (ObjectClonning ) super.clone();	
	}

	public static void main(String[] args) {
	
		ObjectClonning e=new ObjectClonning (2,"Indhu");
	    System.out.println(e.name);
	
		try {		
			ObjectClonning b=e.clone();
			System.out.println(b.name);		
		}
		catch (CloneNotSupportedException e1) {		
			e1.printStackTrace();
		}		
	}
}
