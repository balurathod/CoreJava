package com.rathod.oops;
//passing obj ref vars...
import java.awt.Dimension;

class RefTest1 
{
	public static void main(String[] args) 
	{
		Dimension d = new Dimension(12,24); //w-12 , h-24

		RefTest1 rt = new RefTest1() ;         //class obj
		
		System.out.println("Before modify() d.height = " + d.height);
		
		rt.modify(d);
		System.out.println("After modify() d.height = " + d.height);

	}
	void modify(Dimension dim)
	{
		dim.height = dim.height + 1;
		System.out.println("dim = " + dim.height);
	}
}

/*

java is only pass-by-value i.e.-pass-by- variable-value  
    i.e.-pass-by-a copy of-value(copy of bits)


Ref vars 'd' & 'dim' both pt to same obj( of Dimension).


  Ref var holds bits that reprsnt (to d undrlying VM) a way to get to a specific
  obj in memory(on HEAP).
 
 The caller & called method will now have IDENTICAL copies of ref,thus both will
 refer to the same exact(not a copy)object on d heap.


 what is diff bet caller  & called method?
  */