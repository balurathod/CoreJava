package com.rathod.oops;
//example of this keyword  

public class ThisKeyword {
    int id;  
    String name;  
      
    ThisKeyword(int id,String name){  
    	id = id;  
	    name = name;  
    	//this.id = id;  
	    //this.name = name;  
    } 
    /*ThisKeyword(int i,String nm){  
    	id = i;  
	    name = nm;  
    }*/
    void display(){System.out.println(id+" "+name);}  
    
    public static void main(String args[]){  
    	ThisKeyword s1 = new ThisKeyword(111,"Karan");  
    	ThisKeyword s2 = new ThisKeyword(222,"Aryan");  
	    s1.display();  
	    s2.display();  
	}  
}  
//If there is ambiguity between the instance variable and parameter, this keyword resolves the problem of ambiguity.
//If local variables(formal arguments) and instance variables are different, there is no need to use this keyword like in the following program:
