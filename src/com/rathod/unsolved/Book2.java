package com.rathod.unsolved;
public class Book2 
{
	private String title;        //title val is null(by default) explictly not provided.
	public String getTitle()
	{
		return title;
	}
	public static void main(String[] args) 
	{
		Book2 b = new Book2();
		
		String s = b.getTitle();          //run so val of s also null(bcz val of s is a copy of title)
		System.out.println("Title is " + b.getTitle());

		if (s != null)         //obj ref by s is !null             
		{
			String t = s.toLowerCase(); 
		   // System.out.println("Lowercase of BALU is " + s.toLowerCase());
		}
		
        
	}
}
//Explain complt role of String class?   explian ->String t = s.toLowerCase();?