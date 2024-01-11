package com.rathod.oops;
class Syntax 
{
	public static void main(String[] args) 
	{
		try
		{
			/*1 line...garded region 
			2nd  to n-2 line...govern by try keyword
			code vt kind of ecption 
			one or more line here
			*/

		}
		//nothing is applicable here...(in bet try & catch) 
		catch (Exception mfe)//MyFirst
		{
			//put code here that handles thie exception
			//next line of Excpn handl..
			//last line of Excpn handl..
		}
		catch(Exception mse)//MySecond
		{
             //put code here that handles thie exception
		}
		//some other unguarded(normal,non-risky) code begin/continue here....
		System.out.println("Hello World! of EXCEPTION");
	}
}


/*

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\SCJP6>javac Syntax.java
Syntax.java:15: <identifier> expected
                catch (MyFirstException)
                                       ^
Syntax.java:21: <identifier> expected
                catch(MySecondExcption)
                                      ^
2 errors

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\SCJP6>javac Syntax.java
Syntax.java:15: cannot find symbol
symbol  : class MyFirstException
location: class Syntax
                catch (MyFirstException mfe)
                       ^
Syntax.java:21: cannot find symbol
symbol  : class MySecondExcption
location: class Syntax
                catch(MySecondExcption mse)
                      ^
2 errors

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\SCJP6>javac Syntax.java
Syntax.java:15: cannot find symbol
symbol  : class MyFirstException
location: class Syntax
                catch (MyFirstException mfe)
                       ^
Syntax.java:21: cannot find symbol
symbol  : class MySecondExcption
location: class Syntax
                catch(MySecondExcption mse)
                      ^
2 errors

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\SCJP6>javac Syntax.java
Syntax.java:21: cannot find symbol
symbol  : class MySecondExcption
location: class Syntax
                catch(MySecondExcption mse)
                      ^
1 error

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\SCJP6>javac Syntax.java
Syntax.java:15: ')' expected
                catch (Exception mfe//MyFirst)
                                    ^
Syntax.java:21: ')' expected
                catch(Excption mse//MySecond)
                                  ^
2 errors

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\SCJP6>javac Syntax.java
Syntax.java:21: cannot find symbol
symbol  : class Excption
location: class Syntax
                catch(Excption mse)//MySecond
                      ^
1 error

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\SCJP6>javac Syntax.java
Syntax.java:21: exception java.lang.Exception has already been caught
                catch(Exception mse)//MySecond
                ^
1 error

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\SCJP6>

*/