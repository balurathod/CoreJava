package com.rathod.oops;
//26. Click the Exhibit button.

 public class GoTest 
	 {
     public static void main(String[] args)
	 {
       Sente a = new Sente();
           a.go();

       Goban b = new Goban();            //how is execution flow?
          b.go();

       Stone c = new Stone(); 
          c.go();
     }
 }

 class Sente implements Go               //super class 
	 {
        public void go()
	             { System.out.println("go in Sente."); }
    }

 class Goban extends Sente                   //sub class
	 {
            public void go()
				  { System.out.println("go in Goban"); }
     }

class Stone extends Goban implements Go { }        //subsub class

 interface Go { public void go(); }

/*
What is the result?
A. go in Goban
go in Sente
go in Sente
B. go in Sente
go in Sente
go in Goban
C. go in Sente
go in Goban
go in Goban
D. go in Goban
go in Goban
go in Sente
E. Compilation fails because of an error in line 17.
Answer: C

 //how is execution flow?

 A-first two line r executes due to sepate obj of each class.
    obj is of stone.stone extends goban. & goban extends sente.
	goban & sente class containing go() method.here  compiler 
	decides to overriding of go() in bet goban & sente class.
	according to overriding rule:-
	subclass method override into superclass,then excutes that 
	method &  print "go in Goban"

*/