package com.rathod.oops;
class C2 
{
	public static void main(String[] a1) 
	{
		System.out.println(a1[1]+a1[2]+a1[3]);
	}
}

/*

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>javac C2.java

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>java command A B C
Exception in thread "main" java.lang.NoClassDefFoundError: command
Caused by: java.lang.ClassNotFoundException: command
        at java.net.URLClassLoader$1.run(Unknown Source)
        at java.security.AccessController.doPrivileged(Native Method)
        at java.net.URLClassLoader.findClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        at sun.misc.Launcher$AppClassLoader.loadClass(Unknown Source)
        at java.lang.ClassLoader.loadClass(Unknown Source)
        at java.lang.ClassLoader.loadClassInternal(Unknown Source)

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>java C2 A B C
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
        at C2.main(C2.java:5)

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>java C2
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
        at C2.main(C2.java:5)

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>
*/