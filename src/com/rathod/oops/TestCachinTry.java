package com.rathod.oops;
class TestCatchinTry 
{
	public static void main(String[] args) 
	{
		try
		{
			callBadMethod();
         catch (Exception ex)  // err: catch without try
		   {}

		}
		catch (Exception ex)
		{
			throw ex;              //can't throw it unless u declr it
		}
	}
}
/*


G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\SCJP6>javac TestCachinTry.java
TestCachinTry.java:8: 'catch' without 'try'
                catch (Exception ex)
                ^
TestCachinTry.java:12: class, interface, or enum expected
}
^
2 errors




G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\SCJP6>javac TestCachinTry.java
TestCachinTry.java:8: 'catch' without 'try'
                catch (Exception ex)
                ^
TestCachinTry.java:12: class, interface, or enum expected
}
^
2 errors

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\SCJP6>javac TestCachinTry.java
TestCachinTry.java:8: 'catch' without 'try'
                catch (Exception ex)
                ^
TestCachinTry.java:12: illegal start of type
                catch (Exception ex)
                ^
TestCachinTry.java:12: ';' expected
                catch (Exception ex)
                                   ^
TestCachinTry.java:15: class, interface, or enum expected
}
^
4 errors

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\SCJP6>javac TestCachinTry.java
TestCachinTry.java:7: cannot find symbol
symbol  : method callBadMethod()
location: class TestCatchinTry
                        callBadMethod();
                        ^
1 error

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions\SCJP6>java TestEx2


*/