package com.rathod.oops;
import java.util.*;
class  Dog
{
	public Dog(String n)
	{
		name = n;
	}
	public String name;
	public boolean equals(Object o)
	{
		if ((o instanceof Dog) && (((Dog)o).name == name))
		{
			return true;
		}else
		{
			return false; 
		}

	}
	public int hasCode()
	{
		return name.length();
	}
}
class Cat
{
}

enum Pets {DOG, CAT , HORSE}

class Test1
{
	public static void main(String[] args) 
	{

		Map<Object, Object> m = new HashMap<Object, Object>();
		
		m.put("k1", new Dog("aiko"));      //add some key valpair
		m.put("k2", Pets.DOG);
		m.put(Pets.CAT, "CAT key");

		Dog d1 = new Dog("Jimmy");        //lets keep this ref...
		
		m.put(d1,"Dog key");
		m.put(new Cat(), "Cat Key");
		
		System.out.println(m.get("k1"));

		String k2 = "k2"; 
		System.out.println(m.get(k2));

		//Pets p =new Pets.CAT;          //not exected why?

		//System.out.println(m.get(p));
		System.out.println(m.get(d1));
        System.out.println(m.get(new Cat()));
		System.out.println(m.size());


        d1.name = "madnolia";
        System.out.println(m.get(d1));    //o/p-null   is not why?
		d1.name = "clover";
		System.out.println(m.get(d1));
        //System.out.println(m.get(new Dog("clover")));    //o/p-null   is not why?
		d1.name = "arthur";
        System.out.println(m.get(new Dog("arthur")));    //o/p-null   is not why?
		
	    }
}
/*

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>javac Test1.java

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>java Test1
Dog@de6ced
DOG
Dog key
null
5

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>javac Test1.java

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>java Test1
Dog@de6ced
DOG
Dog key
Dog key
null
5

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>javac Test1.java
Test1.java:65: cannot find symbol
symbol  : class Dod
location: class Test1
        System.out.println(m.get(new Dod("arthur")));    //o/p-null   is not why?
                                     ^
1 error

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>javac Test1.java

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>java Test1
Dog@de6ced
DOG
Dog key
null
5
Dog key
null
null

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>

*/