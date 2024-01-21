package com.rathod.assignments;

import java.math.BigInteger;

//Write a function, add,  which adds two large numbers together and returns their sum: 
//String add(String a, String b) //99 456

public class SumOfTwoLargeNumber {
    

    public static String sumOfTwoNum(String str, String str1) {

        //Check large num
        if(str.length() > str1.length()) {
            String temp = str;
            str = str1;
            str1  = temp;            
        }

        int strLength = str.length();
        int str1Length = str1.length();
        String result = "";

        str = new StringBuilder(str).reverse().toString();
        str1 = new StringBuilder(str1).reverse().toString();
        int carry  = 0;

        for(int i = 0; i < strLength; i++ ) {

            int sum = (((int)str.charAt(i) - '0') + ((int)str1.charAt(i) - '0') + carry );
            result += (char)(sum%10 + '0');
            carry = (sum/10) ;

        }

        for (int i = strLength ; i < str1Length; i++) {
            int sum = ((int)str1.charAt(i) - '0') + carry;
            result += (char)(sum%10 + '0');
            carry = (sum/10); 

        }

        if(carry > 0 ) {
            result += (char) (carry + '0');
        }       
        result = new StringBuilder(result).reverse().toString();

        return result;
    }
    public static void main(String[] args) {
        String str = "8944394323791464";
        String str1  = "14472334024676221";
        System.out.println(sumOfTwoNum(str, str1));

        BigInteger a = new BigInteger(str);
        BigInteger b = new BigInteger(str1);

        System.out.println("Sum of two large Number using BigInteger " +  a.add(b));
    }
}
