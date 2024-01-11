package com.rathod.assignments.faq;

public class MySingleTonClass {
	private static MySingleTonClass myObj;
    
    static{
        myObj = new MySingleTonClass();
    }
     
    private MySingleTonClass(){
     
    }
     
    public static MySingleTonClass getInstance(){
        return myObj;
    }
     
    public void testMe(){
        System.out.println("Hey.... it is working!!!");
    }
     
    public static void main(String a[]){
    	MySingleTonClass ms = getInstance();
    	//MySingleTonClass nf = new MySingleTonClass();   //allowing here y?
    	MySingleTonClass nf = MySingleTonClass.getInstance();
        ms.testMe();
        if(ms == nf)
        	System.out.println("Hey.... it is singleton!!!");
    }
}
