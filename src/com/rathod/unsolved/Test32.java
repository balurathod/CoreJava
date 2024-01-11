package com.rathod.unsolved;
//class HashSet extends Integer{}
class  Test32      //extends HashSet
{
	public static void main(String[] args) 
	{
		Integer a=new Integer(4);  //Wrapper class  use here but for what?
		Integer b=new Integer(8);  //Wrapper class creates here obj for storing val & call it.
		Integer c=new Integer(4);  //
		HashSet  hs=new HashSet();
    
		hs.add(a);
		hs.add(b);
		hs.add(c);
        System.out.println(hs);
		  
			}
}



//o/p->[8,4]   given..
/*
D:\SCJP\Oldscjp(1-5)\Exam2>javac Test32.java
Test32.java:6: cannot find symbol
symbol  : constructor Integer(int)
location: class Integer
                Integer a=new Integer(4);
                          ^
Test32.java:7: cannot find symbol
symbol  : constructor Integer(int)
location: class Integer
                Integer b=new Integer(8);
                          ^
Test32.java:8: cannot find symbol
symbol  : constructor Integer(int)
location: class Integer
                Integer c=new Integer(4);
                          ^
Test32.java:11: cannot find symbol
symbol  : method add(Integer)
location: class HashSet
                hs.add(a);
                  ^
Test32.java:12: cannot find symbol
symbol  : method add(Integer)
location: class HashSet
                hs.add(b);
                  ^
Test32.java:13: cannot find symbol
symbol  : method add(Integer)
location: class HashSet
                hs.add(c);
                  ^
6 errors
*/