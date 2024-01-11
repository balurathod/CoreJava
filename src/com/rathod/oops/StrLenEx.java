package com.rathod.oops;

import java.util.Scanner;

 class StrLenEx {
	  public static int len(String ab){
	        char[] ac = ab.toCharArray();
	        int i = 0, k = 0;

	        try{
	            for(i=0,k=0;ac[i]!='\0';i++)
	                k++;
	        }
	        catch(Exception e){
	        }
	        return k;
	    }

	    public static void main(String []args){
	    	
	    	String s1="1";
	    	String s2=s1;
	    	System.out.println("s1 :"+s1);
	    	s1=s1+"3";
	    	String s3=s1;
	    	s1=s1+"5";
	    	
	    	System.out.println("s1 :"+s1);
	    	if(s2==s3){
	    		System.out.println("both are equal");
	    	}
	    	else{
	    		System.out.println("not equal");
	    	}
	        Scanner sc = new Scanner(System.in);
	        System.out.print("\nEnter Your Name =>" +"  ");
	        String ab = sc.nextLine();
	        System.out.println("\nName Length is:" +StrLenEx.len(ab));
	        System.out.println("\nName Length is:" +StrLenEx.len());
	    }

		private static int len() {
			char cc[]={'s','h','y','a','m','a'};
			  int i = 0, k = 0;
			
	            for(i=0,k=0;cc[i]!='\0';i++)
	                k++;
	       
	      
	   
	       System.out.println(k);
			return k;
		}

	  
	}

