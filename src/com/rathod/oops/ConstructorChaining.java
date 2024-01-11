package com.rathod.oops;
//The this() constructor call should be used to reuse the constructor in the constructor. It maintains the chain between the constructors i.e. it is used for constructor chaining. 
//Let's see the example given below that displays the actual use of this keyword.
//Rule: Call to this() must be the first statement in constructor.
public class ConstructorChaining {
    int id;  
    String name;  
    String city;  
      
    ConstructorChaining(int id,String name){  
	    this.id = id;  
	    this.name = name;  
    }  
    ConstructorChaining(int id,String name,String city){  
	    this(id,name);//now no need to initialize id and name  
	    this.city=city;  
    }  
    void display(){System.out.println(id+" "+name+" "+city);}  
      
    public static void main(String args[]){  
    	ConstructorChaining e1 = new ConstructorChaining(111,"karan");  
    	ConstructorChaining e2 = new ConstructorChaining(222,"Aryan","delhi");  
	    e1.display();  
	    e2.display();  
   }  
}  