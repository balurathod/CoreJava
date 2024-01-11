package com.rathod.unsolved;
class Frog3 
{
 static int frogCount=0;

  //int frogCount=0;

	public Frog3()         //constor
	{
		 frogCount +=1;
	}
}
class TestFrog3
{
	public static void main(String[] args) 
	{
		new Frog3();
		new Frog3();
		new Frog3();

		Frog3 f = new Frog3(); //compiler care only ref variable f as type Frog3 
       
		System.out.println("frogCount: " + f.frogCount);
		//int frogs = f.frogCount;
		
     	System.out.println("frogCount: " + Frog3.frogCount);
    	
		//System.out.println("frogCount:-" + Frog3.frogCount()); //see diffrcn
	}
}
/*


STATIC METHIOD Can't b overridden( they can't redefine in a subclass.).

NOTE:-overriding & redefining r not same thing.so what is diff?


G:\SCJP\Query>javac Frog3.java

G:\SCJP\Query>java TestFrog3
frogCount:-1

G:\SCJP\Query>javac Frog3.java

G:\SCJP\Query>java TestFrog3
frogCount:-12

G:\SCJP\Query>javac Frog3.java

G:\SCJP\Query>java TestFrog3
frogCount:12

G:\SCJP\Query>javac Frog3.java
Frog3.java:24: cannot find symbol
symbol  : method frogCount()
location: class Frog3
        System.out.println("frogCount:-" + Frog3.frogCount()); //see diffrcn
                                                ^
1 error

G:\SCJP\Query>javac Frog3.java
Frog3.java:22: cannot find symbol
symbol  : variable f
location: class TestFrog3
                System.out.println("frogCount: " + f.frogCount);
                                                   ^
1 error

G:\SCJP\Query>javac Frog3.java

G:\SCJP\Query>java TestFrog3

G:\SCJP\Query>javac Frog3.java

G:\SCJP\Query>java TestFrog3
frogCount: 4

G:\SCJP\Query>javac Frog3.java

G:\SCJP\Query>java TestFrog3
frogCount: 3

G:\SCJP\Query>javac Frog3.java

*/