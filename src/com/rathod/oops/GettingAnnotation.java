package com.rathod.oops;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface HelloAnno {
    String value();
    String greetTo();
}

@HelloAnno(value = "Hello", greetTo = "Universe")

public class GettingAnnotation {
    public static void main(String[] args) {
        GettingAnnotation demo = new GettingAnnotation();

        Class clazz =  demo.getClass();
        Annotation[] annotations = clazz.getAnnotations();

        for (Annotation anno : annotations) {
            System.out.println("Annotation Type: " + anno.annotationType());
        }
	
        HelloAnno anno = (HelloAnno) clazz.getAnnotation(HelloAnno.class);
        System.out.println("Anno Value  : " + anno.value());
        System.out.println("Anno GreetTo: " + anno.greetTo());

        try {
            Method m = clazz.getMethod("sayHi");

            anno = m.getAnnotation(HelloAnno.class);
            System.out.println("Anno Value  : " + anno.value());
            System.out.println("Anno GreetTo: " + anno.greetTo());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        demo.sayHello();
    }

    @HelloAnno(value = "Hi", greetTo = "Alice")
    public void sayHi() {
    }

    @HelloAnno(value = "Hello", greetTo = "Bob")
    public void sayHello() {
        try {
            Method m = getClass().getMethod("sayHello");
            HelloAnno anno = m.getAnnotation(HelloAnno.class);

            System.out.println(anno.value() + " " + anno.greetTo());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}