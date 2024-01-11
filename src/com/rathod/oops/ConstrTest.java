package com.rathod.oops;
class Base             //we use here single inheritanc vt constructor,dyna poly,
{
	int value=0;
		Base()            //constructor r use only for initializing methods & variables.
		{
			addValue();
		}
		void addValue()
		{
			value+=17;
		}
	int getValue()
		{
			return value;
			}
	}
	class Derived extends Base
		{
		Derived()
			{
			addValue();             //addValue() method r initialized(declare) by a class constructor.
			}
			void addValue()     //define addValue() method.
			{
				value+=20;
			}
	}
	public class ConstrTest
	{
		public static void main(String[] args) 
	{
	    Base b=new Derived();        //obj of Derived(sub) class is assign to ref of Base(super) class
		System.out.println(b.getValue());
	}
}
/* o/p--40

   Explanation....(Why 40)

         -->Due to addValue() method present in both class means polymorphism arieses.
         -->this  method have no arg(or same arg) means dynamic poly.....
		      i.e.-method overridding.(Run-time/dynamic poly...)

	   Q: Which addValue() method r executed (At run-time) in overridding? 

	   -->It is depends upon ref type & obj type.
	         i.e-Generaly constor's of class created,& metd of dat class execut
	         means-which class ref(sub or super) referring to which type of obj(sub or super).
			 
	  
	  --> in above prog obj of Derived(sub) class is assign to ref of Base(super) class
            so...all content of Derived class(all constror,method & vars) r present(actually)
			 in Derived obj.
			          But this ref (b) of Base class is refer obj of Derived class.
					  (at same time Base class has not creates  any it's own obj )
		    
			 so...JVM overrides(replace content of ) addValue()method  of Derived class on
			addValue() method of Base class. Hence excutes method of Deriveed class.
			and print content of Derived class method in output.

			Hence .....output is 40