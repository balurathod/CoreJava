package com.rathod.genericCollection;
import java.util.*;
public class EqualHashCodeTest {

	public static void main(String[] args) {
//equals() is used in most collections to determine if a collection contains a given element.
//The ArrayList iterates all its elements and execute "123".equals(element) to determine 
//if the element is equal to the parameter object "123". It is the String.equals() implementation 
//that determines if two strings are equal. e.g
		List<String> list = new ArrayList<String>();
		list.add("123"); 
		list.add("456"); 
		System.out.println("LIst val "+list);
		
		boolean contains123 = list.contains("123");
        System.out.println("contains123 val "+contains123);
        
//The equals() method is also used when removing elements.
        boolean removed = list.remove("123");
        System.out.println("LIst val "+list);
        
        

//        public boolean equals(Person obj)//mtd overloading
//it will not only compile but also execute correctly but if you try to put your object in collection e.g. ArrayList and call contains() method which is based on equals() method it will not able to detect your object. 

	}

}

/*
 * 
You could decide that two Employee objects are equal to each other if just their employeeId's are 
equal. Or, you could decide that all fields must be equal - both employeeId, firstName and lastName.
Here are two example implementation of equals() matching these criterias:

public class Employee {
	
  public boolean equals(Object o){
    if(o == null)                return false;
    if(!(o instanceof) Employee) return false;

    Employee other = (Employee) o;
    return this.employeeId == other.employeeId;
  }
}


public class Employee {
	  ...
	  public boolean equals(Object o){
	    if(o == null)                return false;
	    if(!(o instanceof) Employee) return false;

	    Employee other = (Employee) o;
	    if(this.employeeId != other.employeeId)      return false;
	    if(! this.firstName.equals(other.firstName)) return false;
	    if(! this.lastName.equals(other.lastName))   return false;

	    return true;
	  }
	}
	
Which of these two implementations is "proper" depends on what you need to do. Sometimes you need 
to lookup an Employee object from a cache. In that case perhaps all you need is for the employeeId 
to be equal. In other cases you may need more than that - for instance to determine if a copy of 
an Employee object has changed from the original.	


following rule equals method in Java should be:

1) Reflexive : Object must be equal to itself.

2) Symmetric : if a.equals(b) is true then b.equals(a) must be true.

3) Transitive : if a.equals(b) is true and b.equals(c) is true then c.equals(a) must be true.

4) Consistent : multiple invocation of equals() method must result same value until any of properties are modified. So if two objects are equals in Java they will remain equals until any of there property is modified.

5) Null comparison : comparing any object to null must be false and should not result in NullPointerException. For example a.equals(null) must be false, passing unknown object, which could be null,  to equals in Java is is actually a Java coding best practice to avoid NullPointerException in Java.




hashCode()

The hashCode() method of objects is used when you insert them into a HashTable, HashMap or HashSet. If you do not know the theory of how a hashtable works internally, you can read about hastables on Wikipedia.org.

When inserting an object into a hastable you use a key. The hash code of this key is calculated, and used to determine where to store the object internally. When you need to lookup an object in a hashtable you also use a key. The hash code of this key is calculated and used to determine where to search for the object.

The hash code only points to a certain "area" (or list, bucket etc) internally. Since different key objects could potentially have the same hash code, the hash code itself is no guarantee that the right key is found. The hashtable then iterates this area (all keys with the same hash code) and uses the key's equals() method to find the right key. Once the right key is found, the object stored for that key is returned.

So, as you can see, a combination of the hashCode() and equals() methods are used when storing and when looking up objects in a hashtable.

Here are two rules that are good to know about implementing the hashCode() method in your own classes, if the hashtables in the Java Collections API are to work correctly:

If object1 and object2 are equal according to their equals() method, they must also have the same hash code.
If object1 and object2 have the same hash code, they do NOT have to be equal too.
In shorter words:

If equal, then same hash codes too.
Same hash codes no guarantee of being equal.
Here are two example implementation of the hashCode() method matching the equals() methods shown earlier:

public class Employee {
  protected long   employeeId;
  protected String firstName;
  protected String lastName;

  public int hashCode(){
    return (int) employeeId;
  }
}
public class Employee {
    protected long   employeeId;
    protected String firstName;
    protected String lastName;

  public int hashCode(){
    return (int) employeeId *
                firstName.hashCode() *
                lastName.hashCode();
  }
}
Notice, that if two Employee objects are equal, they will also have the same hash code. But, as is especially easy to see in the first example, two Employee objects can be not equal, and still have the same hash code.

In both examples the hash code is the employeeId is rounded down to an int. That means that many employee id's could result in the same hash code, but these Employee objects would still not be equal, since they don't have the same employee id.


========Equals and hashCode contract in Java==========

And equals method in Java must follow its contract with hashcode method in Java as stated below.

1) If two objects are equal by equals() method then there hashcode must be same.

2) If two objects are not equal by equals() method then there hashcode could be same or different.

So this was the basic theory about equals method in Java



==========Steps to Override equals method in Java==========

Here is my approach for overriding equals method in Java. This is based on standard approach most of Java programmer follows while writing equals method in Java.

1) Do this check -- if yes then return true.

2) Do null check -- if yes then return false.

3) Do the instanceof check,  if instanceof return false than return false from equals in Java , after some research I found that instead of instanceof we can use getClass() method for type identification because instanceof check returns true for subclass also, so its not strictly equals comparison until required by business logic. But instanceof check is fine if your class is immutable and no one is going to sub class it. For example we can replace instanceof check by below code

if((obj == null) || (obj.getClass() != this.getClass())) {
        return false;
}


4) Type cast the object; note the sequence instanceof check must be prior to casting object.


5) Compare individual attribute starting with numeric attribute because comparing numeric attribute is fast and use short circuit operator for combining checks.  If first field does not match, don't try to match rest of attribute and return false. It’s also worth to remember doing null check on individual attribute before calling equals() method on them recursively to avoid NullPointerException during equals check in Java.



*/