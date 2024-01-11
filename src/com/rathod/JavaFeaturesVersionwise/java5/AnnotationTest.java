package com.rathod.java5;
/*
 * This Java 5 feature lets you avoid writing boilerplate code under many circumstances by enabling tools to generate it from annotations in the source code. This leads to a “declarative” programming style where the programmer says what should be done and tools emit the code to do it. Also it eliminates the need for maintaining “side files” that must be kept up to date with changes in source files. Instead the information can be maintained in the source file.
What are Annotations?
Annotations provide a little extra information about the classes we write. This feature is very useful because we can attach extra information to our code that may determine how it is used.
For example, in J2SE 5.0, we can declare our intent to override a method like toString() in one of our classes as follows:
 * 
 * */
public class AnnotationTest extends Object {
    @Override
    public String toString() {
        return "My overridden toString() method!";
    }
}
/*
 * In the above example, we declared that we are going to override the toString() method using @Override annotation. So the compiler looks in super class (Object) for toString() method with same signature (parameters and return type) and make sure it exists. If, for some reason, we tried to overload toString() by declaring it with different parameters or return type, then the compiler gives an error as there is no such version of toString() method in java.lang.Object. This is really useful to make sure we override correct method and avoid overloading the method by mistake.
We can also define our own Annotations. They basically looks like interfaces, but they can contain values.

Example to explain custom annotations:
 * */
public @interface Meeting {
    String what() default "Project meeting";
    String when();
    String location();
}

/*
 * This annotation declares three members: what, when, location and sets them up to have “getters” and “setters” automatically. That means each @Meeting annotation has those three fields associated with it, and we don’t have to define the accessor and mutator methods to set them up. If we define this annotation like this, we can use it to mark code that we use for the XYZ Project Meeting:
 * */

@Meeting(what="Project XYZ",
        when="11-Apr-2013",
        location="New York")
public class MeetingXyz {
   //... class definition
}



/*
 * Now the @Meeting type of data is associated with MeetingXyz class. Later on, we could write an analyzer that goes through all of the code and let us know which classes were used at meetings as well as which meetings they were used at and when.
Here, we have discussed about one most commonly used annotation @Override. Few other commonly used annotations are @Deprecated and @SupressWarnings.
 * */
 */