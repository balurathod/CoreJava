package com.rathod.java5;
import java.util.*;
//Enhanced for loop is also referred as ‘forEach’ Loop and is specifically designed to iterate through arrays and collections.
public class ForEachTest 
{
    public static void main(String[] args) 
    {
        List<String> names = new ArrayList<String>();
        names.add("Ram");
        names.add("Peter");
        names.add("Khan");
        names.add("Singh");

        for (String name : names) {
            System.out.println(" Name = " + name);
        }
    }
}

//Enhanced for loop avoids the need for using temporary index variable and simplifies the process of iterating over arrays and collections.