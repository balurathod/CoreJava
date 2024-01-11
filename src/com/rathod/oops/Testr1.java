package com.rathod.oops;
import java.util.*;

class  Dog
{
	public String name;
	Dog(String n)
	{
		name = n;
	}
}
class Test1
{
	public static void main(String[] args) 
	{
		List<Dog> d = new ArrayList<Dog>();
		Dog dog = new Dog("aiko");
		d.add(dog);
		d.add(new Dog ("Jimmy"));
		d.add(new Dog("Kallu"));

		Iterator<Dog> i3 = d.iterator();    //mk an itrtor...
		while (i3.hasNext())
		{
			Dog d2 = i3.next();    //what is diff bet prev & in this prog. 
    		System.out.println(d2.name);
		}
		System.out.println("size " + d.size());
		System.out.println("get1 " + d.get(1).name);
		System.out.println("aiko " + d.indexOf(dog));

		d.remove(2);
		Object[] oa = d.toArray();
		for (Object o : oa )
		{
		  Dog d2 = (Dog)o;
		System.out.println("oa " + d2.name);
	    }
}
}