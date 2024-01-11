package com.rathod.oops;
class Bootchy 
{
	int bootch;
	String snootch;
	
	public Bootchy()
	{
		this("snootchy");
	    System.out.print("First");
	}
	
	public Bootchy(String snootch)
	{
		this(420,"snootchy");
	    System.out.println("Second");
		//System.out.println(bootch);
	}

	public Bootchy(int bootch,String snootch)
	{
		this.bootch=bootch;
		this.snootch=snootch;
		System.out.print("Third");
		//System.out.println(bootch);
	}

	public static void main(String[] args) 
	{
		Bootchy b=new Bootchy();
		System.out.println(b.snootch+""+b.bootch);
	}
}
/*o/p-->ThirdSecondFirst snootchy 420  


Q-how is the flow of execution?

Ans-start in main(),create obj for  Bootchy class,go into Bootchy()constor,
read there this()vt String obj(""),then next this() vt 1 int type arg(420)&
String obj(""),then next this st vt  int ,String type variables in 3rd constor. 
again check, is ther any this() or super(). [Remember .this() & super() spuer most 
st.(first st.) for execution in any constor]if then start execution from there...
i.e.-cursor in 3rd constor ready to execute both Bootch & snootch but we allowed there
     only to excutes snootch(s.o.p("Third")) slly in 2nd constor also both active,
	 so, 
o/p- Third Second First Snootchy 420


*/