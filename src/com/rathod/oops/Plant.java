package com.rathod.oops;
//50. Given:
 public class Plant
	 {
           private String name;
           public Plant(String name)  //para constor..
			   { 
			           this.name = name;
			   }
			   public Plant()        //  default constor...adding here from opcn(d)
				   { 
				        this("fern"); //fern is avi in name obj
				    }
           public String getName()   //metd
			   { 
			         return name;
			   }
			                         //Where declare main().?
    }
 public class Tree extends Plant
	   {
 
           public void growFruit()
			   { }
           public void dropLeaves() 
			   { }
 }


/*
Which is true?
A. The code will compile without changes.
B. The code will compile if public Tree() { Plant(); } is added to the Tree class.
C. The code will compile if public Plant() { Tree(); } is added to the Plant class.
D. The code will compile if public Plant() { this("fern"); } is added to the Plant class.
E. The code will compile if public Plant() { Plant("fern"); } is added to the Plant class.

Answer: D   how?

*/