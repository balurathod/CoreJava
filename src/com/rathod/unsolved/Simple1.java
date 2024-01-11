package com.rathod.unsolved;
class Simple1 
{
	private void methodA(int num)
		{
		assert (num >= 0);
		int x = 0;
    		if (num >= 0)
	        	{
//			      useNum (num + x);
                  System.out.println("Hi");  
		        }
			else
		       {
				//num must b <o
				//this code should never b reached
			   System.out.println("Yikes num is -ve no.!" + num);
	          }
       }
	public static void main(String[] args) 
	{
	}
}
/*

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\Assertion>javac Simple1.java
Simple1.java:9: cannot find symbol
symbol  : method useNum(int)
location: class Simple1
                              useNum (num + x);
                              ^
1 error

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\Assertion>javac Simple1.java

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\Assertion>javac Simple1
error: Class names, 'Simple1', are only accepted if annotation processing is explicitly request
ed
1 error

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\Assertion>javac Simple1
error: Class names, 'Simple1', are only accepted if annotation processing is explicitly request
ed
1 error

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\Assertion>java Simple1

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\Assertion>javac  -source 6 Simple1.java

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\Assertion>javac Simple1.java

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\Assertion>java -ea Simple1

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\Assertion>java -ea -da Simple1

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\Assertion>
*/