package com.rathod.oops;
//staic method r NOT OVERRIDE.....
class Foo {
    public static void classMethod() {
        System.out.println("classMethod() in Foo");
    }

    public void instanceMethod() {
        System.out.println("instanceMethod() in Foo");
    }
}

class Bar extends Foo {
    public static void classMethod() {
        System.out.println("classMethod() in Bar");
    }

    public void instanceMethod() {
        System.out.println("instanceMethod() in Bar");
    }
}
 
class TestInstanceMethod {
    public static void main(String[] args) {
        Foo f = new Bar();
        f.instanceMethod();
        f.classMethod();
    }
}
/*
If you run this, the output is
instanceMethod() in Bar
classMethod() in Foo


Why do we get instanceMethod from Bar, but classMethod() 

Can I override a static method? 
Many people have heard that you can't override a static method. This is true - you can't. However it is possible to write code like this: 
class Foo {
    public static void method() {
        System.out.println("in Foo");
    }
}

class Bar extends Foo {
    public static void method() {
        System.out.println("in Bar");
    }
}
This compiles and runs just fine. Isn't it an example of a static method overriding another static method? The answer is no - it's an example of a static method hiding another static method. If you try to override a static method, the compiler doesn't actually stop you - it just doesn't do what you think it does. 
So what's the difference? 
Briefly, when you override a method, you still get the benefits of run-time polymorphism, and when you hide, you don't. So what does that mean? Take a look at this code: 

*/