package com.rathod.oops;
//RULE--An abstract class can extends abs class & implmnt interface
//We can define CONSTOR in abs class explctly,other wise complr create DEFAULT constor as like simple class . 
interface Magic{
   public void iAdd();
   public void iSub();
}
abstract class SupAbs {
	SupAbs()      //default-constor bt user define
	{
       System.out.println("In SupAbs default constor ");
	}
	SupAbs(int i)      //para-constor    How to pass para here? 
	{
		x = i;
		System.out.println("In SupAbs para-constor ");
	}
   public void supAdd()
	   {
	      System.out.println("In SupAbs Class");
	   }
   public abstract void supSub();
 
}
abstract class  SubAbs extends SupAbs implements Magic
{
	SubAbs()
	{
		System.out.println("In Constor of SubAbs");
	}
	public static void statik()
	{
		System.out.println("static metd in abs class ");
	}
	public void iAdd()
	   {
	      System.out.println("In SubAbs class implmnted mtd-iAdd() of Intrfc");
	   }
	public void iSub()
	   {
	      System.out.println("In SubAbs class implemnted mtd-iSub() of Intrfc");
	   }

	public void supAdd()
	   {
		  super.supAdd(); //compl & run bcz define in supAbs class also.
	      System.out.println("In SubAbs ovriding mtd-supAdd() of SupAbs");
	   }
   public  void supSub()
	{
	  // this.supSub();  excpcn-out of loop
        System.out.println("In SubAbs abstract mtd-suSub() of  SupAbs");
    }
}
class AbsIntrfc extends SubAbs
{
	public static void main(String[] args) 
	{
		SubAbs sa = new AbsIntrfc();
		SupAbs sa1 = new AbsIntrfc(6);
		System.out.println(sa1.x);
		sa.supAdd();
		sa.supSub();
		sa.iSub();
		sa.iAdd();
	}
	
}
