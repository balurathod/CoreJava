package com.rathod.unsolved;
//65
public class AssertStuff
{
	public static void main(String[] args) 
	{
		int x=5;
		int y=7;
		assert(x>y):"Stuff";     //not understand properly..
		System.out.println(y);
	}
}

/*o/p-->passed   


D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>java AssertStuff
passed

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>java -ea AssertStuff
passed




public class Test {
	
	public static void main(String... args) {
		for(int i = 2; i < 4; i++)
  for(int j = 2; j < 4; j++)
     assert i!=j : i; 


	}
}

options
A)The class compiles and runs, but does not print anything.
B)The number 2 gets printed with AssertionError
C)The number 3 gets printed with AssertionError
D)compile error

Correct answer is : B

Explanations : When i and j are both 2, assert condition is false, and AssertionError gets generated. 
Questions no -2

What is the output for the below code ?

public class Test {
	
	public static void main(String... args) {
		for(int i = 2; i < 4; i++)
  for(int j = 2; j < 4; j++)
	if(i < j)
     assert i!=j : i; 


	}
}

options
A)The class compiles and runs, but does not print anything.
B)The number 2 gets printed with AssertionError
C)The number 3 gets printed with AssertionError
D)compile error

Correct answer is : A

Explanations : When if condition returns true, the assert statement also returns true.
Hence AssertionError not generated.


*/