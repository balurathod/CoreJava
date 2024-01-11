package com.rathod.unsolved;
//Isolating a Ref..
/*class GcIsland 
{
	GcIsland i;
	public static void main(String[] args) 
	{
		GcIsland i2 = new GcIsland();
		GcIsland i3 = new GcIsland();
		GcIsland i4 = new GcIsland();

          i2.i = i3;    // i2 refers to i3
		  i3.i = i4;      // i3 refers to i4
		  i4.i = i2;      // i4 refers to i2 

		  i2 = null;
		  i3 = null;
		  i4 = null;
      doComplicatedStuff();  //here GC is not posibl.. how can these (i1,i2,i3) eligbl to GC? 
		System.out.println("Do complcated memory intensive stuff..");
	}

}*/
public class Lost  //using anther class we can eligble it to GC
{
public static void main(String args[])
	{
	  Lost l = new Lost();
	  l=null;
	  doComplicatedStuff();
	}
}