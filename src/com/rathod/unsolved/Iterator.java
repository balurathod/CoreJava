package com.rathod.unsolved;
public static Iterator reverse(List list)
{
	Collections.reverse(list); 
	return list.iterator();

	public static void main(String[] args) 
	{
		List list=new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		for (Object obj:reverse(list))
		{
            System.out.println(obj+",");
		}
		
	}
}
/*
compilation fail...



D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>java Iterator.java
Exception in thread "main" java.lang.NoClassDefFoundError: Iterator/java

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac Iterator.java
Iterator.java:1: class, interface, or enum expected
public static Iterator reverse(List list)
              ^
Iterator.java:4: class, interface, or enum expected
        return list.iterator();
        ^
Iterator.java:6: class, interface, or enum expected
        public static void main(String[] args)
                      ^
Iterator.java:9: class, interface, or enum expected
                list.add("1");
                ^
Iterator.java:10: class, interface, or enum expected
                list.add("2");
                ^
Iterator.java:11: class, interface, or enum expected
                list.add("3");
                ^
Iterator.java:12: class, interface, or enum expected
                for (Object obj:reverse(list))
                ^
Iterator.java:15: class, interface, or enum expected
                }
                ^
8 errors
*/