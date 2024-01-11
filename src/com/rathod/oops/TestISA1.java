package com.rathod.oops;
class  Vehicle              //IS-A relcnship through inheirtance.....
{
	public void vehi()
	{
	     System.out.println("Super class");
      //  System.out.println("val of x is="+x);
   }
}
class  Car extends Vehicle
{
	int x;

	public void car()
	{
       	System.out.println("Sub class of Vehicle ");
      	System.out.println("val of x in car is= " + x );
	}
}
class  Subaru extends Car
{
	public void subar()
	{
		
	System.out.println("Sub  class of Car & vehicle");
	System.out.println("val of x  in subaru is= " + x);
		}
}
class TestISA1
{
	public static void main(String[] args)
	{
		Subaru s=new Subaru();
     	s.vehi();
		s.car();
		s.subar();
	    //s.x=23;                not applicable....if int x;   bcz member var never inherited from 1 class to another
	//s.x=x+5;                error--  compatibility  & nulltype
	}
}




/*By Kathy==>i.e.-> one thing should extend another,apply IS-A Test
                ->Inheritance IS-A relationship works in only one 
				  direction.(reverse is not true)



-->IS-A(based on inheritance or interface) means this thing is a type of that thing
eg-Mustang is a type of Horse. 

so in oops we can say Mustang IS-A Horse

	


	
so ....
         Car extends Vehicle means...Car IS-A Vehicle
		 Subaru extends Car means ..Subaru IS-A Car

		 & also we can say Subaru IS-A vehicle.
		 
		 
		 
		 
		By Kathy==> HAS-A....


		                          Tub IS-A Bathroom......definatly false
								  Bathroom IS-A Tub.......reverse also false
								  
					  Tub & Bathroom r definatly related....
					  but  not through inheritance.
						  
					  so Bathroom & Tub r joined by HAS-A relatinship
					i.e-> say Bathroom HAS-A Tub 
								   
					if yes-means that Bathroom has a Tub instance variable
						   
					In other word Bathroom has a reference to a Tub,but 
					Bathroom does not extends Tub & vice-versa.
									   
									   
									   
									   */