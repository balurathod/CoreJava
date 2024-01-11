package com.rathod.oops;
//super() dirctly call any supr type of constor BUT this() call only currnt constor.
import static java.lang.System.*; 
class  Supr
{
	int i ;
	float f ;
	Supr()
	{
		//this.Subsub();  illegal  
		out.println(" \n");
		out.println("In Supr constor " + i  + "  " +f );
	}

    void mtdSupr()
	{
		i = 20;
		f = 45.6f;
		//this.Subsub();   illegal 
		out.println("In mtdSupr this" + this.i +" " + this.f);
	}
}
class Sub extends Supr
{
    Sub()
	{
		//this.mtdSupr();
		out.println("In Sub constor ");
	}

    void mtdSub()
	{
		i = 40;
		f = 50.7f;
		//super.mtdSupr();
        //this.mtdSupr();
		out.println("In mtdSub ");
	}
}
class Subsub  extends Sub
{
    Subsub()
	{
		//this.mtdSub(); //without NEW oprtr u call this metd using "this " any where in inheritance(but fallow IS-A) 
		out.println("In Subsub constor ");
	}
   void  mtdSubsub()
	{
	     i =10;
	   f = 35.7f;
	   //this.mtdSub();

	   //this.Sub();Not legal constor NEVER call in METHOD BUT method CAN call on Any constor.
	   
		out.println("\n");
    	out.println("In mtdSubsub " + i + " " + f);
		
		//super.mtdSupr();
     	out.println("In mtdSubsub super " + super.i + " " + super.f);
		this.mtdSub();
		out.println("In mtdSubsub this  " + this.i + " " + this.f);

	}
}

class Subsubsub  extends Subsub
{
    Subsubsub()
	{
		 
		//super.mtdSupr();
		//super.mtdSubsub();
		//super.mtdSubsubsub();//o/p-disply bcz constor is on HEAP,constor live till end of main(),cursor r exit from main & then immideatly all constor r deleted 
		
		//this.mtdSupr();
		//this.mtdSubsub();
		//this.mtdSubsubsub();   //all ABOVE r legal


		//super.mtdSubsubsub();//illegal Err-cnt find
        //super.Supr();     u cnt call constor using "supr/this" in CONSTRUCTOR. 
		out.println("In Subsubsub constor ");
	}

