package com.rathod.oops;
//passing primitive vars...
class RefTest2 
{
	public static void main(String[] args) 
	{
		int a = 1;         //primitive type local  var

		RefTest2 rt = new RefTest2() ;         //class obj
		
		System.out.println("Before modify() a = " + a);
		
		rt.modify(a);
		System.out.println("After modify() a = " + a);

	}
	void modify(int number)
	{
		number = number+1;
		
		System.out.println("number = " + number);
	}
}

/*


IMP....
when primi var is passed to method (a to modify() ) it is pass by val.(pass by copy of the bit in the variable. )


G:\SCJP\Scjp6\ch3-Assignmnt>javac RefTest2.java

G:\SCJP\Scjp6\ch3-Assignmnt>java RefTest2
Before modify() a = 1
number = 2
After modify() a = 1

G:\SCJP\Scjp6\ch3-Assignmnt>





java is only pass-by-value i.e.-pass-by- variable-value  
    i.e.-pass-by-a copy of-value(copy of bits in vars.)


Ref vars 'd' & 'dim' both pt to same obj( of Dimension).


  Ref var holds bits that reprsnt (to d undrlying VM) a way to get to a specific
  obj in memory(on HEAP).
 
 The caller & called method will now have IDENTICAL copies of ref,thus both will
 refer to the same exact(not a copy)object on d heap.


 what is diff bet caller called method?
  */