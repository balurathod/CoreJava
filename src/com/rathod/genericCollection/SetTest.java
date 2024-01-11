package com.rathod.genericCollection;
import java.util.*;
public class SetTest {
    public static void main(String[] args) {
        Set<String> uniques = new HashSet<String>();
        Set<String> dups    = new HashSet<String>();
        uniques.add("A");
        uniques.add("A");
        uniques.add("b");
        uniques.add("B");
        uniques.add("C");
        
        dups.add("A");
        dups.add("a");
        dups.add("B");
        dups.add("c");
        dups.add("C");
        
        	for (String a : uniques)
            if (!uniques.add(a))
                dups.add(a);

        // Destructive set-difference
        uniques.removeAll(dups);

        System.out.println("Unique words:    " + uniques);
        System.out.println("Duplicate words: " + dups);
    }
}