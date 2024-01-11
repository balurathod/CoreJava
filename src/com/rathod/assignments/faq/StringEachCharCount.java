package com.rathod.assignments.faq;

import java.util.HashMap;

public class StringEachCharCount {

    static void characterCount(String inputString)
    {
        //Creating a HashMap containing char as a key and occurrences as  a value
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        //Converting given string to char array
        char[] strArray = inputString.toCharArray();
        //checking each char of strArray
        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                //If char is present in charCountMap, incrementing it's count by 1
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value
                charCountMap.put(c, 1);
            }
        }
        //Printing the charCountMap
        System.out.println(charCountMap);
    }
    public static void main(String[] args)
    {
       characterCount("Java J2EE Java JSP J2EE");
       characterCount("All Is Well");
       characterCount("Done And Gone");
    }

}


/*
 * 
{E=4, v=2, =4, P=1, S=1, a=4, J=5}
{W=1, =2, e=1, s=1, A=1, l=4, I=1}
{D=1, d=1, =2, G=1, e=2, A=1, n=3, o=2}

 * */
 