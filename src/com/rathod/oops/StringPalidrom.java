package com.rathod.oops;

public class StringPalidrom {
 
    public static void main(String args[]) {
    	String chr="madam";
        String revStr="";
        int len=chr.length();        
      
        for(int i=len-1;i>-1;i--)  {
        	revStr=revStr+chr.charAt(i);
        }
        System.out.println("Reversed String is: "+revStr);
 
        if(chr.equals(revStr))
        {
        	System.out.println("The Given String is Palindrome");
        }else{
            System.out.println("The Given String is not a Palindrome");
        }
        
        
        
        StringPalidrom sp = new StringPalidrom();
        
        System.out.println(sp.isPalidrome("zaaz"));//true
        System.out.println(sp.isPalidrome("c"));//true
        System.out.println(sp.isPalidrome(""));//true
        
        System.out.println(sp.isPalidrome("hello"));//false
        System.out.println(sp.isPalidrome("java"));//false
        
    }
    public boolean isPalidrome(String str)
    {
    	boolean flag = false;
    	
    	String revStr="";
        int len=str.length();        
      
        for(int i=len-1;i>-1;i--)  {
        	revStr=revStr+str.charAt(i);
        }
        //System.out.println("Reversed String is: "+revStr);
 
        if(str.equals(revStr))
        {
        	//System.out.println("The Given String is Palindrome");
        	return flag = true;
        }else{
            //System.out.println("The Given String is not a Palindrome");
        	return flag = false;
        }    	
    }
}
