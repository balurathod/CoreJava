package com.rathod.JavaFeaturesVersionwise.java11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommaSeparated {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>(Arrays.asList("Development", "test", "Integration"));
        System.out.println(lst);
        String str = String.join(",", lst);
        System.out.println(str);


        String str1 = "This is , my test, for comma separate";
        String[] str2 = str1.split("[,]", 0);
        for (String myString : str2) {
                    System.out.println(myString);
        }
        

        List<String> lst1 = new ArrayList<>(Arrays.asList(str1.split(",")));
        System.out.println(lst1);

    }
}
