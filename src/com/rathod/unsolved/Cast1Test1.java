package com.rathod.unsolved;
/*class Animal
{}
 class Dog extends Animal
{
}
class Cast1Test
{

	public static void main(String[] args) 
	{
		Animal animal=new Animal();
		Dog d=(Dog) animal;
		//String s=(String) animal;                    //animal can't EVER be String (inconvertible types)
		System.out.println("Hello World!");
	}
}
*/

/*Exception in thread "main" java.lang.ClassCastException: Animal cannot be cast to Dog
    at Cast1Test.main(Cast1Test.java:12).

	*/

class Animal
{}
 class Dog extends Animal
{
}
class Cast1Test
{

	public static void main(String[] args) 
	{
		
		Dog d=new Dog();
		Animal a1=d;                         //upcast ok with no explicit cast
		Animal a2=(Animal) d;                //upcast ok with an  explicit cast
		System.out.println("Hello World!");
	}
}

/*no exception of prog ...bcoz Dog IS-A Animal.

-->Anything  Animal can do, aDog can do.

-->but pt is --anyone vt Animal ref can safely call Animal  method on Dog instance.

-->The Animal method may have been overridden in Dog class but all we care abt 
      now is that a dog can always do at least everything  an Animal can do.



Confusion-->
The COMPILER & JVM know it too. 
     so the implicit upcast is always legal for assining an obj of a subtype to a  ref
	 one of its supertype classes(or interface).


-->re-implement=>Override    &  Concrete=>Non-Abstract.
