package com.rathod.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommaSeparatedStr {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>(Arrays.asList("Dev", "test", "integration"));
        System.out.println(lst);

        String str = String.join(",", lst); 
        System.out.println(str);
        
    }   
}
