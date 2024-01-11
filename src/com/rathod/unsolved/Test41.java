package com.rathod.unsolved;
 class Test1 
{
public static void main(String[] args) 
	{
	int[] a = {1};
	Test1 t=new Test1();
	t.increment(a);
	     System.out.println("Length of A="+a.length);

		System.out.println(a[a.length-1]);                 //2[2-1]=2
	}
	void increment(int[] i)
	{
		i[i.length-1]++;                             //1[2-1]++==>1*1++==>2
  System.out.println("Length of I="+i.length);
	}
}