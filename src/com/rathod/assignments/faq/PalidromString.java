package com.rathod.assignments.faq;

//public class PalidromString {
	/*
	public static void main(String[] args) {
		 
		String str="MADAM";
		String revstring="";
		 
		for(int i=str.length()-1;i>=0;--i){
			revstring +=str.charAt(i);
		}		 
		System.out.println(revstring);
		 
		if(revstring.equalsIgnoreCase(str)){
			System.out.println("The string is Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
		 
	}
}
*/
	import java.util.Scanner;

	public class PalidromString {
	  public static void isPalindrome(String word) {
	    // Please write your code here.
	        String a, b = "";
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the string you want to check:");
	        a = s.nextLine();
	        int n = a.length();
	        for(int i = n - 1; i >= 0; i--)
	        {
	            b = b + a.charAt(i);
	        }
	        if(a.equalsIgnoreCase(b))
	        {
	            System.out.println("The string is palindrome.");
	        }
	        else
	        {
	            System.out.println("The string is not palindrome.");
	        }
	    }
	  
	  public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);
	    String word = reader.nextLine();
	    PalidromString.isPalindrome(word);
	  }
	}