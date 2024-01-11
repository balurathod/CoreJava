package com.rathod.java5;
import static java.lang.Integer.*;
import static java.lang.String.format;
import static java.lang.System.*;
public class StaticImport {
    public static void main(String[] args) 
    {
        int num = parseInt("526");	// => Integer.parseInt()
        Integer num2 = valueOf("123");	// => Integer.valueOf()
        // => String.format()
        out.println(format("Numbers: %d, %d", num, num2));
        // => Integer.MAX_VALUE
        out.println(" Integer MAX value = " + MAX_VALUE);
    }
}

/*
Output:

    Numbers: 526, 123
    Integer MAX value = 2147483647

Important Note: Remember the order of keywords. It is ‘import static‘ but not ‘static import’.
This feature eliminates the process of qualifying the static members of a class with the class name. Those members can be methods as well as fields.
*/