package com.rathod.unsolved;
//74
static class A           //non-static class allowed in inner class only
{
	public void process()throws Exception{throw new Exception(); }
}
static class B5 extends A           //non-static class always
{
	void process()	{ System.out.print("B,");   }
	public static void main(String[] args) 
	{
		new B5().process();
	}
}

/*Ans-->B    but


                                    ^

Note:-this happening due to Library class define as a class name in this folder

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac B5.java
B5.java:2: modifier static not allowed here
static class A
       ^
B5.java:6: modifier static not allowed here
static class B5 extends A
       ^
.\Exception.java:3: illegal start of type
try
^
.\Exception.java:3: ';' expected
try
   ^
.\Exception.java:6: illegal start of type
        throws  an Exception
        ^
.\Exception.java:6: ';' expected
        throws  an Exception
                  ^
.\Exception.java:6: <identifier> expected
        throws  an Exception
                            ^
.\Exception.java:8: illegal start of type
        catch(SomeException se)
        ^
.\Exception.java:8: <identifier> expected
        catch(SomeException se)
             ^
.\Exception.java:8: ';' expected
        catch(SomeException se)
              ^
.\Exception.java:8: <identifier> expected
        catch(SomeException se)
                              ^
.\Exception.java:11: illegal start of expression
        throws an Exception
        ^
.\Exception.java:11: ';' expected
        throws an Exception
                           ^
.\Exception.java:13: illegal start of type
finally
^
.\Exception.java:13: ';' expected
finally
       ^
.\Exception.java:17: class, interface, or enum expected
}?
^
B5.java:4: cannot access Exception
bad class file: .\Exception.java
file does not contain class Exception
Please remove or make sure it appears in the correct subdirectory of the classpath.
        public void process()throws Exception{throw new Exception(); }
                                    ^

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>

*/