package com.rathod.unsolved;
import static java.lang.System.*; 

public class Electronic implements Device  
	{
		public void doIt()  {out.println("In Electronic...");}
	}


abstract class Phone1 extends Electronic
	{	}

abstract class Phone2 extends Electronic   //
	{
		public void doIt(int x)
		{out.println("In Phone2...");}
	}
class Phone3 extends Electronic implements Device
	{
	   public  void doStuff() 
	     {  out.println("In Phone3 doStuff()..."); }
    }
interface Device
   {  
	   public void doIt();
	}                                                   
	
class Test 
	{
		public static void  main(String args[])
		{
			Phone3 p=new Phone3();

			
			//Electronic e=new Electronic();
			
			Electronic e1=new Phone3();
		    
			//p=e1;     incompatible type.                            
						
			p.doStuff();   // why it is not executed...via e or e1 ref.
			e1.doIt();
			e1.doIt();
			//e.doIt();
			//e.doIt();

		}
	}
	//Compilation succed but not run....