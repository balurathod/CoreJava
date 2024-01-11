package com.rathod.oops;
 class Animal {
    public static void testClassMethod() {
        System.out.println("The class method in Animal.");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal.");
    }
}
//The second class, a subclass of Animal, is called Cat: 
public class CatOvrid extends Animal {
    public static void testClassMethod() {
        System.out.println("The class method in Cat.");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat.");
    }

    public static void main(String[] args) {
        CatOvrid myCat = new CatOvrid();
        Animal myAnimal = myCat;
        Animal.testClassMethod();
		//myAnimal.testClassMethod();
        myAnimal.testInstanceMethod();
    }
}