   void  mtdSubsubsub()
	{
	   //super.Supr(); - constor   illegal Err-cnt find symbol
	   // this.mtdSupr();  compile & run bt no o/p. bcz metd is on STACK,aftr excucn immedetly mtd delete all its contnt.henc no o/p here 
	//	this.Subsub(); - constor   illegal Err-cnt find symbol
		out.println("In mtdSubsubsub ");
	}
}
class SuprThis
{
	public static void main(String[] args) 
	{
	    Supr spr = new Supr();
		Sub  sub = new Sub(); 
		Subsub subb = new Subsub();
        Subsubsub subbb = new Subsubsub(); 
		
		//Supr spr = new Subsubsub();
		subbb.mtdSubsubsub();
		subb.mtdSubsub();
		sub.mtdSub();
		out.println("Hello World!");
	}
}
/*
CONSTOR never override.

super call super constor & method.


Microsoft Windows [Version 6.0.6001]
Copyright (c) 2006 Microsoft Corporation.  All rights reserved.

C:\Users\PRADIP>G:

G:\>cd SCJP\Query\Solved

G:\SCJP\Query\Solved>javac SuprThis.java
SuprThis.java:2: cannot find symbol
symbol  : class lang
location: package java
import static java.lang.System;
                  ^
SuprThis.java:2: static import only from classes and interfaces
import static java.lang.System;
^
SuprThis.java:7: cannot find symbol
symbol  : variable out
location: class Supr
                out.println("In Supr constor ");
                ^
SuprThis.java:12: cannot find symbol
symbol  : variable out
location: class Supr
                out.println("In mtdSupr ");
                ^
SuprThis.java:19: cannot find symbol
symbol  : variable out
location: class Sub
                out.println("In Sub constor ");
                ^
SuprThis.java:24: cannot find symbol
symbol  : variable out
location: class Sub
                out.println("In mtdSub ");
                ^
SuprThis.java:31: cannot find symbol
symbol  : variable out
location: class Subsub
                out.println("In Subsub constor ");
                ^
SuprThis.java:36: cannot find symbol
symbol  : variable out
location: class Subsub
                out.println("In mtdSubsub ");
                ^
SuprThis.java:44: cannot find symbol
symbol  : variable out
location: class Subsubsub
                out.println("In Subsubsub constor ");
                ^
SuprThis.java:49: cannot find symbol
symbol  : variable out
location: class Subsubsub
                out.println("In mtdSubsubsub ");
                ^
SuprThis.java:60: cannot find symbol
symbol  : variable out
location: class SuprThis
                out.println("Hello World!");
                ^
11 errors

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis
In Supr constor
In Supr constor
In Sub constor
In Supr constor
In Sub constor
In Subsub constor
In Supr constor
In Sub constor
In Subsub constor
In Subsubsub constor
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis
In Supr constor


In Supr constor


In Sub constor
In Supr constor


In Sub constor
In Subsub constor
In Supr constor


In Sub constor
In Subsub constor
In Subsubsub constor
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis
In Supr constor


In Sub constor
In Subsub constor
In Subsubsub constor
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor
In Sub constor
In Subsub constor
In Subsubsub constor
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor


In Supr constor
In Sub constor


In Supr constor
In Sub constor
In Subsub constor


In Supr constor
In Sub constor
In Subsub constor
In Subsubsub constor
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java
SuprThis.java:45: cannot find symbol
symbol  : variable spr
location: class Subsubsub
                this(spr);
                     ^
1 error

G:\SCJP\Query\Solved>javac SuprThis.java
SuprThis.java:45: cannot find symbol
symbol  : variable spr
location: class Subsubsub
                super(spr);
                      ^
1 error

G:\SCJP\Query\Solved>javac SuprThis.java
SuprThis.java:51: call to super must be first statement in constructor
            super(spr);
                 ^
1 error

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor


In Supr constor
In Sub constor


In Supr constor
In Sub constor
In Subsub constor


In Supr constor
In Sub constor
In Subsub constor
In mtdSupr
In Subsubsub constor
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor


In Supr constor
In Sub constor


In Supr constor
In Sub constor
In Subsub constor


In Supr constor
In Sub constor
In Subsub constor
In mtdSupr
In Subsubsub constor
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java
SuprThis.java:45: cannot find symbol
symbol  : method Supr()
location: class Subsubsub
            this.Supr();
                ^
1 error

G:\SCJP\Query\Solved>javac SuprThis.java
SuprThis.java:45: cannot find symbol
symbol  : method Supr()
location: class Subsub
            super.Supr();
                 ^
1 error

G:\SCJP\Query\Solved>javac SuprThis.java
SuprThis.java:45: cannot find symbol
symbol  : method Supr()
location: class Subsub
            super.Supr();
                 ^
SuprThis.java:64: cannot find symbol
symbol  : method Subsubsub()
location: class Subsubsub
                subbb.Subsubsub();
                     ^
2 errors

G:\SCJP\Query\Solved>javac SuprThis.java
SuprThis.java:45: cannot find symbol
symbol  : method Supr()
location: class Subsub
            super.Supr();
                 ^
1 error

G:\SCJP\Query\Solved>javac SuprThis.java
SuprThis.java:45: cannot find symbol
symbol  : method Subsub()
location: class Subsub
            super.Subsub();
                 ^
1 error

G:\SCJP\Query\Solved>javac SuprThis.java
SuprThis.java:45: cannot find symbol
symbol  : method Subsub()
location: class Subsubsub
            this.Subsub();
                ^
1 error

G:\SCJP\Query\Solved>javac SuprThis.java
SuprThis.java:45: not a statement
            this.Subsub;
                ^
1 error

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor


In Supr constor
In Sub constor


In Supr constor
In Sub constor
In Subsub constor


In Supr constor
In Sub constor
In Subsub constor
In Subsubsub constor
In mtdSubsubsub
In mtdSubsub
In mtdSub
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor


In Supr constor
In Sub constor


In Supr constor
In Sub constor
In Subsub constor


In Supr constor
In Sub constor
In Subsub constor
In Subsubsub constor
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor


In Supr constor
In Sub constor


In Supr constor
In Sub constor
In Subsub constor


In Supr constor
In Sub constor
In Subsub constor
In mtdSupr
In Subsubsub constor
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor


In Supr constor
In Sub constor


In Supr constor
In Sub constor
In Subsub constor


In Supr constor
In Sub constor
In Subsub constor
In Subsubsub constor
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor


In Supr constor
In Sub constor


In Supr constor
In Sub constor
In Subsub constor


In Supr constor
In Sub constor
In Subsub constor
In mtdSupr
In Subsubsub constor
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor


In Supr constor
In Sub constor


In Supr constor
In Sub constor
In Subsub constor


In Supr constor
In Sub constor
In Subsub constor
In mtdSub
In Subsubsub constor
Hello World!

G:\SCJP\Query\Solved>java SuprThis


In Supr constor


In Supr constor
In Sub constor


In Supr constor
In Sub constor
In Subsub constor


In Supr constor
In Sub constor
In Subsub constor
In mtdSub
In Subsubsub constor
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor


In Supr constor
In Sub constor


In Supr constor
In Sub constor
In Subsub constor


In Supr constor
In Sub constor
In Subsub constor
In mtdSubsub
In Subsubsub constor
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java
SuprThis.java:45: cannot find symbol
symbol  : method mtdSubsubsub()
location: class Subsub
                super.mtdSubsubsub(); //o/p-disply bcz constor is on HEAP,constor live till end of main(),cursor r exit from main & the
                     ^
1 error

G:\SCJP\Query\Solved>javac SuprThis.java
SuprThis.java:45: cannot find symbol
symbol  : method Supr()
location: class Subsub
                super.Supr();
                     ^
1 error

G:\SCJP\Query\Solved>javac SuprThis.java
SuprThis.java:45: cannot find symbol
symbol  : method Subsub()
location: class Subsubsub
                 this.Subsub();
                     ^
1 error

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor


In Supr constor
In Sub constor


In Supr constor
In Sub constor
In Subsub constor


In Supr constor
In Sub constor
In Subsub constor
In mtdSubsub
In Subsubsub constor
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor


In Supr constor
In Sub constor


In Supr constor
In Sub constor
In mtdSub
In Subsub constor


In Supr constor
In Sub constor
In mtdSub
In Subsub constor
In Subsubsub constor
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java
SuprThis.java:7: cannot find symbol
symbol  : method Sub()
location: class Supr
                this.Sub();
                    ^
1 error

G:\SCJP\Query\Solved>javac SuprThis.java
SuprThis.java:7: cannot find symbol
symbol  : method Subsub()
location: class Supr
                this.Subsub();
                    ^
1 error

G:\SCJP\Query\Solved>javac SuprThis.java
SuprThis.java:14: cannot find symbol
symbol  : method Subsub()
location: class Supr
                this.Subsub();
                    ^
1 error

G:\SCJP\Query\Solved>javac SuprThis.java
SuprThis.java:65: cannot find symbol
symbol  : method Subsub()
location: class Subsubsub
                this.Subsub();
                    ^
1 error

G:\SCJP\Query\Solved>javac SuprThis.java
SuprThis.java:66: cannot find symbol
symbol  : method Sub()
location: class Subsubsub
        this.Sub();
            ^
1 error

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor


In Supr constor
In Sub constor


In Supr constor
In Sub constor
In mtdSub
In Subsub constor


In Supr constor
In Sub constor
In mtdSub
In Subsub constor
In Subsubsub constor
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor
In Sub constor
In mtdSub
In Subsub constor


In Supr constor
In Sub constor
In mtdSub
In Subsub constor
In Subsubsub constor
In mtdSubsubsub
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor
In Sub constor
In mtdSub
In Subsub constor


In Supr constor
In Sub constor
In mtdSub
In Subsub constor
In Subsubsub constor
Hello World!

G:\SCJP\Query\Solved>java SuprThis


In Supr constor
In Sub constor
In mtdSub
In Subsub constor


In Supr constor
In Sub constor
In mtdSub
In Subsub constor
In Subsubsub constor
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor
In Sub constor
In mtdSub
In Subsub constor


In Supr constor
In Sub constor
In mtdSub
In Subsub constor
In Subsubsub constor
In mtdSubsubsub
In mtdSubsub
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java
SuprThis.java:81: cannot find symbol
symbol  : variable sub
location: class SuprThis
                sub.mtdSub();
                ^
1 error

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor
In Sub constor


In Supr constor
In Sub constor
In mtdSub
In Subsub constor


In Supr constor
In Sub constor
In mtdSub
In Subsub constor
In Subsubsub constor
In mtdSubsubsub
In mtdSubsub
In mtdSub
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor


In Supr constor
In Sub constor


In Supr constor
In Sub constor
In mtdSub
In Subsub constor


In Supr constor
In Sub constor
In mtdSub
In Subsub constor
In Subsubsub constor
In mtdSubsubsub
In mtdSubsub
In mtdSub
Hello World!

G:\SCJP\Query\Solved>


Microsoft Windows [Version 6.0.6001]
Copyright (c) 2006 Microsoft Corporation.  All rights reserved.

C:\Users\PRADIP>G:

G:\>cd SCJP\Query\Solved

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor 0  0.0


In Supr constor 0  0.0
In Sub constor


In Supr constor 0  0.0
In Sub constor
In mtdSub
In Subsub constor


In Supr constor 0  0.0
In Sub constor
In mtdSub
In Subsub constor
In Subsubsub constor
In mtdSubsubsub
In mtdSubsub
In mtdSub
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor 0  0.0


In Supr constor 0  0.0
In Sub constor


In Supr constor 0  0.0
In Sub constor
In mtdSub
In Subsub constor


In Supr constor 0  0.0
In Sub constor
In mtdSub
In Subsub constor
In Subsubsub constor
In mtdSubsubsub
In mtdSubsub
In mtdSub
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor 0  0.0


In Supr constor 0  0.0
In Sub constor


In Supr constor 0  0.0
In Sub constor
In mtdSub
In Subsub constor


In Supr constor 0  0.0
In Sub constor
In mtdSub
In Subsub constor
In Subsubsub constor
In mtdSubsubsub
In mtdSubsub
In mtdSub
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor 0  0.0


In Supr constor 0  0.0
In mtdSupr 0 0.0
In Sub constor


In Supr constor 0  0.0
In mtdSupr 0 0.0
In Sub constor
In mtdSub
In Subsub constor


In Supr constor 0  0.0
In mtdSupr 0 0.0
In Sub constor
In mtdSub
In Subsub constor
In Subsubsub constor
In mtdSubsubsub
In mtdSubsub
In mtdSub
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor 0  0.0


In Supr constor 0  0.0
In Sub constor


In Supr constor 0  0.0
In Sub constor
In mtdSupr 0 0.0
In mtdSub
In Subsub constor


In Supr constor 0  0.0
In Sub constor
In mtdSupr 0 0.0
In mtdSub
In Subsub constor
In Subsubsub constor
In mtdSubsubsub
In mtdSubsub
In mtdSupr 0 0.0
In mtdSub
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor 0  0.0


In Supr constor 0  0.0
In Sub constor


In Supr constor 0  0.0
In Sub constor
In Subsub constor


In Supr constor 0  0.0
In Sub constor
In Subsub constor
In Subsubsub constor
In mtdSubsubsub
In mtdSubsub
In mtdSupr 0 0.0
In mtdSub
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor 0  0.0


In Supr constor 0  0.0
In Sub constor


In Supr constor 0  0.0
In Sub constor
In Subsub constor


In Supr constor 0  0.0
In Sub constor
In Subsub constor
In Subsubsub constor
In mtdSubsubsub
In mtdSubsub
In mtdSupr 0 0.0
In mtdSub
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java
SuprThis.java:44: cannot find symbol
symbol  : method mtsSub()
location: class Subsub
           this.mtsSub();
               ^
1 error

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor 0  0.0


In Supr constor 0  0.0
In Sub constor


In Supr constor 0  0.0
In Sub constor
In Subsub constor


In Supr constor 0  0.0
In Sub constor
In Subsub constor
In Subsubsub constor
In mtdSubsubsub
In mtdSupr 0 0.0
In mtdSub
In mtdSubsub
In mtdSupr 0 0.0
In mtdSub
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor 0  0.0


In Supr constor 0  0.0
In Sub constor


In Supr constor 0  0.0
In Sub constor
In Subsub constor


In Supr constor 0  0.0
In Sub constor
In Subsub constor
In Subsubsub constor
In mtdSubsubsub
In mtdSupr 0 0.0
In mtdSub


In mtdSubsub
In mtdSupr 0 0.0
In mtdSub
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor 0  0.0


In Supr constor 0  0.0
In Sub constor


In Supr constor 0  0.0
In Sub constor
In Subsub constor


In Supr constor 0  0.0
In Sub constor
In Subsub constor
In Subsubsub constor
In mtdSubsubsub
In mtdSupr 10 35.7
In mtdSub


In mtdSubsub 10 35.7
In mtdSupr 0 0.0
In mtdSub
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor 0  0.0


In Supr constor 0  0.0
In Sub constor


In Supr constor 0  0.0
In Sub constor
In Subsub constor


In Supr constor 0  0.0
In Sub constor
In Subsub constor
In Subsubsub constor
In mtdSubsubsub


In mtdSubsub 10 35.7
In mtdSupr 0 0.0
In mtdSub
Hello World!

G:\SCJP\Query\Solved>





G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor 0  0.0


In Supr constor 0  0.0
In Sub constor


In Supr constor 0  0.0
In Sub constor
In Subsub constor


In Supr constor 0  0.0
In Sub constor
In Subsub constor
In Subsubsub constor
In mtdSubsubsub


In mtdSubsub 10 35.7
In mtdSubsub 10 35.7
In mtdSub
In mtdSubsub 40 50.7
In mtdSub
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java

G:\SCJP\Query\Solved>java SuprThis


In Supr constor 0  0.0


In Supr constor 0  0.0
In Sub constor


In Supr constor 0  0.0
In Sub constor
In Subsub constor


In Supr constor 0  0.0
In Sub constor
In Subsub constor
In Subsubsub constor
In mtdSubsubsub


In mtdSubsub 10 35.7
In mtdSupr 20 45.6
In mtdSubsub 20 45.6
In mtdSub
In mtdSubsub 40 50.7
In mtdSub
Hello World!

G:\SCJP\Query\Solved>javac SuprThis.java
SuprThis.java:51: cannot find symbol
symbol  : method Sub()
location: class Subsub
           this.Sub();
               ^
1 error

G:\SCJP\Query\Solved>

















*/