package com.rathod.unsolved;
//61. Given:
class Collec
{
public static Iterator reverse(List list) {
	 Collections.reverse(list);
	 return list.iterator();
 }

public static void main(String[] args) 
{
	 List list = new ArrayList();
	 list.add("1"); 
	 list.add("2"); 
	 list.add("3");
	 for (Object obj: reverse(list))
		System.out.print(obj + ", ");
}
}

/*
What is the result?
A. 3, 2, 1,
B. 1, 2, 3,
C. Compilation fails.
D. The code runs with no output.
E. An exception is thrown at runtime.
Answer: C
*/
