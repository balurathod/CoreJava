package com.rathod.unsolved;
public static Collection get()
{
	Collection sorted=new LinkedList(); 
	    sorted.add("B");
        sorted.add("C");
		sorted.add("A");
		
		return sorted;
}
	public static void main(String[] args) 
	{
		for (Object obj:get())
		{
            System.out.println(obj+",");
		}
		
	}

//o/p-->B,C,A